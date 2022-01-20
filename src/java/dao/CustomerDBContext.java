/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Account;
import model.Customer;

/**
 *
 * @author area1
 */
public class CustomerDBContext extends DBContext {

    public ArrayList<Customer> checkDupRegister() {
        ArrayList<Customer> customers = new ArrayList<>();
        try {
            String sql = "SELECT [PersonalID]\n"
                    + "	   ,Account.Email\n"
                    + "  FROM [Customer]\n"
                    + "  INNER JOIN Account\n"
                    + "  ON Account.ID = Customer.AccountID";
            PreparedStatement stm = connection.prepareStatement(sql);
            ResultSet rs = stm.executeQuery();

            while (rs.next()) {
                Account account = new Account();
                account.setEmail(rs.getString("Email").trim());

                Customer customer = new Customer();
                customer.setPersonalID(rs.getString("PersonalID").trim());
                customer.setAccount(account);

                customers.add(customer);
            }
        } catch (SQLException ex) {
            Logger.getLogger(CustomerDBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return customers;
    }

    public void register(Customer customer, Account account) {
        try {
            connection.setAutoCommit(false);
            String sql_account = "INSERT INTO [Account]\n"
                    + "           ([Email]\n"
                    + "           ,[Password]\n"
                    + "           ,[Role]\n"
                    + "           ,[Status]\n"
                    + "     VALUES\n"
                    + "           (?\n"
                    + "           ,?\n"
                    + "           ,?\n"
                    + "           ,?)";

            PreparedStatement stm_account = connection.prepareStatement(sql_account);
            stm_account.setString(1, account.getEmail());
            stm_account.setString(2, account.getPassword());
            stm_account.setBoolean(3, false);
            stm_account.setBoolean(4, true);
            stm_account.executeUpdate();

            String sql_get_accountid = "select @@identity as account_id";
            PreparedStatement stm_get_accountid = connection.prepareStatement(sql_get_accountid);
            ResultSet rs_accountid = stm_get_accountid.executeQuery();

            if (rs_accountid.next()) {
                account.setId(rs_accountid.getInt("account_id"));
                customer.setAccount(account);
            }

            String sql_customer = "INSERT INTO [Customer]\n"
                    + "           ([AccountID]\n"
                    + "           ,[FirstName]\n"
                    + "           ,[LastName]\n"
                    + "           ,[Address]\n"
                    + "           ,[Dob]\n"
                    + "           ,[JoinDate]\n"
                    + "           ,[Phone]\n"
                    + "           ,[PersonalID]\n"
                    + "           ,[Province]\n"
                    + "           ,[District])\n"
                    + "     VALUES\n"
                    + "           (?\n"
                    + "           ,?\n"
                    + "           ,?\n"
                    + "           ,?\n"
                    + "           ,?\n"
                    + "           ,?\n"
                    + "           ,?\n"
                    + "           ,?\n"
                    + "           ,?\n"
                    + "           ,?)";

            PreparedStatement stm_customer = connection.prepareStatement(sql_customer);
            stm_customer.setInt(1, customer.getAccount().getId());
            stm_customer.setString(2, customer.getFirstName());
            stm_customer.setString(3, customer.getLastName());
            stm_customer.setString(4, customer.getAddress());
            stm_customer.setDate(5, customer.getDob());
            stm_customer.setTimestamp(6, customer.getJoinDate());
            stm_customer.setString(7, customer.getPhone());
            stm_customer.setString(8, customer.getPersonalID());
            stm_customer.setString(9, customer.getProvince());
            stm_customer.setString(10, customer.getDistrict());
            stm_customer.executeUpdate();

            String sql_count_contract = "SELECT top 1 Staff.AccountID as StaffID, \n"
                    + "		count(Contract.CustomerID) as NumberOfContract\n"
                    + "FROM Staff\n"
                    + "	INNER JOIN Account\n"
                    + "	ON Account.ID = Staff.AccountID\n"
                    + "	LEFT JOIN Customer_Staff\n"
                    + "	ON Customer_Staff.StaffID = Staff.AccountID\n"
                    + "	LEFT JOIN Customer\n"
                    + "	ON Customer.AccountID = Customer_Staff.CustomerID\n"
                    + "	LEFT JOIN Contract\n"
                    + "	ON Contract.CustomerID = Customer.AccountID\n"
                    + "WHERE Account.Status = 1 and (Contract.Status in (1, 2, 3, 5) or Contract.Status is null)\n"
                    + "GROUP BY Staff.AccountID\n"
                    + "ORDER BY NumberOfContract asc";
            PreparedStatement stm_count_contract = connection.prepareStatement(sql_count_contract);
            ResultSet rs_count_contract = stm_count_contract.executeQuery();
            
            int staffID = 0;
            if(rs_count_contract.next()) {
                staffID = rs_count_contract.getInt("StaffID");
            }

            String sql_custaff = "INSERT INTO [Customer_Staff]\n"
                    + "           ([CustomerID]\n"
                    + "           ,[StaffID]\n"
                    + "           ,[StartDate]\n"
                    + "     VALUES\n"
                    + "           (?\n"
                    + "           ,?\n"
                    + "           ,?)";

            PreparedStatement stm_custaff = connection.prepareStatement(sql_custaff);
            stm_custaff.setInt(1, customer.getAccount().getId());
            stm_custaff.setInt(2, staffID);
            stm_custaff.setTimestamp(3, customer.getJoinDate());

            connection.commit();
        } catch (SQLException ex) {
            Logger.getLogger(CustomerDBContext.class.getName()).log(Level.SEVERE, null, ex);
            try {
                connection.rollback();
            } catch (SQLException ex1) {
                Logger.getLogger(CustomerDBContext.class.getName()).log(Level.SEVERE, null, ex1);
            }
        } finally {
            try {
                connection.setAutoCommit(true);
            } catch (SQLException ex) {
                Logger.getLogger(CustomerDBContext.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}

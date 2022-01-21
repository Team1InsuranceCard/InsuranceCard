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
import model.CustomerStaff;
import model.Staff;

/**
 *
 * @author area1
 */
public class CustomerDBContext extends DBContext {

    public CustomerStaff getCustomerDashboard(int customerID) {
        try {
//            connection.setAutoCommit(false);
            String sql_Select_Customer = "SELECT [Customer].AccountID AS CustomerID\n"
                    + "      ,[Customer].[FirstName] AS CustomerFirstname\n"
                    + "      ,[Customer].[LastName] AS CustomerLastName,\n"
                    + "	  Staff.AccountID AS StaffID,\n"
                    + "	  Staff.FirstName AS StaffFirstname, Staff.LastName AS StaffLastname,\n"
                    + "	  Staff.Phone AS Staffphone, AccountStaff.Email AS Staffemail\n"
                    + "  FROM [Customer] INNER JOIN Customer_Staff ON Customer.AccountID = Customer_Staff.CustomerID\n"
                    + "  INNER JOIN Staff ON Customer_Staff.StaffID=Staff.AccountID\n"
                    + "  INNER JOIN Account AS AccounTStaff ON Staff.AccountID = AccounTStaff.ID\n"
                    + "  WHERE AccounTStaff.[Status] IN (1) AND Customer_Staff.EndDate IS NULL AND\n"
                    + "  Customer.AccountID = ?";
            PreparedStatement psm_Select_Customer = connection.prepareStatement(sql_Select_Customer);
            psm_Select_Customer.setInt(1, customerID);
            ResultSet rs_select_customer = psm_Select_Customer.executeQuery();
            CustomerStaff cs = new CustomerStaff();

            if (rs_select_customer.next()) {
                Customer cus = new Customer();
                cus.setFirstName(rs_select_customer.getString("CustomerFirstname"));
                cus.setLastName(rs_select_customer.getString("CustomerLastName"));
                Staff staff = new Staff();

                staff.setFirstName(rs_select_customer.getString("StaffFirstname"));
                staff.setLastName(rs_select_customer.getString("StaffLastname"));
                staff.setPhone(rs_select_customer.getString("Staffphone"));
                Account account = new Account();
                account.setEmail(rs_select_customer.getString("Staffemail"));
                account.setId(rs_select_customer.getInt("StaffID"));

                staff.setAccount(account);
                cs.setCustomer(cus);
                cs.setStaff(staff);
            }
//            connection.commit();
            return cs;
        } catch (SQLException ex) {
//            try {
//                connection.rollback();
            Logger.getLogger(CustomerDBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
//catch (SQLException ex1) {
//                Logger.getLogger(CustomerDBContext.class.getName()).log(Level.SEVERE, null, ex1);
//            }

//        } finally {
//            try {
//
//                connection.setAutoCommit(true);
//            } catch (SQLException ex) {
//                Logger.getLogger(CustomerDBContext.class.getName()).log(Level.SEVERE, null, ex);
//            }
//        }
        return null;
    }

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
                    + "           ,[Status])\n"
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
            if (rs_count_contract.next()) {
                staffID = rs_count_contract.getInt("StaffID");
            }

            String sql_custaff = "INSERT INTO [Customer_Staff]\n"
                    + "           ([CustomerID]\n"
                    + "           ,[StaffID]\n"
                    + "           ,[StartDate])\n"
                    + "     VALUES\n"
                    + "           (?\n"
                    + "           ,?\n"
                    + "           ,?)";

            PreparedStatement stm_custaff = connection.prepareStatement(sql_custaff);
            stm_custaff.setInt(1, customer.getAccount().getId());
            stm_custaff.setInt(2, staffID);
            stm_custaff.setTimestamp(3, customer.getJoinDate());
            stm_custaff.executeUpdate();
            
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

    public CustomerStaff viewCustomer(int id) {
        try {
            CustomerStaff cs = new CustomerStaff();

            String sql = "SELECT Customer_Staff.CustomerID\n"
                    + "       ,Customer.[FirstName] as customer_FirstName\n"
                    + "       ,Customer.[LastName] as customer_LastName\n"
                    + "       ,[Address]\n"
                    + "       ,[Dob]\n"
                    + "       ,[JoinDate]\n"
                    + "       ,Customer.[Phone]\n"
                    + "       ,[PersonalID]\n"
                    + "       ,Account.Email\n"
                    + "       ,Account.[Status]\n"
                    + "	   ,Staff.FirstName as staff_FirstName\n"
                    + "	   ,Staff.LastName as staff_LastName\n"
                    + "  FROM [Customer_Staff]\n"
                    + "  INNER JOIN Customer\n"
                    + "			ON Customer.AccountID = Customer_Staff.CustomerID\n"
                    + "  INNER JOIN Staff \n"
                    + "			ON Staff.AccountID = Customer_Staff.StaffID\n"
                    + "  INNER JOIN Account\n"
                    + "			ON Account.ID = Customer.AccountID\n"
                    + "  WHERE CustomerID = ?";
            PreparedStatement stm = connection.prepareStatement(sql);
            stm.setInt(1, id);
            ResultSet rs = stm.executeQuery();

            if (rs.next()) {
                Customer customer = new Customer();
                customer.setFirstName(rs.getString("customer_FirstName"));
                customer.setLastName(rs.getString("customer_LastName"));
                customer.setAddress(rs.getString("Address"));
                customer.setDob(rs.getDate("Dob"));
                customer.setJoinDate(rs.getTimestamp("JoinDate"));
                customer.setPhone(rs.getString("Phone"));
                customer.setPersonalID(rs.getString("PersonalID"));

                Account account = new Account();
                account.setId(rs.getInt("CustomerID"));
                account.setEmail(rs.getString("Email"));
                account.setStatus(rs.getBoolean("Status"));

                customer.setAccount(account);

                Staff staff = new Staff();
                staff.setFirstName(rs.getString("staff_FirstName"));
                staff.setLastName(rs.getString("staff_LastName"));

                cs.setCustomer(customer);
                cs.setStaff(staff);
                return cs;
            }
        } catch (SQLException ex) {
            Logger.getLogger(CustomerDBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}

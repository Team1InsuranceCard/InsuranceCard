/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
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
public class CustomerStaffDBContext extends DBContext {

    public CustomerStaff viewCustomer(int id) {
        CustomerStaff cs = new CustomerStaff();
        try {
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
                customer.setJoinDate(rs.getDate("JoinDate"));
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
            Logger.getLogger(CustomerStaffDBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public void create(CustomerStaff cs) {
        try {
            String sql = "insert into Customer_Staff\n"
                    + "(CustomerID, StaffID, StartDate)\n"
                    + "values (?, ?, ?)";
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setInt(1, cs.getCustomer().getAccount().getId());
            ps.setInt(2, cs.getStaff().getAccount().getId());
            ps.setDate(3, cs.getStartDate());
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(AccountDBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}

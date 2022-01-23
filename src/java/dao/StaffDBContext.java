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
import model.Customer;
import model.CustomerStaff;

/**
 *
 * @author area1
 */
public class StaffDBContext extends DBContext {

    public void createCustomer(CustomerStaff cus_staff) {
        try {
            Customer cus = cus_staff.getCustomer();            
            connection.setAutoCommit(false);
            // create account for customer
            String sql_acc = "INSERT INTO Account\n"
                    + "(Email, Password, Role, Status, isDelete)\n"
                    + "VALUES (?, ?, 0, 1, 0)";
            PreparedStatement ps_acc = connection.prepareStatement(sql_acc);
            ps_acc.setString(1, cus.getAccount().getEmail());
            ps_acc.setString(2, cus.getAccount().getPassword());
            ps_acc.executeUpdate();
            // get customer's account id            
            String sql_get_acc_id = "select @@IDENTITY as aid";
            PreparedStatement ps_get_acc_id = connection.prepareStatement(sql_get_acc_id);
            ResultSet rs_get_id = ps_get_acc_id.executeQuery();
            if (rs_get_id.next()) {
                cus.getAccount().setId(rs_get_id.getInt("aid"));
            }
            // insert customer
            String sql_cus = "insert into Customer\n"
                    + "(AccountID, FirstName, LastName, Address, Dob, \n"
                    + "JoinDate, Phone, PersonalID, Province, District)\n"
                    + "values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement ps_cus = connection.prepareStatement(sql_cus);
            ps_cus.setInt(1, cus.getAccount().getId());
            ps_cus.setString(2, cus.getFirstName());
            ps_cus.setString(3, cus.getLastName());
            ps_cus.setString(4, cus.getAddress());
            ps_cus.setDate(5, cus.getDob());
            ps_cus.setTimestamp(6, cus.getJoinDate());
            ps_cus.setString(7, cus.getPhone());
            ps_cus.setString(8, cus.getPersonalID());
            ps_cus.setString(9, cus.getProvince());
            ps_cus.setString(10, cus.getDistrict());
            ps_cus.executeUpdate();
            // insert cus_staff
            String sql_cus_staff = "insert into Customer_Staff\n"
                    + "(CustomerID, StaffID)\n"
                    + "values (?, ?)";
            PreparedStatement ps_cus_staff = connection.prepareStatement(sql_cus_staff);
            ps_cus_staff.setInt(1, cus.getAccount().getId());
            ps_cus_staff.setInt(2, cus_staff.getStaff().getAccount().getId());
            ps_cus_staff.executeUpdate();
            connection.commit();
        } catch (SQLException ex) {
            Logger.getLogger(StaffDBContext.class.getName()).log(Level.SEVERE, null, ex);
            try {
                connection.rollback();
            } catch (SQLException ex1) {
                Logger.getLogger(StaffDBContext.class.getName()).log(Level.SEVERE, null, ex1);
            }
        } finally {
            try {
                connection.setAutoCommit(true);
            } catch (SQLException ex) {
                Logger.getLogger(StaffDBContext.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

}

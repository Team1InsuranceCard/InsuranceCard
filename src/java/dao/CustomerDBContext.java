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

/**
 *
 * @author area1
 */
public class CustomerDBContext extends DBContext {

    public void create(Customer c) {
        try {
            String sql = "insert into Customer\n"
                    + "(AccountID, FirstName, LastName, Address, Dob, \n"
                    + "JoinDate, Phone, PersonalID, Province, District)\n"
                    + "values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setInt(1, c.getAccount().getId());
            ps.setString(2, c.getFirstName());
            ps.setString(3, c.getLastName());
            ps.setString(4, c.getAddress());
            ps.setDate(5, c.getDob());
            ps.setDate(6, c.getJoinDate());
            ps.setString(7, c.getPhone());
            ps.setString(8, c.getPersonalID());
            ps.setString(9, c.getProvince());
            ps.setString(10, c.getDistrict());
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(AccountDBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}

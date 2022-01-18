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

/**
 *
 * @author area1
 */
public class AccountDBContext extends DBContext {

    public boolean checkExist(String email) {
        try {
            String sql = "select * from Account\n"
                    + "where Email = ? and Status = 1";
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(1, email);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(AccountDBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public int create(Account a) {
        try {
            String sql = "INSERT INTO Account\n"
                    + "(Email, Password, Role, Status, isDelete)\n"
                    + "VALUES (?, ?, 0, 1, 0)";
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(1, a.getEmail());
            ps.setString(2, a.getPassword());
            ps.executeUpdate();
            
            // get account id            
            String sql_get_id = "select @@IDENTITY as aid";
            PreparedStatement ps_get_id = connection.prepareStatement(sql);
            ResultSet rs_get_id = ps_get_id.executeQuery();
            if (rs_get_id.next()) {
                return rs_get_id.getInt("aid");
            }
        } catch (SQLException ex) {
            Logger.getLogger(AccountDBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return -1;
    }

}

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

/**
 *
 * @author area1
 */
public class AccountDBContext extends DBContext {

    public Account getAccount(String user, String pass) {
        try {
            String sql = "select ID, Email, [Password], [Role], [Status]\n"
                    + "from Account\n"
                    + "where Email = ?\n"
                    + "and [Password] = ?";
            PreparedStatement stm = connection.prepareStatement(sql);
            stm.setString(1, user);
            stm.setString(2, pass);
            ResultSet rs = stm.executeQuery();
            Account a = null;
            while (rs.next()) {
                if (a == null) {
                    a = new Account();
                    a.setId(rs.getInt("ID"));
                    a.setEmail(rs.getString("Email"));
                    a.setPassword(rs.getString("Password"));
                    a.setRole(rs.getBoolean("Role"));
                    a.setStatus(rs.getBoolean("Status"));
                }
            }
            return a;
        } catch (SQLException ex) {
            Logger.getLogger(AccountDBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

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

}

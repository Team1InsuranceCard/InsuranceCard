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
import model.AccountStatusCode;

/**
 *
 * @author area1
 */
public class AccountDBContext extends DBContext {

    public Account getAccount(String user, String pass) {
        try {
            String sql = "select ID, Email, [Password], [Role], [asc].StatusCode, [asc].StatusName\n"
                    + "from Account a inner join AccountStatusCode [asc] on a.[Status] = [asc].StatusCode\n"
                    + "where Email = ? and [Password] = ?";
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
                    AccountStatusCode asc = new AccountStatusCode();
                    asc.setStatusCode(rs.getShort("StatusCode"));
                    asc.setStatusName(rs.getString("StatusName"));
                    a.setStatusCode(asc);
                }
            }
            return a;
        } catch (SQLException ex) {
            Logger.getLogger(AccountDBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public Account getAccount(int accountID) {
        try {
            String sql = "select ID, Email, [Password], [Role], [asc].StatusCode, [asc].StatusName\n"
                    + "from Account a inner join AccountStatusCode [asc] on a.[Status] = [asc].StatusCode\n"
                    + "where ID = ? and a.[isDelete] = 0 and a.[Status] = 1";
            PreparedStatement stm = connection.prepareStatement(sql);
            stm.setInt(1, accountID);
            ResultSet rs = stm.executeQuery();

            if (rs.next()) {
                Account a = new Account();
                a.setId(rs.getInt("ID"));
                a.setEmail(rs.getString("Email"));
                a.setPassword(rs.getString("Password"));
                a.setRole(rs.getBoolean("Role"));
                AccountStatusCode asc = new AccountStatusCode();
                asc.setStatusCode(rs.getShort("StatusCode"));
                asc.setStatusName(rs.getString("StatusName"));
                a.setStatusCode(asc);
                return a;
            }
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
            Logger.getLogger(AccountDBContext.class
                    .getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public boolean checkExistCusAccEmail(Account cusAcc) {
        try {
            String sql = "select * from Account\n"
                    + "where Email = ? and Status = 1 and ID <> ?";
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(1, cusAcc.getEmail());
            ps.setInt(2, cusAcc.getId());
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                return true;

            }
        } catch (SQLException ex) {
            Logger.getLogger(AccountDBContext.class
                    .getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

}

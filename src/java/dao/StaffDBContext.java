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
import model.Staff;

/**
 *
 * @author area1
 */
public class StaffDBContext extends DBContext {

    public ArrayList<Staff> getStaffs() {
        ArrayList<Staff> staffs = new ArrayList<>();
        try {
            String sql = "select AccountID, FirstName, LastName\n"
                    + "from Staff";
            PreparedStatement ps = connection.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Account acc = new Account();
                acc.setId(rs.getInt("AccountID"));

                Staff staff = new Staff();
                staff.setAccount(acc);
                staff.setFirstName(rs.getString("FirstName"));
                staff.setLastName(rs.getString("LastName"));

                staffs.add(staff);
            }
        } catch (SQLException ex) {
            Logger.getLogger(StaffDBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return staffs;
    }

    public Staff getStaff(int accountId) {
        try {
            String sql = "select a.ID, a.Email, a.[Password], a.[Role], a.[Status], a.GoogleID, FirstName, LastName, Phone\n"
                    + "from Staff s inner join Account a on s.AccountID = a.ID\n"
                    + "where AccountID = ?";
            PreparedStatement stm = connection.prepareStatement(sql);
            stm.setInt(1, accountId);
            ResultSet rs = stm.executeQuery();
            Staff s = null;
            while (rs.next()) {
                if (s == null) {
                    s = new Staff();
                    Account a = new Account();
                    a.setId(accountId);
                    a.setEmail(rs.getString("Email"));
                    a.setPassword(rs.getString("Password"));
                    a.setRole(rs.getBoolean("Role"));
                    a.setStatus(rs.getByte("Status"));
                    a.setGoogleID(rs.getString("GoogleID"));
                    s.setAccount(a);
                    s.setFirstName(rs.getString("FirstName"));
                    s.setLastName(rs.getString("LastName"));
                    s.setPhone(rs.getString("Phone"));
                }
            }
            return s;
        } catch (SQLException ex) {
            Logger.getLogger(StaffDBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public int getTotalCus(int accountId) {
        try {
            String sql = "select s.AccountID, COUNT(cs.CustomerID) as customers\n"
                    + "from Staff s inner join Customer_Staff cs on s.AccountID = cs.StaffID\n"
                    + "where s.AccountID = ?\n"
                    + "group by s.AccountID, cs.NextStaff\n"
                    + "having cs.NextStaff is null";
            PreparedStatement stm = connection.prepareStatement(sql);
            stm.setInt(1, accountId);
            ResultSet rs = stm.executeQuery();
            int total = 0;
            while (rs.next()) {
                if (total == 0) {
                    total = rs.getInt("customers");
                }
            }
            return total;
        } catch (SQLException ex) {
            Logger.getLogger(StaffDBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
    }

    public int getTotalCont(int accountId) {
        try {
            String sql = "select c.StartStaff, COUNT(c.StartStaff) as contracts\n"
                    + "from [Contract] c inner join Staff s on c.StartStaff = s.AccountID\n"
                    + "where s.AccountID = ?\n"
                    + "group by c.StartStaff";
            PreparedStatement stm = connection.prepareStatement(sql);
            stm.setInt(1, accountId);
            ResultSet rs = stm.executeQuery();
            int total = 0;
            while (rs.next()) {
                if (total == 0) {
                    total = rs.getInt("contracts");
                }
            }
            return total;
        } catch (SQLException ex) {
            Logger.getLogger(StaffDBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
    }
}

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

    public int getStartStaff(int cusID) {
        int id = 0;
        try {
            String sql = "SELECT [StaffID]\n"
                    + "  FROM [Customer_Staff]\n"
                    + "  WHERE CustomerID = ? and NextStaff is null";
            PreparedStatement stm = connection.prepareStatement(sql);
            stm.setInt(1, cusID);
            ResultSet rs = stm.executeQuery();

            if (rs.next()) {
                id = rs.getInt("StaffID");
            }
        } catch (SQLException ex) {
            Logger.getLogger(StaffDBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return id;
    }
}

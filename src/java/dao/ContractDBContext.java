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

/**
 *
 * @author area1
 */
public class ContractDBContext extends DBContext{

    public int totalContracts(int id) {
        int totalContract = 0;
        try {
            String sql = "SELECT count(ID) as TotalContract\n"
                    + "FROM Contract\n"
                    + "WHERE CustomerID = ?";
            PreparedStatement stm = connection.prepareStatement(sql);
            stm.setInt(1, id);
            ResultSet rs = stm.executeQuery();
            
            if(rs.next()) {
                totalContract = rs.getInt("TotalContract");
            }
        } catch (SQLException ex) {
            Logger.getLogger(ContractDBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return totalContract;
    }
}

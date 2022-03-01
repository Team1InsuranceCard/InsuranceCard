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
import model.Delivery;

/**
 *
 * @author quynm
 */
public class DeliveryDBContext extends DBContext {

    public void insertDelivery(Delivery delivery) {
        try {
            String sql = "INSERT INTO [Delivery]\n"
                    + "           ([FullName]\n"
                    + "           ,[Phone]\n"
                    + "           ,[Email]\n"
                    + "           ,[Address]\n"
                    + "           ,[Province]\n"
                    + "           ,[District]\n"
                    + "           ,[ContractID])\n"
                    + "     VALUES\n"
                    + "           (?,?,?,?,?,?,?)";
            PreparedStatement stm = connection.prepareStatement(sql);
            stm.setString(1, delivery.getFullName());
            stm.setString(2, delivery.getPhone());
            stm.setString(3, delivery.getEmail());
            stm.setString(4, delivery.getAddress());
            stm.setString(5, delivery.getProvince());
            stm.setString(6, delivery.getDistrict());
            stm.setInt(7, delivery.getContract().getId());
            stm.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(ContractDBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}

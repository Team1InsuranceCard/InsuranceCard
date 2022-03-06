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
import model.Accident;
import model.Contract;

/**
 *
 * @author area1
 */
public class AccidentDBContext extends DBContext {

    public void setAccident(Accident accident) {
        String sql_insert_accident = "INSERT INTO [Accident]\n"
                + "           ([AccidentDate]\n"
                + "           ,[Title]\n"
                + "           ,[CreatedDate]\n"
                + "           ,[Attachment]\n"
                + "           ,[HumanDamage]\n"
                + "           ,[VehicleDamage]\n"
                + "           ,[ContractID])\n"
                + "     VALUES\n"
                + "           (? ,? ,? ,? ,? ,?,?)";
        try {
            PreparedStatement psm_insert_accident = connection.prepareStatement(sql_insert_accident);
            int i = 0;
            psm_insert_accident.setTimestamp(++i, accident.getAccidentDate());
            psm_insert_accident.setString(++i, accident.getTitle());
            psm_insert_accident.setTimestamp(++i, accident.getCreatedDate());
            psm_insert_accident.setString(++i, accident.getAttachment());
            psm_insert_accident.setString(++i, accident.getHumanDamage());
            psm_insert_accident.setString(++i, accident.getVehicleDamage());
            psm_insert_accident.setInt(++i, accident.getContract().getId());

            psm_insert_accident.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(AccidentDBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Accident getAccident(int id) {
        Accident accident = new Accident();
        try {
            String sql = "select Title\n"
                    + "	, ContractID\n"
                    + "	, CreatedDate\n"
                    + "	, AccidentDate\n"
                    + "	, HumanDamage\n"
                    + "	, VehicleDamage\n"
                    + "	, Attachment\n"
                    + "from Accident\n"
                    + "where ID = ?";
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                Contract contract = new Contract();
                contract.setId(rs.getInt("ContractID"));
                
                accident.setId(id);
                accident.setTitle(rs.getString("Title"));
                accident.setContract(contract);
                accident.setCreatedDate(rs.getTimestamp("CreatedDate"));
                accident.setAccidentDate(rs.getTimestamp("AccidentDate"));
                accident.setHumanDamage(rs.getString("HumanDamage"));
                accident.setVehicleDamage(rs.getString("VehicleDamage"));
                accident.setAttachment(rs.getString("Attachment"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(AccidentDBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return accident;
    }

}

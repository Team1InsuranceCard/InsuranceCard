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
import model.Contract;

/**
 *
 * @author area1
 */
public class ContractDBContext extends DBContext {

    public int totalContracts(int id) {
        int totalContract = 0;
        try {
            String sql = "SELECT count(ID) as TotalContract\n"
                    + "FROM Contract\n"
                    + "WHERE CustomerID = ?";
            PreparedStatement stm = connection.prepareStatement(sql);
            stm.setInt(1, id);
            ResultSet rs = stm.executeQuery();

            if (rs.next()) {
                totalContract = rs.getInt("TotalContract");
            }
        } catch (SQLException ex) {
            Logger.getLogger(ContractDBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return totalContract;
    }

    public Contract getContract(int accountID, int contractID) {
        Contract contract = new Contract();
        try {
            String sql = "SELECT Contract.[ID]\n"
                    + "      ,[ProductID]\n"
                    + "      ,[CustomerID]\n"
                    + "      ,[StartDate]\n"
                    + "      ,[EndDate]\n"
                    + "      ,Contract.[Status]\n"
                    + "      ,[ContractFee]\n"
                    + "      ,[CancelComment]\n"
                    + "      ,[CancelReason]\n"
                    + "      ,[CancelDate]\n"
                    + "      ,[CancelRequestDate]\n"
                    + "      ,[VehicleType]\n"
                    + "      ,[Engine]\n"
                    + "      ,[LicensePlate]\n"
                    + "      ,[Color]\n"
                    + "      ,[CertImage]\n"
                    + "      ,[Brand]\n"
                    + "      ,[Owner]\n"
                    + "      ,[Chassis]\n"
                    + "      ,[RequestDate]\n"
                    + "      ,[ResolveDate]\n"
                    + "	  ,Customer.[FirstName] as Cus_fname\n"
                    + "      ,Customer.[LastName] as Cus_lname\n"
                    + "      ,[Address]\n"
                    + "      ,[Dob]\n"
                    + "      ,Customer.[Phone]\n"
                    + "      ,[PersonalID]\n"
                    + "	  ,Product.[Title]\n"
                    + "      ,[Price]\n"
                    + "      ,[ContentDetail]\n"
                    + "	  ,Staff.[FirstName] as Staff_fname\n"
                    + "      ,Staff.[LastName] as Staff_lname\n"
                    + "  FROM [Contract]\n"
                    + "  INNER JOIN Customer\n"
                    + "  ON Customer.AccountID = Contract.CustomerID\n"
                    + "  INNER JOIN Product\n"
                    + "  ON Product.ID = Contract.ProductID\n"
                    + "  INNER JOIN Staff\n"
                    + "  ON Staff.AccountID = Contract.StaffID\n"
                    + "  WHERE Customer.AccountID = ? and Contract.ID = ?";
            PreparedStatement stm = connection.prepareStatement(sql);
            stm.setInt(1, accountID);
            stm.setInt(2, contractID);
            ResultSet rs = stm.executeQuery();
            
            if (rs.next()) {
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(ContractDBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
       return contract;
    }
}

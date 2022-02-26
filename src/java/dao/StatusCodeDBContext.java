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
import model.ContractStatusCode;
import model.ProductStatusCode;

/**
 *
 * @author area1
 */
public class StatusCodeDBContext extends DBContext {

    public ArrayList<ContractStatusCode> getContractStatusCodes() {
        ArrayList<ContractStatusCode> statusCodes = new ArrayList<>();
        String sql_select_statuscode = "SELECT [StatusCode]\n"
                + "      ,[StatusName]\n"
                + "  FROM [ContractStatusCode]";

        try {
            PreparedStatement psm_select_statuscode = connection.prepareStatement(sql_select_statuscode);
            ResultSet rs_select_statuscode = psm_select_statuscode.executeQuery();
            while (rs_select_statuscode.next()) {
                ContractStatusCode statusCode = new ContractStatusCode();
                statusCode.setStatusCode(rs_select_statuscode.getShort("StatusCode"));
                statusCode.setStatusName(rs_select_statuscode.getString("StatusName"));

                statusCodes.add(statusCode);
            }
            return statusCodes;
        } catch (SQLException ex) {
            Logger.getLogger(StatusCodeDBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    public ContractStatusCode getContractStatusCode(int code) {
        String sql_select_statuscode = "SELECT [StatusCode]\n"
                + "      ,[StatusName]\n"
                + "  FROM [ContractStatusCode]"
                + "  WHERE [StatusCode] = ?";

        try {
            PreparedStatement psm_select_statuscode = connection.prepareStatement(sql_select_statuscode);
            psm_select_statuscode.setInt(1, code);
            ResultSet rs_select_statuscode = psm_select_statuscode.executeQuery();
            if (rs_select_statuscode.next()) {
                ContractStatusCode statusCode = new ContractStatusCode();
                statusCode.setStatusCode(rs_select_statuscode.getShort("StatusCode"));
                statusCode.setStatusName(rs_select_statuscode.getString("StatusName"));

                return statusCode;
            }
        } catch (SQLException ex) {
            Logger.getLogger(StatusCodeDBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}

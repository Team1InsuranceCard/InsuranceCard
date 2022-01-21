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
public class PaymentDBContext extends DBContext {

    public double totalAmountSpent(int customerID) {
        try {
            double totalAmount = 0;
            String sql_count_total_amount = "SELECT SUM(Payment.Amout) AS TotalAmount\n"
                    + "  FROM [Contract] INNER JOIN Payment ON Contract.ID=Payment.ContractID\n"
                    + "	WHERE Contract.CustomerID = ? AND Payment.PaidDate IS NOT NULL";
            PreparedStatement psm_count_total_amount = connection.prepareStatement(sql_count_total_amount);
            psm_count_total_amount.setInt(1, customerID);
            ResultSet rs_count_total_amount = psm_count_total_amount.executeQuery();

            if (rs_count_total_amount.next()) {
                totalAmount = rs_count_total_amount.getDouble("TotalAmount");
            }
            return totalAmount;
        } catch (SQLException ex) {
            Logger.getLogger(PaymentDBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
    }
}

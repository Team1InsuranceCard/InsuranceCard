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
import model.Customer;

/**
 *
 * @author area1
 */
public class CustomerDBContext extends DBContext {
    public void getCustomer(int customerID){
        try {
            String sql_Select_Customer = "";
            PreparedStatement psm_Select_Customer = connection.prepareStatement(sql_Select_Customer);
            ResultSet rs_select_customer = psm_Select_Customer.executeQuery();
            if(rs_select_customer.next()){
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(CustomerDBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
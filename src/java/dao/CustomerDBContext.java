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
import model.Customer;

/**
 *
 * @author area1
 */
public class CustomerDBContext extends DBContext {

    public ArrayList<Customer> checkDupRegister() {
        ArrayList<Customer> customers = new ArrayList<>();
        try {
            String sql = "SELECT [PersonalID]\n"
                    + "	   ,Account.Email\n"
                    + "  FROM [Customer]\n"
                    + "  INNER JOIN Account\n"
                    + "  ON Account.ID = Customer.AccountID";
            PreparedStatement stm = connection.prepareStatement(sql);
            ResultSet rs = stm.executeQuery();
            
            while(rs.next()) {
                Account account = new Account();
                account.setEmail(rs.getString("Email").trim());
                
                Customer customer = new Customer();
                customer.setPersonalID(rs.getString("PersonalID").trim());
                customer.setAccount(account);
                
                customers.add(customer);            
            }
        } catch (SQLException ex) {
            Logger.getLogger(CustomerDBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return customers;
    }
}

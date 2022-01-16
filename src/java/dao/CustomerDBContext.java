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
public class CustomerDBContext extends DBContext{

    public Customer getCustomer(int id) {
        Customer customer = new Customer();
        try {
            String sql = "SELECT Customer.[AccountID]\n"
                    + "      ,[FirstName]\n"
                    + "      ,[LastName]\n"
                    + "      ,[Address]\n"
                    + "      ,[Dob]\n"
                    + "      ,[JoinDate]\n"
                    + "      ,[Phone]\n"
                    + "      ,[PersonalID]\n"
                    + "	  ,Account.Email\n"
                    + "	  ,[Status]\n"
                    + "  FROM [Customer]\n"
                    + "  INNER JOIN Account \n"
                    + "  ON Customer.AccountID = Account.ID\n"
                    + "  WHERE AccountID = ?";
            PreparedStatement stm = connection.prepareStatement(sql);
            stm.setInt(1, id);
            ResultSet rs = stm.executeQuery();
            
            if(rs.next()) {
                Account account = new Account();
                account.setId(rs.getInt("AccountID"));
                account.setEmail(rs.getString("Email"));
                account.setStatus(rs.getBoolean("Status"));
                
                customer.setAccountID(account);
                customer.setFirstName(rs.getString("FirstName"));
                customer.setLastName(rs.getString("LastName"));
                customer.setAddress(rs.getString("Address"));
                customer.setDob(rs.getDate("Dob"));
                customer.setJoinDate(rs.getDate("JoinDate"));
                customer.setPhone(rs.getString("Phone"));
                customer.setPersonalID(rs.getString("PersonalID"));
                
                return customer;
            }
        } catch (SQLException ex) {
            Logger.getLogger(CustomerDBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}

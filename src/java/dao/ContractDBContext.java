/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.time.LocalDate;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Contract;
import model.Customer;
import model.Product;
import model.Staff;

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
            String sql = "SELECT Product.[Title]\n"
                    + "      ,[Price]\n"
                    + "      ,[ContentDetail]\n"
                    + "	  ,Customer.[FirstName] as Cus_fname\n"
                    + "	  ,Customer.[LastName] as Cus_lname\n"
                    + "      ,[Address]\n"
                    + "      ,[Dob]\n"
                    + "      ,Customer.[Phone]\n"
                    + "      ,[PersonalID]\n"
                    + "	  ,Contract.[StartDate]\n"
                    + "      ,[EndDate]\n"
                    + "      ,Contract.[Status]\n"
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
                    + "	  ,Staff.[FirstName] as StartStaff_fname\n"
                    + "	  ,Staff.[LastName] as StartStaff_lname\n"
                    + "      ,(SELECT Staff.[FirstName]\n"
                    + "		FROM Contract\n"
                    + "		INNER JOIN Staff ON Staff.AccountID = Contract.CancelStaff\n"
                    + "		) as CancelStaff_fname\n"
                    + "	  ,(SELECT Staff.[LastName]\n"
                    + "		FROM Contract\n"
                    + "		INNER JOIN Staff ON Staff.AccountID = Contract.CancelStaff\n"
                    + "		) as CancelStaff_lname\n"
                    + "  FROM [Contract]\n"
                    + "  INNER JOIN Customer\n"
                    + "  ON Customer.AccountID = Contract.CustomerID\n"
                    + "  INNER JOIN Product\n"
                    + "  ON Product.ID = Contract.ProductID\n"
                    + "  INNER JOIN Staff\n"
                    + "  ON Staff.AccountID = Contract.StartStaff\n"
                    + "  WHERE Contract.CustomerID = ? and Contract.ID = ?";
            PreparedStatement stm = connection.prepareStatement(sql);
            stm.setInt(1, accountID);
            stm.setInt(2, contractID);
            ResultSet rs = stm.executeQuery();

            if (rs.next()) {
                Product product = new Product();
                product.setTitle(rs.getString("Title"));
                product.setPrice(rs.getDouble("Price"));
                product.setContentDetail(rs.getString("ContentDetail"));

                Customer customer = new Customer();
                customer.setFirstName(rs.getString("Cus_fname"));
                customer.setLastName(rs.getString("Cus_lname"));
                customer.setAddress(rs.getString("Address"));
                customer.setDob(rs.getDate("Dob"));
                customer.setPhone(rs.getString("Phone"));
                customer.setPersonalID(rs.getString("PersonalID"));
                
                Staff start_staff = new Staff();
                start_staff.setFirstName(rs.getString("StartStaff_fname"));
                start_staff.setLastName(rs.getString("StartStaff_lname"));
                
                Staff cancel_staff = new Staff();
                cancel_staff.setFirstName(rs.getString("CancelStaff_fname"));
                cancel_staff.setLastName(rs.getString("CancelStaff_lname"));
                
                contract.setProduct(product);
                contract.setCustomer(customer);
                contract.setStartStaff(start_staff);
                contract.setCancelStaff(cancel_staff);
                contract.setStartDate(rs.getTimestamp("StartDate"));
                contract.setEndDate(rs.getTimestamp("EndDate"));
                contract.setStatus(rs.getShort("Status"));
                contract.setCancelComment(rs.getString("CancelComment"));
                
                        
                return contract;
            }
        } catch (SQLException ex) {
            Logger.getLogger(ContractDBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}

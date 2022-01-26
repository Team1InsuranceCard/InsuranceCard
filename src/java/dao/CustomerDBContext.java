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
import model.CustomerStaff;
import model.Staff;

/**
 *
 * @author area1
 */
public class CustomerDBContext extends DBContext {

    public Account getCustomerByEmailNGoogleID(String email, String googleID) {
        try {
//            Customer customer = new Customer();
            connection.setAutoCommit(false);
            String sql_select_account = "SELECT [ID]\n"
                    + "      ,[Email]\n"
                    + "      ,[Password]\n"
                    + "      ,[Role]\n"
                    + "      ,[Status]\n"
                    + "      ,[GoogleID]\n"
                    + "  FROM [Account]\n"
                    + "  WHERE (Email=? OR GoogleID=?) AND Status=1 AND isDelete=0";
            PreparedStatement psm_select_account = connection.prepareStatement(sql_select_account);
            psm_select_account.setNString(1, email);
            psm_select_account.setNString(2, googleID);
            ResultSet rs_select_account = psm_select_account.executeQuery();
            Account account = null;
//            Boolean isAccountExist = false;
            if (rs_select_account.next()) {
                account = new Account();
                account.setId(rs_select_account.getInt("ID"));
                account.setEmail(rs_select_account.getString("Email"));
                account.setPassword(rs_select_account.getString("Password"));
                account.setRole(rs_select_account.getBoolean("Role"));
                account.setStatus(rs_select_account.getShort("Status"));
                String gettingGoogleID = rs_select_account.getString("GoogleID");
                if (gettingGoogleID == null) {
                    gettingGoogleID = "";
                }
                account.setGoogleID(gettingGoogleID);
//                isAccountExist = true;
            }
            if (account != null && (account.getGoogleID().isEmpty() || account.getGoogleID() == null)) {
                String sql_update_googleID = "UPDATE [Account]\n"
                        + "   SET[GoogleID] = ?\n"
                        + " WHERE ID=?";
                PreparedStatement psm_update_googleID = connection.prepareStatement(sql_update_googleID);
                psm_update_googleID.setString(1, googleID);
                psm_update_googleID.setInt(2, account.getId());
                psm_update_googleID.executeUpdate();
                account.setGoogleID(googleID);
//                customer.setAccount(account);;
                //query get Info Customer from AccountID
                ////
            }
            connection.commit();
            return account;
        } catch (SQLException ex) {
            try {
                connection.rollback();
            } catch (SQLException ex1) {
                Logger.getLogger(CustomerDBContext.class.getName()).log(Level.SEVERE, null, ex1);
            }
            Logger.getLogger(CustomerDBContext.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                connection.setAutoCommit(true);
            } catch (SQLException ex) {
                Logger.getLogger(CustomerDBContext.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        return null;
    }

//    public void insertCustomerByGoogle(Customer customer) {
//        try {
//            connection.setAutoCommit(false);
//            String sql_insert_account = "INSERT INTO [Account]\n"
//                    + "           ([Email]\n"
//                    + "           ,[Role]\n"
//                    + "           ,[Status]\n"
//                    + "           ,[GoogleID])\n"
//                    + "     VALUES\n"
//                    + "           (?\n"
//                    + "           ,0\n"
//                    + "           ,1\n"
//                    + "           ,?)";
//            PreparedStatement psm_insert_account = connection.prepareStatement(sql_insert_account);
//            psm_insert_account.setString(1, customer.getAccount().getEmail());
//            psm_insert_account.setString(2, customer.getAccount().getGoogleID());
//            psm_insert_account.executeUpdate();
//            //select accountId to insert into customer table
//            String sql_get_accountid = "select @@identity as account_id";
//            PreparedStatement stm_get_accountid = connection.prepareStatement(sql_get_accountid);
//            ResultSet rs_accountid = stm_get_accountid.executeQuery();
//            if (rs_accountid.next()) {
//                customer.getAccount().setId(rs_accountid.getInt("account_id"));
//            }
//            //
//
//            String sql_insert_customer = "INSERT INTO [dbo].[Customer]\n"
//                    + "           ([AccountID]\n"
//                    + "           ,[FirstName]\n"
//                    + "           ,[LastName]\n"
//                    + "           ,[JoinDate])\n"
//                    + "     VALUES\n"
//                    + "           (?\n"
//                    + "           ,?\n"
//                    + "           ,?\n"
//                    + "           ,?)";
//            PreparedStatement psm_insert_customer = connection.prepareStatement(sql_insert_customer);
//            psm_insert_customer.setInt(1, customer.getAccount().getId());
//            psm_insert_customer.setNString(2, customer.getFirstName());
//            psm_insert_customer.setNString(3, customer.getLastName());
//            psm_insert_customer.setTimestamp(4, customer.getJoinDate());
//
//            psm_insert_customer.executeUpdate();
//            connection.commit();
//
//        } catch (SQLException ex) {
//            try {
//                connection.rollback();
//            } catch (SQLException ex1) {
//                Logger.getLogger(CustomerDBContext.class.getName()).log(Level.SEVERE, null, ex1);
//            }
//            Logger.getLogger(CustomerDBContext.class.getName()).log(Level.SEVERE, null, ex);
//        } finally {
//            try {
//                connection.setAutoCommit(true);
//            } catch (SQLException ex) {
//                Logger.getLogger(CustomerDBContext.class.getName()).log(Level.SEVERE, null, ex);
//            }
//        }
//
//    }
    public CustomerStaff getCustomerDashboard(int customerID) {
        try {
//            connection.setAutoCommit(false);
            String sql_Select_Customer = "SELECT [Customer].AccountID AS CustomerID\n"
                    + "      ,[Customer].[FirstName] AS CustomerFirstname\n"
                    + "      ,[Customer].[LastName] AS CustomerLastName,\n"
                    + "	  Staff.AccountID AS StaffID,\n"
                    + "	  Staff.FirstName AS StaffFirstname, Staff.LastName AS StaffLastname,\n"
                    + "	  Staff.Phone AS Staffphone, AccountStaff.Email AS Staffemail\n"
                    + "  FROM [Customer] INNER JOIN Customer_Staff ON Customer.AccountID = Customer_Staff.CustomerID\n"
                    + "  INNER JOIN Staff ON Customer_Staff.StaffID=Staff.AccountID\n"
                    + "  INNER JOIN Account AS AccounTStaff ON Staff.AccountID = AccounTStaff.ID\n"
                    + "  WHERE AccounTStaff.[Status] IN (1) AND Customer_Staff.EndDate IS NULL AND\n"
                    + "  Customer.AccountID = ?";
            PreparedStatement psm_Select_Customer = connection.prepareStatement(sql_Select_Customer);
            psm_Select_Customer.setInt(1, customerID);
            ResultSet rs_select_customer = psm_Select_Customer.executeQuery();
            CustomerStaff cs = new CustomerStaff();

            if (rs_select_customer.next()) {
                Customer cus = new Customer();
                cus.setFirstName(rs_select_customer.getString("CustomerFirstname"));
                cus.setLastName(rs_select_customer.getString("CustomerLastName"));
                Staff staff = new Staff();

                staff.setFirstName(rs_select_customer.getString("StaffFirstname"));
                staff.setLastName(rs_select_customer.getString("StaffLastname"));
                staff.setPhone(rs_select_customer.getString("Staffphone"));
                Account account = new Account();
                account.setEmail(rs_select_customer.getString("Staffemail"));
                account.setId(rs_select_customer.getInt("StaffID"));

                staff.setAccount(account);
                cs.setCustomer(cus);
                cs.setStaff(staff);
            }
//            connection.commit();
            return cs;
        } catch (SQLException ex) {
//            try {
//                connection.rollback();
            Logger.getLogger(CustomerDBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
//catch (SQLException ex1) {
//                Logger.getLogger(CustomerDBContext.class.getName()).log(Level.SEVERE, null, ex1);
//            }

//        } finally {
//            try {
//
//                connection.setAutoCommit(true);
//            } catch (SQLException ex) {
//                Logger.getLogger(CustomerDBContext.class.getName()).log(Level.SEVERE, null, ex);
//            }
//        }
        return null;
    }

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

            while (rs.next()) {
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

    public void register(Customer customer, Account account) {
        try {
            connection.setAutoCommit(false);
            String sql_account = "INSERT INTO [Account]\n"
                    + "	([Email]\n"
                    + "	,[Password]\n"
                    + "	,[Role]\n"
                    + "	,[Status]\n"
                    + "	,[GoogleID])\n"
                    + "	VALUES\n"
                    + "	(?\n"
                    + "	,?\n"
                    + "	,?\n"
                    + "	,?\n"
                    + "	,?)";

            PreparedStatement stm_account = connection.prepareStatement(sql_account);
            stm_account.setString(1, account.getEmail());
            stm_account.setString(2, account.getPassword());
            stm_account.setBoolean(3, false);
            stm_account.setBoolean(4, true);
            stm_account.setString(5, account.getGoogleID());
            stm_account.executeUpdate();

            String sql_get_accountid = "select @@identity as account_id";
            PreparedStatement stm_get_accountid = connection.prepareStatement(sql_get_accountid);
            ResultSet rs_accountid = stm_get_accountid.executeQuery();

            if (rs_accountid.next()) {
                account.setId(rs_accountid.getInt("account_id"));
                customer.setAccount(account);
            }

            String sql_customer = "INSERT INTO [Customer]\n"
                    + "           ([AccountID]\n"
                    + "           ,[FirstName]\n"
                    + "           ,[LastName]\n"
                    + "           ,[Address]\n"
                    + "           ,[Dob]\n"
                    + "           ,[JoinDate]\n"
                    + "           ,[Phone]\n"
                    + "           ,[PersonalID]\n"
                    + "           ,[Province]\n"
                    + "           ,[District])\n"
                    + "     VALUES\n"
                    + "           (?\n"
                    + "           ,?\n"
                    + "           ,?\n"
                    + "           ,?\n"
                    + "           ,?\n"
                    + "           ,?\n"
                    + "           ,?\n"
                    + "           ,?\n"
                    + "           ,?\n"
                    + "           ,?)";

            PreparedStatement stm_customer = connection.prepareStatement(sql_customer);
            stm_customer.setInt(1, customer.getAccount().getId());
            stm_customer.setString(2, customer.getFirstName());
            stm_customer.setString(3, customer.getLastName());
            stm_customer.setString(4, customer.getAddress());
            stm_customer.setDate(5, customer.getDob());
            stm_customer.setTimestamp(6, customer.getJoinDate());
            stm_customer.setString(7, customer.getPhone());
            stm_customer.setString(8, customer.getPersonalID());
            stm_customer.setString(9, customer.getProvince());
            stm_customer.setString(10, customer.getDistrict());
            stm_customer.executeUpdate();

            String sql_count_contract = "SELECT top 1 Staff.AccountID as StaffID, \n"
                    + "		count(Contract.CustomerID) as NumberOfContract\n"
                    + "FROM Staff\n"
                    + "	INNER JOIN Account\n"
                    + "	ON Account.ID = Staff.AccountID\n"
                    + "	LEFT JOIN Customer_Staff\n"
                    + "	ON Customer_Staff.StaffID = Staff.AccountID\n"
                    + "	LEFT JOIN Customer\n"
                    + "	ON Customer.AccountID = Customer_Staff.CustomerID\n"
                    + "	LEFT JOIN Contract\n"
                    + "	ON Contract.CustomerID = Customer.AccountID\n"
                    + "WHERE Account.Status = 1 and (Contract.Status in (1, 2, 3, 5) or Contract.Status is null)\n"
                    + "GROUP BY Staff.AccountID\n"
                    + "ORDER BY NumberOfContract asc";
            PreparedStatement stm_count_contract = connection.prepareStatement(sql_count_contract);
            ResultSet rs_count_contract = stm_count_contract.executeQuery();

            int staffID = 0;
            if (rs_count_contract.next()) {
                staffID = rs_count_contract.getInt("StaffID");
            }

            String sql_custaff = "INSERT INTO [Customer_Staff]\n"
                    + "           ([CustomerID]\n"
                    + "           ,[StaffID]\n"
                    + "           ,[StartDate])\n"
                    + "     VALUES\n"
                    + "           (?\n"
                    + "           ,?\n"
                    + "           ,?)";

            PreparedStatement stm_custaff = connection.prepareStatement(sql_custaff);
            stm_custaff.setInt(1, customer.getAccount().getId());
            stm_custaff.setInt(2, staffID);
            stm_custaff.setTimestamp(3, customer.getJoinDate());
            stm_custaff.executeUpdate();

            connection.commit();
        } catch (SQLException ex) {
            Logger.getLogger(CustomerDBContext.class.getName()).log(Level.SEVERE, null, ex);
            try {
                connection.rollback();
            } catch (SQLException ex1) {
                Logger.getLogger(CustomerDBContext.class.getName()).log(Level.SEVERE, null, ex1);
            }
        } finally {
            try {
                connection.setAutoCommit(true);
            } catch (SQLException ex) {
                Logger.getLogger(CustomerDBContext.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public CustomerStaff viewCustomer(int id) {
        try {
            CustomerStaff cs = new CustomerStaff();

            String sql = "SELECT Customer_Staff.CustomerID\n"
                    + "       ,Customer_Staff.StaffID\n"
                    + "       ,Customer.[FirstName] as customer_FirstName\n"
                    + "       ,Customer.[LastName] as customer_LastName\n"
                    + "       ,[Address]\n"
                    + "       ,[Dob]\n"
                    + "       ,[JoinDate]\n"
                    + "       ,Customer.[Phone]\n"
                    + "       ,[PersonalID]\n"
                    + "       ,Account.Email\n"
                    + "       ,Account.[Status]\n"
                    + "       ,Province\n"
                    + "       ,District\n"
                    + "	   ,Staff.FirstName as staff_FirstName\n"
                    + "	   ,Staff.LastName as staff_LastName\n"
                    + "  FROM [Customer_Staff]\n"
                    + "  INNER JOIN Customer\n"
                    + "			ON Customer.AccountID = Customer_Staff.CustomerID\n"
                    + "  INNER JOIN Staff \n"
                    + "			ON Staff.AccountID = Customer_Staff.StaffID\n"
                    + "  INNER JOIN Account\n"
                    + "			ON Account.ID = Customer.AccountID\n"
                    + "  WHERE CustomerID = ?";
            PreparedStatement stm = connection.prepareStatement(sql);
            stm.setInt(1, id);
            ResultSet rs = stm.executeQuery();

            if (rs.next()) {
                Customer customer = new Customer();
                customer.setFirstName(rs.getString("customer_FirstName"));
                customer.setLastName(rs.getString("customer_LastName"));
                customer.setAddress(rs.getString("Address"));
                customer.setDob(rs.getDate("Dob"));
                customer.setJoinDate(rs.getTimestamp("JoinDate"));
                customer.setPhone(rs.getString("Phone"));
                customer.setPersonalID(rs.getString("PersonalID"));
                customer.setProvince(rs.getString("Province"));
                customer.setDistrict(rs.getString("District"));

                Account cus_account = new Account();
                cus_account.setId(rs.getInt("CustomerID"));
                cus_account.setEmail(rs.getString("Email"));
                cus_account.setStatus(rs.getShort("Status"));

                customer.setAccount(cus_account);

                Account staff_account = new Account();
                staff_account.setId(rs.getInt("StaffID"));

                Staff staff = new Staff();
                staff.setAccount(staff_account);
                staff.setFirstName(rs.getString("staff_FirstName"));
                staff.setLastName(rs.getString("staff_LastName"));

                cs.setCustomer(customer);
                cs.setStaff(staff);
                return cs;
            }
        } catch (SQLException ex) {
            Logger.getLogger(CustomerDBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public void staffCreateCustomer(CustomerStaff cusStaff) {
        try {
            Customer cus = cusStaff.getCustomer();
            connection.setAutoCommit(false);
            // create account for customer
            String sql_acc = "INSERT INTO Account\n"
                    + "(Email, Password, Role, Status, isDelete)\n"
                    + "VALUES (?, ?, 0, 1, 0)";
            PreparedStatement ps_acc = connection.prepareStatement(sql_acc);
            ps_acc.setString(1, cus.getAccount().getEmail());
            ps_acc.setString(2, cus.getAccount().getPassword());
            ps_acc.executeUpdate();
            // get customer's account id            
            String sql_get_acc_id = "select @@IDENTITY as aid";
            PreparedStatement ps_get_acc_id = connection.prepareStatement(sql_get_acc_id);
            ResultSet rs_get_id = ps_get_acc_id.executeQuery();
            if (rs_get_id.next()) {
                cus.getAccount().setId(rs_get_id.getInt("aid"));
            }
            // insert customer
            String sql_cus = "insert into Customer\n"
                    + "(AccountID, FirstName, LastName, Address, Dob, \n"
                    + "JoinDate, Phone, PersonalID, Province, District)\n"
                    + "values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement ps_cus = connection.prepareStatement(sql_cus);
            ps_cus.setInt(1, cus.getAccount().getId());
            ps_cus.setString(2, cus.getFirstName());
            ps_cus.setString(3, cus.getLastName());
            ps_cus.setString(4, cus.getAddress());
            ps_cus.setDate(5, cus.getDob());
            ps_cus.setTimestamp(6, cus.getJoinDate());
            ps_cus.setString(7, cus.getPhone());
            ps_cus.setString(8, cus.getPersonalID());
            ps_cus.setString(9, cus.getProvince());
            ps_cus.setString(10, cus.getDistrict());
            ps_cus.executeUpdate();
            // insert cus_staff
            String sql_cus_staff = "insert into Customer_Staff\n"
                    + "(CustomerID, StaffID)\n"
                    + "values (?, ?)";
            PreparedStatement ps_cus_staff = connection.prepareStatement(sql_cus_staff);
            ps_cus_staff.setInt(1, cus.getAccount().getId());
            ps_cus_staff.setInt(2, cusStaff.getStaff().getAccount().getId());
            ps_cus_staff.executeUpdate();
            connection.commit();
        } catch (SQLException ex) {
            Logger.getLogger(StaffDBContext.class.getName()).log(Level.SEVERE, null, ex);
            try {
                connection.rollback();
            } catch (SQLException ex1) {
                Logger.getLogger(StaffDBContext.class.getName()).log(Level.SEVERE, null, ex1);
            }
        } finally {
            try {
                connection.setAutoCommit(true);
            } catch (SQLException ex) {
                Logger.getLogger(StaffDBContext.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public void staffEditCustomer(CustomerStaff cusStaff) {
        try {
            connection.setAutoCommit(false);
            Customer cus = cusStaff.getCustomer();
            Account cusAcc = cus.getAccount();
            Account staffAcc = cusStaff.getStaff().getAccount();
            // update cus acc info
            String sql_acc = "update Account\n"
                    + "set Email = ?, Status = ?\n"
                    + "where ID = ?";
            PreparedStatement ps_acc = connection.prepareStatement(sql_acc);
            ps_acc.setString(1, cusAcc.getEmail());
            ps_acc.setInt(2, cusAcc.getStatus());
            ps_acc.setInt(3, cusAcc.getId());
            ps_acc.executeUpdate();
            // update cus info
            String sql_cus = "update Customer\n"
                    + "set FirstName = ?, LastName = ?, Address = ?, \n"
                    + "	Dob = ?, JoinDate = ?, Phone = ?, PersonalID = ?, \n"
                    + "	Province = ?, District = ?\n"
                    + "where AccountID = ?";
            PreparedStatement ps_cus = connection.prepareStatement(sql_cus);
            ps_cus.setString(1, cus.getFirstName());
            ps_cus.setString(2, cus.getLastName());
            ps_cus.setString(3, cus.getAddress());
            ps_cus.setDate(4, cus.getDob());
            ps_cus.setTimestamp(5, cus.getJoinDate());
            ps_cus.setString(6, cus.getPhone());
            ps_cus.setString(7, cus.getPersonalID());
            ps_cus.setString(8, cus.getProvince());
            ps_cus.setString(9, cus.getDistrict());
            ps_cus.setInt(10, cusAcc.getId());
            ps_cus.executeUpdate();
            // if new staff
            // insert new cus_staff
            String sql_insert_cs = "if exists (select *\n"
                    + "			from Customer_Staff\n"
                    + "			where CustomerID = ? and StaffID <> ? and EndDate is null)\n"
                    + "begin\n"
                    + "	insert into Customer_Staff\n"
                    + "	(CustomerID, StaffID, StartDate)\n"
                    + "	values (?, ?, GETDATE())\n"
                    + "end";
            PreparedStatement ps_insert_cs = connection.prepareStatement(sql_insert_cs);
            ps_insert_cs.setInt(1, cusAcc.getId());
            ps_insert_cs.setInt(2, staffAcc.getId());
            ps_insert_cs.setInt(3, cusAcc.getId());
            ps_insert_cs.setInt(4, staffAcc.getId());
            ps_insert_cs.executeUpdate();
            // if new staff
            // update old cus_staff
            String sql_update_cs = "update Customer_Staff\n"
                    + "set NextStaff = ?, EndDate = GETDATE()\n"
                    + "where CustomerID = ? and StaffID <> ? and EndDate is null";
            PreparedStatement ps_update_cs = connection.prepareStatement(sql_update_cs);
            ps_update_cs.setInt(1, staffAcc.getId());
            ps_update_cs.setInt(2, cusAcc.getId());
            ps_update_cs.setInt(3, staffAcc.getId());
            ps_update_cs.executeUpdate();
            connection.commit();
        } catch (SQLException ex) {
            Logger.getLogger(CustomerDBContext.class.getName()).log(Level.SEVERE, null, ex);
            try {
                connection.rollback();
            } catch (SQLException ex1) {
                Logger.getLogger(CustomerDBContext.class.getName()).log(Level.SEVERE, null, ex1);
            }
        } finally {
            try {
                connection.setAutoCommit(true);
            } catch (SQLException ex) {
                Logger.getLogger(CustomerDBContext.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

}

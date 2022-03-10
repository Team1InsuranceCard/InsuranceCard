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
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Account;
import model.AccountStatusCode;
import model.Product;
import model.ProductStatusCode;
import model.Staff;

/**
 *
 * @author area1
 */
public class StaffDBContext extends DBContext {

    public HashMap<Staff, Integer> getTop10RankStaffByContract() {
        HashMap<Staff, Integer> top10Ranks = new HashMap<>();
        String sql_select_top10_staff = "SELECT TOP 10 COUNT(Contract.ID) AS NumberContract,\n"
                + "	SUM(Payment.Amount) AS Revenues,\n"
                + "	Contract.StartStaff	\n"
                + "      ,[FirstName]\n"
                + "      ,[LastName]\n"
                + "      ,[Phone]\n"
                + "  FROM [Staff] LEFT JOIN Contract ON Contract.StartStaff = Staff.AccountID\n"
                + "	LEFT JOIN Account ON Staff.AccountID = Account.ID\n"
                + "	LEFT JOIN Payment ON Payment.ContractID = Contract.ID\n"
                + "	WHERE Account.isDelete = 0 AND Account.Status IN (1) AND Staff.isDelete = 0\n"
                + "	AND Contract.isDelete = 0\n"
                + "	GROUP BY Contract.StartStaff, Staff.[FirstName], Staff.LastName, Staff.Phone\n"
                + "	ORDER BY COUNT(Contract.CustomerID) DESC, SUM(Payment.Amount) DESC";
        try {
            PreparedStatement psm_select_top10_staff = connection.prepareStatement(sql_select_top10_staff);
            ResultSet rs_select_top10_staff = psm_select_top10_staff.executeQuery();
            while (rs_select_top10_staff.next()) {
                Staff staff = new Staff();
                Account account = new Account();
                account.setId(rs_select_top10_staff.getInt("StartStaff"));
                staff.setAccount(account);
                staff.setFirstName(rs_select_top10_staff.getString("FirstName"));
                staff.setLastName(rs_select_top10_staff.getString("LastName"));

                int numberContracts = rs_select_top10_staff.getInt("NumberContract");

                top10Ranks.put(staff, numberContracts);
            }

        } catch (SQLException ex) {
            Logger.getLogger(StaffDBContext.class.getName()).log(Level.SEVERE, null, ex);
        }

        return top10Ranks;
    }

    public ArrayList<Staff> getTop3RankStaffByContract() {
        ArrayList<Staff> topRank = new ArrayList<>();

        String sql_select_top3_staff = "SELECT TOP 3 COUNT(Contract.ID) AS NumberContract,\n"
                + "	SUM(Payment.Amount) AS Revenues,\n"
                + "	Contract.StartStaff	\n"
                + "      ,[FirstName]\n"
                + "      ,[LastName]\n"
                + "      ,[Phone]\n"
                + "  FROM [Staff] LEFT JOIN Contract ON Contract.StartStaff = Staff.AccountID\n"
                + "	LEFT JOIN Account ON Staff.AccountID = Account.ID\n"
                + "	LEFT JOIN Payment ON Payment.ContractID = Contract.ID\n"
                + "	WHERE Account.isDelete = 0 AND Account.Status IN (1) AND Staff.isDelete = 0\n"
                + "	AND Payment.PaidDate IS NOT NULL\n"
                + "	AND Contract.isDelete = 0\n"
                + "	GROUP BY Contract.StartStaff, Staff.[FirstName], Staff.LastName, Staff.Phone\n"
                + "	ORDER BY COUNT(Contract.CustomerID) DESC, SUM(Payment.Amount) DESC";
        PreparedStatement psm_select_top3_staff;
        try {
            psm_select_top3_staff = connection.prepareStatement(sql_select_top3_staff);
            ResultSet rs_select_top3_staff = psm_select_top3_staff.executeQuery();
            while (rs_select_top3_staff.next()) {
                Staff staff = new Staff();
                Account account = new Account();
                account.setId(rs_select_top3_staff.getInt("StartStaff"));
                staff.setAccount(account);
                staff.setFirstName(rs_select_top3_staff.getString("FirstName"));
                staff.setLastName(rs_select_top3_staff.getString("LastName"));
                staff.setPhone(rs_select_top3_staff.getString("Phone"));

                topRank.add(staff);
            }
        } catch (SQLException ex) {
            Logger.getLogger(StaffDBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return topRank;
    }

    public int getTotalActiveStaffs() {
        int total = 0;
        String sql_select_count_staff = "SELECT COUNT([AccountID]) AS TotalStaffs\n"
                + "  FROM [Staff] INNER JOIN Account ON Staff.AccountID = Account.ID\n"
                + "  WHERE Staff.isDelete = 0 AND Account.isDelete = 0 AND Account.Status IN (1)";
        try {
            PreparedStatement psm_select_count_staff = connection.prepareStatement(sql_select_count_staff);
            ResultSet rs_select_count_staff = psm_select_count_staff.executeQuery();
            if (rs_select_count_staff.next()) {
                total = rs_select_count_staff.getInt("TotalStaffs");
            }
        } catch (SQLException ex) {
            Logger.getLogger(StaffDBContext.class.getName()).log(Level.SEVERE, null, ex);
        }

        return total;
    }

    public ArrayList<Staff> getStaffs() {
        ArrayList<Staff> staffs = new ArrayList<>();
        try {
            String sql = "select AccountID, FirstName, LastName\n"
                    + "from Staff";
            PreparedStatement ps = connection.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Account acc = new Account();
                acc.setId(rs.getInt("AccountID"));

                Staff staff = new Staff();
                staff.setAccount(acc);
                staff.setFirstName(rs.getString("FirstName"));
                staff.setLastName(rs.getString("LastName"));

                staffs.add(staff);
            }
        } catch (SQLException ex) {
            Logger.getLogger(StaffDBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return staffs;
    }

    public int getStartStaff(int cusID) {
        int id = 0;
        try {
            String sql = "SELECT [StaffID]\n"
                    + "  FROM [Customer_Staff]\n"
                    + "  WHERE CustomerID = ? and NextStaff is null";
            PreparedStatement stm = connection.prepareStatement(sql);
            stm.setInt(1, cusID);
            ResultSet rs = stm.executeQuery();

            if (rs.next()) {
                id = rs.getInt("StaffID");
            }
        } catch (SQLException ex) {
            Logger.getLogger(StaffDBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return id;
    }

    public Staff getStaff(int accountId) {
        try {
            String sql = "select a.ID, a.Email, a.[Password], a.[Role], a.[Status], a.GoogleID, FirstName, LastName, Phone\n"
                    + "from Staff s inner join Account a on s.AccountID = a.ID\n"
                    + "where AccountID = ?";
            PreparedStatement stm = connection.prepareStatement(sql);
            stm.setInt(1, accountId);
            ResultSet rs = stm.executeQuery();
            Staff s = null;
            while (rs.next()) {
                if (s == null) {
                    s = new Staff();
                    AccountStatusCode statusCode = new AccountStatusCode();
                    statusCode.setStatusCode(rs.getShort("Status"));
                    
                    Account a = new Account();
                    a.setId(accountId);
                    a.setEmail(rs.getString("Email"));
                    a.setPassword(rs.getString("Password"));
                    a.setRole(rs.getBoolean("Role"));
                    a.setStatus(rs.getByte("Status"));
                    a.setGoogleID(rs.getString("GoogleID"));
                    a.setStatusCode(statusCode);
                    
                    s.setAccount(a);
                    s.setFirstName(rs.getString("FirstName"));
                    s.setLastName(rs.getString("LastName"));
                    s.setPhone(rs.getString("Phone"));
                }
            }
            return s;
        } catch (SQLException ex) {
            Logger.getLogger(StaffDBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public int getTotalCus(int accountId) {
        try {
            String sql = "select s.AccountID, COUNT(cs.CustomerID) as customers\n"
                    + "from Staff s inner join Customer_Staff cs on s.AccountID = cs.StaffID\n"
                    + "where s.AccountID = ?\n"
                    + "group by s.AccountID, cs.NextStaff\n"
                    + "having cs.NextStaff is null";
            PreparedStatement stm = connection.prepareStatement(sql);
            stm.setInt(1, accountId);
            ResultSet rs = stm.executeQuery();
            int total = 0;
            while (rs.next()) {
                if (total == 0) {
                    total = rs.getInt("customers");
                }
            }
            return total;
        } catch (SQLException ex) {
            Logger.getLogger(StaffDBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
    }

    public int getUnholdedCus(int accountId) {
        try {
            String sql = "select COUNT(a.[Status]) as unholded\n"
                    + "from Customer_Staff cs inner join Staff s on cs.StaffID = s.AccountID\n"
                    + "						inner join Account a on cs.CustomerID = a.ID\n"
                    + "where a.[Status] = 2 and s.AccountID = ?\n"
                    + "group by a.[Status]";
            PreparedStatement stm = connection.prepareStatement(sql);
            stm.setInt(1, accountId);
            ResultSet rs = stm.executeQuery();
            int unholded = 0;
            while (rs.next()) {
                if (unholded == 0) {
                    unholded = rs.getInt("unholded");
                }
            }
            return unholded;
        } catch (SQLException ex) {
            Logger.getLogger(StaffDBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
    }

    public int getTotalCont(int accountId) {
        try {
            String sql = "select c.StartStaff, COUNT(c.StartStaff) as contracts\n"
                    + "from [Contract] c inner join Staff s on c.StartStaff = s.AccountID\n"
                    + "where s.AccountID = ?\n"
                    + "group by c.StartStaff";
            PreparedStatement stm = connection.prepareStatement(sql);
            stm.setInt(1, accountId);
            ResultSet rs = stm.executeQuery();
            int total = 0;
            while (rs.next()) {
                if (total == 0) {
                    total = rs.getInt("contracts");
                }
            }
            return total;
        } catch (SQLException ex) {
            Logger.getLogger(StaffDBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
    }

    public int getUnholdedCont(int accountId) {
        try {
            String sql = "select COUNT(cs.StaffID) as unholded\n"
                    + "from Customer_Staff cs inner join [Contract] c on cs.CustomerID = c.CustomerID\n"
                    + "where c.[Status] = 2 and cs.StaffID = ?\n"
                    + "group by cs.StaffID";
            PreparedStatement stm = connection.prepareStatement(sql);
            stm.setInt(1, accountId);
            ResultSet rs = stm.executeQuery();
            int total = 0;
            while (rs.next()) {
                if (total == 0) {
                    total = rs.getInt("unholded");
                }
            }
            return total;
        } catch (SQLException ex) {
            Logger.getLogger(StaffDBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
    }

    public int getTotalCompensation(int accountId) {
        try {
            String sql = "select COUNT(cont.StartStaff) as compensation\n"
                    + "from Compensation comp inner join Accident a on comp.AccidentID = a.ID\n"
                    + "						inner join [Contract] cont on a.ContractID = cont.ID\n"
                    + "where cont.StartStaff = ?\n"
                    + "group by cont.StartStaff";
            PreparedStatement stm = connection.prepareStatement(sql);
            stm.setInt(1, accountId);
            ResultSet rs = stm.executeQuery();
            int total = 0;
            while (rs.next()) {
                if (total == 0) {
                    total = rs.getInt("compensation");
                }
            }
            return total;
        } catch (SQLException ex) {
            Logger.getLogger(StaffDBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
    }

    public int getUnholdedCompensation(int accountId) {
        try {
            String sql = "select COUNT(cont.StartStaff) as unholded\n"
                    + "from Compensation comp inner join Accident a on comp.AccidentID = a.ID\n"
                    + "						inner join [Contract] cont on a.ContractID = cont.ID\n"
                    + "where comp.[Status] = 2 and cont.StartStaff = ?\n"
                    + "group by cont.StartStaff";
            PreparedStatement stm = connection.prepareStatement(sql);
            stm.setInt(1, accountId);
            ResultSet rs = stm.executeQuery();
            int total = 0;
            while (rs.next()) {
                if (total == 0) {
                    total = rs.getInt("unholded");
                }
            }
            return total;
        } catch (SQLException ex) {
            Logger.getLogger(StaffDBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
    }

    public int getTotalCancel(int accountId) {
        try {
            String sql = "select c.CancelStaff, COUNT(c.CancelStaff) as cancels\n"
                    + "from [Contract] c inner join Staff s on c.CancelStaff = s.AccountID\n"
                    + "where s.AccountID = ? and c.[Status] = 4\n"
                    + "group by c.CancelStaff";
            PreparedStatement stm = connection.prepareStatement(sql);
            stm.setInt(1, accountId);
            ResultSet rs = stm.executeQuery();
            int total = 0;
            while (rs.next()) {
                if (total == 0) {
                    total = rs.getInt("cancels");
                }
            }
            return total;
        } catch (SQLException ex) {
            Logger.getLogger(StaffDBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
    }

    public int getUnholdedCancel(int accountId) {
        try {
            String sql = "select c.CancelStaff, COUNT(c.CancelStaff) as unholded\n"
                    + "from [Contract] c inner join Staff s on c.CancelStaff = s.AccountID\n"
                    + "where c.[Status] = 3 and s.AccountID = ?\n"
                    + "group by c.CancelStaff";
            PreparedStatement stm = connection.prepareStatement(sql);
            stm.setInt(1, accountId);
            ResultSet rs = stm.executeQuery();
            int total = 0;
            while (rs.next()) {
                if (total == 0) {
                    total = rs.getInt("unholded");
                }
            }
            return total;
        } catch (SQLException ex) {
            Logger.getLogger(StaffDBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
    }

    public ArrayList<Product> getProducts() {
        ArrayList<Product> products = new ArrayList<>();
        try {
            String sql = "select ID, Title, [Description], Price, ImageURL, p.isDelete, ContentDetail, StartDate, psc.StatusCode, psc.StatusName\n"
                    + "from Product p inner join ProductStatusCode psc on p.[Status] = psc.StatusCode";
            PreparedStatement stm = connection.prepareStatement(sql);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                Product p = new Product();
                p.setId(rs.getInt("ID"));
                p.setTitle(rs.getString("Title"));
                p.setDescription(rs.getString("Description"));
                p.setPrice(rs.getDouble("Price"));
                p.setImageURL(rs.getString("ImageURL"));
                ProductStatusCode psc = new ProductStatusCode();
                psc.setStatusCode(rs.getShort("StatusCode"));
                psc.setStatusName(rs.getString("StatusName"));
                p.setStatusCode(psc);
                p.setIsDelete(rs.getBoolean("isDelete"));
                p.setContentDetail(rs.getString("ContentDetail"));
                p.setStartDate(rs.getTimestamp("StartDate"));
                products.add(p);
            }
        } catch (SQLException ex) {
            Logger.getLogger(StaffDBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return products;
    }

    //this method return a staff who have least contract
    public Staff getLeastContractStaff() {
        try {
            String sql = "SELECT TOP 1 [AccountID]\n"
                    + "      ,[FirstName]\n"
                    + "      ,[LastName]\n"
                    + "      ,[Phone]\n"
                    + "	  ,COUNT(c.ID) as [total contract]\n"
                    + "  FROM [Staff] s JOIN [Contract] c ON s.AccountID = c.StartStaff\n"
                    + "  WHERE s.[isDelete] = 0\n"
                    + "  GROUP BY c.StartStaff,[AccountID],[FirstName],[LastName],[Phone]\n"
                    + "  ORDER BY [total contract]";
            PreparedStatement stm = connection.prepareStatement(sql);
            ResultSet rs = stm.executeQuery();

            if (rs.next()) {
                AccountDBContext adb = new AccountDBContext();
                Account a = adb.getAccount(rs.getInt("AccountID"));
                Staff s = new Staff();
                s.setAccount(a);
                s.setFirstName(rs.getString("FirstName"));
                s.setLastName(rs.getString("LastName"));
                s.setPhone(rs.getString("Phone"));

                return s;
            }
        } catch (SQLException ex) {
            Logger.getLogger(StaffDBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public void createStaff(Account account, Staff staff) {
        try {
            connection.setAutoCommit(false);
            String sql_account = "INSERT INTO [Account]\n"
                    + "           ([Email]\n"
                    + "           ,[Password]\n"
                    + "           ,[Role]\n"
                    + "           ,[Status])\n"
                    + "     VALUES\n"
                    + "           (?\n"
                    + "           ,?\n"
                    + "           ,?\n"
                    + "           ,?)";
            PreparedStatement stm_account = connection.prepareStatement(sql_account);
            stm_account.setString(1, account.getEmail());
            stm_account.setString(2, account.getPassword());
            stm_account.setBoolean(3, true);
            stm_account.setShort(4, Short.parseShort("1"));
            stm_account.executeUpdate();

            String sql_get_accountid = "select @@identity as account_id";
            PreparedStatement stm_get_accountid = connection.prepareStatement(sql_get_accountid);
            ResultSet rs_accountid = stm_get_accountid.executeQuery();

            if (rs_accountid.next()) {
                account.setId(rs_accountid.getInt("account_id"));
                staff.setAccount(account);
            }

            String sql_staff = "INSERT INTO [Staff]\n"
                    + "           ([AccountID]\n"
                    + "           ,[FirstName]\n"
                    + "           ,[LastName]\n"
                    + "           ,[Phone])\n"
                    + "     VALUES\n"
                    + "           (?\n"
                    + "           ,?\n"
                    + "           ,?\n"
                    + "           ,?)";
            PreparedStatement stm_staff = connection.prepareStatement(sql_staff);
            stm_staff.setInt(1, staff.getAccount().getId());
            stm_staff.setString(2, staff.getFirstName());
            stm_staff.setString(3, staff.getLastName());
            stm_staff.setString(4, staff.getPhone());
            stm_staff.executeUpdate();

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
    
    public void modUpdateStaff(int id) {
        String sql = "";
    }
}

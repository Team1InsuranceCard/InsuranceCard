/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import controller.externalmodule.PaginationModule;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Account;
import model.Brand;
import model.Contract;
import model.ContractStatusCode;
import model.Customer;
import model.Product;
import model.ProductStatusCode;
import model.Staff;
import model.VehicleType;

/**
 *
 * @author area1
 */
public class ContractDBContext extends DBContext {

    public int totalContracts(String querySearch, String contractStatus) {
        int totalContract = 0;
        if (querySearch == null) {
            querySearch = "";
        }
        try {
            String sql_total = "SELECT COUNT(CONTRACT.[ID]) AS TotalContract\n"
                    + "  FROM [Contract] JOIN Customer_Staff ON Contract.CustomerID = Customer_Staff.CustomerID\n"
                    + "  JOIN ACCOUNT ON ACCOUNT.ID = Customer_Staff.CustomerID\n"
                    + "  JOIN Customer ON Customer.AccountID = Contract.CustomerID\n"
                    + "  JOIN Product ON Product.ID = Contract.ProductID\n"
                    + "  WHERE CONTRACT.isDelete = 0"
                    + "   AND (Product.Title LIKE ? + '%' OR Customer.FirstName LIKE ? +'%' OR Customer.LastName LIKE  ? + '%')"
                    + "  AND Contract.Status IN  (" + contractStatus + ")";
            PreparedStatement stm_total = connection.prepareStatement(sql_total);
            stm_total.setString(1, querySearch);
            stm_total.setString(2, querySearch);
            stm_total.setString(3, querySearch);

            ResultSet rs_total = stm_total.executeQuery();
            if (rs_total.next()) {
                totalContract = rs_total.getInt("TotalContract");
            }
        } catch (SQLException ex) {
            Logger.getLogger(ContractDBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return totalContract;
    }

    public int totalContractsByStaff(int staffId, String querySearch, String contractStatus) {
        int totalContract = 0;
        if (querySearch == null) {
            querySearch = "";
        }
        try {
            String sql_total = "SELECT COUNT(CONTRACT.[ID]) AS TotalContract\n"
                    + "  FROM [Contract] JOIN Customer_Staff ON Contract.CustomerID = Customer_Staff.CustomerID\n"
                    + "  JOIN ACCOUNT ON ACCOUNT.ID = Customer_Staff.CustomerID\n"
                    + "  JOIN Customer ON Customer.AccountID = Contract.CustomerID\n"
                    + "  JOIN Product ON Product.ID = Contract.ProductID\n"
                    + "  WHERE Customer_Staff.StaffID = ? AND Customer_Staff.EndDate IS NULL AND CONTRACT.isDelete = 0"
                    + "   AND (Product.Title LIKE ? + '%' OR Customer.FirstName LIKE ? +'%' OR Customer.LastName LIKE  ? + '%')"
                    + "  AND Contract.Status IN  (" + contractStatus + ")";
            PreparedStatement stm_total = connection.prepareStatement(sql_total);
            stm_total.setInt(1, staffId);
            stm_total.setString(2, querySearch);
            stm_total.setString(3, querySearch);
            stm_total.setString(4, querySearch);

            ResultSet rs_total = stm_total.executeQuery();
            if (rs_total.next()) {
                totalContract = rs_total.getInt("TotalContract");
            }
        } catch (SQLException ex) {
            Logger.getLogger(ContractDBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return totalContract;
    }

    public HashMap<Integer, Contract> getContractsByStaff(int staffId, String query, int pageIndex, String customerNameOrdered,
            String startDateOrdered, String endDateOrdered, String contractStatus) {
        int[] recordFromTo = PaginationModule.calcFromToRecord(pageIndex, 20);
        HashMap<Integer, Contract> contracts = new HashMap<>();
        if (query == null) {
            query = "";
        }
        if (customerNameOrdered == null || !(customerNameOrdered.equalsIgnoreCase("ASC") || customerNameOrdered.equalsIgnoreCase("DESC"))) {
            customerNameOrdered = "ASC";
        }
        if (startDateOrdered == null || !(startDateOrdered.equalsIgnoreCase("ASC") || startDateOrdered.equalsIgnoreCase("DESC"))) {
            startDateOrdered = "ASC";
        }
        if (endDateOrdered == null || !(endDateOrdered.equalsIgnoreCase("ASC") || endDateOrdered.equalsIgnoreCase("DESC"))) {
            endDateOrdered = "ASC";
        }

        String sql_select_contract = "SELECT * FROM\n"
                + "(SELECT ROW_NUMBER() OVER (ORDER BY Customer.FirstName " + customerNameOrdered
                + ", Customer.LastName " + customerNameOrdered
                + ", Contract.StartDate " + startDateOrdered + ", Contract.EndDate " + endDateOrdered + ") AS Row_count\n"
                + "		,CONTRACT.[ID]\n"
                + "      ,CONTRACT.[ProductID]\n"
                + "      ,CONTRACT.[CustomerID]\n"
                + "      ,CONTRACT.[StartDate]\n"
                + "      ,CONTRACT.[EndDate]\n"
                + "      ,CONTRACT.[Status]"
                + "      ,ContractStatusCode.StatusName\n"
                + "      ,CONTRACT.[isDelete]\n"
                + "	  ,Customer.FirstName, Customer.LastName\n"
                + "	  ,Product.Title\n"
                + "  FROM [Contract] JOIN Customer_Staff ON Contract.CustomerID = Customer_Staff.CustomerID\n"
                + "  JOIN ACCOUNT ON ACCOUNT.ID = Customer_Staff.CustomerID\n"
                + "  JOIN Customer ON Customer.AccountID = Contract.CustomerID\n"
                + "  JOIN Product ON Product.ID = Contract.ProductID"
                + "  JOIN ContractStatusCode ON Contract.Status=ContractStatusCode.StatusCode\n"
                + "  WHERE Customer_Staff.StaffID = ? AND Customer_Staff.EndDate IS NULL AND CONTRACT.isDelete = 0"
                + "   AND (Product.Title LIKE ? + '%' OR Customer.FirstName LIKE ? +'%' OR Customer.LastName LIKE ?+'%')"
                + "  AND Contract.Status IN (" + contractStatus + ")) AS Main\n"
                + "WHERE MAIN.Row_count BETWEEN ? AND ?";
        try {
            PreparedStatement stm_select_contract = connection.prepareStatement(sql_select_contract);

            stm_select_contract.setInt(1, staffId);
            stm_select_contract.setString(2, query);
            stm_select_contract.setString(3, query);
            stm_select_contract.setString(4, query);

            stm_select_contract.setInt(5, recordFromTo[0]);
            stm_select_contract.setInt(6, recordFromTo[1]);
            ResultSet rs_select_contract = stm_select_contract.executeQuery();
            while (rs_select_contract.next()) {
                Contract contract = new Contract();
                contract.setId(rs_select_contract.getInt("ID"));

                Customer customer = new Customer();
                Account account = new Account();
                account.setId(rs_select_contract.getInt("CustomerID"));
                customer.setAccount(account);
                customer.setFirstName(rs_select_contract.getString("FirstName"));
                customer.setLastName(rs_select_contract.getString("LastName"));
                contract.setCustomer(customer);

                Product product = new Product();
                product.setId(rs_select_contract.getInt("ProductID"));
                product.setTitle(rs_select_contract.getString("Title"));
                contract.setProduct(product);

                contract.setStartDate(rs_select_contract.getTimestamp("StartDate"));
                contract.setEndDate(rs_select_contract.getTimestamp("EndDate"));

                ContractStatusCode statuscode = new ContractStatusCode();
                statuscode.setStatusCode(rs_select_contract.getShort("Status"));
                statuscode.setStatusName(rs_select_contract.getString("StatusName"));
                contract.setStatusCode(statuscode);
                contracts.put(rs_select_contract.getInt("Row_count"), contract);
            }
            return contracts;
        } catch (SQLException ex) {
            Logger.getLogger(ContractDBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public HashMap<Integer, Contract> getContracts(String query, int pageIndex, String customerNameOrdered,
            String startDateOrdered, String endDateOrdered, String contractStatus) {
        int[] recordFromTo = PaginationModule.calcFromToRecord(pageIndex, 20);
        HashMap<Integer, Contract> contracts = new HashMap<>();
        if (query == null) {
            query = "";
        }
        if (customerNameOrdered == null || !(customerNameOrdered.equalsIgnoreCase("ASC") || customerNameOrdered.equalsIgnoreCase("DESC"))) {
            customerNameOrdered = "ASC";
        }
        if (startDateOrdered == null || !(startDateOrdered.equalsIgnoreCase("ASC") || startDateOrdered.equalsIgnoreCase("DESC"))) {
            startDateOrdered = "ASC";
        }
        if (endDateOrdered == null || !(endDateOrdered.equalsIgnoreCase("ASC") || endDateOrdered.equalsIgnoreCase("DESC"))) {
            endDateOrdered = "ASC";
        }

        String sql_select_contract = "SELECT * FROM\n"
                + "(SELECT ROW_NUMBER() OVER (ORDER BY Customer.FirstName " + customerNameOrdered
                + ", Customer.LastName " + customerNameOrdered
                + ", Contract.StartDate " + startDateOrdered + ", Contract.EndDate " + endDateOrdered + ") AS Row_count\n"
                + "		,CONTRACT.[ID]\n"
                + "      ,CONTRACT.[ProductID]\n"
                + "      ,CONTRACT.[CustomerID]\n"
                + "      ,CONTRACT.[StartDate]\n"
                + "      ,CONTRACT.[EndDate]\n"
                + "      ,CONTRACT.[Status]"
                + "      ,ContractStatusCode.StatusName\n"
                + "      ,CONTRACT.[isDelete]\n"
                + "	  ,Customer.FirstName, Customer.LastName\n"
                + "	  ,Product.Title\n"
                + "  FROM [Contract] JOIN Customer_Staff ON Contract.CustomerID = Customer_Staff.CustomerID\n"
                + "  JOIN ACCOUNT ON ACCOUNT.ID = Customer_Staff.CustomerID\n"
                + "  JOIN Customer ON Customer.AccountID = Contract.CustomerID\n"
                + "  JOIN Product ON Product.ID = Contract.ProductID"
                + "  JOIN ContractStatusCode ON Contract.Status=ContractStatusCode.StatusCode\n"
                + "  WHERE CONTRACT.isDelete = 0"
                + "   AND (Product.Title LIKE ? + '%' OR Customer.FirstName LIKE ? +'%' OR Customer.LastName LIKE ?+'%')"
                + "  AND Contract.Status IN (" + contractStatus + ")) AS Main\n"
                + "WHERE MAIN.Row_count BETWEEN ? AND ?";
        try {
            PreparedStatement stm_select_contract = connection.prepareStatement(sql_select_contract);

            stm_select_contract.setString(1, query);
            stm_select_contract.setString(2, query);
            stm_select_contract.setString(3, query);

            stm_select_contract.setInt(4, recordFromTo[0]);
            stm_select_contract.setInt(5, recordFromTo[1]);
            ResultSet rs_select_contract = stm_select_contract.executeQuery();
            while (rs_select_contract.next()) {
                Contract contract = new Contract();
                contract.setId(rs_select_contract.getInt("ID"));

                Customer customer = new Customer();
                Account account = new Account();
                account.setId(rs_select_contract.getInt("CustomerID"));
                customer.setAccount(account);
                customer.setFirstName(rs_select_contract.getString("FirstName"));
                customer.setLastName(rs_select_contract.getString("LastName"));
                contract.setCustomer(customer);

                Product product = new Product();
                product.setId(rs_select_contract.getInt("ProductID"));
                product.setTitle(rs_select_contract.getString("Title"));
                contract.setProduct(product);

                contract.setStartDate(rs_select_contract.getTimestamp("StartDate"));
                contract.setEndDate(rs_select_contract.getTimestamp("EndDate"));

                ContractStatusCode statuscode = new ContractStatusCode();
                statuscode.setStatusCode(rs_select_contract.getShort("Status"));
                statuscode.setStatusName(rs_select_contract.getString("StatusName"));
                contract.setStatusCode(statuscode);
                contracts.put(rs_select_contract.getInt("Row_count"), contract);
            }
            return contracts;
        } catch (SQLException ex) {
            Logger.getLogger(ContractDBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public int totalContractsByCustomer(int customerId) {
        int totalContract = 0;
        try {
            String sql = "SELECT count(ID) as TotalContract\n"
                    + "FROM Contract\n"
                    + "WHERE CustomerID = ?";
            PreparedStatement stm = connection.prepareStatement(sql);
            stm.setInt(1, customerId);
            ResultSet rs = stm.executeQuery();

            if (rs.next()) {
                totalContract = rs.getInt("TotalContract");
            }
        } catch (SQLException ex) {
            Logger.getLogger(ContractDBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return totalContract;
    }

    public Contract getContractDetailByCustomer(int accountID, int contractID) {
        Contract contract = new Contract();
        try {
            String sql = "SELECT Product.ID as ProID\n"
                    + "   ,Product.Title\n"
                    + "	  ,Price\n"
                    + "	  ,ContentDetail\n"
                    + "	  ,Customer.FirstName as Cus_fname\n"
                    + "	  ,Customer.LastName as Cus_lname\n"
                    + "	  ,[Address]\n"
                    + "      ,Dob\n"
                    + "      ,Customer.Phone\n"
                    + "	  ,PersonalID\n"
                    + "	  ,Contract.ProductID\n"
                    + "      ,Contract.[StartDate]\n"
                    + "      ,[EndDate]\n"
                    + "      ,Contract.[Status]\n"
                    + "	  ,ContractStatusCode.StatusName\n"
                    + "	  ,CancelComment\n"
                    + "	  ,CancelReason\n"
                    + "	  ,CancelDate\n"
                    + "	  ,CancelRequestDate\n"
                    + "   ,VehicleType.ID as VehicleTypeID\n"
                    + "	  ,VehicleType.VehicleType\n"
                    + "	  ,Engine\n"
                    + "	  ,LicensePlate\n"
                    + "	  ,Color\n"
                    + "	  ,CertImage\n"
                    + "   ,Brand.ID as BrandID\n"
                    + "	  ,Brand.Brand\n"
                    + "	  ,[Owner]\n"
                    + "	  ,Chassis\n"
                    + "	  ,RequestDate\n"
                    + "	  ,ResolveDate\n"
                    + "	  ,Staff.[FirstName] as StartStaff_fname\n"
                    + "      ,Staff.[LastName] as StartStaff_lname\n"
                    + "      ,(SELECT Staff.[FirstName]\n"
                    + "        FROM Contract\n"
                    + "        INNER JOIN Staff ON Staff.AccountID = Contract.CancelStaff\n"
                    + "		WHERE Contract.ID = ?\n"
                    + "        ) as CancelStaff_fname\n"
                    + "      ,(SELECT Staff.[LastName]\n"
                    + "         FROM Contract\n"
                    + "         INNER JOIN Staff ON Staff.AccountID = Contract.CancelStaff\n"
                    + "		 WHERE Contract.ID = ?\n"
                    + "         ) as CancelStaff_lname\n"
                    + "      ,Payment.Amount\n"
                    + "  FROM [Contract]\n"
                    + "  INNER JOIN Product\n"
                    + "  ON Product.ID = Contract.ProductID\n"
                    + "  INNER JOIN Customer\n"
                    + "  On Customer.AccountID = Contract.CustomerID\n"
                    + "  INNER JOIN ContractStatusCode\n"
                    + "  ON ContractStatusCode.StatusCode = Contract.Status\n"
                    + "  INNER JOIN VehicleType\n"
                    + "  ON VehicleType.ID = Contract.VehicleTypeID\n"
                    + "  INNER JOIN Brand\n"
                    + "  ON Brand.ID = Contract.BrandID\n"
                    + "  INNER JOIN Staff\n"
                    + "  ON Staff.AccountID = Contract.StartStaff\n"
                    + "  INNER JOIN Payment\n"
                    + "  ON Payment.ContractID = Contract.ID\n"
                    + "  WHERE CustomerID = ? and ContractID = ?";
            PreparedStatement stm = connection.prepareStatement(sql);
            stm.setInt(1, contractID);
            stm.setInt(2, contractID);
            stm.setInt(3, accountID);
            stm.setInt(4, contractID);
            ResultSet rs = stm.executeQuery();

            if (rs.next()) {
                Product product = new Product();
                product.setId(rs.getInt("ProID"));
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

                ContractStatusCode contract_status = new ContractStatusCode();
                contract_status.setStatusCode(rs.getShort("Status"));
                contract_status.setStatusName(rs.getString("StatusName"));
                
                VehicleType vt = new VehicleType();
                vt.setId(rs.getInt("VehicleTypeID"));
                vt.setVehicleType(rs.getString("VehicleType"));
                
                Brand brand = new Brand();
                brand.setId(rs.getInt("BrandID"));
                brand.setBrand(rs.getString("Brand"));

                contract.setProduct(product);
                contract.setCustomer(customer);
                contract.setStartStaff(start_staff);
                contract.setCancelStaff(cancel_staff);
                contract.setStatusCode(contract_status);
                contract.setVehicleType2(vt);
                contract.setBrand2(brand);
                contract.setStartDate(rs.getTimestamp("StartDate"));
                contract.setEndDate(rs.getTimestamp("EndDate"));
                contract.setStatus(rs.getShort("Status"));
                contract.setCancelComment(rs.getString("CancelComment"));
                contract.setCancelReason(rs.getString("CancelReason"));
                contract.setCancelDate(rs.getTimestamp("CancelDate"));
                contract.setCancelRequestDate(rs.getTimestamp("CancelRequestDate"));
                contract.setEngine(rs.getString("Engine"));
                contract.setLicensePlate(rs.getString("LicensePlate"));
                contract.setColor(rs.getString("Color"));
                contract.setCertImage(rs.getString("CertImage"));
                contract.setOwner(rs.getString("Owner"));
                contract.setChassis(rs.getString("Chassis"));
                contract.setRequestDate(rs.getTimestamp("RequestDate"));
                contract.setResolveDate(rs.getTimestamp("ResolveDate"));
                contract.setContractFee(rs.getInt("Amount"));

                return contract;
            }
        } catch (SQLException ex) {
            Logger.getLogger(ContractDBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public int renewContractByCustomer(Contract contract) {
        int contract_id = 0;
        try {
            connection.setAutoCommit(false);
            String sql_contract = "INSERT INTO [Contract]\n"
                    + "           ([ProductID]\n"
                    + "           ,[CustomerID]\n"
                    + "           ,[StartDate]\n"
                    + "           ,[EndDate]\n"
                    + "           ,[Status]\n"
                    + "           ,[ContractFee]\n"
                    + "           ,[VehicleTypeID]\n"
                    + "           ,[Engine]\n"
                    + "           ,[LicensePlate]\n"
                    + "           ,[Color]\n"
                    + "           ,[CertImage]\n"
                    + "           ,[BrandID]\n"
                    + "           ,[Owner]\n"
                    + "           ,[Chassis]\n"
                    + "           ,[RequestDate]\n"
                    + "           ,[StartStaff])\n"
                    + "     VALUES\n"
                    + "           (?\n"
                    + "           ,?\n"
                    + "           ,?\n"
                    + "           ,?\n"
                    + "           ,?\n"
                    + "           ,?\n"
                    + "           ,?\n"
                    + "		   ,?\n"
                    + "		   ,?\n"
                    + "		   ,?\n"
                    + "		   ,?\n"
                    + "		   ,?\n"
                    + "		   ,?\n"
                    + "		   ,?\n"
                    + "		   ,?\n"
                    + "           ,?)";
            PreparedStatement stm_contract = connection.prepareStatement(sql_contract);
            stm_contract.setInt(1, contract.getProduct().getId());
            stm_contract.setInt(2, contract.getCustomer().getAccount().getId());
            stm_contract.setTimestamp(3, contract.getStartDate());
            stm_contract.setTimestamp(4, contract.getEndDate());
            stm_contract.setShort(5, contract.getStatus());
            stm_contract.setDouble(6, contract.getContractFee());
            stm_contract.setInt(7, contract.getVehicleType2().getId());
            stm_contract.setString(8, contract.getEngine());
            stm_contract.setString(9, contract.getLicensePlate());
            stm_contract.setString(10, contract.getColor());
            stm_contract.setString(11, contract.getCertImage());
            stm_contract.setInt(12, contract.getBrand2().getId());
            stm_contract.setString(13, contract.getOwner());
            stm_contract.setString(14, contract.getChassis());
            stm_contract.setTimestamp(15, contract.getRequestDate());
            stm_contract.setInt(16, contract.getStartStaff().getAccount().getId());
            stm_contract.executeUpdate();

            String sql_get_contractid = "select @@identity as contract_id";
            PreparedStatement stm_get_contractid = connection.prepareStatement(sql_get_contractid);
            ResultSet rs_contractid = stm_get_contractid.executeQuery();

            if (rs_contractid.next()) {
                contract.setId(rs_contractid.getInt("contract_id"));
                contract_id = rs_contractid.getInt("contract_id");
            }

            String sql_payment = "INSERT INTO [Payment]\n"
                    + "           ([Amount]\n"
                    + "           ,[StartDate]\n"
                    + "           ,[ContractID])\n"
                    + "     VALUES\n"
                    + "           (?\n"
                    + "           ,?\n"
                    + "           ,?)";
            PreparedStatement stm_payment = connection.prepareStatement(sql_payment);
            stm_payment.setDouble(1, contract.getContractFee());
            stm_payment.setTimestamp(2, contract.getRequestDate());
            stm_payment.setInt(3, contract.getId());
            stm_payment.executeUpdate();

            connection.commit();
        } catch (SQLException ex) {
            Logger.getLogger(ContractDBContext.class.getName()).log(Level.SEVERE, null, ex);
            try {
                connection.rollback();
            } catch (SQLException ex1) {
                Logger.getLogger(ContractDBContext.class.getName()).log(Level.SEVERE, null, ex1);
            }
        } finally {
            try {
                connection.setAutoCommit(true);
            } catch (SQLException ex) {
                Logger.getLogger(ContractDBContext.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return contract_id;
    }

    public boolean checkRenewRight(int cusID, int proID, int contractID) {
        boolean check = true;
        try {
            String sql = "SELECT Contract.ID\n"
                    + "FROM Contract\n"
                    + "INNER JOIN Product\n"
                    + "ON Product.ID = Contract.ProductID\n"
                    + "WHERE Contract.Status in (1,2,3)\n"
                    + " and CustomerID = ? and ProductID = ?\n"
                    + " and Contract.ID <> ?";
            PreparedStatement stm = connection.prepareStatement(sql);
            stm.setInt(1, cusID);
            stm.setInt(2, proID);
            stm.setInt(3, contractID);
            ResultSet rs = stm.executeQuery();

            if (rs.next()) {
                check = false;
            }
        } catch (SQLException ex) {
            Logger.getLogger(ContractDBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return check;
    }

    public void undoCancelContractByCustomer(int contractID) {
        try {
            String sql = "UPDATE [Contract]\n"
                    + "   SET [Status] = ?\n"
                    + " WHERE Contract.ID = ?";
            PreparedStatement stm = connection.prepareStatement(sql);
            stm.setShort(1, Short.valueOf("1"));
            stm.setInt(2, contractID);
            stm.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(ContractDBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Contract staffGetContractDetail(int id) {
        Contract contract = new Contract();
        try {
            String sql = "select ProductID\n"
                    + "	, Title\n"
                    + "	, ContentDetail\n"
                    + "	, p.Status as proStatusID\n"
                    + "	, ps.StatusName as proStatusName\n"
                    + "	, CustomerID\n"
                    + "	, Email\n"
                    + "	, c.FirstName as cusFName\n"
                    + "	, c.LastName as cusLName\n"
                    + "	, Address\n"
                    + "	, Dob\n"
                    + "	, c.Phone\n"
                    + "	, PersonalID\n"
                    + "	, Province\n"
                    + "	, District\n"
                    + "	, ct.StartDate\n"
                    + "	, EndDate\n"
                    + "	, ct.Status as contractStatusID\n"
                    + "	, cts.StatusName as contractStatusName\n"
                    + "	, ContractFee\n"
                    + "	, CancelComment\n"
                    + "	, CancelReason\n"
                    + "	, CancelDate\n"
                    + "	, CancelRequestDate\n"
                    + "	, VehicleTypeID\n"
                    + "	, VehicleType\n"
                    + "	, Engine\n"
                    + "	, LicensePlate\n"
                    + "	, Color\n"
                    + "	, CertImage\n"
                    + "	, BrandID\n"
                    + "	, Brand\n"
                    + "	, Owner\n"
                    + "	, Chassis\n"
                    + "	, RequestDate\n"
                    + "	, ResolveDate\n"
                    + "	, StartStaff\n"
                    + "	, s.FirstName as startStaffFname\n"
                    + "	, s.LastName as startStaffLName\n"
                    + "	, CancelStaff\n"
                    + "	, (select FirstName from Staff where AccountID = ct.CancelStaff) as cancelStaffFName\n"
                    + "	, (select LastName from Staff where AccountID = ct.CancelStaff) as cancelStaffLName\n"
                    + "from Contract ct inner join Customer c\n"
                    + "on ct.CustomerID = c.AccountID\n"
                    + "inner join Account a\n"
                    + "on ct.CustomerID = a.ID\n"
                    + "inner join ContractStatusCode cts\n"
                    + "on ct.Status = cts.StatusCode\n"
                    + "inner join Staff s\n"
                    + "on ct.StartStaff = s.AccountID\n"
                    + "inner join Product p\n"
                    + "on ct.ProductID = p.ID\n"
                    + "inner join ProductStatusCode ps\n"
                    + "on p.Status = ps.StatusCode\n"
                    + "inner join VehicleType vt\n"
                    + "on ct.VehicleTypeID = vt.ID\n"
                    + "inner join Brand b\n"
                    + "on ct.BrandID = b.ID\n"
                    + "where ct.ID = ?";
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                ProductStatusCode proStatus = new ProductStatusCode();
                proStatus.setStatusCode(rs.getShort("proStatusID"));
                proStatus.setStatusName(rs.getString("proStatusName"));

                Product pro = new Product();
                pro.setId(rs.getInt("ProductID"));
                pro.setTitle(rs.getString("Title"));
                pro.setContentDetail("ContentDetail");
                pro.setStatusCode(proStatus);

                Account cusAcc = new Account();
                cusAcc.setId(rs.getInt("CustomerID"));
                cusAcc.setEmail(rs.getString("Email"));

                Customer cus = new Customer();
                cus.setAccount(cusAcc);
                cus.setFirstName(rs.getString("cusFName"));
                cus.setLastName(rs.getString("cusLName"));
                cus.setAddress(rs.getString("Address"));
                cus.setDob(rs.getDate("Dob"));
                cus.setPhone(rs.getString("Phone"));
                cus.setPersonalID(rs.getString("PersonalID"));
                cus.setProvince(rs.getString("Province"));
                cus.setDistrict(rs.getString("District"));

                Account startStaffAcc = new Account();
                startStaffAcc.setId(rs.getInt("StartStaff"));

                Staff startStaff = new Staff();
                startStaff.setAccount(startStaffAcc);
                startStaff.setFirstName(rs.getString("startStaffFname"));
                startStaff.setLastName(rs.getString("startStaffLName"));

                Account cancelStaffAcc = new Account();
                cancelStaffAcc.setId(rs.getInt("CancelStaff"));

                Staff cancelStaff = new Staff();
                cancelStaff.setAccount(cancelStaffAcc);
                cancelStaff.setFirstName(rs.getString("cancelStaffFName"));
                cancelStaff.setLastName(rs.getString("cancelStaffLName"));

                ContractStatusCode contractStatus = new ContractStatusCode();
                contractStatus.setStatusCode(rs.getShort("contractStatusID"));
                contractStatus.setStatusName(rs.getString("contractStatusName"));

                VehicleType vehicleType = new VehicleType();
                vehicleType.setId(rs.getInt("VehicleTypeID"));
                vehicleType.setVehicleType(rs.getString("VehicleType"));

                Brand brand = new Brand();
                brand.setId(rs.getInt("BrandID"));
                brand.setBrand(rs.getString("Brand"));

                contract.setId(id);
                contract.setProduct(pro);
                contract.setCustomer(cus);
                contract.setStartDate(rs.getTimestamp("StartDate"));
                contract.setEndDate(rs.getTimestamp("EndDate"));
                contract.setCancelComment(rs.getString("CancelComment"));
                contract.setCancelReason(rs.getString("CancelReason"));
                contract.setCancelDate(rs.getTimestamp("CancelDate"));
                contract.setCancelRequestDate(rs.getTimestamp("CancelRequestDate"));
                contract.setEngine(rs.getString("Engine"));
                contract.setLicensePlate(rs.getString("LicensePlate"));
                contract.setColor(rs.getString("Color"));
                contract.setCertImage(rs.getString("CertImage"));
                contract.setOwner(rs.getString("Owner"));
                contract.setChassis(rs.getString("Chassis"));
                contract.setRequestDate(rs.getTimestamp("RequestDate"));
                contract.setResolveDate(rs.getTimestamp("ResolveDate"));
                contract.setStartStaff(startStaff);
                contract.setCancelStaff(cancelStaff);
                contract.setStatusCode(contractStatus);
                contract.setContractFee(rs.getDouble("ContractFee"));
                contract.setVehicleType2(vehicleType);
                contract.setBrand2(brand);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ContractDBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return contract;
    }

    public void staffContractPayment(int contractID) {
        try {
            connection.setAutoCommit(false);
            // update payment
            String sql_payment = "update Payment\n"
                    + "set PaidDate = GETDATE()\n"
                    + "	, PaymentMethodID = 1\n"
                    + "	, Note = Null\n"
                    + "where ContractID = ?";
            PreparedStatement ps_payment = connection.prepareStatement(sql_payment);
            ps_payment.setInt(1, contractID);
            ps_payment.executeUpdate();
            // update contract status
            String sql_contract = "update Contract\n"
                    + "set Status = 1\n"
                    + "where ID = ?";
            PreparedStatement ps_contract = connection.prepareStatement(sql_contract);
            ps_contract.setInt(1, contractID);
            ps_contract.executeUpdate();
            connection.commit();
        } catch (SQLException ex) {
            Logger.getLogger(PaymentDBContext.class.getName()).log(Level.SEVERE, null, ex);
            try {
                connection.rollback();
            } catch (SQLException ex1) {
                Logger.getLogger(PaymentDBContext.class.getName()).log(Level.SEVERE, null, ex1);
            }
        } finally {
            try {
                connection.setAutoCommit(true);
            } catch (SQLException ex) {
                Logger.getLogger(PaymentDBContext.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}

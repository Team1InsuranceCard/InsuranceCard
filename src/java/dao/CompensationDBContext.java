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
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Accident;
import model.Compensation;
import model.CompensationStatusCode;
import model.Contract;

/**
 *
 * @author area1
 */
public class CompensationDBContext extends DBContext {

    public int getCompensationQuantity(int customerID) {
        int compensationQuantity = 0;
        try {
            String sql_count_compensation = "SELECT COUNT(Compensation.ID) AS CompensationQuantity\n"
                    + "  FROM [Compensation] INNER JOIN Contract ON Compensation.ContractID=Contract.ID\n"
                    + "  WHERE Compensation.ResolveDate IS NULL AND Contract.CustomerID = ?";
            PreparedStatement psm_count_compenstion = connection.prepareStatement(sql_count_compensation);
            psm_count_compenstion.setInt(1, customerID);
            ResultSet rs_counResultSet = psm_count_compenstion.executeQuery();
            if (rs_counResultSet.next()) {
                compensationQuantity = rs_counResultSet.getInt("CompensationQuantity");
            }
        } catch (SQLException ex) {
            Logger.getLogger(CompensationDBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return compensationQuantity;
    }

    public ArrayList<Compensation> getContractCompensations(int contractID) {
        ArrayList<Compensation> compensations = new ArrayList<>();
        try {
            String sql = "select c.ID\n"
                    + "	, c.CreatedDate\n"
                    + "	, ResolveDate\n"
                    + "	, Status\n"
                    + "	, StatusName\n"
                    + "from Compensation c inner join CompensationStatusCode cs\n"
                    + "on c.Status = cs.StatusCode\n"
                    + "inner join Accident a\n"
                    + "on c.AccidentID = a.ID\n"
                    + "where a.ContractID = ?";
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setInt(1, contractID);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                CompensationStatusCode comStatus = new CompensationStatusCode();
                comStatus.setStatusCode(rs.getInt("Status"));
                comStatus.setStatusName(rs.getString("StatusName"));

                Compensation com = new Compensation();
                com.setId(rs.getInt("ID"));
                com.setCreateDate(rs.getTimestamp("CreatedDate"));
                com.setResolveDate(rs.getTimestamp("ResolveDate"));
                com.setStatus(comStatus);
                compensations.add(com);
            }
        } catch (SQLException ex) {
            Logger.getLogger(PaymentDBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return compensations;
    }

    public ArrayList<Compensation> searchCompensationHis(int cusID, int pageSize, int pageIndex, String search, String from, String to, int statusID) {
        ArrayList<Compensation> compensations = new ArrayList<>();
        try {
            String sql = "with compenHis as (select cp.ID\n"
                    + "						, DriverName\n"
                    + "						, cp.CreatedDate\n"
                    + "						, cp.ResolveDate\n"
                    + "						, cp.Status\n"
                    + "						, cpc.StatusName\n"
                    + "						, ContractID\n"
                    + "						, ROW_NUMBER() over (order by cp.ID) as rowNumber\n"
                    + "					from Compensation cp inner join Accident a\n"
                    + "					on cp.AccidentID = a.ID\n"
                    + "					inner join Contract ct\n"
                    + "					on a.ContractID = ct.ID\n"
                    + "					inner join CompensationStatusCode cpc\n"
                    + "					on cp.Status = cpc.StatusCode\n"
                    + "					where CustomerID = ?\n"
                    + "						and (DriverName like N'%' + ? + '%'\n"
                    + "							or CONVERT(varchar, cp.CreatedDate, 120) like '%' + ? + '%'\n"
                    + "							or CONVERT(varchar, cp.ResolveDate, 120) like '%' + ? + '%'\n"
                    + "							or cpc.StatusName like '%' + ? + '%'\n"
                    + "							or CONVERT(varchar, ContractID) like '%' + ? + '%')";
            if (from != null) {
                sql += "\nand CONVERT(date, cp.CreatedDate) >= CONVERT(date, ?)";
            }
            if (to != null) {
                sql += "\nand CONVERT(date, cp.CreatedDate) <= CONVERT(date, ?)"
                        + "\nand CONVERT(date, cp.ResolveDate) <= CONVERT(date, ?)";
            }
            if (statusID != -1) {
                sql += "\nand cp.Status = ?";
            }
            sql += ")\nselect ID\n"
                    + "	, DriverName\n"
                    + "	, CreatedDate\n"
                    + "	, ResolveDate\n"
                    + "	, Status\n"
                    + "	, StatusName\n"
                    + "	, ContractID\n"
                    + "from compenHis\n"
                    + "where rowNumber >= (? - 1) * ? + 1\n"
                    + "	and rowNumber <= ? * ?";
            PreparedStatement ps = connection.prepareStatement(sql);
            int index = 1;
            ps.setInt(index++, cusID);
            ps.setString(index++, search);
            ps.setString(index++, search);
            ps.setString(index++, search);
            ps.setString(index++, search);
            ps.setString(index++, search);
            if (from != null) {
                ps.setString(index++, from);
            }
            if (to != null) {
                ps.setString(index++, to);
                ps.setString(index++, to);
            }
            if (statusID != -1) {
                ps.setInt(index++, statusID);
            }
            ps.setInt(index++, pageIndex);
            ps.setInt(index++, pageSize);
            ps.setInt(index++, pageIndex);
            ps.setInt(index, pageSize);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                CompensationStatusCode compenStatus = new CompensationStatusCode();
                compenStatus.setStatusCode(rs.getInt("Status"));
                compenStatus.setStatusName(rs.getString("StatusName"));

                Contract contract = new Contract();
                contract.setId(rs.getInt("ContractID"));

                Accident accident = new Accident();
                accident.setContract(contract);

                Compensation compen = new Compensation();
                compen.setId(rs.getInt("ID"));
                compen.setDriverName(rs.getString("DriverName"));
                compen.setCreateDate(rs.getTimestamp("CreatedDate"));
                compen.setResolveDate(rs.getTimestamp("ResolveDate"));
                compen.setStatus(compenStatus);
                compen.setAccident(accident);
                compensations.add(compen);
            }
        } catch (SQLException ex) {
            Logger.getLogger(PaymentDBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return compensations;
    }

    public int getTotalCustomerCompensation(int customerID, String search, String from, String to, int statusID) {
        int total = 0;
        try {
            String sql = "select COUNT(*) as total\n"
                    + "from Compensation cp inner join Accident a\n"
                    + "on cp.AccidentID = a.ID\n"
                    + "inner join Contract ct\n"
                    + "on a.ContractID = ct.ID\n"
                    + "inner join CompensationStatusCode cpc\n"
                    + "on cp.Status = cpc.StatusCode\n"
                    + "where CustomerID = ?\n"
                    + "	and (DriverName like N'%' + ? + '%'\n"
                    + "		or CONVERT(varchar, cp.CreatedDate, 120) like N'%' + ? + '%'\n"
                    + "		or CONVERT(varchar, cp.ResolveDate, 120) like '%' + ? + '%'\n"
                    + "		or cpc.StatusName like '%' + ? + '%'\n"
                    + "		or CONVERT(varchar, ContractID) like '%' + ? + '%')";
            if (from != null) {
                sql += "\nand CONVERT(date, cp.CreatedDate) >= CONVERT(date, ?)";
            }
            if (to != null) {
                sql += "\nand CONVERT(date, cp.CreatedDate) <= CONVERT(date, ?)"
                        + "\nand CONVERT(date, cp.ResolveDate) <= CONVERT(date, ?)";
            }            
            if (statusID != -1) {
                sql += "\nand cp.Status = ?";
            }
            PreparedStatement ps = connection.prepareStatement(sql);
            int index = 1;
            ps.setInt(index++, customerID);
            ps.setString(index++, search);
            ps.setString(index++, search);
            ps.setString(index++, search);
            ps.setString(index++, search);
            ps.setString(index++, search);
            if (from != null) {
                ps.setString(index++, from);
            }
            if (to != null) {
                ps.setString(index++, to);
                ps.setString(index++, to);
            }
            if (statusID != -1) {
                ps.setInt(index++, statusID);
            }
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                total = rs.getInt("total");
            }
        } catch (SQLException ex) {
            Logger.getLogger(CompensationDBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return total;
    }

}

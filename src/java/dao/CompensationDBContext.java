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
import model.Accident;
import model.Account;
import model.Compensation;
import model.CompensationStatusCode;

/**
 *
 * @author area1
 */
public class CompensationDBContext extends DBContext {

    public void setCompensation(Compensation compensation) {
        try {
            connection.setAutoCommit(false);
//            AccidentDBContext accidentDBC = new AccidentDBContext();
//            accidentDBC.setAccident(compensation.getAccident());
            Accident accident = compensation.getAccident();
            String sql_insert_accident = "INSERT INTO [Accident]\n"
                    + "           ([AccidentDate]\n"
                    + "           ,[Title]\n"
                    + "           ,[CreatedDate]\n"
                    + "           ,[Attachment]\n"
                    + "           ,[HumanDamage]\n"
                    + "           ,[VehicleDamage]\n"
                    + "           ,[ContractID])\n"
                    + "     VALUES\n"
                    + "           (? ,? ,? ,? ,? ,?,?)";

            PreparedStatement psm_insert_accident = connection.prepareStatement(sql_insert_accident);
            int i = 0;
            psm_insert_accident.setTimestamp(++i, accident.getAccidentDate());
            psm_insert_accident.setString(++i, accident.getTitle());
            psm_insert_accident.setTimestamp(++i, accident.getCreatedDate());
            psm_insert_accident.setString(++i, accident.getAttatchment());
            psm_insert_accident.setString(++i, accident.getHumanDamage());
            psm_insert_accident.setString(++i, accident.getVehicleDamage());
            psm_insert_accident.setInt(++i, accident.getContract().getId());

            psm_insert_accident.executeUpdate();
            String sql_select_accident_identity = "SELECT @@IDENTITY AS AccidentId";
            PreparedStatement psm_select_accident_identity = connection.prepareStatement(sql_select_accident_identity);
            ResultSet rs_select_accident_identity = psm_select_accident_identity.executeQuery();
            if (rs_select_accident_identity.next()) {
                compensation.getAccident().setId(rs_select_accident_identity.getInt("AccidentId"));
            }
            String sql_insert_compensation = "INSERT INTO [Compensation]\n"
                    + "           ([DriverName]\n"
                    + "           ,[CreatedDate]\n"
                    + "           ,[Status]\n"
                    + "           ,[Description]\n"
                    + "           ,[Attachment]\n"
                    + "           ,[AccidentID])\n"
                    + "     VALUES\n"
                    + "           (?, ?, 2, ?, ?, ?)";

            PreparedStatement psm_insert_compensation = connection.prepareStatement(sql_insert_compensation);
            i = 0;
            psm_insert_compensation.setString(++i, compensation.getDriverName());
            psm_insert_compensation.setTimestamp(++i, compensation.getCreateDate());
            psm_insert_compensation.setString(++i, compensation.getDescription());
            psm_insert_compensation.setString(++i, compensation.getAttachment());
            psm_insert_compensation.setInt(++i, compensation.getAccident().getId());
            psm_insert_compensation.executeUpdate();

            connection.commit();
        } catch (SQLException ex) {
            try {
                connection.rollback();
            } catch (SQLException ex1) {
                Logger.getLogger(CompensationDBContext.class.getName()).log(Level.SEVERE, null, ex1);
            }
            Logger.getLogger(CompensationDBContext.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                connection.setAutoCommit(true);
            } catch (SQLException ex) {
                Logger.getLogger(CompensationDBContext.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

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

    //Resolve Compensation
//    String sql = "select cont.ID as contId, cont.[Status] as contStatus, cont.StartDate, cont.EndDate, (cont.ContractFee/pro.Price) as term, payme.PaymentMethod,\n"
//            + "	(cus.FirstName + ' ' + cus.LastName) as CusName, acc.Email, cus.Dob, cus.PersonalID, cus.Phone, cus.[Address],\n"
//            + "	vt.VehicleType, cont.Engine, cont.LicensePlate, cont.Color, b.Brand, cont.[Owner], cont.Chassis,\n"
//            + "	cont.ProductID, pro.Title, pro.[Status] as proStatus,\n"
//            + "	acci.[Title] as acciTitle, acci.Attachment as acciAttach, acci.VehicleDamage, acci.AccidentDate, acci.HumanDamage,\n"
//            + "	comp.ID as compId, comp.DriverName, comp.CreatedDate, comp.[Description], comp.[Status] as compStatus, comp.Attachment as compAttach, comp.ResolveNote\n"
//            + "from [Contract] cont inner join Payment pay on cont.ID = pay.ContractID\n"
//            + "								inner join PaymentMethod payme on pay.PaymentMethodID = payme.ID\n"
//            + "					inner join Product pro on cont.ProductID = pro.ID\n"
//            + "					inner join Customer cus on cont.CustomerID = cus.AccountID\n"
//            + "								inner join Account acc on cus.AccountID = acc.ID\n"
//            + "					inner join VehicleType vt on cont.VehicleTypeID = vt.ID\n"
//            + "					inner join Brand b on cont.BrandID = b.ID\n"
//            + "					inner join Accident acci on cont.ID = acci.ContractID\n"
//            + "					inner join Compensation comp on acci.ID = comp.AccidentID";
}

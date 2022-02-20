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
import model.Brand;

/**
 *
 * @author area1
 */
public class BrandDBContext extends DBContext {
    public ArrayList<Brand> getBrands() {
        ArrayList<Brand> brands = new ArrayList<>();
        try {
            String sql = "SELECT [ID]\n"
                    + "      ,[Brand]\n"
                    + "  FROM [Brand]";
            PreparedStatement psm = connection.prepareStatement(sql);
            ResultSet rs = psm.executeQuery();

            while (rs.next()) {
                Brand b = new Brand(rs.getInt("ID"), rs.getString("Brand"));
                brands.add(b);
            }

        } catch (SQLException ex) {
            Logger.getLogger(BrandDBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return brands;
    }
}

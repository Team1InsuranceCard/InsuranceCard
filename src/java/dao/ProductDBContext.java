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
import model.Product;

/**
 *
 * @author area1
 */
public class ProductDBContext extends DBContext {

    public ArrayList<Product> getProducts() {
        ArrayList<Product> products = new ArrayList<>();
        try {
            String sql_Select_Product = "SELECT [ID]\n"
                    + "      ,[Title]\n"
                    + "      ,[Description]\n"
                    + "      ,[Price]\n"
                    + "      ,[ImageURL]\n"
                    + "      ,[Status]\n"
                    + "      ,[isDelete]\n"
                    + "  FROM [dbo].[Product]";
            PreparedStatement psm_Select_Product = connection.prepareStatement(sql_Select_Product);
            ResultSet rs = psm_Select_Product.executeQuery();
            if (rs.next()) {
                Product product = new Product();
                product.setId(rs.getInt("ID"));
                product.setTitle(rs.getNString("Title"));
                product.setDescription("Description");
                product.setPrice(rs.getFloat("Price"));
                product.setImageURL(rs.getString("ImageURL"));
                product.setStatus(rs.getShort("Status"));
                product.setIsDelete(rs.getBoolean("isDelete"));
                
                products.add(product);
            }
            return products;
        } catch (SQLException ex) {
            Logger.getLogger(ProductDBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}

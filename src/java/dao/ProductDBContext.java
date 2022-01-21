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

    public ArrayList<Product> getProductsByCustomer(int customerID) {
        try {
            ArrayList<Product> products = new ArrayList<>();
            String sql_select_products = "SELECT DISTINCT\n"
                    + "	   Product.ID AS ProductID\n"
                    + "	  ,Product.ImageURL AS ProductImage\n"
                    + "	  ,Product.Title AS ProductTitle\n"
                    + "	  ,Product.Description AS ProductDescription\n"
                    + "\n"
                    + "  FROM [Contract] INNER JOIN Product ON Contract.ProductID=Product.ID\n"
                    + "  WHERE [Contract].Status IN (1) AND [Contract].isDelete=0 AND Product.Status IN (1)\n"
                    + "	AND Contract.CustomerID = ?";
            PreparedStatement psm_select_product = connection.prepareStatement(sql_select_products);
            psm_select_product.setInt(1, customerID);
            ResultSet rs_select_products = psm_select_product.executeQuery();
            if (rs_select_products.next()) {
                Product product = new Product();
                product.setId(rs_select_products.getInt(""));
                product.setImageURL(rs_select_products.getString(""));
                product.setTitle(rs_select_products.getString(""));
                product.setDescription(rs_select_products.getString(""));

                products.add(product);
            }
            return products;
        } catch (SQLException ex) {
            Logger.getLogger(ProductDBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public Product getProductByID(int pID) {
        try {
            String sql_select_product = "SELECT Product.ID AS ProductID\n"
                    + "	  ,Product.ImageURL AS ProductImage\n"
                    + "	  ,Product.Title AS ProductTitle\n"
                    + "	  ,Product.Description AS ProductDescription\n"
                    + "\n"
                    + "  FROM Product \n"
                    + "  WHERE ID = ?\n";
            PreparedStatement psm_select_product = connection.prepareStatement(sql_select_product);
            psm_select_product.setInt(1, pID);
            ResultSet rs_select_product = psm_select_product.executeQuery();
            if (rs_select_product.next()) {
                Product product = new Product();
                product.setId(rs_select_product.getInt("ProductID"));
                product.setImageURL(rs_select_product.getString("ProductImage"));
                product.setTitle(rs_select_product.getString("ProductTitle"));
                product.setDescription(rs_select_product.getString("ProductDescription"));
                return product;
            }
        } catch (SQLException ex) {
            Logger.getLogger(ProductDBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}

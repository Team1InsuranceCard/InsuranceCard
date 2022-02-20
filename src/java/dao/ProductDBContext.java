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
import model.ProductStatusCode;

/**
 *
 * @author area1
 */
public class ProductDBContext extends DBContext {

    public Product getProduct(int productID) {
        String sql_select_product = "SELECT [ID]\n"
                + "      ,[Title]\n"
                + "      ,[Description]\n"
                + "      ,[Price]\n"
                + "      ,[ImageURL]\n"
                + "      ,[Status]\n"
                + "      ,[isDelete]\n"
                + "      ,[ContentDetail]\n"
                + "      ,[StartDate]\n"
                + "  FROM [Product]\n"
                + "  WHERE Product.ID = ? AND (Product.isDelete = 0 OR Product.isDelete is NULL)";
        try {
            PreparedStatement psm_select_product = connection.prepareStatement(sql_select_product);
            psm_select_product.setInt(1, productID);
            ResultSet rs_select_product = psm_select_product.executeQuery();
            if (rs_select_product.next()) {
                Product product = new Product();
                product.setId(productID);
                product.setTitle(rs_select_product.getString("Title"));
                product.setImageURL(rs_select_product.getString("ImageURL"));

                ProductStatusCode statusCode = new ProductStatusCode();
                statusCode.setStatusCode(rs_select_product.getShort("Status"));
                
                product.setStatusCode(statusCode);
                product.setDescription(rs_select_product.getString("Description"));
                product.setStartDate(rs_select_product.getTimestamp("StartDate"));
                product.setPrice(rs_select_product.getDouble("Price"));
                product.setContentDetail(rs_select_product.getString("ContentDetail"));
                
                return product;
            }
        } catch (SQLException ex) {
            Logger.getLogger(ProductDBContext.class.getName()).log(Level.SEVERE, null, ex);
        }

        return null;
    }

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
                    + "  FROM [Product] WHERE Status IN (1) AND isDelete = 0";
            PreparedStatement psm_Select_Product = connection.prepareStatement(sql_Select_Product);
            ResultSet rs = psm_Select_Product.executeQuery();
            while (rs.next()) {
                Product product = new Product();
                product.setId(rs.getInt("ID"));
                product.setTitle(rs.getString("Title"));
                product.setDescription(rs.getString("Description"));
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
                    + "Product.ID AS ProductID\n"
                    + ",Product.ImageURL AS ProductImage\n"
                    + ",Product.Title AS ProductTitle\n"
                    + ",Product.Description AS ProductDescription\n"
                    + "                    \n"
                    + "FROM [Contract] INNER JOIN Product ON Contract.ProductID=Product.ID\n"
                    + "WHERE [Contract].Status IN (1) AND [Contract].isDelete=0 AND Product.Status IN (1)\n"
                    + "AND Product.isDelete=0\n"
                    + "AND Contract.CustomerID = ?";
            PreparedStatement psm_select_product = connection.prepareStatement(sql_select_products);
            psm_select_product.setInt(1, customerID);
            ResultSet rs_select_products = psm_select_product.executeQuery();
            while (rs_select_products.next()) {
                Product product = new Product();
                product.setId(rs_select_products.getInt("ProductID"));
                product.setImageURL(rs_select_products.getString("ProductImage"));
                product.setTitle(rs_select_products.getString("ProductTitle"));
                product.setDescription(rs_select_products.getString("ProductDescription"));

                products.add(product);
            }
            return products;
        } catch (SQLException ex) {
            Logger.getLogger(ProductDBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public Product getProductByID(int pId) {
        try {
            String sql_select_products = "SELECT [ID]\n"
                    + "      ,[Title]\n"
                    + "      ,[Price]\n"
                    + "      ,[Status]\n"
                    + "  FROM [Product]\n"
                    + "  WHERE [ID] = ?";
            PreparedStatement psm_select_product = connection.prepareStatement(sql_select_products);
            psm_select_product.setInt(1, pId);
            ResultSet rs_select_products = psm_select_product.executeQuery();
            if (rs_select_products.next()) {
                Product product = new Product();
                product.setId(rs_select_products.getInt("ID"));
                product.setTitle(rs_select_products.getString("Title"));
                product.setPrice(rs_select_products.getDouble("Price"));
                product.setStatus(rs_select_products.getShort("Status"));

                return product;
            }
        } catch (SQLException ex) {
            Logger.getLogger(ProductDBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public short checkStatus(int id) {
        short check = 0;

        try {
            String sql = "SELECT [Status]\n"
                    + "  FROM [Product]\n"
                    + "  WHERE ID = ?";
            PreparedStatement stm = connection.prepareStatement(sql);
            stm.setInt(1, id);
            ResultSet rs = stm.executeQuery();

            if (rs.next()) {
                if (rs.getShort("Status") == 1) {
                    check = 1;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(ProductDBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return check;
    }
}

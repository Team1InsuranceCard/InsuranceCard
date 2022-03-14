/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller.moderator;

import dao.ProductDBContext;
import dao.StatusCodeDBContext;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Timestamp;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Product;
import model.ProductStatusCode;

/**
 *
 * @author ADMIN
 */
public class UpdateProduct extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
//        processRequest(request, response);
        int productid = Integer.parseInt(request.getParameter("productid"));
        ProductDBContext dbP = new ProductDBContext();
        Product product = dbP.getProductToUpdate(productid);
        
        request.setAttribute("product", product);
        request.getRequestDispatcher("../../view/moderator/update_product.jsp").forward(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
//        processRequest(request, response);
        Product product = (Product) request.getAttribute("product");
        
        String title = request.getParameter("title");
        String raw_photo = request.getParameter("photo");
        Double price = Double.parseDouble(request.getParameter("price"));
        String description = request.getParameter("description");
        Short raw_status = Short.parseShort(request.getParameter("status"));
        String content_detai = request.getParameter("content_detail");
        LocalDateTime myDateObj = LocalDateTime.now();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String formattedDate = myDateObj.format(dtf);
        Timestamp ts = Timestamp.valueOf(formattedDate);
        
        StatusCodeDBContext dbSC = new StatusCodeDBContext();
        ProductStatusCode status = dbSC.getProductStatusCode(raw_status);
        
        String photo = "";
        if (raw_photo.equals("")) {
            photo = product.getImageURL();
        }
        
        product.setTitle(title);
        product.setImageURL(photo);
        product.setPrice(price);
        product.setDescription(description);
        product.setStatusCode(status);
        product.setContentDetail(content_detai);
        product.setUpdateDate(ts);
        product.getUpdateTime().add(ts);
        
        ProductDBContext dbP = new ProductDBContext();
        dbP.updateProduct(product);
        request.getRequestDispatcher("../../view/moderator/update_product.jsp").forward(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}

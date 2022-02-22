/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller.staff;

import dao.BrandDBContext;
import dao.CustomerDBContext;
import dao.ProductDBContext;
import dao.VehicleTypeDBContext;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Account;
import model.Brand;
import model.Customer;
import model.Product;
import model.VehicleType;

/**
 *
 * @author quynm
 */
public class StaffNewContractController extends HttpServlet {

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
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet StaffNewContractController</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet StaffNewContractController at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
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
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");

        ProductDBContext pdb = new ProductDBContext();

        String productID = request.getParameter("productID");
        int pID;
        if (productID != null) {
            try {
                pID = Integer.parseInt(productID);
            } catch (NumberFormatException ex) {
                //incorrect product id => set pid to 0
                pID = 0;
            }
        } else {
            pID = 0;
        }
        //get Product sent by URL if there is
        Product product = pdb.getProductByID(pID);
        request.setAttribute("productSent", product);
        
        //get current date
        LocalDate d = LocalDate.now();
        request.setAttribute("now", d);

        //get vehicle types
        VehicleTypeDBContext vtdb = new VehicleTypeDBContext();
        ArrayList<VehicleType> vehicleTypes = vtdb.getVehicleTypes();
        request.setAttribute("vehicletypes", vehicleTypes);

        //get brands
        BrandDBContext bdb = new BrandDBContext();
        ArrayList<Brand> brands = bdb.getBrands();
        request.setAttribute("brands", brands);

        //get all products
        ArrayList<Product> products = pdb.getProducts();
        request.setAttribute("products", products);

        request.getRequestDispatcher("../../view/staff/new-contract.jsp")
                .forward(request, response);

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
        processRequest(request, response);
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

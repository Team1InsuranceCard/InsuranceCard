/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller.customer;

import dao.CustomerDBContext;
import dao.ProductDBContext;
import dao.VehicleTypeDBContext;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Account;
import model.Customer;
import model.Product;
import model.VehicleType;

/**
 *
 * @author quynm
 */
public class NewContractController extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
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

        String productID = request.getParameter("productID");
        int pID;
        ProductDBContext pdb = new ProductDBContext();
        try {
            pID = Integer.parseInt(productID);
            Product product = pdb.getProductByID(pID);
            if (product == null) {
                //incorrect product id => redirect to dashboard to choose product again
                response.sendRedirect("../dashboard");
            } else {
                //get current date
                LocalDate d = LocalDate.now();
                request.setAttribute("now", d);

                //get vehicle types
                VehicleTypeDBContext vtdb = new VehicleTypeDBContext();
                ArrayList<VehicleType> vehicleTypes = vtdb.getVehicleTypes();
                request.setAttribute("vehicletypes", vehicleTypes);

                //getCustomer
                Account account = (Account) request.getSession().getAttribute("account");
                CustomerDBContext cdb = new CustomerDBContext();
                if(account != null){
                    //get customer by account if user logged in (account has been saved in session)
                    Customer customer = cdb.getCustomerByAccount(account);
                    request.setAttribute("customer", customer);
                }

                request.setAttribute("product", product);
                request.getRequestDispatcher("../../view/customer/new-contract.jsp")
                        .forward(request, response);
            }
        } catch (NumberFormatException ex) {
            //incorrect product id => redirect to dashboard to choose product again
            response.sendRedirect("../dashboard");
        }
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

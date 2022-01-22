/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.CustomerDBContext;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Account;
import model.Customer;

/**
 *
 * @author area1
 */
public class LoginByGoogle extends HttpServlet {

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
            out.println("<title>Servlet LoginByGoogle</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet LoginByGoogle at " + request.getContextPath() + "</h1>");
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
//        processRequest(request, response);

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

//        ID: 117772045812347420828
//GoogleLoginApi.html:18 Name: Khánh Huy Nguyễn
//GoogleLoginApi.html:19 Image URL: https://lh3.googleusercontent.com/a-/AOh14Gi4Fe_SU0NH7xKANJ8QoE6N8BShoZ-AesR8_CnbFw=s96-c
//GoogleLoginApi.html:20 Email: area1110@outlook.com
//GoogleLoginApi.html:21 Family Name: Nguyễn
//GoogleLoginApi.html:22 Given Name: Khánh Huy
        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String family_name = request.getParameter("family_name");
        String given_name = request.getParameter("given_name");
        String googleID = request.getParameter("id");

        Account account = new Account();
        account.setEmail(email);
        account.setGoogleID(googleID);

        CustomerDBContext customerDBC = new CustomerDBContext();
        Customer customer = customerDBC.getCustomerByEmailNGoogleID(account);
        if (customer != null) {
            request.getSession().setAttribute("current_user", customer);
        } else {
            Customer signupCustomer = new Customer();
            signupCustomer.setFirstName(family_name);
            signupCustomer.setLastName(given_name);

            LocalDateTime myDateObj = LocalDateTime.now();
            Timestamp joinDate = Timestamp.valueOf(myDateObj);
            signupCustomer.setJoinDate(joinDate);

            customerDBC.register(customer, account);
        }
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

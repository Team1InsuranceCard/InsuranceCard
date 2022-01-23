/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.CustomerDBContext;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;
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
 * @author ASUS
 */
public class VerifyEmail extends HttpServlet {

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
        request.getRequestDispatcher("view/verify_email.jsp").forward(request, response);
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
        LocalDateTime myDateObj = LocalDateTime.now();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String formattedDate = myDateObj.format(dtf);
        Timestamp ts = Timestamp.valueOf(formattedDate);

        request.setCharacterEncoding("UTF-8");

        String authCode = (String) request.getSession().getAttribute("authCode");
        String code = request.getParameter("code");

        String mess = "";
        if (!code.equals(authCode.trim())) {
            mess = "Wrong code! Please check again!";
        } else {
            mess = "Register succesfully!";
            // delete seesion
            request.getSession().removeAttribute("authCode");
            Account account = new Account();
            Customer customer = new Customer();

            try {
                String email = (String) request.getSession().getAttribute("email");
                String phone = (String) request.getSession().getAttribute("phone");
                String personalID = (String) request.getSession().getAttribute("personalID");
                String address = (String) request.getSession().getAttribute("address");
                String firstName = (String) request.getSession().getAttribute("firstName");
                String lastName = (String) request.getSession().getAttribute("lastName");
                String dob = (String) request.getSession().getAttribute("dob");
                String pass = (String) request.getSession().getAttribute("pass");
                String province = (String) request.getSession().getAttribute("province");
                String district = (String) request.getSession().getAttribute("district");

                account.setEmail(email);
                account.setPassword(pass);

                customer.setAccount(account);
                customer.setPhone(phone);
                customer.setPersonalID(personalID);
                customer.setAddress(address);
                customer.setFirstName(firstName);
                customer.setLastName(lastName);
                customer.setDob(Date.valueOf(dob));
                customer.setProvince(province);
                customer.setDistrict(district);
                customer.setJoinDate(ts);

                CustomerDBContext cdb = new CustomerDBContext();
                cdb.register(customer, account);
            } catch (IllegalArgumentException iae) {
                iae.printStackTrace();
            }
        }
        request.setAttribute("mess", mess);
        request.getRequestDispatcher("view/verify_email.jsp").forward(request, response);
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

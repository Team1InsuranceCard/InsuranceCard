/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller.staff;

import controller.SendMail;
import dao.AccountDBContext;
import dao.StaffDBContext;
import java.io.IOException;
import java.sql.Date;
import java.sql.Timestamp;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Account;
import model.Customer;
import model.CustomerStaff;
import model.Staff;

/**
 *
 * @author DELL
 */
public class CreateCustomer extends HttpServlet {

    private String getAlphaNumericString(int n) {
        String AlphaNumericString = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
                + "0123456789"
                + "abcdefghijklmnopqrstuvxyz";

        // create StringBuffer size of AlphaNumericString
        StringBuilder sb = new StringBuilder(n);

        for (int i = 0; i < n; i++) {
            // generate a random number between
            // 0 to AlphaNumericString variable length
            int index = (int) (AlphaNumericString.length() * Math.random());

            // add Character one by one in end of sb
            sb.append(AlphaNumericString
                    .charAt(index));
        }

        return sb.toString();
    }

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
        request.getRequestDispatcher("../../view/staff/customer_create.jsp").forward(request, response);
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
        String email = request.getParameter("email");
        String pass = getAlphaNumericString(8);
        String fname = request.getParameter("fname");
        String lname = request.getParameter("lname");
        String address = request.getParameter("address");
        Date dob = Date.valueOf(request.getParameter("dob"));
        String joinDate_raw = request.getParameter("joinDate");
        Timestamp joinDate = Timestamp.valueOf(joinDate_raw.replace("T", " ") + ":00");
        String phone = request.getParameter("phone");
        String pid = request.getParameter("pid");
        String province = request.getParameter("province");
        String district = request.getParameter("district");
        Boolean isExistEmail = false;
        Boolean isSuccess = false;

        AccountDBContext adb = new AccountDBContext();
        // check if exist account is active with same email
        // true => notify user and re-input
        if (adb.checkExist(email)) {
            isExistEmail = true;
        } else {
            Account a_cus = new Account();
            a_cus.setEmail(email);
            a_cus.setPassword(pass);

            Customer cus = new Customer();
            cus.setAccount(a_cus);
            cus.setFirstName(fname);
            cus.setLastName(lname);
            cus.setAddress(address);
            cus.setDob(dob);
            cus.setJoinDate(joinDate);
            cus.setPhone(phone);
            cus.setPersonalID(pid);
            cus.setProvince(province);
            cus.setDistrict(district);

            Account a_staff = (Account) request.getSession().getAttribute("account");

            Staff s = new Staff();
            s.setAccount(a_staff);

            CustomerStaff cs = new CustomerStaff();
            cs.setCustomer(cus);
            cs.setStaff(s);

            StaffDBContext sdb = new StaffDBContext();
            sdb.createCustomer(cs);
            isSuccess = true;
            request.setAttribute("pass", a_cus.getPassword());
        }

        // set attribute
        request.setAttribute("fname", fname);
        request.setAttribute("lname", lname);
        request.setAttribute("pid", pid);
        request.setAttribute("email", email);
        request.setAttribute("dob", dob);
        request.setAttribute("phone", phone);
        request.setAttribute("address", address);
        request.setAttribute("joinDate", joinDate_raw);
        request.setAttribute("isExistEmail", isExistEmail);
        request.setAttribute("isSuccess", isSuccess);

        if (isSuccess) {
            // send email for customer: email, password
            String subject = "INSURANCE CARD SYSTEM";
            String message = "<!DOCTYPE html>\n"
                    + "<html lang=\"en\">\n"
                    + "  <head> </head>\n"
                    + "  <body>\n"
                    + "    <h4>Dear,</h4>\n"
                    + "    <p>\n"
                    + "      Welcome to Insurace Card. To log in when visiting our site just click\n"
                    + "      <a href=\"\">Login</a>, and then enter your e-mail address and password.\n"
                    + "    </p>\n"
                    + "    <p>Use the following values when prompted to log in:</p>\n"
                    + "    <p><strong>E-mail</strong>: " + email + "</p>\n"
                    + "    <p><strong>Password</strong>: " + pass + "</p>\n"
                    + "    <p>\n"
                    + "      If you have any questions about your account or any other matter, please\n"
                    + "      feel free to contact us at\n"
                    + "      <a href=\"mailto:insurancecard1517@gmail.com\"\n"
                    + "        >insurancecard1517@gmail.com</a\n"
                    + "      >.\n"
                    + "    </p>\n"
                    + "  </body>\n"
                    + "</html>";
            SendMail.send(email, subject, message, "insurancecard1517@gmail.com", "team1se1517");
        }

        request.getRequestDispatcher("../../view/staff/customer_create.jsp").forward(request, response);
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

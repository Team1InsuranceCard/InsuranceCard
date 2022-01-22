/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller.staff;

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
        Account demo = new Account();
        demo.setId(1);
        request.getSession().setAttribute("account", demo);
        
        String email = request.getParameter("email");
        String pass = getAlphaNumericString(8);
        String fname = request.getParameter("fname");
        String lname = request.getParameter("lname");
        String address = request.getParameter("address");
        Date dob = Date.valueOf(request.getParameter("dob"));
        String joinDate_raw = request.getParameter("joinDate").replace("T", " ") + ":00";
        Timestamp joinDate = Timestamp.valueOf(joinDate_raw);
        String phone = request.getParameter("phone");
        String pid = request.getParameter("pid");
        String province = request.getParameter("province");
        String district = request.getParameter("district");

        AccountDBContext adb = new AccountDBContext();
        // check if exist account is active with same email
        // true => notify user and re-input
//        if (adb.checkExist(email)) {
//            
//        }

        Account a_cus = new Account();
        a_cus.setEmail(email);
        a_cus.setPassword(pass);

        Customer c = new Customer();
        c.setAccount(a_cus);
        c.setFirstName(fname);
        c.setLastName(lname);
        c.setAddress(address);
        c.setDob(dob);
        c.setJoinDate(joinDate);
        c.setPhone(phone);
        c.setPersonalID(pid);
        c.setProvince(province);
        c.setDistrict(district);

        Account a_staff = (Account) request.getSession().getAttribute("account");
        
        Staff s = new Staff();
        s.setAccount(a_staff);

        CustomerStaff cs = new CustomerStaff();
        cs.setCustomer(c);
        cs.setStaff(s);

        StaffDBContext db = new StaffDBContext();
        db.createCustomer(cs);
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

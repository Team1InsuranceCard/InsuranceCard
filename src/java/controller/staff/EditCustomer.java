/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller.staff;

import dao.AccountDBContext;
import dao.CustomerDBContext;
import java.io.IOException;
import java.sql.Date;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Account;
import model.Customer;
import model.CustomerStaff;

/**
 *
 * @author DELL
 */
public class EditCustomer extends HttpServlet {

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
        int id = Integer.parseInt(request.getParameter("id"));

        CustomerDBContext cusDb = new CustomerDBContext();
        CustomerStaff cusStaff = cusDb.viewCustomer(id);
        Customer cus = cusStaff.getCustomer();

        // set attribute
        request.setAttribute("aid", id);
        request.setAttribute("email", cus.getAccount().getEmail());
        request.setAttribute("status", cus.getAccount().getStatus());
        request.setAttribute("fname", cus.getFirstName());
        request.setAttribute("pid", cus.getPersonalID());
        request.setAttribute("lname", cus.getLastName());
        request.setAttribute("province", cus.getProvince());
        request.setAttribute("dob", cus.getDob());
        request.setAttribute("district", cus.getDistrict());
        request.setAttribute("phone", cus.getPhone());
        request.setAttribute("address", cus.getAddress());
        request.getRequestDispatcher("../../view/staff/customer_edit.jsp").forward(request, response);
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
        int cusId = Integer.parseInt(request.getParameter("aid"));

        CustomerDBContext cusDb = new CustomerDBContext();
        CustomerStaff cusStaff = cusDb.viewCustomer(cusId);
        Customer cus = cusStaff.getCustomer();

        String email = request.getParameter("email");
        short status = Short.parseShort(request.getParameter("status"));
        String fname = request.getParameter("fname");
        String pid = request.getParameter("pid");
        String lname = request.getParameter("lname");
        String province = request.getParameter("province");
        Date dob = Date.valueOf(request.getParameter("dob"));
        String district = request.getParameter("district");
        String phone = request.getParameter("phone");
        String address = request.getParameter("address");
        Boolean isExistEmail = false;
        Boolean isSuccess = false;

        Account cusAcc = new Account();
        cusAcc.setId(cusId);
        cusAcc.setEmail(email);
        cusAcc.setStatus(status);

        // cus
        cus.setAccount(cusAcc);
        cus.setFirstName(fname);
        cus.setLastName(lname);
        cus.setAddress(address);
        cus.setDob(dob);
        cus.setPhone(phone);
        cus.setPersonalID(pid);
        cus.setProvince(province);
        cus.setDistrict(district);


        CustomerStaff cs = new CustomerStaff();
        cs.setCustomer(cus);

        AccountDBContext accDB = new AccountDBContext();
        // check if exist account is active with same email
        // true => notify user and re-input
        if (accDB.checkExistCusAccEmail(cusAcc)) {
            isExistEmail = true;
        } else {
            CustomerDBContext cusDB = new CustomerDBContext();
            cusDB.staffEditCustomer(cus);
            isSuccess = true;
        }
        
        request.setAttribute("aid", cusId);
        request.setAttribute("email", email);
        request.setAttribute("status", status);
        request.setAttribute("fname", fname);
        request.setAttribute("pid", pid);
        request.setAttribute("lname", lname);
        request.setAttribute("province", province);
        request.setAttribute("dob", dob);
        request.setAttribute("district", district);
        request.setAttribute("phone", phone);
        request.setAttribute("address", address);
        request.setAttribute("isExistEmail", isExistEmail);
        request.setAttribute("isSuccess", isSuccess);
        request.getRequestDispatcher("../../view/staff/customer_edit.jsp").forward(request, response);
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

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller.staff;

import dao.StaffDBContext;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Account;
import model.Staff;

/**
 *
 * @author ADMIN
 */
public class StaffDashboard extends HttpServlet {

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
//        HttpSession session = request.getSession();
        try {
            Account acc = (Account) request.getSession().getAttribute("account");
            int accountId = acc.getId();
            StaffDBContext dbS = new StaffDBContext();
            Staff staff = dbS.getStaff(accountId);
            int totalCus = dbS.getTotalCus(accountId);
            int totalCont = dbS.getTotalCont(accountId);
            int totalCancel = dbS.getTotalCancel(accountId);
            
            request.getSession().setAttribute("fname", staff.getFirstName());
            request.getSession().setAttribute("lname", staff.getLastName());
            request.getSession().setAttribute("total1", totalCus);
            request.getSession().setAttribute("total2", totalCont);
            request.getSession().setAttribute("total3", totalCancel);
            
//            request.setAttribute("", dbS);
            request.getRequestDispatcher("../view/staff/staff_dashboard.jsp").forward(request, response);
        } catch (NullPointerException ex) {
            response.sendRedirect("../login");
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
//        processRequest(request, response);
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

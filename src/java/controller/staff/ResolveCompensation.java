/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller.staff;

import dao.CompensationDBContext;
import dao.ContractDBContext;
import dao.PaymentMethodDBContext;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Compensation;
import model.Contract;
import model.PaymentMethod;

/**
 *
 * @author ADMIN
 */
public class ResolveCompensation extends HttpServlet {

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
        int id = Integer.parseInt(request.getParameter("id"));
        CompensationDBContext dbCompensation = new CompensationDBContext();
        Compensation compensation = dbCompensation.getCompensation(id);
        ContractDBContext dbContract = new ContractDBContext();
        Contract contract = dbContract.staffGetContractDetail(compensation.getAccident().getContract().getId());
        int term = contract.getEndDate().getYear() - contract.getStartDate().getYear();
        PaymentMethodDBContext dbPayMethod = new PaymentMethodDBContext();
        PaymentMethod paymentMethod = dbPayMethod.getPaymentMethod(contract.getId());
        
        
        //Contract info
        request.setAttribute("compensation", compensation);
        request.setAttribute("contract", contract);
        request.setAttribute("term", term);
        request.setAttribute("paymentMethod", paymentMethod);
        request.getRequestDispatcher("../../view/staff/resolve_compensation.jsp").forward(request, response);
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
        int id = (int) request.getAttribute("id");
        int decision = Integer.parseInt(request.getParameter("decision"));
        String resolveNote = request.getParameter("resolve_note");
        
        CompensationDBContext dbC = new CompensationDBContext();
        Compensation compensation = dbC.getCompensation(id);
        compensation.setStatus(status);
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

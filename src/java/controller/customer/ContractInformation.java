/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller.customer;

import dao.ContractDBContext;
import dao.ProductDBContext;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Account;
import model.Contract;

/**
 *
 * @author ASUS
 */
public class ContractInformation extends HttpServlet {

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
        int contractID = Integer.parseInt(request.getParameter("id"));

        Account acc = (Account) request.getSession().getAttribute("account");
        ContractDBContext cdb = new ContractDBContext();
        Contract contract = cdb.getContractDetail(1, contractID); //change to acc.id

        ProductDBContext pdb = new ProductDBContext();
        short proID = pdb.checkStatus(contract.getProduct().getId());
        
        String btn = "";
        if (contract.getStatus() == 3) {
            btn += "No cancel more";
        } else if (contract.getStatus() == 1 || contract.getStatus() == 2) {
            btn += "Cancel";
        } else {
            btn += "Renew";
        }
        
        request.setAttribute("contract", contract);
        request.setAttribute("btn", btn);
        request.setAttribute("pro", proID);
        request.setAttribute("mess", proID==0?"Product is inactive!":"");
        request.getRequestDispatcher("../../view/customer/contract_information.jsp").forward(request, response);
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
        request.setCharacterEncoding("UTF-8");
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

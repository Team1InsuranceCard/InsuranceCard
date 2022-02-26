/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller.staff;

import dao.BrandDBContext;
import dao.CompensationDBContext;
import dao.ContractDBContext;
import dao.PaymentDBContext;
import dao.StaffDBContext;
import dao.VehicleTypeDBContext;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Brand;
import model.Compensation;
import model.Contract;
import model.Payment;
import model.Staff;
import model.VehicleType;

/**
 *
 * @author quynm
 */
public class UpdateContractController extends HttpServlet {

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
            out.println("<title>Servlet UpdateContractController</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet UpdateContractController at " + request.getContextPath() + "</h1>");
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
        int id = Integer.parseInt(request.getParameter("id") != null ? 
                request.getParameter("id") : "0");
        ContractDBContext contractDB = new ContractDBContext();
        Contract contract = contractDB.staffGetContractDetail(id);

        if (contract != null) {
            PaymentDBContext payDB = new PaymentDBContext();
            ArrayList<Payment> payments = payDB.getContractPayments(id);

            CompensationDBContext comDB = new CompensationDBContext();
            ArrayList<Compensation> compensations = comDB.getContractCompensations(id);

            StaffDBContext sdb = new StaffDBContext();
            ArrayList<Staff> staffs = sdb.getStaffs();

            int type = contract.getEndDate().getYear() - contract.getStartDate().getYear();
            
            VehicleTypeDBContext vtdb = new VehicleTypeDBContext();
            ArrayList<VehicleType> vehicleTypes = vtdb.getVehicleTypes();
            
            BrandDBContext bdb = new BrandDBContext();
            ArrayList<Brand> brands = bdb.getBrands();

            request.setAttribute("contract", contract);
            request.setAttribute("payments", payments);
            request.setAttribute("compensations", compensations);
            request.setAttribute("staffs", staffs);
            request.setAttribute("contractType", type);
            request.setAttribute("vehicleTypes", vehicleTypes);
            request.setAttribute("brands", brands);
            request.getRequestDispatcher("../../view/staff/update-contract.jsp").forward(request, response);
        } else{
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

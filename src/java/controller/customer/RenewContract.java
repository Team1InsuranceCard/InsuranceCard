/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller.customer;

import dao.ContractDBContext;
import dao.StaffDBContext;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Timestamp;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Account;
import model.Contract;
import model.Customer;
import model.Product;
import model.Staff;

/**
 *
 * @author ASUS
 */
public class RenewContract extends HttpServlet {

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
        LocalDate d = java.time.LocalDate.now();

        int contractID = (int) request.getSession().getAttribute("contractID");
        Account acc = (Account) request.getSession().getAttribute("account");
        ContractDBContext cdb = new ContractDBContext();
        Contract contract = cdb.getContractDetail(3, contractID); //change to acc.id

        request.setAttribute("contract", contract);
        request.setAttribute("minDate", d);
        request.getRequestDispatcher("../../view/customer/renew_contract.jsp").forward(request, response);
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
        LocalDate date = java.time.LocalDate.now();
        int duration = Integer.parseInt(request.getParameter("duration"));
        String startDate = request.getParameter("startDate");

        LocalDate sDate = LocalDate.parse(startDate, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        DateTimeFormatter df = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        int contractID = (int) request.getSession().getAttribute("contractID");
//        Account acc = (Account) request.getSession().getAttribute("account");
        ContractDBContext cdb = new ContractDBContext();
        Contract c = cdb.getContractDetail(3, contractID); //change to acc.id

        Product product = new Product();
        product.setId(c.getProduct().getId());

        Account acc = new Account();
        acc.setId(3);

        Customer customer = new Customer();
        customer.setAccount(acc);

        StaffDBContext sdb = new StaffDBContext();
        Account acc_staff = new Account();
        acc_staff.setId(sdb.getStartStaff(3));

        Staff staff = new Staff();
        staff.setAccount(acc_staff);

        Contract contract = new Contract();
        contract.setProduct(product);
        contract.setCustomer(customer);
        contract.setStartDate(Timestamp.valueOf(startDate)); //fix
        contract.setEndDate(Timestamp.valueOf(sDate.plusYears(duration).format(df))); //follow duration
        contract.setStatus(Short.parseShort("2"));
        contract.setContractFee(duration * c.getProduct().getPrice());
        contract.setVehicleType(c.getVehicleType());
        contract.setEngine(c.getEngine());
        contract.setColor(c.getColor());
        contract.setCertImage(c.getCertImage());
        contract.setBrand(c.getBrand());
        contract.setOwner(c.getOwner());
        contract.setChassis(c.getChassis());
        contract.setRequestDate(Timestamp.valueOf(date.toString()));
        contract.setStartStaff(staff);

        cdb.renewContract(contract); // acc.id
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

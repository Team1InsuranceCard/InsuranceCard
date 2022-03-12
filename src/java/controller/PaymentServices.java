/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import com.paypal.api.payments.Amount;
import com.paypal.api.payments.Details;
import com.paypal.api.payments.Item;
import com.paypal.api.payments.ItemList;
import com.paypal.api.payments.Links;
import com.paypal.api.payments.Payer;
import com.paypal.api.payments.PayerInfo;
import com.paypal.api.payments.Payment;
import com.paypal.api.payments.PaymentExecution;
import com.paypal.api.payments.RedirectUrls;
import com.paypal.api.payments.Transaction;
import com.paypal.base.rest.APIContext;
import com.paypal.base.rest.PayPalRESTException;
import java.util.ArrayList;
import java.util.List;
import model.Contract;

/**
 *
 * @author quynm
 */
public class PaymentServices {
    private static final String CLIENT_ID = "AbZO9q8O7I5RPDVawBkofhFkP6xW80rrjeDqoDXct5V8TErb5ZQJpZthsGqDS-36ZxcsC9O4GkV2_WGJ";
    private static final String CLIENT_SECRET = "EFJbuxnBcCTVMQ_wu8AJ7ZyV73sE6QURypM3g-Vz9jumGChz6-5jS2QrVh8AoO4aE4na0Im5X8YJq2OD";
    private static final String MODE = "sandbox";
 
    public String authorizePayment(Contract contract)        
            throws PayPalRESTException {       
 
//        Payer payer = getPayerInformation();
//        RedirectUrls redirectUrls = getRedirectURLs();
//        List<Transaction> listTransaction = getTransactionInformation(contract);
         
        Payment requestPayment = new Payment();
//        requestPayment.setTransactions(listTransaction);
//        requestPayment.setRedirectUrls(redirectUrls);
//        requestPayment.setPayer(payer);
        requestPayment.setIntent("authorize");
 
        APIContext apiContext = new APIContext(CLIENT_ID, CLIENT_SECRET, MODE);
 
        Payment approvedPayment = requestPayment.create(apiContext);
 
//        return getApprovalLink(approvedPayment);
        return null;
 
    }
    private Payer getPayerInformation() {
        Payer payer = new Payer();
        payer.setPaymentMethod("paypal");

        PayerInfo payerInfo = new PayerInfo();
        payerInfo.setFirstName("William")
                .setLastName("Peterson")
                .setEmail("william.peterson@company.com");

        payer.setPayerInfo(payerInfo);

        return payer;
    }

    private RedirectUrls getRedirectURLs() {
        RedirectUrls redirectUrls = new RedirectUrls();
        redirectUrls.setCancelUrl("http://localhost:8080/Paypal/cancel.html");
        redirectUrls.setReturnUrl("http://localhost:8080/Paypal/review_payment");

        return redirectUrls;
    }

    

    public Payment getPaymentDetails(String paymentId) throws PayPalRESTException {
        APIContext apiContext = new APIContext(CLIENT_ID, CLIENT_SECRET, MODE);
        return Payment.get(apiContext, paymentId);
    }

    public Payment executePayment(String paymentId, String payerId)
            throws PayPalRESTException {
        PaymentExecution paymentExecution = new PaymentExecution();
        paymentExecution.setPayerId(payerId);

        Payment payment = new Payment().setId(paymentId);

        APIContext apiContext = new APIContext(CLIENT_ID, CLIENT_SECRET, MODE);

        return payment.execute(apiContext, paymentExecution);
    }
}

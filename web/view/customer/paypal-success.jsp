<%-- 
    Document   : paypal-success
    Created on : Mar 12, 2022, 4:52:12 PM
    Author     : quynm
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <base href="${pageContext.servletContext.contextPath}/">
        <title>InsuranceCard</title>
        <link rel="icon" href="asset/image/favicon.png" type="image/png" sizes="16x16">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous"/>
        <link href="asset/style/paypal_success.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
        <jsp:include page="../header_customer.jsp">
            <jsp:param name="currentscreen" value="contract" />
        </jsp:include>
        <div class="container">
            <h1>Payment Done. Thank you for purchasing our products</h1>
            <br/>
            <h2>Receipt Details:</h2>
            <table>
                <tr>
                    <td><b>Merchant:</b></td>
                    <td>Company ABC Ltd.</td>
                </tr>
                <tr>
                    <td><b>Payer:</b></td>
                    <td>${payer.firstName} ${payer.lastName}</td>      
                </tr>
                <tr>
                    <td><b>Description:</b></td>
                    <td>${transaction.description}</td>
                </tr>
                <tr>
                    <td><b>Subtotal:</b></td>
                    <td>${transaction.amount.details.subtotal} USD</td>
                </tr>
                <tr>
                    <td><b>Shipping:</b></td>
                    <td>${transaction.amount.details.shipping} USD</td>
                </tr>
                <tr>
                    <td><b>Tax:</b></td>
                    <td>${transaction.amount.details.tax} USD</td>
                </tr>
                <tr>
                    <td><b>Total:</b></td>
                    <td>${transaction.amount.total} USD</td>
                </tr>                    
            </table>
        </div>
        <jsp:include page="../footer_full.jsp"></jsp:include>
    </body>
</html>

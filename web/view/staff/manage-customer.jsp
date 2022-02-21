<%-- 
    Document   : manage-customer
    Created on : Feb 21, 2022, 4:44:35 PM
    Author     : quynm
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>InsuranceCard</title>
        <link rel="icon" href="asset/image/favicon.png" type="image/png" sizes="16x16">
        <!-- CDN to reset CSS -->
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/normalize/8.0.1/normalize.min.css" />
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous"/>
        <link href="../../asset/style/staff/manage_customer.css" rel="stylesheet" type="text/css"/>
        <base href="${pageContext.servletContext.contextPath}/">
    </head>
    <body>
        <jsp:include page="../header_staff.jsp">
            <jsp:param name="currentscreen" value="customer" />
        </jsp:include>
        <div class="container">
            <h2 class="title">CUSTOMERS LIST</h2>
            <hr/>
            <form method="POST" action="staff/customer/view">
                <div class="left">
                    <label for="inputCusID">Customer ID:</label>
                    <input type="text" id="inputCusID" class="inputdata"/><br/>
                    <label for="inputCusName">Customer Name:</label>
                    <input type="text" id="inputCusName" class="inputdata"/><br/>
                    <label for="inputPhone">Phone:</label>
                    <input type="text" id="inputPhone" class="inputdata"/><br/>
                </div>
                <div class="right">
                    <label for="inputProvince">Province:</label>
                    <input type="text" id="inputProvince" class="inputdata"/><br/>
                    <label for="inputDistrict">District:</label>
                    <input type="text" id="inputDistrict" class="inputdata"/><br/>
                    <input type="submit" class="btnFilter" value="Filter"/>
                </div>
            </form>
        </div>
        <jsp:include page="../footer_full.jsp"></jsp:include>


        <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
        <script src='https://cdn.jsdelivr.net/gh/vietblogdao/js/districts.min.js'></script>
        <script src="http://code.jquery.com/ui/1.9.2/jquery-ui.js"></script> 
        <script src="asset/script/customer/new_contract.js"></script>
    </body>
</html>

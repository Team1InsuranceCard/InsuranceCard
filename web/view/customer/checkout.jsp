<%-- 
    Document   : checkout
    Created on : Mar 12, 2022, 1:07:01 PM
    Author     : quynm
--%>

<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>InsuranceCard</title>
        <link rel="icon" href="asset/image/favicon.png" type="image/png" sizes="16x16">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous"/>
        <link href="../../asset/style/customer/checkout.css" rel="stylesheet" type="text/css"/>
        <base href="${pageContext.servletContext.contextPath}/">
    </head>
    <body>
        <jsp:include page="../header_customer.jsp">
            <jsp:param name="currentscreen" value="contract" />
        </jsp:include>
        <div class="container">
            
        </div>
        <jsp:include page="../footer_full.jsp"></jsp:include>


        <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
        <script src="http://code.jquery.com/ui/1.9.2/jquery-ui.js"></script> 
        <script src="asset/script/customer/checkout.js"></script>
    </body>
</html>

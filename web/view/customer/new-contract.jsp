<%-- 
    Document   : new-contract
    Created on : Jan 21, 2022, 9:39:11 PM
    Author     : quynm
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>InsuranceCard</title>
        <link rel="icon" href="asset/image/favicon.png" type="image/png" sizes="16x16">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous"/>
        <link href="asset/style/customer/new_contract.css" rel="stylesheet" type="text/css"/>
        <base href="${pageContext.servletContext.contextPath}/">
    </head>
    <body>
        <c:set var="account" value="${sessionScope.account}"></c:set>
        <jsp:include page="../header_customer.jsp"></jsp:include>
            <h2 class="title">REQUEST NEW CONTRACT</h2>
            <div class="content_container">
                <div class="row">
                    <div class="col-lg-8 left">
                        <h3 class="group-title">1. OWNER'S INFORMATION</h3>
                        <c:if test="${not empty sessionScope.account}">
                            <div class="quick-checkbox">
                                <input id="chk-1" type="checkbox"/>
                                <label for="chk-1">Use your account's information</label>
                            </div>
                        </c:if>
                        <h3 class="group-title">2. VEHICLE'S INFORMATION</h3>
                        <h3 class="group-title">3. INSURANCE SERVICE INFORMATION</h3>
                        <h3 class="group-title">4. DELIVERY INFORMATION</h3>
                        <div class="quick-checkbox">
                            <input id="chk-2" type="checkbox"/>
                            <label for="chk-2">Use your account's information</label>
                        </div>

                    </div>
                    <div class="col-lg-4 right">
                        <h3 class="group-title">PAYMENT INFORMATION</h3>
                    </div>
                </div>
            </div>
        <jsp:include page="../footer_full.jsp"></jsp:include>
    </body>
</html>

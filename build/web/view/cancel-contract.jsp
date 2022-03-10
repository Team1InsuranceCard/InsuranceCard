<%-- 
    Document   : cancel-contract
    Created on : Mar 10, 2022, 9:39:44 AM
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
        <!-- CDN to reset CSS -->
        <!--<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/normalize/8.0.1/normalize.min.css" />-->
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous"/>
        <base href="${pageContext.servletContext.contextPath}/">
        <link href="asset/style/change_password.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
    <c:if test="${sessionScope.account eq null and sessionScope.mod_account eq null}">
            <jsp:include page="header_common.jsp"></jsp:include>
        </c:if>
        <c:if test="${sessionScope.account.role eq true}">
            <jsp:include page="header_staff.jsp">
                <jsp:param name="currentscreen" value="contract"/>
            </jsp:include>
        </c:if>
        <c:if test="${sessionScope.account.role eq false}">
            <jsp:include page="header_customer.jsp">
                <jsp:param name="currentscreen" value="contract"/>
            </jsp:include>
        </c:if>
        <c:if test="${sessionScope.mod_account ne null}">
            <jsp:include page="header_moderator.jsp"></jsp:include>
        </c:if>
    </body>
</html>

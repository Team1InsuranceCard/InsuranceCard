

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>InsuranceCard</title>
        <link rel="icon" href="../../asset/image/favicon.png" type="image/png" sizes="16x16">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">
        <link href="../../asset/style/staff/customer_detail.css" rel="stylesheet" type="text/css"/>

    </head>
    <body>
        <c:set var="c" value="${requestScope.customer}"/>
        <jsp:include page="../header_staff.jsp">
            <jsp:param name="currentscreen" value="customer"/>
        </jsp:include>
        <section>
            <div class="row">
                <div class="col-md-4">
                    <img src="../../asset/image/staff/icon member.png" alt="member icon"/>
                    <h3 id="name">${c.firstName}</h3>
                    <p>Join date: ${c.joinDate}</p>
                    <form action="customerEdit" method="POST">
                        <input type="submit" id="edit" value="Edit"/>
                    </form>
                </div>
                <div class="col-md-8">
                    <div class="acc info">
                        <p class="type-info">Account information</p>
                        <div class="container">
                            <div class="left">
                                <p class="info-label">Email</p>
                                <p class="info-content">${c.accountID.id}</p>
                            </div>
                            <div class="right">
                                <p class="info-label">Status</p>
                                <p class="info-content">Active</p>
                            </div>
                        </div>
                    </div>
                    <div class="person info">
                        <p class="type-info">Personal information</p>
                        <div class="container">
                            <div class="left">
                                <p class="info-label">DOB</p>
                                <p class="info-content">17/02/2001</p>
                            </div>
                            <div class="right">
                                <p class="info-label">Phone</p>
                                <p class="info-content">0355070517</p>
                            </div>
                        </div>
                        <div class="container">
                            <div class="left">
                                <p class="info-label">Address</p>
                                <p class="info-content">Yen Phu, Tay Ho, Ha Noi</p>
                            </div>
                            <div class="right">
                                <p class="info-label">Personal ID</p>
                                <p class="info-content">027301000028</p>
                            </div>
                        </div>
                    </div>

                    <div class="contract info">
                        <p class="type-info">Contract information</p>
                        <div class="container">
                            <div class="left">
                                <p class="info-label">Staff</p>
                                <p class="info-content">Nguyen Van A</p>
                            </div>
                            <div class="right">
                                <p class="info-label">Toal contracts</p>
                                <p class="info-content">17
                                    <a href="#" style="margin-left:10px;
                                       text-decoration: underline;">View</a>
                                </p>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </section>
    <jsp:include page="../footer_full.jsp"/>
</body>
</html>

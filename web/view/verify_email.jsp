<%-- 
    Document   : iframe_verifyemail
    Created on : Jan 19, 2022, 6:46:17 PM
    Author     : ASUS
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>InsuranceCard</title>
        <link rel="icon" href="../asset/image/favicon.png" type="image/png" sizes="16x16">
        <Link rel="stylesheet" href = "https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.3/css/all.min.css"/>
        <link href="asset/style/verify_email.css" rel="stylesheet" type="text/css"/>
        <c:set var="rs" value="${requestScope}"/>

    </head>
    <body>
        <form action="verify_email" method="POST">
            <div>
                <input type="hidden" name="email" value="${rs.email}"/>
                <input type="hidden" name="phone" value="${rs.phone}"/>
                <input type="hidden" name="personalID" value="${rs.personalID}"/>
                <input type="hidden" name="address" value="${rs.address}"/>
                <input type="hidden" name="firstName" value="${rs.firstName}"/>
                <input type="hidden" name="lastName" value="${rs.lastName}"/>
                <input type="hidden" name="dob" value="${rs.dob}"/>
                <input type="hidden" name="pass" value="${rs.pass}"/>
                <input type="hidden" name="province" value="${rs.province}"/>
                <input type="hidden" name="district" value="${rs.district}"/>
            </div>
            <div class="container">
                <div>
                    <p id="title">
                        <i class="fas fa-check-circle"></i>
                        Verify Email</p>
                </div>
                <div class="content">
                    <p id="c1">Please check your email and enter verify code</p>
                    <p id="c2">To be able to confirm the real account, we need to sure about 
                        your email. Thank you so much!</p>
                    <p style="color:red;">${requestScope.mess}</p>
                    <input type="text" name="code" placeholder="verify code"
                           id="input-code" minlength="8" maxlength="8"
                           required/>
                    <br/>
                    <input id="btn-submit" type="submit" value="Submit"/>
                </div>    
            </div>    
        </form>
    </body>
</html>

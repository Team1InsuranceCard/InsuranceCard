<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<style>
    body {
        background-image: url('${pageContext.servletContext.contextPath}/asset/image/login_background.jpg');
        background-repeat: no-repeat;
        background-position-y: 55%;
        background-size: cover;
        /*background-color: #E5E5E5;*/
    }
</style>
<!DOCTYPE html>
<html>
    <head>
        <base href="${pageContext.servletContext.contextPath}/">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login</title>
        <link rel="icon" href="asset/image/favicon.png" type="image/png" sizes="16x16">
        <link href="asset/style/login.css" rel="stylesheet" type="text/css"/>

    </head>
    <body>
        <div class="limiter">
            <form action="login" method="POST">
                <div class="logo-group">
                    <div class="car">
                        <img src="asset/image/icon_car.png" alt="LogoIcon"/>
                    </div>
                    <div class="insurance-card">
                        <img src="asset/image/InsuranceCard.png" alt="LogoTitle"/>
                    </div>
                </div>

                <c:if test="${requestScope.alert != null}">
                    <div class="alert">
                        <div class="alert-danger">
                            ${requestScope.alert}
                        </div>
                    </div>
                </c:if>

                <c:if test="${sessionScope.account != null}">
                    <div class="username"><input class="input100" type="email" name="user" value="${sessionScope.account.username}" placeholder="Email" required/></div>
                    <div class="img-user"><img src="asset/image/user_1.png" alt="UserIcon"/></div>
                    <div class="password"><input class="input100" type="password" name="pass" pattern="[a-zA-Z0-9@]+" value="${sessionScope.account.password}" placeholder="Password" required></div>
                    <div class="img-pass"><img src="asset/image/password_1.png" alt="PassIcon"/></div>
                    </c:if>

                <c:if test="${sessionScope.account == null}">
                    <div class="username"><input class="input100" type="email" name="user" value="${requestScope.user}" placeholder="Email" required/></div>
                    <div class="img-user"><img src="asset/image/user_1.png" alt="UserIcon"/></div>
                    <div class="password"><input class="input100" type="password" name="pass" pattern="[a-zA-Z0-9@]+" placeholder="Password" required></div>
                    <div class="img-pass"><img src="asset/image/password_1.png" alt="PassIcon"/></div>
                </c:if>
                <div class="remember">
                    <label for="check"><input type="checkbox" id="check" name="remember">
                        <span class="checkmark"></span><span>Remember Me?</span>
                    </label>
                </div>
                <div class="logbutton">
                    <input type="submit" name="log" value="LOGIN">
                </div>
                <div class="forgot-sign">
                    <div class="forgot"><a href="#">Forgot Password?</a></div>
                    <div class="sign"><a href="register">Sign Up</a></div>
                </div>
                <div class="quick-log">
                    <div class="google">
                        <img src="asset/image/gg_icon.png" alt=""/>
                        <input type="button" name="gg" value="Google">
                    </div>
                </div>
            </form>
        </div>
    </body>
</html>
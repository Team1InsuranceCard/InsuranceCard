<%-- 
    Document   : login
    Created on : Feb 22, 2022, 8:11:30 AM
    Author     : ASUS
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>InsuranceCard</title>
        <link rel="icon" href="asset/image/favicon.png" type="image/png" sizes="16x16">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
        <script src="https://code.iconify.design/2/2.1.2/iconify.min.js"></script>
        <link href="../../asset/style/moderator/login.css" rel="stylesheet" type="text/css"/>
        <base href="${pageContext.servletContext.contextPath}/">

    </head>

    <body>
        <div class="container">
            <form action="moderator/login" method="POST">
                <div class="row">
                    <div class="col-md-6 left">
                        <span class="iconify logo" data-icon="ant-design:car-filled"></span>
                    </div>

                    <div class="col-md-6 right">
                        <h3 class="title">INSURANCE CARD</h3>
                        <div class="form">
                            <p class="attribute">Username <span>*</span></p>
                            <input class="input" type="text" name="username" required/>
                            <span class="iconify input-icon" data-icon="carbon:user-avatar-filled-alt"></span>
                            <br/>
                            <p class="attribute">Password <span>*</span></p>
                            <input class="input" type="text" name="password" required/>
                            <span class="iconify input-icon" data-icon="ri:lock-password-fill"></span>
                            <br/>
                            <div>
                                <input class="btn" type="submit" value="Sign In"/>
                            </div>
                        </div>
                        </form>
                    </div>
                    </body>
                    </html>

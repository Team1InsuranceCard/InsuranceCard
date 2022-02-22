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
        <base href="${pageContext.servletContext.contextPath}/">


    </head>

    <body>
        <div class="container">
            <form action="moderator/login" method="POST">
                <div class="row">
                    <div class="col-md-5" left>
                        <i class="fa-solid fa-car-rear 2x"></i>
                        <span class="iconify" data-icon="ant-design:car-filled"></span>
                    </div>

                    <div class="col-md-5" right>
                        <h3>INSURANCE CARD</h3>
                        <p>User name <span>*</span></p>
                        <input type="text" name="username" required/>
                        <br/>
                        <p>Password <span>*</span></p>
                        <input type="text" name="password" required/>
                        <br/>
                        <input type="submit" value="Sign In"/>
                    </div>
                </div>
            </form>
        </div>
    </body>
</html>

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

        <style>
            body {
                font-family: -apple-system, BlinkMacSystemFont, "Segoe UI", Roboto,
                    Oxygen, Ubuntu, Cantarell, "Open Sans", "Helvetica Neue", sans-serif;
                color: #5C2941;
                background-color: #C4C4C4;
            }

            .logo {
                width: 27rem;
                height: 27rem;
                color: #A23246;
            }

            .container {
                margin: 5rem 8rem 2rem 7.5rem;
            }

            .container .row {
                width: 80rem;
            }

            .container .row .left {
                width: 100%;
                background-color: #A4C4B5;
                padding: 7rem 9rem 5rem 6rem;
            }

            .container .row .right {
                width: 100%;
                background-color: #FFFFFF;
            }

            .title {
                font-weight: bold;
                margin-bottom: 5rem;
                padding: 5rem 9rem 0 11rem;
            }

            .container .row .form {
                padding-left: 7rem;
            }

            .attribute {
                font-style: italic;
                margin-top: 2rem;
            }

            .input {
                position: absolute;
                border: none;
                border-bottom: 1px solid rgba(0, 0, 0, 0.65);
                width: 23rem;
                transition: 0.25s ease;
                padding: 0.25rem 4rem 0.25rem 1rem;
            }
            
            .container .row .right .input-icon {
                position: relative;
                width: 2.5rem;
                height: 3rem;
                margin-left: 20rem;
                padding-bottom: 1rem; 
            }
            
            .container .row .right span {
                color: red;
            }

            .input:focus {
                outline: 0;
                border-bottom: 2px solid #FC6376;
                color: #5C2941;
            }

            .container .row .btn {
                width: 10rem;
                height: 3.5rem;
                background: #A4C4B5;
                border-radius: 30px;
                margin-left: 7rem;
                margin-top: 5rem;
                color: #FFFFFF;
                font-size: 18px;
                font-weight: bold;
            }
            
            
        </style>
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

<%-- 
    Document   : staff_create
    Created on : Feb 21, 2022, 8:36:16 PM
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
        <base href="${pageContext.servletContext.contextPath}/">

        <style>
            body {
                font-family: -apple-system, BlinkMacSystemFont, "Segoe UI", Roboto,
                    Oxygen, Ubuntu, Cantarell, "Open Sans", "Helvetica Neue", sans-serif;
                color: #5C2941;
                /*overflow-x: hidden;*/
            }

            section .func-label {
                margin: 7rem 0 3rem 23rem;
                font-weight: bold;
            }

            section .container {
                margin-left: 23rem;
            }

            .container .row .attribute {
                font-size: 18px;
                font-weight: bold;
                margin-bottom: 1.5rem;
                margin-left: 5rem;
            }

            .container .row .input {
                margin-bottom: 3rem;
                margin-left: 5rem;
            }

            .container .row .input input {
                width: 20rem;
                height: 3.5rem;
                background: #FFF9EC;
                border: 1.75px solid #000000;
                box-sizing: border-box;
                border-radius: 10px;
                padding-left: 1.5rem;
            }

            .container .row span {
                color: red;
            }

            .btn-input {
                margin: 1rem 0 3rem 24.75rem;
            }

            .btn-input .btn {
                width: 7rem;
                height: 3rem;
                border-radius: 10px;
                font-weight: bold;
            }

            .create {
                background: #FC6376;
                margin-right: 1rem;
                color: #FFFFFF;
            }

            .cancel {
                background: #C4C4C4;
                color: #5C2941;
            }
            
            ::placeholder {
                color: rgba(0, 0, 0, 0.4);
                font-style: italic;
            }
        </style>
    </head>

    <body>
        <header>
            <jsp:include page="../header_moderator.jsp">
                <jsp:param name="currentscreen" value="staff"/>
            </jsp:include>
        </header>

        <section>
            <h2 class="func-label">New Staff</h2>

            <form action="moderator/staff/create" method="POST">
                <div class="container">
                    <!-- Name -->
                    <div class="row">
                        <div class="col-md-5 attribute">First name <span>*</span></div>
                        <div class="col-md-5 attribute">Last name <span>*</span></div>
                    </div>

                    <div class="row">
                        <div class="col-md-5 input fname">
                            <input type="text"  name="firstName"
                                   pattern="/[^a-z0-9A-Z_\x{00C0}-\x{00FF}\x{1EA0}-\x{1EFF}]/u"
                                   placeholder="Nguyễn Văn" required/>
                        </div>
                        <div class="col-md-5 input lname">
                            <input type="text"  name="lastName"
                                   pattern="/[^a-z0-9A-Z_\x{00C0}-\x{00FF}\x{1EA0}-\x{1EFF}]/u"
                                   placeholder="Anh" required/>
                        </div>
                    </div>

                    <!-- Email + Phone -->
                    <div class="row">
                        <div class="col-md-5 attribute">Email <span>*</span></div>
                        <div class="col-md-5 attribute">Phone <span>*</span></div>
                    </div>

                    <div class="row">
                        <div class="col-md-5 input email">
                            <input type="email" name="email"
                                   placeholder="anhnv@gmail.com" required/>
                        </div>
                        <div class="col-md-5 input phone">
                            <input type="tel" name="phone" pattern="[0]{1}[0-9]{9}"  
                                   minlength="10" maxlength="10"
                                   placeholder="0123456789" required/>
                        </div>
                    </div>

                    <div class="btn-input">
                        <input type="submit" class="create btn" value="Create"/>
                        <input type="button" class="cancel btn" value="Cancel"/>
                    </div>
                </div>
            </form>
        </section>

        <footer>
            <jsp:include page="../footer_full.jsp"></jsp:include>
        </footer>
    </body>
</html>

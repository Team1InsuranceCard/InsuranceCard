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
        <link href="../../asset/style/moderator/staff_create.css" rel="stylesheet" type="text/css"/>
        <base href="${pageContext.servletContext.contextPath}/">
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
                        <a href="moderator/staff">
                            <input type="button" class="cancel btn" value="Cancel"/>
                        </a>
                    </div>
                </div>
            </form>
        </section>

        <footer>
            <jsp:include page="../footer_full.jsp"></jsp:include>
        </footer>
    </body>
</html>

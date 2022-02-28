<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <base href="${pageContext.servletContext.contextPath}/">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Insurance Card</title>
        <link rel="icon" href="asset/image/favicon.png" type="image/png" sizes="16x16">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
              integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
              crossorigin="anonymous">
        <link rel = "stylesheet" href = "https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.3/css/all.min.css"/>
        <link href="asset/style/customer/contact.css" rel="stylesheet" type="text/css"/>
        <style>
/*            .mess-box {
                display: none;
                align-items: center;
                padding: 10px 10px;
                border-radius: 4px;
                margin: 0 60px 30px 60px;
            }

            .mess-box--success {
                background-color: #dff0d8;
                border: 1px solid #d6e9c6;
                color: #3c763d;
            }*/
        </style>
    </head>
    <body>
        <jsp:include page="../header_customer.jsp">
            <jsp:param name="currentscreen" value="" />
        </jsp:include>

        <section>
            <div class="row container justify-content-between">
                <div class="col-lg-5">
                    <h2>Message Us</h2>
                    <div>
                        <img src="asset/image/customer/contact/Contact.png" alt=""/>
                    </div>
                </div>
                <div class="col-lg-5 main-form">
                    <div class="mess-box mess-box--success" style="${requestScope.mess == ""? "display: none;" : "display: flex;"}">${requestScope.mess}</div>
                    <form action="contact" method="POST" autocomplete="off">
                        <div class="text">
                            <input type="text" name="fullName" 
                                   placeholder="Full name*" 
                                   pattern="/[^a-z0-9A-Z_\x{00C0}-\x{00FF}\x{1EA0}-\x{1EFF}]/u"
                                   value="${fullName}" required/>
                        </div>
                        <div class="text">
                            <input
                                type="email"
                                name="email"
                                placeholder="Email*"
                                value="${email}"
                                pattern="[a-z0-9._%+-]+@[a-z0-9.-]+\.[a-z]{2,}$"
                                required
                                />
                        </div>
                        <div class="text">
                            <textarea
                                type="text"
                                name="message"
                                placeholder="Message*"
                                value="${message}"
                                required
                                ></textarea>
                        </div>
                        <div class="text">
                            <input type="submit" value="Submit"/>
                        </div>
                    </form>
                </div>
            </div>
        </section>

        <jsp:include page="../footer_full.jsp"></jsp:include>
    </body>
</html>

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
        <link href="asset/style/customer/contact.css" rel="stylesheet" type="text/css"/>
<!--        <style>
            body {
                font-family: -apple-system, BlinkMacSystemFont, "Segoe UI", Roboto, Oxygen,
                    Ubuntu, Cantarell, "Open Sans", "Helvetica Neue", sans-serif;
            }

            section .container {
                /*                margin-top: 10rem;
                                margin-bottom: 5em;*/
                margin: 10em auto 5em auto;
            }

            @media only screen and (max-width: 800px) {
                .col-lg-5 img {
                    display: none;
                }
                section .container {
                    /*                margin-top: 10rem;
                                    margin-bottom: 5em;*/
                    margin: 15em auto 3em auto;
                }
            }

            @media only screen and (min-width: 992px) and (max-width: 1200px) {
                .col-lg-5 img {
                    width: 550px;
                }
            }

            h2 {
                text-align: center;
            }

            .text input{
                margin-top: 0.7em;
                margin-bottom: 10px;
                border-radius: 30px;
                padding: 15px 25px;
                border: none;
                background: rgba(253, 177, 166, 0.7);
                color: rgba(252, 99, 118, 1);
                font-weight: bold;
                font-size: 18px;
                width: 100%;
                height: 3.5rem;
            }
            
            .text input::placeholder {
                color: rgba(252, 99, 118, 1);
            }

            .text textarea {
                margin-top: 1em;
                margin-bottom: 10px;
                border-radius: 30px;
                padding: 15px 25px;
                border: none;
                background: rgba(253, 177, 166, 0.7);
                color: rgba(252, 99, 118, 1);
                font-weight: bold;
                font-size: 18px;
                width: 100%;
                height: 11rem;
                resize: none;
            }
            
            .text textarea::placeholder {
                color: rgba(252, 99, 118, 1);
            }
        </style>-->
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
                    <form action="contact" method="POST" autocomplete="off">
                        <div class="text">
                            <input type="text" name="fullName" 
                                   placeholder="First name*" 
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

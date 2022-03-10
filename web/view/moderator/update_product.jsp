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
        <style>
            main {
                margin-top: 73px;
                margin-left: 290px;
                padding: 35px 45px 50px
            }

            .header__btn {
                margin: 1em;
            }

            .btn {
                border: none;
                font-size: 18px;
                border-radius: 4px;
                min-width: 90px;
                text-align: center;
                box-sizing: content-box;
            }

            .btn--primary {
                background-color: #4FCD5C;
                color: #fff;
                transition: all 0.2s;
            }

            .btn--primary:hover {
                background: rgba(79, 205, 92, 0.8);
            }

            .btn--secondary {
                background-color: #E76666;
                color: #000;
                text-decoration: none;
                transition: all 0.2s;
            }

            .btn--secondary:hover {
                background: rgba(231, 102, 102, 0.8);
                color: #fff;
            }
            
            .section__img {
                height: 10em;
                background-color: black;
            }
            
            .section_upload {
                margin-top: 7em;
            }
        </style>
    </head>
    <body>
        <header>
            <jsp:include page="../header_moderator.jsp">
                <jsp:param name="currentscreen" value="" />
            </jsp:include>
        </header>

        <main>
            <form action="/moderator/product/update" method="POST">
                <div class="row col-lg-12 product-top">
                    <div class="row col-lg-6">
                        <div class="row col-lg-9 header__btn justify-content-between">
                            <input class="col-lg-2 btn btn--primary" 
                                   type="submit" value="Submit" />

                            <a class="col-lg-2 btn btn--secondary"
                               onclick="confirmBox('Are you sure you want to cancel?', 'staff/compensation/resolve-compensation?id=${requestScope.compensation.id}')">Cancel</a>
                        </div>
                        
                        <div class="row col-lg-9 section__img">
                            
                        </div>
                        <div class="row col-lg-3 section_upload">
                            <a>Import image</a>
                        </div>
                    </div>
                    <div class="row col-lg-12">

                    </div>
                </div>
            </form>
        </main>

        <footer>
            <jsp:include page="../footer_full.jsp"></jsp:include>
        </footer>
    </body>
</html>

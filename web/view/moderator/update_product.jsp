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
                /*display: inline-block;*/
            }

            .btn--primary:hover {
                background: rgba(79, 205, 92, 0.8);
            }

            .btn--secondary {
                background-color: #E76666;
                color: #000;
                text-decoration: none;
                transition: all 0.2s;
                /*display: inline-block;*/
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

            .text input{
                margin-top: 0.7em;
                margin-bottom: 10px;
                border-radius: 8px;
                padding: 15px 25px;
                border: solid #000;
                background: rgba(253, 177, 166, 0.7);
                color: rgba(252, 99, 118, 1);
                font-weight: bold;
                font-size: 18px;
                width: 100%;
                height: 3.5rem;
            }

            .text textarea {
                margin-top: 1em;
                margin-bottom: 10px;
                border-radius: 8px;
                padding: 15px 25px;
                border: solid #000;
                background: rgba(253, 177, 166, 0.7);
                color: rgba(252, 99, 118, 1);
                font-weight: bold;
                font-size: 18px;
                width: 100%;
                height: 11rem;
                resize: none;
            }

            .text p {
                margin-top: 1.5em;
                float: right;
            }

            .img input {
                height: 2em;
                margin-top: 13em;
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
                    <div class="row col-lg-6 top-right">
                        <div class="row col-lg-12 btn">
                            <input class="col-lg-3 btn--primary" type="submit" value="Submit"/>
                            <input class="col-lg-3 btn--secondary" type="button" value="Cancel"/>
                        </div>
                        <div class="row col-lg-12 justify-content-between img">
                            <img class="col-lg-10" src="asset/image/moderator/image show.png" alt=""/>
                            <input class="col-lg-2" type="button" value="Upload"/>
                        </div>
                    </div>
                    <div class="row col-lg-6 top-left">
                        <div class="row col-lg-12 justify-content-between text">
                            <label for="txt_title" class="col-lg-3">
                                <p>Title</p>
                            </label>
                            <input
                                type="text"
                                name="title"
                                id ="txt_title"
                                placeholder="Title"
                                class="col-lg-8"
                                required
                                />
                        </div>
                        <div class="row col-lg-12 justify-content-between text">
                            <label for="txt_price" class="col-lg-3">
                                <p>Price</p>
                            </label>
                            <input
                                type="text"
                                name="price"
                                id ="txt_price"
                                placeholder="Price"
                                class="col-lg-8"
                                required
                                />
                        </div>
                        <div class="row col-lg-12 justify-content-between text">
                            <label for="txt_desc" class="col-lg-3">
                                <p>Description</p>
                            </label>
                            <textarea
                                type="text"
                                name="description"
                                placeholder="Description"
                                id ="txt_desc"
                                class="col-lg-8"
                                required
                                ></textarea>
                        </div>
                    </div>
                </div>
            </form>
        </main>

        <footer>
            <jsp:include page="../footer_full.jsp"></jsp:include>
        </footer>
    </body>
</html>

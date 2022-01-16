

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>InsuranceCard</title>
        <link rel="icon" href="../../asset/image/favicon.png" type="image/png" sizes="16x16">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">

        <style>
            body {
                background-color: #F8F8F8;
                overflow-x: hidden;
                font-family: -apple-system, BlinkMacSystemFont, "Segoe UI", Roboto,
                    Oxygen, Ubuntu, Cantarell, "Open Sans", "Helvetica Neue", sans-serif;
            }

            section {
                width: 1100px;
                height: 630px;
                margin-left: 370px;
                margin-top: 117px;
                background: #FFF9EC;
                color: #5C2941;
            }

            .col-md-4 {
                text-align: center;
                margin-top: 150px;
            }

            .col-md-4 #name {
                display: block;
                word-break: break-all;
            }

            #edit {
                margin-top: 60px;
                width: 142px;
                height: 62px;
                background: #FFDCCC;
                border-radius: 20px;
                font-size: 25px;
                font-weight: bold;
                border: none;
            }

            #edit:hover {
                color: #ffffff;
                background: #FC6376;
            }

            #name {
                margin-bottom: 15px;
            }

            .row .col-md-8{
                border-left: 2px solid #E5E5E5;
                margin-top: 30px;
            }

            .info {
                margin-top: 35px;
                margin-left: 30px;
                padding-bottom: 30px;
                border-bottom: 1px solid #E5E5E5;
            }

            .type-info {
                font-size: 16px;
            }

            .info-label {
                font-size: 18px;
                font-weight: bold;
            }

            .container .left {
                display: block;
                float: left;
                width: 200px;
                margin-right: 100px;
                word-break: break-all;
            }

            .container .right {
                float: left;
                width: 300px;
                word-break: break-all;
            }

            .contract {
                border: none;
            }

        </style>
    </head>
    <body>
        <jsp:include page="../header_staff.jsp">
            <jsp:param name="currentscreen" value="customer"/>
        </jsp:include>
        <section>
            <div class="row">
                <div class="col-md-4">
                    <img src="../../asset/image/staff/icon member.png" alt="member icon"/>
                    <h3 id="name">Do Phuong Loan</h3>
                    <p>Join date: 17/01/2022</p>
                    <form action="customerEdit" method="GET">
                        <input type="submit" id="edit" value="Edit"/>
                    </form>
                </div>
                <div class="col-md-8">
                    <div class="acc info">
                        <p class="type-info">Account information</p>
                        <div class="container">
                            <div class="left">
                                <p class="info-label">Email</p>
                                <p class="info-content">loandphe150131@fpt.edu.vn</p>
                            </div>
                            <div class="right">
                                <p class="info-label">Status</p>
                                <p class="info-content">Active</p>
                            </div>
                        </div>
                    </div>
                    <div class="person info">
                        <p class="type-info">Personal information</p>
                        <div class="container">
                            <div class="left">
                                <p class="info-label">DOB</p>
                                <p class="info-content">17/02/2001</p>
                            </div>
                            <div class="right">
                                <p class="info-label">Phone</p>
                                <p class="info-content">0355070517</p>
                            </div>
                        </div>
                        <div class="container">
                            <div class="left">
                                <p class="info-label">Address</p>
                                <p class="info-content">Yen Phu, Tay Ho, Ha Noi</p>
                            </div>
                            <div class="right">
                                <p class="info-label">Personal ID</p>
                                <p class="info-content">027301000028</p>
                            </div>
                        </div>
                    </div>

                    <div class="contract info">
                        <p class="type-info">Contract information</p>
                        <div class="container">
                            <div class="left">
                                <p class="info-label">Staff</p>
                                <p class="info-content">Nguyen Van A</p>
                            </div>
                            <div class="right">
                                <p class="info-label">Toal contracts</p>
                                <p class="info-content">17
                                    <a href="#" style="margin-left:10px;
                                       text-decoration: underline;">View</a>
                                </p>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </section>
</body>
</html>

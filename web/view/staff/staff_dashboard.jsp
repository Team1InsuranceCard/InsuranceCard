<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
        <link href="asset/style/staff/staff_dashboard.css" rel="stylesheet" type="text/css"/>
<!--        <style>
            body {
                background: #FFF9EC;
                color: #5C2941;
            }

            .main-container {
                margin-top: 10em;
                margin-bottom: 5em;
                padding-left: 4em;
                /*margin-right: 1em;*/
                margin-left: 330px;
            }

            .row1 {
                /*background-color: gray;*/
                min-height: 13em;
                margin-bottom: 1em;
            }

            .staff-card {
                background-color: #ffdccc;
                text-align: center;
                border-radius: 10px;
                min-height: 13em;
                margin-bottom: 1em;
            }

            .staff-card .name-card-image {
                margin: 1vh auto 3vh auto;
            }

            .staff-card .name-card-image img {
                width: 8em;
            }

            .row2 .task-container {
                border-radius: 7px;
                margin-bottom: 2em;
            }

            .above {
                background-color: #ffdccc;
                border-radius: 7px 7px 0 0;
                padding: 0.5em;
            }

            .under {
                background-color: rgba(253, 130, 145, 0.5);
                border-radius: 0 0 7px 7px;
            }

            .under .unholded, .arrow {
                padding-top: 0.3em;
            }

            .unholded a {
                color: #000;
            }

            .unholded a:hover{
                text-decoration: none;
                color: buttonshadow;

            }

            .row2 .under .unhold-number {
                background-color: #FC6376;
                border-radius: 7px;
                max-width: 10.5% !important;
            }

            .row3 .under .unhold-number {
                background-color: #FC6376;
                border-radius: 7px;
                max-width: 13% !important;
            }

            .row3 .plan {
                max-width: 90%;
                margin: 0 auto;
            }

            .row3 .plan .table th:first-child, td:first-child {
                width: 33em;
            }

            .row3 .task-container {
                margin-bottom: 2em;
            }

            .row3 .plan .table thead {
                background-color: #FD8291;
            }

            .row3 .plan .table tbody tr {
                background-color: rgba(253, 177, 166, 0.7);
            }

            table thead th:first-child, tbody td:first-child {
                border-radius: 7px 0 0 7px;
            }

            table thead th:last-child, tbody td:last-child {
                border-radius: 0 7px 7px 0;
            }

            table {
                border-collapse: separate !important;
                -webkit-border-horizontal-spacing: 0 !important;
                -webkit-border-vertical-spacing: 3px !important;
            }

            table thead a:hover, tbody tr td a:hover {
                text-decoration: none;
            }
            
            table tbody tr td a {
                font-size: 1.3em;
            }
        </style>-->
    </head>
    <body>
        <jsp:include page="../header_staff.jsp">
            <jsp:param name="currentscreen" value="dashboard" />
        </jsp:include>
        <section>
            <div class="container main-container">
                <div class="row justify-content-around row1">
                    <div class="col-lg-4 staff-card">
                        <div class="name-card-image">
                            <img src="asset/image/staff/User.png" alt="avatar"/>
                        </div>
                        <div class="name-card-content">
                            <!--staff name-->
                            <h3>Hello ${sessionScope.fname} ${sessionScope.lname}</h3>
                        </div>
                    </div>
                    <div class="col-lg-8 ads-container">
                        <div class="ads">
                            <img
                                src="https://content.naic.org/sites/default/files/article/web_image_ci_health_insurance_card.png"
                                style="width: 100%; height: 13em;"
                                />
                        </div>
                    </div>
                </div>
                <div class="row justify-content-around row2">
                    <div class="col-lg-5 task-container">
                        <div class="row above">
                            <div class="col-6 task-image">
                                <img src="asset/image/staff/User.png" alt="customer"/>
                            </div>
                            <div class="col-6 task-total">
                                <h1>${sessionScope.total1}</h1>
                                <h4>Customers</h4>
                            </div>
                        </div>
                        <div class="row under">
                            <div class="col-2 unhold-number">
                                <h3>${sessionScope.unhold1}</h3>
                            </div>
                            <div class="col-9 unholded">
                                <a href="#">
                                    <h4>Unholded</h4>
                                </a>
                            </div>
                            <div class="col-1 arrow">
                                <a href="#">
                                    <img src="asset/image/staff/Arrow.png" alt="arrow"/>
                                </a>
                            </div>
                        </div>
                    </div>
                    <div class="col-lg-5 task-container">
                        <div class="row above">
                            <div class="col-6 task-image">
                                <img src="asset/image/staff/User.png" alt="customer"/>
                            </div>
                            <div class="col-6 task-total">
                                <h1>${sessionScope.total2}</h1>
                                <h4>Contracts</h4>
                            </div>
                        </div>
                        <div class="row under">
                            <div class="col-2 unhold-number">
                                <h3>${sessionScope.unhold2}</h3>
                            </div>
                            <div class="col-9 unholded">
                                <a href="#">
                                    <h4>Unholded</h4>
                                </a>
                            </div>
                            <div class="col-1 arrow">
                                <a href="#">
                                    <img src="asset/image/staff/Arrow.png" alt="arrow"/>
                                </a>
                            </div>
                        </div>
                    </div>
                    <!--                    <div class="col-lg-3 task-container">
                                            <div class="row above">
                                                <div class="col-5 task-image">
                                                    <img src="asset/image/staff/User.png" alt="customer"/>
                                                </div>
                                                <div class="col-7 task-total">
                                                    <h1>${sessionScope.total3}</h1>
                                                    <h4>Cancels</h4>
                                                </div>
                                            </div>
                                            <div class="row under">
                                                <div class="col-2 unhold-number">
                                                    <h3>4</h3>
                                                </div>
                                                <div class="col-7 unholded">
                                                    <a href="#">
                                                        <h4>Unholded</h4>
                                                    </a>
                                                </div>
                                                <div class="col-3 arrow">
                                                    <a href="#">
                                                        <img src="asset/image/staff/Arrow.png" alt="arrow"/>
                                                    </a>
                                                </div>
                                            </div>
                                        </div>-->
                </div>
                <div class="row row3">
                    <div class="col-lg-4 task-container">
                        <div class="row above">
                            <div class="col-5 task-image">
                                <img src="asset/image/staff/User.png" alt="customer"/>
                            </div>
                            <div class="col-7 task-total">
                                <h1>${sessionScope.total3}</h1>
                                <h4>Compensation</h4>
                            </div>
                        </div>
                        <div class="row under">
                            <div class="col-2 unhold-number">
                                <h3>${sessionScope.unhold3}</h3>
                            </div>
                            <div class="col-8 unholded">
                                <a href="#">
                                    <h4>Unholded</h4>
                                </a>
                            </div>
                            <div class="col-2 arrow">
                                <a href="#">
                                    <img src="asset/image/staff/Arrow.png" alt="arrow"/>
                                </a>
                            </div>
                        </div>
                        <br>
                        <div class="row above">
                            <div class="col-5 task-image">
                                <img src="asset/image/staff/User.png" alt="customer"/>
                            </div>
                            <div class="col-7 task-total">
                                <h1>${sessionScope.total4}</h1>
                                <h4>Cancels</h4>
                            </div>
                        </div>
                        <div class="row under">
                            <div class="col-2 unhold-number">
                                <h3>${sessionScope.unhold4}</h3>
                            </div>
                            <div class="col-8 unholded">
                                <a href="#">
                                    <h4>Unholded</h4>
                                </a>
                            </div>
                            <div class="col-2 arrow">
                                <a href="#">
                                    <img src="asset/image/staff/Arrow.png" alt="arrow"/>
                                </a>
                            </div>
                        </div>
                        <!--                        <br>
                                                <div class="row above">
                                                    <div class="col-5 task-image">
                                                        <img src="asset/image/staff/User.png" alt="customer"/>
                                                    </div>
                                                    <div class="col-7 task-total">
                                                        <h1>${sessionScope.total5}</h1>
                                                        <h4>Requests</h4>
                                                    </div>
                                                </div>
                                                <div class="row under">
                                                    <div class="col-2 unhold-number">
                                                        <h3>4</h3>
                                                    </div>
                                                    <div class="col-8 unholded">
                                                        <a href="#">
                                                            <h4>Unholded</h4>
                                                        </a>
                                                    </div>
                                                    <div class="col-2 arrow">
                                                        <a href="#">
                                                            <img src="asset/image/staff/Arrow.png" alt="arrow"/>
                                                        </a>
                                                    </div>
                                                </div>-->
                    </div>
                    <div class="col-lg-8 plan-container">
                        <div class="plan">
                            <table class="table">
                                <thead>
                                    <tr>
                                        <th scope="col" style="color: #007bff;">Insurance Plans</th>
                                        <th scope="col"><a href="product" style="color: black;">View All</a></th>
                                    </tr>
                                </thead>
                                <tbody>
                                    <c:forEach var="p" items="${sessionScope.products}" begin="0" end="4">
                                        <tr>
                                            <td scope="row"><a href="product/detail?productid=${p.id}">${p.id}. ${p.title}</a></td>
                                            <td></td>
                                        </tr>
                                    </c:forEach>
                                </tbody>
                            </table>
                        </div>
                    </div>
                </div>
            </div>
        </section>
        <jsp:include page="../footer_full.jsp"></jsp:include>
    </body>
</html>

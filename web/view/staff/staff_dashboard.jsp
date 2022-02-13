<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <base href="${pageContext.servletContext.contextPath}/">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Dashboard</title>
        <link rel="icon" href="asset/image/favicon.png" type="image/png" sizes="16x16">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
              integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
              crossorigin="anonymous">
        <link href="asset/style/staff/staff_dashboard.css" rel="stylesheet" type="text/css"/>

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
                            <!--                            <img
                                                            src="asset/image/customer/cutomer_dashboard/image2.png"
                                                            alt="customericon"
                                                            />-->
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
                    <div class="col-lg-3 task-container">
                        <div class="row above">
                            <div class="col-5 task-image">
                                <img src="asset/image/staff/User.png" alt="customer"/>
                            </div>
                            <div class="col-7 task-total">
                                <h1>${requestScope.total1}</h1>
                                <h4>Customers</h4>
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
                    </div>
                    <div class="col-lg-3 task-container">
                        <div class="row above">
                            <div class="col-5 task-image">
                                <img src="asset/image/staff/User.png" alt="customer"/>
                            </div>
                            <div class="col-7 task-total">
                                <h1>${requestScope.total2}</h1>
                                <h4>Contracts</h4>
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
                    </div>
                    <div class="col-lg-3 task-container">
                        <div class="row above">
                            <div class="col-5 task-image">
                                <img src="asset/image/staff/User.png" alt="customer"/>
                            </div>
                            <div class="col-7 task-total">
                                <h1>${requestScope.total3}</h1>
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
                    </div>
                </div>
                <div class="row row3">
                    <div class="col-lg-4 task-container">
                        <div class="row above">
                            <div class="col-5 task-image">
                                <img src="asset/image/staff/User.png" alt="customer"/>
                            </div>
                            <div class="col-7 task-total">
                                <h1>${requestScope.total4}</h1>
                                <h4>Compensations</h4>
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
                        </div>
                        <br>
                        <div class="row above">
                            <div class="col-5 task-image">
                                <img src="asset/image/staff/User.png" alt="customer"/>
                            </div>
                            <div class="col-7 task-total">
                                <h1>${requestScope.total5}</h1>
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
                        </div>
                    </div>
                    <div class="col-lg-8 plan-container">
                        <div class="plan">
                            <table class="table">
                                <thead>
                                    <tr>
                                        <th scope="col">Insurance Plans</th>
                                        <th scope="col">View All</th>
                                    </tr>
                                </thead>
                                <tbody>
                                    <tr>
                                        <td scope="row">1</td>
                                        <td></td>
                                    </tr>
                                    <tr>
                                        <td scope="row">2</td>
                                        <td></td>
                                    </tr>
                                    <tr>
                                        <td scope="row">3</td>
                                        <td></td>
                                    </tr>
                                    <tr>
                                        <td scope="row">4</td>
                                        <td></td>
                                    </tr>
                                    <tr>
                                        <td scope="row">5</td>
                                        <td></td>
                                    </tr>
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

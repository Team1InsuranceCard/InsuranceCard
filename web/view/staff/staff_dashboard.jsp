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
        <!--<link href="asset/style/staff/staff_dashboard.css" rel="stylesheet" type="text/css"/>-->
        <!--<script src="asset/script/staff/staff_dashboard.js" defer></script>-->
        <style>
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

            .staff-welcome {
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

            .task-container {
                /*min-height: 13em;*/
                margin: 2em 0;
            }

            .task {
                background-color: #ffdccc;
                margin: 0 auto;
                border-radius: 10px;
            }

            .task .task-image{
                padding-top: 0.5em;
                display: inline-table;
                margin-bottom: 1em;
            }

            .task-total {
                display: inline-table;
                margin-left: 1.5em;
                margin-bottom: 1em;
            }

            .task-total h2, h4 {
                text-align: center;
            }

            .task-unhold {
                background-color: red;
                /*                margin-left: -0.93em;
                                margin-right: -0.95em;*/
                height: 3.4em;
                border-radius: 0 0 10px 10px;
            }

            .unhold-number {
                background-color: yellow;
                width: 1.7em;
                height: 1.7em;
                border-radius: 0 10px 10px 10px;
                text-align: center;
                float: left;
                font-size: 2em;
            }

            .unholded {
                /*float: right;*/
                font-size: 1.3em;
                
                /*margin-right: 2.2em;*/
            }

            .row3 .task:last-child {
                margin: 2em auto;
            }

        </style>
    </head>
    <body>
        <jsp:include page="../header_staff.jsp">
            <jsp:param name="currentscreen" value="dashboard" />
        </jsp:include>
        <section>
            <div class="container main-container">
                <div class="row staff-welcome">
                    <div class="col-lg-4 staff-card">
                        <div class="name-card-image">
                            <!--                            <img
                                                            src="asset/image/customer/cutomer_dashboard/image2.png"
                                                            alt="customericon"
                                                            />-->
                            <img src="asset/image/staff/User.png" alt=""/>
                        </div>
                        <div class="name-card-content">
                            <h3>Nguyen Que Tien</h3>
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
                <div class="row task-container">
                    <div class="col-lg-3 task">
                        <div class="task-image">
                            <img src="asset/image/staff/User.png" alt=""/>
                        </div>
                        <div class="task-total">
                            <h2>26</h2>
                            <h4>Customers</h4>
                        </div>
                        <div class="task-unhold">
                            <div class="unhold-number">
                                4
                            </div>
                            <div class="unholded">
                                <a href="#">
                                    Unholded
                                    <img src="asset/image/staff/Arrow.png" alt=""/>
                                </a>
                            </div>
                        </div>
                    </div>
                    <div class="col-lg-3 task">
                        <div class="task-image">
                            <img src="asset/image/staff/User.png" alt=""/>
                        </div>
                        <div class="task-total">
                            <h2>26</h2>
                            <h4>Customers</h4>
                        </div>
                        <div class="task-unhold">
                            <div class="unhold-number">
                                4
                            </div>
                            <div class="unholded">
                                <a href="#">
                                    Unholded
                                    <img src="asset/image/staff/Arrow.png" alt=""/>
                                </a>
                            </div>
                        </div>
                    </div>
                    <div class="col-lg-3 task">
                        <div class="task-image">
                            <img src="asset/image/staff/User.png" alt=""/>
                        </div>
                        <div class="task-total">
                            <h2>26</h2>
                            <h4>Customers</h4>
                        </div>
                        <div class="task-unhold">
                            <div class="unhold-number">
                                4
                            </div>
                            <div class="unholded">
                                <a href="#">
                                    Unholded
                                    <img src="asset/image/staff/Arrow.png" alt=""/>
                                </a>
                            </div>
                        </div>
                    </div>
                </div>
                <div class="row row3">
                    <div class="col-lg-4">
                        <div class="task">
                            <div class="task-image">
                                <img src="asset/image/staff/User.png" alt=""/>
                            </div>
                            <div class="task-total">
                                <h2>26</h2>
                                <h4>Customers</h4>
                            </div>
                            <div class="task-unhold">
                                <div class="unhold-number">
                                    4
                                </div>
                                <div class="unholded">
                                    <a href="#">
                                        Unholded
                                        <img src="asset/image/staff/Arrow.png" alt=""/>
                                    </a>
                                </div>
                            </div>
                        </div>
                        <div class="task">
                            <div class="task-image">
                                <img src="asset/image/staff/User.png" alt=""/>
                            </div>
                            <div class="task-total">
                                <h2>26</h2>
                                <h4>Customers</h4>
                            </div>
                            <div class="task-unhold">
                                <div class="unhold-number">
                                    4
                                </div>
                                <div class="unholded">
                                    <a href="#">
                                        Unholded
                                        <img src="asset/image/staff/Arrow.png" alt=""/>
                                    </a>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="col-lg-8 plan-container">
                        <div class="plan">
                            <table class="table">
                                <thead>
                                    <tr>
                                        <th scope="col">Insurance Plans</th>
                                        <th scope="col">View</th>

                                    </tr>
                                </thead>
                                <tbody>
                                    <tr>
                                        <td scope="row">aaaaaaaaaaa</td>
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
                                </tbody>
                            </table>
                        </div>
                    </div>
                </div>
            </div>
        </section>
    </body>
</html>

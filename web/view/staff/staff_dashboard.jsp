<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <base href="${pageContext.servletContext.contextPath}/">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Dashboard</title>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
              integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
              crossorigin="anonymous">
        <link href="asset/style/staff/staff_dashboard.css" rel="stylesheet" type="text/css"/>
        <!--<script src="asset/script/staff/staff_dashboard.js" defer></script>-->
    </head>
    <body>
        <jsp:include page="../header_staff.jsp">
            <jsp:param name="currentscreen" value="dashboard" />
        </jsp:include>
        <section>
            <div class="container main-container">
                <div class="row staff-welcome">
                    <div class="col-lg-4 dashboard-card user-card-info">
                        <div class="name-card-image">
                            
                        </div>
                        <div class="name-card-content">
                            
                        </div>
                    </div>
                    <div class="col-lg-8">
                        <div class="ads-container">
                            <div class="ads">
                                <img
                                    src="https://images.moneycontrol.com/static-mcnews/2018/03/car-insurance-770x433.jpg?impolicy=website&width=770&height=431"
                                    style="width: 100%"
                                    />
                            </div>
                        </div>
                    </div>
                </div>
                <div class="row task-container">
                    <div class="col-lg-3 task">
                        
                    </div>
                    <div class="col-lg-3 task">
                        
                    </div>
                    <div class="col-lg-3 task">
                        
                    </div>
                </div>
            </div>
        </section>
    </body>
</html>

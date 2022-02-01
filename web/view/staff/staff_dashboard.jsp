<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <base href="${pageContext.servletContext.contextPath}/">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Dashboard</title>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">
        <link href="asset/style/staff/staff_dashboard.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
            <jsp:include page="../header_staff.jsp">
                <jsp:param name="currentscreen" value="dashboard" />
            </jsp:include>
        <section>
            <div class="row">
                <div class="staff-welcome">
                    <div class="col-md-4 staff-info">
                        
                    </div>
                </div>
            </div>
        </section>
    </body>
</html>

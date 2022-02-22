<%-- 
    Document   : payment_history
    Created on : Feb 22, 2022, 5:30:39 PM
    Author     : ASUS
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>InsuranceCard</title>
        <link rel="icon" href="asset/image/favicon.png" type="image/png" sizes="16x16">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
        <base href="${pageContext.servletContext.contextPath}/">
    </head>
    <body>
        <header>
            <jsp:include page="../header_customer.jsp">
                <jsp:param name="currentscreen" value="history"/>
            </jsp:include>
        </header>
        
        <section>
            
        </section>
        
        <footer>
            <%--<jsp:include page="../footer_full.jsp"></jsp:include>--%>
        </footer>
    </body>
</html>

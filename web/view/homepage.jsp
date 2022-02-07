<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>InsuranceCard</title>
        <link rel="icon" href="asset/image/favicon.png" type="image/png" sizes="16x16">
        <base href="${pageContext.servletContext.contextPath}/">
        <link rel="stylesheet" href="asset/style/homepage.css"/>
        <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

</head> 
<body>
    <jsp:include page="header_common.jsp"/>
    <main>
        <div class="head-image" style="background-image: url('asset/image/homepage_header_image.png');">
            <div class="header-title-quote">
                <h1>Save About</h1>
                <h1>Your Vehicle</h1>
            </div>
            <div class="header-param-quote">
                <p>
                    We live in an unpredictable world these days. Thus, there are many legitimate reasons to prepare yourself for those unannounced curveballs.
                </p>
            </div>
        </div>

        <div class="container short-intro">
            
        </div>
    </main>
    <%--<jsp:include page="footer_full.jsp"/>--%>
</body>

</html>
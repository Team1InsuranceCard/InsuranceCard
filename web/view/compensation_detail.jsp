<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <base href="${pageContext.servletContext.contextPath}/" />
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>InsuranceCard</title>
    <link
      rel="icon"
      href="asset/image/favicon.png"
      type="image/png"
      sizes="16x16"
    />
    <link
      rel="stylesheet"
      href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/css/bootstrap.min.css"
      integrity="sha384-zCbKRCUGaJDkqS1kPbPd7TveP5iyJE0EjAuZQTgFLD2ylzuqKfdKlfG/eSrtxUkn"
      crossorigin="anonymous"
    />
    <link rel="stylesheet" href="asset/style/compensation_detail.css" />
  </head>
  <body>
    <jsp:include page="header_customer.jsp">
      <jsp:param name="currentscreen" value="history" />
      <jsp:param name="currenthistory" value="compensation" />
    </jsp:include>
    <main>
        <div class="container">
            
        </div>

    </main>
  </body>
</html>

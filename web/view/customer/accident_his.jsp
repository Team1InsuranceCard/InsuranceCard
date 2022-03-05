<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> <%@ taglib
prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %> <%@page
contentType="text/html" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
  <jsp:include page="../header_customer.jsp">
    <jsp:param name="currentscreen" value="customer" />
  </jsp:include>

  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
    <title>Insurance Card</title>
    <base href="${pageContext.servletContext.contextPath}/" />
    <link
      rel="icon"
      href="asset/image/favicon.png"
      type="image/png"
      sizes="16x16"
    />
    <link rel="stylesheet" href="asset/style/customer/accident_his.css" />
  </head>
  <body>
    <div class="card">
      <div class="card__header">
        <h2 class="card__header-text">Accident History</h2>
      </div>

      <div class="card__body">
        <div class="card__item">
          <div class="card__title">ID</div>
          <div class="card__text">dfs</div>
        </div>

        <div class="card__item">
          <div class="card__title">Title</div>
          <div class="card__text">dfs</div>
        </div>

        <div class="card__item">
          <div class="card__title">Contract</div>
          <div class="card__text">dfs</div>
          <div class="card__icon">
            <img src="asset/image/customer/accident_his/icon_clipboard.png" />
          </div>
        </div>

        <div class="card__item">
          <div class="card__title">Created Date</div>
          <div class="card__text">dfs</div>
        </div>

        <div class="card__item">
          <div class="card__title">Accident Date</div>
          <div class="card__text">dfs</div>
        </div>

        <div class="card__item">
          <div class="card__title">Human Damage</div>
          <div class="card__text">dfs</div>
        </div>

        <div class="card__item">
          <div class="card__title">Vehicle Damage</div>
          <div class="card__text">dfs</div>
        </div>

        <div class="card__item">
          <div class="card__title">Attachment</div>
          <a class="card__btn" href="customer/contract/detail?id=">View</a>
        </div>
      </div>
    </div>
  </body>

  <jsp:include page="../footer_full.jsp">
    <jsp:param name="currentscreen" value="customer" />
  </jsp:include>
</html>

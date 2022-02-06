<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> <%@page
contentType="text/html" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
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
    <link rel="stylesheet" href="asset/style/customer/view_personal_info.css" />
  </head>
  <body>
    <jsp:include page="../header_customer.jsp">
      <jsp:param name="currentscreen" value="customer" />
    </jsp:include>

    <main>
      <div class="menu">
        <div class="menu__item menu__item--active">
          <img
            src="asset/image/customer/view_personal_info/icon_profile.png"
            class="menu__icon"
          />
          <a href="" class="menu__heading">Personal Information</a>
        </div>

        <div class="menu__item">
          <img
            src="asset/image/customer/view_personal_info/icon_lockKey.png"
            class="menu__icon"
          />
          <a href="" class="menu__heading">Password</a>
        </div>

        <div class="menu__item">
          <img
            src="asset/image/customer/view_personal_info/icon_bell.png"
            class="menu__icon"
          />
          <a href="" class="menu__heading">Notifications</a>
        </div>

        <div class="menu__item">
          <img
            src="asset/image/customer/view_personal_info/icon_logout.png"
            class="menu__icon"
          />
          <a href="" class="menu__heading">Logout</a>
        </div>
      </div>

      <div class="section">
        <div class="section__header">
          <h2 class="section__heading">Personal Information</h2>

          <div class="btn">Edit</div>
        </div>

        <div class="section__main">
          <div class="section__item">
            <div class="section__title">Email</div>
            <div class="section__text">tuyet</div>
          </div>

          <div class="section__item">
            <div class="section__title">First Name</div>
            <div class="section__text">tuyet</div>
          </div>

          <div class="section__item">
            <div class="section__title">Last Name</div>
            <div class="section__text">tuyet</div>
          </div>

          <div class="section__item">
            <div class="section__title">Personal ID</div>
            <div class="section__text">tuyet</div>
          </div>

          <div class="section__item">
            <div class="section__title">Phone</div>
            <div class="section__text">tuyet</div>
          </div>

          <div class="section__item">
            <div class="section__title">Province</div>
            <div class="section__text">tuyet</div>
          </div>

          <div class="section__item">
            <div class="section__title">District</div>
            <div class="section__text">tuyet</div>
          </div>

          <div class="section__item">
            <div class="section__title">Address</div>
            <div class="section__text">tuyet</div>
          </div>
        </div>
      </div>
    </main>

    <jsp:include page="../footer_full.jsp">
      <jsp:param name="currentscreen" value="customer" />
    </jsp:include>
  </body>
</html>

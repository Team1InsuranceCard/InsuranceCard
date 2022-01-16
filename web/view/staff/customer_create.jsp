<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> <%@page
contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
    <title>JSP Page</title>
    <base href="${pageContext.servletContext.contextPath}/" />
    <link rel="stylesheet" href="asset/style/staff/customer_create_edit.css" />
  </head>
  <body>
    <jsp:include page="../header_staff.jsp">
      <jsp:param name="currentscreen" value="customer" />
    </jsp:include>

    <main>
      <h1>NEW CUSTOMER</h1>

      <form>
        <div class="form-list">
          <div class="form-item">
            <p class="label">First Name</p>
            <input class="form-input" type="text" name="" id="" />
          </div>

          <div class="form-item">
            <p class="label">Last Name</p>
            <input class="form-input" type="text" name="" id="" />
          </div>

          <div class="form-item">
            <p class="label">Personal ID</p>
            <input class="form-input" type="text" name="" id="" />
          </div>

          <div class="form-item">
            <p class="label">Email</p>
            <input class="form-input" type="text" name="" id="" />
          </div>

          <div class="form-item">
            <p class="label">Date of Birth</p>
            <input class="form-input" type="date" name="" id="" />
          </div>

          <div class="form-item">
            <p class="label">Phone</p>
            <input class="form-input" type="text" name="" id="" />
          </div>

          <div class="form-item">
            <p class="label">Province</p>
            <input class="form-input" type="text" name="" id="" />
          </div>

          <div class="form-item">
            <p class="label">District</p>
            <input class="form-input" type="text" name="" id="" />
          </div>

          <div class="form-item">
            <p class="label">Address</p>
            <input class="form-input" type="text" name="" id="" />
          </div>

          <div class="form-item">
            <p class="label">Joining Date</p>
            <input class="form-input" type="datetime-local" name="" id="" />
          </div>
        </div>

        <div class="form-btn">
          <input class="btn create-btn" type="submit" value="Create" />
          <a href="" class="btn cancel-btn">Cancel</a>
        </div>
      </form>
    </main>

    <jsp:include page="../footer_full.jsp">
      <jsp:param name="currentscreen" value="customer" />
    </jsp:include>
  </body>
</html>

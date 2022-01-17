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
      <h1>EDIT CUSTOMER</h1>

      <form>
        <div class="form-list">
          <div class="form-item">
            <p class="label">First Name</p>
            <input
              class="form-input"
              type="text"
              name=""
              id=""
              pattern="/[^a-z0-9A-Z_\x{00C0}-\x{00FF}\x{1EA0}-\x{1EFF}]/u"
              required
            />
          </div>

          <div class="form-item">
            <p class="label">Last Name</p>
            <input
              class="form-input"
              type="text"
              name=""
              id=""
              pattern="/[^a-z0-9A-Z_\x{00C0}-\x{00FF}\x{1EA0}-\x{1EFF}]/u"
              required
            />
          </div>

          <div class="form-item">
            <p class="label">Personal ID</p>
            <input
              class="form-input"
              type="text"
              name=""
              id=""
              pattern="[0-9]+"
              minlength="12"
              maxlength="12"
              required
            />
          </div>

          <div class="form-item">
            <p class="label">Email</p>
            <input
              class="form-input"
              type="text"
              name=""
              id=""
              pattern="[a-z0-9._%+-]+@[a-z0-9.-]+\.[a-z]{2,}$"
              required
            />
          </div>

          <div class="form-item">
            <p class="label">Date of Birth</p>
            <input class="form-input" type="date" name="" id="" required />
          </div>

          <div class="form-item">
            <p class="label">Phone</p>
            <input
              class="form-input"
              type="text"
              name=""
              id=""
              pattern="0[0-9]{9}"
              required
            />
          </div>

          <div class="form-item">
            <p class="label">Province</p>
            <select class="form-input" name="calc_shipping_provinces" required>
              <option value=""></option>
            </select>
            <input class="billing_address_1" name="" type="hidden" value="" />
          </div>

          <div class="form-item">
            <p class="label">District</p>
            <select class="form-input" name="calc_shipping_district" required>
              <option value=""></option>
            </select>
            <input class="billing_address_2" name="" type="hidden" value="" />
          </div>

          <div class="form-item">
            <p class="label">Address</p>
            <input class="form-input" type="text" name="" id="" required />
          </div>

          <div class="form-item">
            <p class="label">Joining Date</p>
            <input
              class="form-input"
              type="datetime-local"
              name=""
              id=""
              required
            />
          </div>
        </div>

        <div class="form-btn">
          <input class="btn save-btn" type="submit" value="Save" />
          <a href="" class="btn cancel-btn">Cancel</a>
        </div>
      </form>
    </main>

    <jsp:include page="../footer_full.jsp">
      <jsp:param name="currentscreen" value="customer" />
    </jsp:include>
  </body>
</html>

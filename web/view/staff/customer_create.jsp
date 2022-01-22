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

      <form action="staff/customer/create" method="POST">
        <div class="form-list">
          <div class="form-item">
            <p class="label">First Name</p>
            <input
              class="form-input"
              type="text"
              name="fname"
              value="${requestScope.fname}"
              pattern="/[^a-z0-9A-Z_\x{00C0}-\x{00FF}\x{1EA0}-\x{1EFF}]/u"
              required
            />
          </div>

          <div class="form-item">
            <p class="label">Last Name</p>
            <input
              class="form-input"
              type="text"
              name="lname"
              value="${requestScope.lname}"
              pattern="/[^a-z0-9A-Z_\x{00C0}-\x{00FF}\x{1EA0}-\x{1EFF}]/u"
              required
            />
          </div>

          <div class="form-item">
            <p class="label">Personal ID</p>
            <input
              class="form-input"
              type="text"
              name="pid"
              value="${requestScope.pid}"
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
              name="email"
              value="${requestScope.email}"
              pattern="[a-z0-9._%+-]+@[a-z0-9.-]+\.[a-z]{2,}$"
              required
            />
          </div>

          <div class="form-item">
            <p class="label">Date of Birth</p>
            <input
              class="form-input"
              type="date"
              name="dob"
              value="${requestScope.dob}"
              required
            />
          </div>

          <div class="form-item">
            <p class="label">Phone</p>
            <input
              class="form-input"
              type="text"
              name="phone"
              value="${requestScope.phone}"
              pattern="0[0-9]{9}"
              required
            />
          </div>

          <div class="form-item">
            <p class="label">Province</p>
            <select class="form-input" name="calc_shipping_provinces" required>
              <option value=""></option>
            </select>
            <input
              class="billing_address_1"
              name="province"
              type="hidden"
              value=""
            />
          </div>

          <div class="form-item">
            <p class="label">District</p>
            <select class="form-input" name="calc_shipping_district" required>
              <option value=""></option>
            </select>
            <input
              class="billing_address_2"
              name="district"
              type="hidden"
              value=""
            />
          </div>

          <div class="form-item">
            <p class="label">Address</p>
            <input
              class="form-input"
              type="text"
              name="address"
              value="${requestScope.address}"
              pattern="^[^-\s][\w\s-]+$"
              required
            />
          </div>

          <div class="form-item">
            <p class="label">Joining Date</p>
            <input
              class="form-input"
              type="datetime-local"
              id="joinDate"
              name="joinDate"
              value="${requestScope.joinDate}"
              required
            />
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

    <!-- auto joinDate -->
    <script>
      var joinDateElm = document.getElementById("joinDate");
      var now = new Date();
      var utcString = now.toISOString().substring(0, 19);
      var year = now.getFullYear();
      var month = now.getMonth() + 1;
      var day = now.getDate();
      var hour = now.getHours();
      var minute = now.getMinutes();
      var second = now.getSeconds();
      var localDatetime =
        year +
        "-" +
        (month < 10 ? "0" + month.toString() : month) +
        "-" +
        (day < 10 ? "0" + day.toString() : day) +
        "T" +
        (hour < 10 ? "0" + hour.toString() : hour) +
        ":" +
        (minute < 10 ? "0" + minute.toString() : minute) +
        utcString.substring(16, 19);
      joinDateElm.value = localDatetime;
    </script>

    <!-- province, district -->
    <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
    <script src="https://cdn.jsdelivr.net/gh/vietblogdao/js/districts.min.js"></script>
    <script>
      //<![CDATA[
      if ((address_2 = localStorage.getItem("address_2_saved"))) {
        $('select[name="calc_shipping_district"] option').each(function () {
          if ($(this).text() == address_2) {
            $(this).attr("selected", "");
          }
        });
        $("input.billing_address_2").attr("value", address_2);
      }
      if ((district = localStorage.getItem("district"))) {
        $('select[name="calc_shipping_district"]').html(district);
        $('select[name="calc_shipping_district"]').on("change", function () {
          var target = $(this).children("option:selected");
          target.attr("selected", "");
          $('select[name="calc_shipping_district"] option')
            .not(target)
            .removeAttr("selected");
          address_2 = target.text();
          $("input.billing_address_2").attr("value", address_2);
          district = $('select[name="calc_shipping_district"]').html();
          localStorage.setItem("district", district);
          localStorage.setItem("address_2_saved", address_2);
        });
      }
      $('select[name="calc_shipping_provinces"]').each(function () {
        var $this = $(this),
          stc = "";
        c.forEach(function (i, e) {
          e += +1;
          stc += "<option value=" + e + ">" + i + "</option>";
          $this.html('<option value=""></option>' + stc);
          if ((address_1 = localStorage.getItem("address_1_saved"))) {
            $('select[name="calc_shipping_provinces"] option').each(
              function () {
                if ($(this).text() == address_1) {
                  $(this).attr("selected", "");
                }
              }
            );
            $("input.billing_address_1").attr("value", address_1);
          }
          $this.on("change", function (i) {
            i = $this.children("option:selected").index() - 1;
            var str = "",
              r = $this.val();
            if (r != "") {
              arr[i].forEach(function (el) {
                str += '<option value="' + el + '">' + el + "</option>";
                $('select[name="calc_shipping_district"]').html(
                  '<option value=""></option>' + str
                );
              });
              var address_1 = $this.children("option:selected").text();
              var district = $('select[name="calc_shipping_district"]').html();
              localStorage.setItem("address_1_saved", address_1);
              localStorage.setItem("district", district);
              $('select[name="calc_shipping_district"]').on(
                "change",
                function () {
                  var target = $(this).children("option:selected");
                  target.attr("selected", "");
                  $('select[name="calc_shipping_district"] option')
                    .not(target)
                    .removeAttr("selected");
                  var address_2 = target.text();
                  $("input.billing_address_2").attr("value", address_2);
                  district = $('select[name="calc_shipping_district"]').html();
                  localStorage.setItem("district", district);
                  localStorage.setItem("address_2_saved", address_2);
                }
              );
            } else {
              $('select[name="calc_shipping_district"]').html(
                '<option value=""></option>'
              );
              district = $('select[name="calc_shipping_district"]').html();
              localStorage.setItem("district", district);
              localStorage.removeItem("address_1_saved", address_1);
            }
          });
        });
      });
      //]]>
    </script>
  </body>
</html>

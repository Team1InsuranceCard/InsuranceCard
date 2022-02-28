<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <base href="${pageContext.servletContext.contextPath}/" />
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
    <title>Insurance Card</title>
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
    <link
      rel="stylesheet"
      href="asset/style/customer/request_compensation.css"
    />
  </head>
  <body>
    <jsp:include page="../header_customer.jsp">
      <jsp:param value="history" name="currentscreen" />
      <jsp:param value="compensation" name="currenthistory" />
    </jsp:include>

    <main>
      <div class="container">
        <div class="row border rounded">
          <div class="title-card">
            <h4 class="title-card-text">1. Contract Information</h4>
          </div>
          <table class="content-card-table table table-borderless">
            <tbody>
              <tr>
                <th>Contract ID</th>
                <td>HD00001</td>
                <th>Status</th>
                <td>Active</td>
              </tr>
              <tr>
                <th>Product</th>
                <td>Bao hiem Bao Viet cho xe duoi 50cc</td>
                <th>Contract Fee</th>
                <td>530000</td>
              </tr>
              <tr>
                <th>Start Date</th>
                <td>25/1/2021</td>
                <th>End Date</th>
                <td>25/1/2022</td>
              </tr>
            </tbody>
          </table>
        </div>
        <div class="row border rounded">
            <div class="title-card">
              <h4 class="title-card-text">2. Accident Information</h4>
            </div>
            <table class="content-card-table table table-borderless">
              <tbody>
                <tr>
                  <th>Title</th>
                  <td>HD00001</td>
                  <th>Date</th>
                  <td>Active</td>
                </tr>
                <tr>
                  <th>Attachment</th>
                  <td>Bao hiem Bao Viet cho xe duoi 50cc</td>
                  <th></th>
                  <td></td>
                </tr>
                <tr>
                  <th>Human damage</th>
                  <td>25/1/2021</td>
                  <th>Vehicle damange</th>
                  <td>25/1/2022</td>
                </tr>
              </tbody>
            </table>
          </div>
      </div>
    </main>
  </body>
</html>

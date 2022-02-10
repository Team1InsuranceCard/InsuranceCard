<%-- Document : manage_contract Created on : Feb 9, 2022, 4:27:04 PM Author :
area1 --%> <%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
    <title>Insurance Card</title>
    <base href="${pageContext.servletContext.contextPath}/" />
    <link
      rel="stylesheet"
      href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/css/bootstrap.min.css"
      integrity="sha384-zCbKRCUGaJDkqS1kPbPd7TveP5iyJE0EjAuZQTgFLD2ylzuqKfdKlfG/eSrtxUkn"
      crossorigin="anonymous"
    />
    <link
      rel="icon"
      href="asset/image/favicon.png"
      type="image/png"
      sizes="16x16"
    />
    <link rel="stylesheet" href="asset/style/staff/manage_contract.css" />
  </head>
  <body>
    <jsp:include page="../header_staff.jsp">
      <jsp:param name="currentscreen" value="contract" />
    </jsp:include>
    
    <main>
      <div class="container contract-action">
        <div class="row">
          <div class="col seach-bar">
            <form class="form-inline">
              <input
                class="form-control mr-sm-2"
                type="search"
                placeholder="Search"
                aria-label="Search"
              />
              <button class="btn btn-outline-success my-2 my-sm-0" type="submit">
                Search
              </button>
            </form>
          </div>
          <div class="col create-contract-button"><a href="">New Contract</a></div>
        </div>
      </div>
      <div class="contract-list">
        <div class="contract-list-title"><h2>Contract List</h2></div>
        <div class="contract-list-content">
          <table class="contract-list-table table table-striped">
            <thead class="contract-list-header">
              <th scope="col">STT</th>
              <th scope="col">Customers</th>
              <th scope="col">Product</th>
              <th scope="col">Start date</th>
              <th scope="col">End date</th>
              <th scope="col">Status</th>
            </thead>
            <tbody>
              <tr>
                <th scope="row">1</th>
                <td>Nguyễn Khánh Huy</td>
                <td>Bảo hiểm đầu xe</td>
                <td>2022-10-11 11:02:22</td>
                <td>2022-10-11 11:02:22</td>
                <td><span>Pending</span></td>
              </tr>
              <tr>
                <th scope="row">1</th>
                <td>Nguyễn Khánh Huy</td>
                <td>Bảo hiểm đầu xe</td>
                <td>2022-10-11 11:02:22</td>
                <td>2022-10-11 11:02:22</td>
                <td><span>Pending</span></td>
              </tr>
              <tr>
                <th scope="row">1</th>
                <td>Nguyễn Khánh Huy</td>
                <td>Bảo hiểm đầu xe</td>
                <td>2022-10-11 11:02:22</td>
                <td>2022-10-11 11:02:22</td>
                <td><span>Pending</span></td>
              </tr>
              <tr>
                <th scope="row">1</th>
                <td>Nguyễn Khánh Huy</td>
                <td>Bảo hiểm đầu xe</td>
                <td>2022-10-11 11:02:22</td>
                <td>2022-10-11 11:02:22</td>
                <td><span>Pending</span></td>
              </tr>
              <tr>
                <th scope="row">1</th>
                <td>Nguyễn Khánh Huy</td>
                <td>Bảo hiểm đầu xe</td>
                <td>2022-10-11 11:02:22</td>
                <td>2022-10-11 11:02:22</td>
                <td><span>Pending</span></td>
              </tr>
              <tr>
                <th scope="row">1</th>
                <td>Nguyễn Khánh Huy</td>
                <td>Bảo hiểm đầu xe</td>
                <td>2022-10-11 11:02:22</td>
                <td>2022-10-11 11:02:22</td>
                <td><span>Pending</span></td>
              </tr>
            </tbody>
          </table>
        </div>
        <nav aria-label="Page navigation example">
          <ul class="pagination justify-content-end">
            <li class="page-item   disabled">
              <a class="page-link" href="#" tabindex="-1">First</a>
            </li>
            <li class="page-item"><a class="page-link" href="#"><</a></li>
            <li class="page-item"><a class="page-link active" href="#">1</a></li>
            <li class="page-item"><a class="page-link" href="#">2</a></li>
            <li class="page-item"><a class="page-link" href="#">3</a></li>
            <li class="page-item"><a class="page-link" href="#">></a></li>

            <li class="page-item item-last">
              <a class="page-link" href="#">Last</a>
            </li>
          </ul>
        </nav>
      </div>
    </main>

    <%--<jsp:include page="../footer_full.jsp" />--%>
  </body>
</html>

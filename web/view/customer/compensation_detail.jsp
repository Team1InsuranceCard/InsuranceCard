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
    <link rel="stylesheet" href="asset/style/customer/compensation_detail.css" />
  </head>
  <body>
    <jsp:include page="../header_customer.jsp">
      <jsp:param name="currentscreen" value="history" />
      <jsp:param name="currenthistory" value="compensation" />
    </jsp:include>
    <main>
      <div class="container">
        <div class="row">
          <div class="col">
            <div class="compensation-header"><h2>Compensation</h2></div>
          </div>
          <div class="col">
            <button type="button" class="btn btn-danger float-right">Cancel request</button>
          </div>
        </div>       
        <div class="row border rounded compensation-card">
          <div class="title-card">
            <h4 class="title-card-text">1. Contract Information</h4>
          </div>
          <table class="content-card-table table table-borderless">
            <tbody>
              <tr>
                <th>Contract ID</th>
                <td>${param.contractid}</td>
                <th>View Detail</th>
                <td></td>
              </tr>
              <tr>
                <th>Customer</th>
                <td>${param.contractid}</td>
                <th>Status</th>
                <td>
                  <c:set
                    var="statuscode"
                    value="${contract.statusCode.statusCode}"
                  />
                  <c:choose>
                    <c:when test="${statuscode == 0}">
                      <span style="color: #5c2941"
                        >${contract.statusCode.statusName}</span
                      >
                    </c:when>
                    <c:when test="${statuscode == 1}">
                      <span style="color: #0dc858"
                        >${contract.statusCode.statusName}</span
                      >
                    </c:when>
                    <c:when test="${statuscode == 2}">
                      <span style="color: #ff7d42"
                        >${contract.statusCode.statusName}</span
                      >
                    </c:when>
                    <c:when test="${statuscode == 3}">
                      <span style="color: #ff7d42"
                        >${contract.statusCode.statusName}</span
                      >
                    </c:when>
                    <c:when test="${statuscode == 4}">
                      <span style="color: #5c2941"
                        >${contract.statusCode.statusName}</span
                      >
                    </c:when>
                    <c:when test="${statuscode == 5}">
                      <span style="color: #5c2941"
                        >${contract.statusCode.statusName}</span
                      >
                    </c:when>
                    <c:otherwise>
                      <span style="color: #5c2941"
                        >${contract.statusCode.statusName}</span
                      >
                    </c:otherwise>
                  </c:choose>
                </td>
              </tr>
              <tr>
                <th>Product</th>
                <td>${contract.product.title}</td>
                <th>Contract Fee</th>
                <td>${contract.contractFee}</td>
              </tr>
              <tr>
                <th>Start Date</th>
                <td>
                  <fmt:formatDate
                    pattern="yyyy-MM-dd"
                    value="${contract.startDate}"
                  />
                </td>
                <th>End Date</th>
                <td>
                  <fmt:formatDate
                    pattern="yyyy-MM-dd"
                    value="${contract.endDate}"
                  />
                </td>
              </tr>
            </tbody>
          </table>
        </div>
        <div class="row border rounded compensation-card">
          <div class="title-card">
            <h4 class="title-card-text">2. Accident Information</h4>
          </div>
          <table class="content-card-table table table-borderless">
            <tbody>
              <tr>
                <th>Title</th>
                <td>Tai nan</td>
                <th>Date</th>
                <td>11/12/2019</td>
              </tr>
              <tr>
                <th>Attachment</th>
                <td>
                  <span
                    id="accident-file-name"
                    class="attachment-file-name"
                  ></span>
                  <button
                    type="button"
                    onclick="uploadFile('accident-file-url', 'accident-file-name')"
                    class="import-attachment-button"
                  >
                    Download file
                  </button>
                </td>
                <th></th>
                <td></td>
              </tr>
              <tr>
                <th>Human damage</th>
                <td>
                  <textarea
                    class="compensation-input"
                    name="accident-human-damage"
                    id=""
                    cols="30"
                    rows="10"
                    readonly
                  ></textarea>
                </td>
                <th>Vehicle damange</th>
                <td>
                  <textarea
                    class="compensation-input"
                    name="accident-vehicle-damage"
                    id=""
                    cols="30"
                    rows="10"
                    readonly
                  ></textarea>
                </td>
              </tr>
            </tbody>
          </table>
        </div>
        <div class="row border rounded compensation-card">
          <div class="title-card">
            <h4 class="title-card-text">3. Compensation Information</h4>
          </div>
          <table class="content-card-table table table-borderless">
            <tbody>
              <tr>
                <th>Driver Name</th>
                <td>Trach Van Doanh</td>
                <th>Attachment</th>
                <td>
                  <span
                    id="compensation-file-name"
                    class="attachment-file-name"
                  ></span>
                  <button
                    type="button"
                    onclick="uploadFile('compensation-file-url', 'compensation-file-name')"
                    class="import-attachment-button"
                  >
                    Download file
                  </button>
                </td>
              </tr>
            </tbody>
          </table>
          <table class="content-card-table table table-borderless">
            <tbody>
              <tr>
                <th>Description</th>
                <td>
                  <textarea
                    class="compensation-input"
                    name="compensation-description"
                    id=""
                    cols="100"
                    rows="10"
                    readonly
                  ></textarea>
                </td>
              </tr>
            </tbody>
          </table>
          <!-- <div class="commitment">
              <input type="checkbox" id="promise" /><span
                >I commit that all information is real. If are wrong, I will
                face with law’s punishment.</span
              >
            </div>
            <div class="compensation-submit">
              <button
                class="disabled"
                id="button-submit"
                type="submit"
                disabled
              >
                Submit
              </button>
            </div> -->
        </div>
      </div>
    </main>
  </body>
</html>

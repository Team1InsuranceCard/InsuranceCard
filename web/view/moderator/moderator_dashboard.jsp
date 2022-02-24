<%@page contentType="text/html" pageEncoding="UTF-8"%>

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
    <link
      rel="stylesheet"
      href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/css/bootstrap.min.css"
      integrity="sha384-zCbKRCUGaJDkqS1kPbPd7TveP5iyJE0EjAuZQTgFLD2ylzuqKfdKlfG/eSrtxUkn"
      crossorigin="anonymous"
    />
    <link
      rel="stylesheet"
      href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.0/css/all.min.css"
    />
    <link
      rel="stylesheet"
      href="asset/style/moderator/moderator_dashboard.css"
    />
  </head>
  <body>
    <jsp:include page="../header_moderator.jsp">
      <jsp:param name="currentscreen" value="dashboard" />
    </jsp:include>
    <main>
      <div class="container">
        <div class="row">
          <div class="col">
            <div
              class="custom-card"
              style="background-color: rgba(70, 159, 227, 0.8)"
            >
              <div class="container">
                <div class="row">
                  <div class="col-7">
                    <div class="custom-card-text">
                      <div class="custom-card-title">250.000.000</div>
                      <div class="custom-card-subtitle">Total Revenues</div>
                    </div>
                  </div>
                  <div class="col-5">
                    <div class="custom-card-icon">
                      <i class="fas fa-wallet"></i>
                    </div>
                  </div>
                </div>
              </div>
            </div>
          </div>
          <div class="col">
            <div
              class="custom-card"
              style="background: rgba(250, 101, 136, 0.8)"
            >
              <div class="container">
                <div class="row">
                  <div class="col-7">
                    <div class="custom-card-text">
                      <div class="custom-card-title">250.000.000</div>
                      <div class="custom-card-subtitle">Total Contracts</div>
                    </div>
                  </div>
                  <div class="col-5">
                    <div class="custom-card-icon">
                      <i class="fas fa-file-signature"></i>
                    </div>
                  </div>
                </div>
              </div>
            </div>
          </div>
          <div class="col">
            <div
              class="custom-card"
              style="background: rgba(62, 203, 166, 0.8)"
            >
              <div class="container">
                <div class="row">
                  <div class="col-7">
                    <div class="custom-card-text">
                      <div class="custom-card-title">250.000.000</div>
                      <div class="custom-card-subtitle">Total Customers</div>
                    </div>
                  </div>
                  <div class="col-5">
                    <div class="custom-card-icon">
                      <i class="fas fa-users"></i>
                    </div>
                  </div>
                </div>
              </div>
            </div>
          </div>
        </div>
        <div class="row">
          <div class="col">
            <div class="custom-card-rank">
              <div class="container">
                <div class="row">
                  <div class="col">
                    <div class="total-number">16</div>
                  </div>
                  <div class="col">
                    <div class="total-title-align total-title">Total Products</div>
                  </div>
                </div>
              </div>
            </div>
          </div>
          <div class="col"></div>
        </div>
      </div>
    </main>
  </body>
</html>

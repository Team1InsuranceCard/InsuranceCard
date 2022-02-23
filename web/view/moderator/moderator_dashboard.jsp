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
    <script src="https://cdn.jsdelivr.net/npm/chart.js@3.7.1/dist/chart.min.js"></script>
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
              <table class="table table-borderless table-hover table-rank">
                <thead class="table-rank-head">
                  <tr>
                    <th scope="col">Top 3</th>
                    <th scope="col">Product Title</th>
                  </tr>
                </thead>
                <tbody>
                  <tr>
                    <th scope="row"><div class="rank-value">1</div></th>
                    <td>Mark</td>
                  </tr>
                  <tr>
                    <th scope="row">2</th>
                    <td>Jacob</td>
                  </tr>
                  <tr>
                    <th scope="row">3</th>
                    <td>Larry</td>
                  </tr>
                </tbody>
              </table>
              <!-- <canvas id="myChart" style="width:100%;max-width:600px"></canvas> -->
            </div>
          </div>
          <div class="col"></div>
        </div>
      </div>
    </main>




    <script>
    var xValues = ["Bảo hiểm bảo việt cho xe trên 50cc", "Bảo hiểm bảo việt cho xe trên 50cc", "Bảo hiểm bảo việt cho xe trên 50cc", "USA", "Argentina"];
    var yValues = [55, 49, 44, 24, 15];
    var barColors = ["red", "green","blue","orange","brown"];
    
    new Chart("myChart", {
      type: "bar",
      data: {
        labels: xValues,
        datasets: [{
          backgroundColor: barColors,
          data: yValues
        }]
      },
      options: {
        legend: {display: false},
        title: {
          display: true,
          text: "Products Usage"
        }
      }
    });
    </script>


  </body>
</html>

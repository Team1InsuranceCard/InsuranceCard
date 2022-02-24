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
        <div class="row" style="margin-bottom: 2em">
          <div class="col">
            <div
              class="custom-card"
              style="background-color: rgba(70, 159, 227, 0.8)"
            >
              <div class="container">
                <div class="row">
                  <div class="col-7">
                    <div class="custom-card-text">
                      <div class="custom-card-title">${total_revenues}</div>
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
                      <div class="custom-card-title">${total_contracts}</div>
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
                      <div class="custom-card-title">${total_customers}</div>
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
                    <div class="total-title-align total-title">
                      Total Products
                    </div>
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
                    <th scope="row">
                      <div class="rank-value">
                        <img
                          src="asset/image/moderator/Triangle_1.png"
                          class="icon-rank icon-triangle"
                          alt=""
                        />
                      </div>
                    </th>
                    <td><div class="rank-title">Jacob</div></td>
                  </tr>
                  <tr>
                    <th scope="row">
                      <div class="rank-value">
                        <img
                          src="asset/image/moderator/Triangle_2.png"
                          class="icon-rank icon-triangle"
                          alt=""
                        />
                      </div>
                    </th>
                    <td><div class="rank-title">Jacob</div></td>
                  </tr>
                  <tr>
                    <th scope="row">
                      <div class="rank-value">
                        <img
                          src="asset/image/moderator/Triangle_3.png"
                          class="icon-rank icon-triangle"
                          alt=""
                        />
                      </div>
                    </th>
                    <td><div class="rank-title">Jacob</div></td>
                  </tr>
                </tbody>
              </table>
              <canvas
                class="dashboard-chard"
                id="productChart"
                style="width: 100%; max-width: 600px"
              ></canvas>
            </div>
          </div>
          <div class="col">
            <div class="custom-card-rank">
              <div class="container">
                <div class="row">
                  <div class="col">
                    <div class="total-number">16</div>
                  </div>
                  <div class="col">
                    <div class="total-title-align total-title">
                      Total Staffs
                    </div>
                  </div>
                </div>
              </div>
              <table class="table table-borderless table-hover table-rank">
                <thead class="table-rank-head">
                  <tr>
                    <th scope="col">Top 3</th>
                    <th scope="col">Name</th>
                    <th scope="col" style="width: 13em">Phone</th>
                  </tr>
                </thead>
                <tbody>
                  <tr>
                    <th scope="row">
                      <div class="rank-value">
                        <img
                          src="asset/image/moderator/Star_1.png"
                          class="icon-rank"
                          alt=""
                        />
                      </div>
                    </th>
                    <td><div class="rank-title">Jacob</div></td>
                    <td>
                      <div class="rank-title rank-userphone">0911101110</div>
                    </td>
                  </tr>
                  <tr>
                    <th scope="row">
                      <div class="rank-value">
                        <img
                          src="asset/image/moderator/Star_2.png"
                          class="icon-rank"
                          alt=""
                        />
                      </div>
                    </th>
                    <td><div class="rank-title">Jacob</div></td>
                    <td>
                      <div class="rank-title rank-userphone">0911101110</div>
                    </td>
                  </tr>
                  <tr>
                    <th scope="row">
                      <div class="rank-value">
                        <img
                          src="asset/image/moderator/Star_3.png"
                          class="icon-rank"
                          alt=""
                        />
                      </div>
                    </th>
                    <td><div class="rank-title">Jacob</div></td>
                    <td>
                      <div class="rank-title rank-userphone">0911101110</div>
                    </td>
                  </tr>
                </tbody>
              </table>
              <canvas
                class="dashboard-chard"
                id="staffChart"
                style="width: 100%; max-width: 600px"
              ></canvas>
            </div>
          </div>
        </div>
        <div class="row"></div>
      </div>
    </main>

    <script>
      var xValues = [];
      var yValues = [];
      var barColors = [];

      for (i = 0; i < 16; i++) {
        xValues.push(i + "x");
        yValues.push(i * 10);
        barColors.push(randomColor());
      }

      function randomColor() {
        var r = Math.floor(Math.random() * 255);
        var g = Math.floor(Math.random() * 255);
        var b = Math.floor(Math.random() * 255);
        return "rgb(" + r + "," + g + "," + b + ")";
      }

      new Chart("productChart", {
        type: "bar",
        data: {
          labels: xValues,
          datasets: [
            {
              backgroundColor: barColors,
              data: yValues,
            },
          ],
        },
        options: {
          plugins: { legend: { display: false } },
          scales: {
            x: {
              ticks: {
                display: false,
              },
            },
            y: {
              ticks: {
                color: "#fff9ec",
              },
            },
          },
        },
      });
    </script>
    <script>
      var xValues = [];
      var yValues = [];
      var barColors = [];

      for (i = 0; i < 16; i++) {
        xValues.push(i + "x");
        yValues.push(i * 10);
        barColors.push(randomColor());
      }

      function randomColor() {
        var r = Math.floor(Math.random() * 255);
        var g = Math.floor(Math.random() * 255);
        var b = Math.floor(Math.random() * 255);
        return "rgb(" + r + "," + g + "," + b + ")";
      }

      new Chart("staffChart", {
        type: "bar",
        data: {
          labels: xValues,
          datasets: [
            {
              backgroundColor: barColors,
              data: yValues,
            },
          ],
        },
        options: {
          plugins: { legend: { display: false } },
          scales: {
            x: {
              ticks: {
                display: false,
              },
            },
            y: {
              ticks: {
                color: "#fff9ec",
              },
            },
          },
        },
      });
    </script>
  </body>
</html>

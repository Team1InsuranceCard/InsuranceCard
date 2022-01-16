<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
    <title>JSP Page</title>
    <link
      rel="stylesheet"
      href="${pageContext.request.contextPath}/asset/style/customer/customer_dashboard.css"
    />
    <script
      src="${pageContext.request.contextPath}/asset/script/customer/customer_dashboard.js"
      defer
    ></script>
  </head>
  <body>
    <header>
      <jsp:include page="../header_customer.jsp">
        <jsp:param name="currentscreen" value="dashboard" />
      </jsp:include>
    </header>
    <main>
      <div class="main-body-dashboard">
        <div class="slideshow-container">
          <!-- Full-width images with number and caption text -->
          <div class="mySlides fade">
            <div class="numbertext">1 / 3</div>
            <img
              src="https://www.w3schools.com/howto/img_mountains_wide.jpg"
              style="width: 100%"
            />
            <div class="text">Caption Text</div>
          </div>
          <div class="mySlides fade">
            <div class="numbertext">2 / 3</div>
            <img
              src="https://www.w3schools.com/howto/img_nature_wide.jpg"
              style="width: 100%"
            />
            <div class="text">Caption Two</div>
          </div>
          <div class="mySlides fade">
            <div class="numbertext">3 / 3</div>
            <img
              src="https://www.w3schools.com/howto/img_band_chicago.jpg"
              style="width: 100%"
            />
            <div class="text">Caption Three</div>
          </div>
          <!-- Next and previous buttons -->
          <a class="prev" onclick="plusSlides(-1)">&#10094;</a>
          <a class="next" onclick="plusSlides(1)">&#10095;</a>
        </div>
        <br />
        <!-- The dots/circles -->
        <!-- <div style="text-align: center">
                <span class="dot" onclick="currentSlide(1)"></span>
                <span class="dot" onclick="currentSlide(2)"></span>
                <span class="dot" onclick="currentSlide(3)"></span>
              </div> -->

        <div class="service-dashboard">
          <div class="dashboard-title">
            <h2>Current service</h2>
            <a href="">All></a>
          </div>
          <div class="dashboard-content">
            <div class="dashboard-card">
              <div class="dashboard-card-info">
                <div class="dashboard-card-header">Service 1</div>
                <div class="dashboard-card-description">
                  <p>
                    Lorem ipsum dolor sit amet, consectetur adipiscing elit.
                    Donec eget nunc euismod, porttitor nisl eu, tincidunt nunc.
                  </p>
                </div>
              </div>
              <div class="dashboard-card-goto">
                <button class="dashboard-btn">More Info</button>
              </div>
            </div>
          </div>
        </div>
        <div class="service-dashboard"></div>
      </div>
    </main>
    <footer></footer>
  </body>
</html>

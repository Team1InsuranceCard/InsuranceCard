<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
    <title>JSP Page</title>
    <base href="${pageContext.servletContext.contextPath}/" />
    <link
      href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css"
      rel="stylesheet"
      integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3"
      crossorigin="anonymous"
    />
    <link
      rel="stylesheet"
      href="${pageContext.servletContext.contextPath}/asset/style/customer/customer_dashboard.css"
    />
    <script
      src="${pageContext.servletContext.contextPath}/asset/script/customer/customer_dashboard.js"
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
      <div class="container main-container">
        <div class="row user-welcome">
          <div class="col-md-5 user-card-info">
            <div class="name-card-image">
              <img
                src="asset/image/customer/cutomer_dashboard/image2.png"
                alt="customericon"
              />
            </div>
            <div class="name-card-content">
              <h2>Nguyen Khanh Hung</h2>
            </div>
          </div>
          <div class="col-md-7 image-welcome">
            <!-- <img
              src="asset/image/customer/cutomer_dashboard/image4.jpg"
              alt=""
            /> -->
            <img
              src="https://us.123rf.com/450wm/maxborovkov/maxborovkov1809/maxborovkov180900067/110330061-autumn-welcome-sign-with-colorful-maple-leaves-vector-background-.jpg?ver=6"
              alt=""
            />
          </div>
        </div>
        <div class="row">
          <div class="col-md-8 container statistic-calendar">
            <div class="row">
              <div class="col-md-4 statistic-card">
                <div class="statistic-title">Amount spent</div>
                <div class="statistic-number">100000</div>
              </div>
              <div class="col-md-4 statistic-card">
                <div class="statistic-title">Amount spent</div>
                <div class="statistic-number">100000</div>
              </div>
              <div class="col-md-4 statistic-card">
                <div class="statistic-title">Amount spent</div>
                <div class="statistic-number">100000</div>
              </div>
            </div>
            <div class="row calendar-card">
              <ul class="weekdays">
                <li>Mo</li>
                <li>Tu</li>
                <li>We</li>
                <li>Th</li>
                <li>Fr</li>
                <li>Sa</li>
                <li>Su</li>
              </ul>

              <ul class="days">
                <li>1</li>
                <li>2</li>
                <li>3</li>
                <li>4</li>
                <li>5</li>
                <li>6</li>
                <li>7</li>
                <li>8</li>
                <li>9</li>
                <li><span class="active">10</span></li>
                <li>11</li>
                <li>12</li>
                <li>13</li>
                <li>14</li>
                <li>15</li>
                <li>16</li>
                <li>17</li>
                <li>18</li>
                <li>19</li>
                <li>20</li>
                <li>21</li>
                <li>22</li>
                <li>23</li>
                <li>24</li>
                <li>25</li>
                <li>26</li>
                <li>27</li>
                <li>28</li>
                <li>29</li>
                <li>30</li>
                <li>31</li>
              </ul>
            </div>
          </div>
          <div class="col-md-4 container staff-info-zone">
            <div class="staff-name-card">
              <div class="staff-icon">
                <img
                  src="asset/image/customer/cutomer_dashboard/image1.png"
                  alt="customericon"
                />
              </div>
              <div class="staff-name">
                <h3>Nguyen Khanh Ha</h3>
              </div>
            </div>
            <div class="staff-phone">0929029073</div>
            <div class="staff-email">butchi3mau@gmail.com</div>
          </div>
        </div>
      </div>
    </main>
    <jsp:include page="../footer_full.jsp"></jsp:include>
  </body>
</html>

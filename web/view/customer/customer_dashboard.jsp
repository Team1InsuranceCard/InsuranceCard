<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
            href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css"
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
                    <div class="col-lg-5 dashboard-card user-card-info">
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
                    <div class="col-lg-7">
                        <!-- <img
                          src="asset/image/customer/cutomer_dashboard/image4.jpg"
                          alt=""
                        /> -->
                        <!-- <img
                          src="https://us.123rf.com/450wm/maxborovkov/maxborovkov1809/maxborovkov180900067/110330061-autumn-welcome-sign-with-colorful-maple-leaves-vector-background-.jpg?ver=6"
                          alt=""
                        /> -->
                        <div class="slideshow-container">
                            <div class="mySlides fade">
                                <img
                                    src="https://us.123rf.com/450wm/maxborovkov/maxborovkov1809/maxborovkov180900067/110330061-autumn-welcome-sign-with-colorful-maple-leaves-vector-background-.jpg?ver=6"
                                    style="width: 100%"
                                    />
                            </div>
                            <div class="mySlides fade">
                                <img
                                    src="https://www.w3schools.com/howto/img_snow_wide.jpg"
                                    style="width: 100%"
                                    />
                            </div>
                            <div class="mySlides fade">
                                <img
                                    src="https://www.w3schools.com/howto/img_mountains_wide.jpg"
                                    style="width: 100%"
                                    />
                            </div>
                        </div>
                        <br />

                        <div style="text-align: center">
                            <span class="dot"></span>
                            <span class="dot"></span>
                            <span class="dot"></span>
                        </div>
                    </div>
                </div>
                <div class="row">
                    <div class="col-lg-8 container statistic-calendar">
                        <div class="row statistic-group">
                            <div class="col dashboard-card statistic-card">
                                <div class="statistic-title">Amount spent</div>
                                <div class="statistic-number">100000</div>
                            </div>
                            <div class="col dashboard-card statistic-card">
                                <div class="statistic-title">Requests</div>
                                <div class="statistic-number">100000</div>
                            </div>
                            <div class="col dashboard-card statistic-card">
                                <div class="statistic-title">Contracts</div>
                                <div class="statistic-number">100000</div>
                            </div>
                        </div>
                        <div class="row dashboard-card calendar-card">
                            <div class="calendar">
                                <div class="calendar-header">
                                    <span class="month-picker" id="month-picker">February</span>
                                    <div class="year-picker">
                                        <span class="year-change" id="prev-year">
                                            <pre>&lt;</pre>
                                        </span>
                                        <span id="year">2021</span>
                                        <span class="year-change" id="next-year">
                                            <pre>></pre>
                                        </span>
                                    </div>
                                </div>
                                <div class="calendar-body">
                                    <div class="calendar-week-day">
                                        <div>Sun</div>
                                        <div>Mon</div>
                                        <div>Tue</div>
                                        <div>Wed</div>
                                        <div>Thu</div>
                                        <div>Fri</div>
                                        <div>Sat</div>
                                    </div>
                                    <div class="calendar-days"></div>
                                </div>
                                <div class="calendar-footer">
                                    <div class="toggle">
                                        <!-- <span>Dark Mode</span>
                                            <div class="dark-mode-switch">
                                                <div class="dark-mode-switch-ident"></div>
                                            </div> -->
                                    </div>
                                </div>
                                <div class="month-list"></div>
                            </div>
                        </div>
                    </div>
                    <div class="card col-lg-4 staff-info-zone">
                        <div class="dashboard-card">
                            <div class="card staff-name-card">
                                <div class="staff-icon">
                                    <img
                                        src="asset/image/customer/cutomer_dashboard/image1.png"
                                        alt="customericon"
                                        />
                                </div>
                                <div class="staff-name">
                                    <h4 class="staff-tag">Staff</h4>
                                    <h3>Nguyen Khanh Ha</h3>
                                </div>
                            </div>
                            <div class="card staff-phone staff-contact">0929029073</div>
                            <div class="card staff-email staff-contact">
                                butchi3mau@gmail.com
                            </div>
                        </div>
                    </div>
                </div>

                <div class="dashboard-card dashboard-service-card">
                    <div class="service-title"><h2>Current service</h2></div>
                    <div class="row row-cols-1 row-cols-lg-3">
                        <c:forEach items="${buyable_products}" var="product">
                            <div class="col">
                                <div class="card service-sub-card">
                                    <img
                                        class="card-img-top"
                                        src="${product.imageURL}"
                                        alt="${product.title}"
                                        />
                                    <div class="card-body">
                                        <h5 class="card-title">${product.title}</h5>
                                        <div class="wrapper-desciption-service">
                                            <p class="card-text desciption-service-text">
                                                ${product.description}
                                            </p>
                                        </div>
                                        <a href="#" class="btn btn-primary go-to-button"
                                           >More</a
                                        >
                                    </div>
                                </div>
                            </div>
                        </c:forEach>
                            <div class="col">
                                <div class="card service-sub-card">
                                    <img
                                        class="card-img-top"
                                        src="https://via.placeholder.com/278x200"
                                        alt="Card image cap"
                                        />
                                    <div class="card-body">
                                        <h5 class="card-title">Card title</h5>
                                        <div class="wrapper-desciption-service">
                                            <p class="card-text desciption-service-text">
                                                This is a longer card with supporting text below as a
                                                natural lead-in to additional content. This content is a
                                                little bit longerạpq ạdklfjq qjefioja s ịqrf .
                                            </p>
                                        </div>
                                        <a href="#" class="btn btn-primary go-to-button"
                                           >Go somewhere</a
                                        >
                                    </div>
                                </div>
                            </div>
                            <div class="col">
                                <div class="card service-sub-card">
                                    <img
                                        class="card-img-top"
                                        src="https://via.placeholder.com/278x200"
                                        alt="Card image cap"
                                        />
                                    <div class="card-body">
                                        <h5 class="card-title">Card title</h5>
                                        <div class="wrapper-desciption-service">
                                            <p class="card-text desciption-service-text">
                                                This is a longer card with supporting text below as a
                                                natural lead-in to additional content. This content is a
                                                little bit longerạpq ạdklfjq qjefioja s ịqrf .
                                            </p>
                                        </div>
                                        <a href="#" class="btn btn-primary go-to-button"
                                           >Go somewhere</a
                                        >
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>

                    <div class="dashboard-card dashboard-service-card">
                        <div class="service-title"><h2>Explore more service</h2></div>
                        <div class="row row-cols-1 row-cols-lg-3">
                            <c:forEach items="${buyable_products}" var="product">
                            <div class="col">
                                <div class="card service-sub-card">
                                    <img
                                        class="card-img-top"
                                        src="${product.imageURL}"
                                        alt="${product.title}"
                                        />
                                    <div class="card-body">
                                        <h5 class="card-title">${product.title}</h5>
                                        <div class="wrapper-desciption-service">
                                            <p class="card-text desciption-service-text">
                                                ${product.description}
                                            </p>
                                        </div>
                                        <a href="#" class="btn btn-primary go-to-button"
                                           >More</a
                                        >
                                    </div>
                                </div>
                            </div>
                        </c:forEach>
                            <div class="col">
                                <div class="card service-sub-card">
                                    <img
                                        class="card-img-top"
                                        src="https://via.placeholder.com/278x200"
                                        alt="Card image cap"
                                        />
                                    <div class="card-body">
                                        <h5 class="card-title">Card title</h5>
                                        <div class="wrapper-desciption-service">
                                            <p class="card-text desciption-service-text">
                                                This is a longer card with supporting text below as a
                                                natural lead-in to additional content. This content is a
                                                little bit longerạpq ạdklfjq qjefioja s ịqrf .
                                            </p>
                                        </div>
                                        <a href="#" class="btn btn-primary go-to-button"
                                           >Go somewhere</a
                                        >
                                    </div>
                                </div>
                            </div>
                            <div class="col">
                                <div class="card service-sub-card">
                                    <img
                                        class="card-img-top"
                                        src="https://via.placeholder.com/278x200"
                                        alt="Card image cap"
                                        />
                                    <div class="card-body">
                                        <h5 class="card-title">Card title</h5>
                                        <div class="wrapper-desciption-service">
                                            <p class="card-text desciption-service-text">
                                                This is a longer card with supporting text below as a
                                                natural lead-in to additional content. This content is a
                                                little bit longerạpq ạdklfjq qjefioja s ịqrf .
                                            </p>
                                        </div>
                                        <a href="#" class="btn btn-primary go-to-button"
                                           >Go somewhere</a
                                        >
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="dashboard-card dashboard-service-card">
                        <div class="service-title"><h2>About Us</h2></div>
                        <div class="card-group">
                            <div class="card mb-3">
                                <div class="card-header about-header-icon">
                                    <i class="far fa-building"></i>
                                </div>
                                <div class="card-body">
                                    <h5 class="card-title">About us</h5>
                                    <p class="card-text">About the InsuraceCard system.</p>
                                </div>
                            </div>
                            <div class="card mb-3">
                                <div class="card-header about-header-icon">
                                    <i class="far fa-newspaper"></i>
                                </div>
                                <div class="card-body">
                                    <h5 class="card-title">Press release</h5>
                                    <p class="card-text">
                                        Some quick example text to build on the card title and make up
                                        the bulk of the card's content.
                                    </p>
                                </div>
                            </div>
                            <div class="card mb-3">
                                <div class="card-header about-header-icon">
                                    <i class="fas fa-trophy"></i>
                                </div>
                                <div class="card-body">
                                    <h5 class="card-title">Reward</h5>
                                    <p class="card-text">
                                        Some quick example text to build on the card title and make up
                                        the bulk of the card's content.
                                    </p>
                                </div>
                            </div>
                        </div>
                        <div class="service-title"><h2>Help center</h2></div>
                        <div class="card-group">
                            <div class="card">
                                <div class="card-body">
                                    <h5 class="card-title help-desk-icon"><i class="far fa-credit-card"></i></h5>
                                    <p class="card-text">
                                        How to pay insurance services
                                    </p>
                                    <!-- <a href="#" class="btn btn-primary">Go somewhere</a> -->
                                </div>
                            </div>

                            <div class="card">
                                <div class="card-body">
                                    <h5 class="card-title help-desk-icon"><i class="fas fa-file-download"></i></h5>
                                    <p class="card-text">
                                        Commonly used forms
                                    </p>
                                    <!-- <a href="#"  class="btn btn-primary">Go somewhere</a> -->
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </main>
            <jsp:include page="../footer_full.jsp"></jsp:include>
        </body>
    </html>

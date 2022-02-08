<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>    
<html lang="en">
    <head>
        <meta charset="UTF-8" />
        <meta http-equiv="X-UA-Compatible" content="IE=edge" />
        <meta name="viewport" content="width=device-width, initial-scale=1.0" />
        <title>InsuranceCard</title>
        <link
            rel="icon"
            href="asset/image/favicon.png"
            type="image/png"
            sizes="16x16"
            />
        <base href="${pageContext.servletContext.contextPath}/" />
        <link rel="stylesheet" href="asset/style/homepage.css" />
        <!--Font Awesome-->
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.0/css/all.min.css"/>
        <%--<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>--%>
    </head>
    <body>
        <jsp:include page="header_common.jsp" />
        <main>
            <div
                class="head-image"
                style="background-image: url('asset/image/homepage_header_image.png')"
                >
                <div class="header-title-quote">
                    <h1>Save About</h1>
                    <h1>Your Vehicle</h1>
                </div>
                <div class="header-param-quote">
                    <p>
                        We live in an unpredictable world these days. Thus, there are many
                        legitimate reasons to prepare yourself for those unannounced
                        curveballs.
                    </p>
                </div>
            </div>

            <div class="container short-intro">
                <h2 class="short-intro-title">
                    Earn Money from Trading, Bitcoins and Mining
                </h2>
                <p class="short-intro-text">
                    Bitcoin cloud mining can be a tricky thing to determine if itâs
                    completely safe in the Bitcoin world, and if it is, will it be cost
                    effective? The return on your investment can be longer than other
                    alternatives such as buying and selling Bitcoin. This can be due to
                    the fees involved, the time it takes to mine, the upfront costs and
                    the value of Bitcoin during that time.
                </p>
                <div class="card-deck">
                    <div class="card">
                        <div class="card-body">
                            <div class="card-title">
                                <img src="asset/image/icon-park_easy.png" alt="" class="" />
                            </div>
                            <h5 class="card-subtitle card-subtitle-custom">Easy</h5>
                            <p class="card-text">Easy to use</p>
                        </div>
                    </div>
                    <div class="card">
                        <div class="card-body">
                            <div class="card-title">
                                <img src="asset/image/healthicons_ui-secure.png" alt="" />
                            </div>
                            <h5 class="card-subtitle card-subtitle-custom">Secure</h5>
                            <p class="card-text">Be sure in your account security</p>
                        </div>
                    </div>
                    <div class="card">
                        <div class="card-body">
                            <div class="card-title">
                                <img src="asset/image/cil_mood-very-good.png" alt="" />
                            </div>
                            <h5 class="card-subtitle card-subtitle-custom">Ultility</h5>
                            <p class="card-text">Detail</p>
                        </div>
                    </div>
                </div>
            </div>
            <div class="intro-project">
                <div class="container">
                    <div class="intro-project-title">
                        <h2>Our project</h2>
                    </div>
                    <div class="intro-project-text">
                        <p>
                            Bitcoin Calculator tool allows you to convert any amount to and
                            from bitcoin (up to six decimal places) and your preferred world
                            currencies, with conversion rates based on the live Bitcoin Price
                            Index.
                        </p>
                    </div>
                </div>
            </div>
            <div class="intro-team">
                <div class="intro-team-title">
                    <h2>Our team</h2>
                </div>
                <div class="container">
                    <div class="row row-cols-1 row-cols-3">
                        <div class="col md-4 card-image-custom">
                            <div class="card">
                                <img
                                    src="https://via.placeholder.com/468x60?text=Visit+Blogging.com+Now"
                                    alt=""
                                    class="card-img-top"
                                    />
                            </div>
                        </div>
                        <div class="col md-4 card-image-custom">
                            <div class="card">
                                <img
                                    src="https://via.placeholder.com/468x60?text=Visit+Blogging.com+Now"
                                    alt=""
                                    class="card-img-top"
                                    />
                            </div>
                        </div>
                        <div class="col md-4 card-image-custom">
                            <div class="card">
                                <img
                                    src="https://via.placeholder.com/468x60?text=Visit+Blogging.com+Now"
                                    alt=""
                                    class="card-img-top"
                                    />
                            </div>
                        </div>
                    </div>
                    <div class="row row-cols-1 row-cols-2 card-customer-child-group">
                        <div class="col md-4 card-image-custom">
                            <div class="card">
                                <img
                                    src="https://via.placeholder.com/468x60?text=Visit+Blogging.com+Now"
                                    alt=""
                                    class="card-img-top"
                                    />
                            </div>
                        </div>
                        <div class="col md-4 card-image-custom">
                            <div class="card">
                                <img
                                    src="https://via.placeholder.com/468x60?text=Visit+Blogging.com+Now"
                                    alt=""
                                    class="card-img-top"
                                    />
                            </div>
                        </div>
                    </div>
                </div>
            </div>
            <div class="achivement-showoff">
                <div class="container">
                    <div class="achivement-title">
                        <h2>Achivements</h2>
                    </div>
                    <div class="achivement-text">
                        <p>
                            Bitcoin Calculator tool allows you to convert any amount to and
                            from bitcoin (up to six decimal places) and your preferred world
                            currencies, with conversion rates based on the live Bitcoin Price
                            Index.
                        </p>
                    </div>
                    <div class="card-deck">
                        <div class="card border-0 achivement-card">
                            <div class="card-body">
                                <img src="asset/image/bi_people-fill.png" alt="" class="card-img-top"/>
                                <h3 class="card-title card-subtitle-custom">Customers</h3>
                                <p class="card-text">5.000.000</p>
                            </div>
                        </div>

                        <div class="card border-0 achivement-card">
                            <div class="card-body">
                                <img src="asset/image/teenyicons_contract-solid.png" alt="" class="card-img-top"/>
                                <h3 class="card-title card-subtitle-custom">Contracts</h3>
                                <p class="card-text">7.050.000</p>
                            </div>
                        </div>
                        <div class="card border-0 achivement-card">
                            <div class="card-body">
                                <img src="asset/image/ic_round-where-to-vote.png" alt="" class="card-img-top"/>
                                <h3 class="card-title card-subtitle-custom">Votes</h3>
                                <p class="card-text">1.172.000</p>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </main>
        <jsp:include page="footer_full.jsp" />
    </body>
</html>

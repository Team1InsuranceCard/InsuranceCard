<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="root" value="${pageContext.request.contextPath}" />

<link
    rel="stylesheet"
    href="${pageContext.request.contextPath}/asset/style/header_customer.css"
    />
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/css/bootstrap.min.css" integrity="sha384-zCbKRCUGaJDkqS1kPbPd7TveP5iyJE0EjAuZQTgFLD2ylzuqKfdKlfG/eSrtxUkn" crossorigin="anonymous">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.0.0/css/all.min.css" integrity="sha512-9usAa10IRO0HhonpyAIVpjrylPvoDwiPUiKdWk5t3PyolY1cOd4DSE0Ga+ri4AuTroPR5aQvXU9xC6qOPnzFeg==" crossorigin="anonymous" referrerpolicy="no-referrer" />
<meta name="google-signin-client_id" content="80615342986-dff0u5ao63gt3ghum6kk9oo3j3a2pj72.apps.googleusercontent.com">
<script src="https://apis.google.com/js/platform.js" async defer></script>
<script src="${root}/asset/script/google_login.js" defer></script>
<header>
    <nav class="navbar navbar-expand-lg fixed-top header_customer">
        <div class="container header-element">
            <a class="navbar-brand" href="${root}"> 
                <img
                    class="logo-icon"
                    src="${root}/asset/image/icon_car.png"
                    alt="LogoIcon"
                    />
                <img
                    class="logo-icon"
                    src="${root}/asset/image/InsuranceCard.png"
                    alt="LogoTitle"
                    />
            </a>
            <ul class="navbar-nav mr-auto breadcrumb">
                <c:set var="current" value="${param.currentscreen}" />
                <li class="nav-item">
                    <a <c:if test="${current == 'dashboard'}">class="active"</c:if> href="">DashBoard</a>
                    </li>
                    <li class="nav-item">
                        <a <c:if test="${current == 'contract'}">class="active"</c:if> href="">Contract</a>
                    </li>
                    <li class="nav-item dropdown">
                        <a
                            class="dropdown-toggle <c:if test="${current == 'history'}">active</c:if>"
                            href="#"
                            id="navbarDropdown"
                            role="button"
                            data-toggle="dropdown"
                            aria-haspopup="true"
                            aria-expanded="false"
                            >
                            History
                        </a>
                        <div class="dropdown-menu" aria-labelledby="navbarDropdown">
                            <a class="dropdown-item" href="#">Payment</a>
                            <a class="dropdown-item" href="#">Compensation</a>
                        </div>
                    </li>
                    <li class="nav-item">
                        <a <c:if test="${current == 'contacts'}">class="active"</c:if> href="">Contacts</a>
                    </li>
                </ul>
                <div class="navbar-nav">
                    <div class="user-role">
                        <a href=""
                           ><img src="${root}/asset/image/icon_bell.png" alt="bell"
                          /></a>
                    <a href=""
                       ><img src="${root}/asset/image/icon_user.png" alt="bell"
                          /></a>
                    <a class="logout-button" onclick="signOut();" href="${root}/logout"><i class="fa-solid fa-right-from-bracket"></i></a>
                </div>
            </div>
        </div>
    </nav>
</header>
<script
    src="https://code.jquery.com/jquery-3.6.0.min.js"
    integrity="sha256-/xUj+3OJU5yExlq6GSYGSHk7tPXikynS7ogEvDej/m4="
    crossorigin="anonymous"
></script>
<script
    src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js"
    integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q"
    crossorigin="anonymous"
></script>
<script
    src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"
    integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl"
    crossorigin="anonymous"
></script>
<script>
    $(document).ready(function () {
        var a = $(window).scrollTop(),
                i = $("nav").offset().top,
                t = !0;
        $(window).scroll(function () {
            var o = $(this).scrollTop();
            if (a < o) {
                if (t) {
                    var n = (i -= 150);
                    $("nav").animate({top: n}, 400), (t = !1);
                }
            } else if (!t) {
                n = i += 150;
                $("nav").animate({top: n}, 400), (t = !0);
            }
            a = o;
        });
    });
</script>

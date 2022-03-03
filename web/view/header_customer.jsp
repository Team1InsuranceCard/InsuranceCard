<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="root" value="${pageContext.request.contextPath}" />

<link
    rel="stylesheet"
    href="${pageContext.request.contextPath}/asset/style/header_customer.css"
    />
<meta name="google-signin-client_id" content="80615342986-dff0u5ao63gt3ghum6kk9oo3j3a2pj72.apps.googleusercontent.com">
<script src="https://apis.google.com/js/platform.js" async defer></script>
<script src="${root}/asset/script/google_login.js" defer></script>
<header>
    <nav class="navbar navbar-expand-lg fixed-top header_customer">
        <div class="container header-element">
            <a class="navbar-brand" href="${root}/homepage"> 
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
                    <a <c:if test="${current == 'dashboard'}">class="active"</c:if> href="${root}/customer/dashboard">DashBoard</a>
                    </li>
                    <li class="nav-item">
                        <a <c:if test="${current == 'contract'}">class="active"</c:if> href="${root}/customer/contract/view">Contract</a>
                    </li>
                    <li class="nav-item dropdown history-dropdown">
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
                            <a class="<c:if test="${param.currenthistory == 'payment'}">active</c:if> dropdown-item" href="${root}/customer/history/payment">Payment</a>
                            <a class="<c:if test="${param.currenthistory == 'compensation'}">active</c:if> dropdown-item" href="${root}/customer/history/compensation">Compensation</a>
                        </div>
                    </li>
                    <li class="nav-item">
                        <a <c:if test="${current == 'contacts'}">class="active"</c:if> href="${root}/contact">Contacts</a>
                    </li>
                </ul>
                <div class="navbar-nav">
                    <div class="user-role">
                        <a href="javascript:void()"
                           ><img src="${root}/asset/image/icon_bell.png" alt="bell"
                          /></a>
                    <a href="${root}/customer/info"
                       ><img src="${root}/asset/image/icon_user.png" alt="user"
                          /></a>
                    <a onclick="signOut();" href="${root}/logout"><img src="${root}/asset/image/icon_logout.png" /></a>
                </div>
            </div>
        </div>
    </nav>
</header>
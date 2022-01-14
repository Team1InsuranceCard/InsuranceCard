<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<link rel="stylesheet" href="${pageContext.request.contextPath}/asset/style/header_customer.css">
<c:set var="root" value="${pageContext.request.contextPath}"/>
<div class="header_customer header-table">
    <div class="header-element logo">
        <div class="logo-group">
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
        </div>
    </div>

    <div class="header-element">
        <ul class="breadcrumb">
            <c:set var="current" value="${param.currentscreen}"/> 
            <li>
                <a <c:if test="${current == 'dashboard'}">class="active"</c:if> href="">DashBoard</a>
                </li>
                <li>
                    <a <c:if test="${current == 'services'}">class="active"</c:if> href="">Services</a>
                </li>
                <li>
                    <a <c:if test="${current == 'contract'}">class="active"</c:if> href="">Contract</a>
                </li>
                <li>
                    <div  class="dropdown">
                        <a <c:if test="${current == 'history'}">class="active"</c:if> class="dropbtn">History</a>
                        <div class="dropdown-content">
                            <a class="dropdown-title" href="#">Payment</a>
                            <a class="dropdown-title" href="#">Compensation</a>
                        </div>
                    </div>
                </li>
                <li>
                    <a <c:if test="${current == 'contacts'}">class="active"</c:if> href="">Contacts</a>
            </li>
        </ul>
    </div>
    <div class="header-element" style="width: 20em;">
        <div class="user-role">
            <a href=""><img src="${root}/asset/image/icon_bell.png" alt="bell" /></a>
            <a href=""><img src="${root}/asset/image/icon_user.png" alt="bell" /></a>
        </div>
    </div>
</div>

        

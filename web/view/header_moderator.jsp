<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="root" value="${pageContext.request.contextPath}"/>

<link rel="stylesheet" href="${root}/asset/style/header_staff_mod.css" />

<div class="header-staff">
    <a href="#" class="brand">
        <img src="${root}/asset/image/icon_car.png" class="brand-logo" />
        <p class="brand-title">InsuranceCard</p>
    </a>
    <div class="header-element">
        <img src="${root}/asset/image/icon_bell.png" class="icon-header" />
        <img src="${root}/asset/image/icon_user.png" class="icon-header" />
    </div>
</div>

<div class="sidebar-staff">
    <ul>
        <c:set var="current" value="${param.currentscreen}"/> 
        <li>
            <a class="sidebar-item <c:if test="${current == 'dashboard'}">active</c:if>" href="">DashBoard</a>
            </li>
            <li>
                <a class="sidebar-item <c:if test="${current == 'customer'}">active</c:if>" href="">Product</a>
            </li>
            <li>
                <a class="sidebar-item <c:if test="${current == 'contract'}">active</c:if>" href="">Staff</a>        
        </li>
    </ul>
</div>

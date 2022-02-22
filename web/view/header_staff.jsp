<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="root" value="${pageContext.request.contextPath}"/>

<link rel="stylesheet" href="${root}/asset/style/header_staff_mod.css" />

<header>
    <div class="header-staff">
        <a href="${root}/homepage" class="brand">
            <img src="${root}/asset/image/icon_car.png" class="brand-logo" />
            <p class="brand-title">InsuranceCard</p>
        </a>
        <div class="header-element">
            <a href="" class="icon-header">
                <img src="${root}/asset/image/icon_bell.png" />
            </a>

            <a href="" class="icon-header">
                <img src="${root}/asset/image/icon_user.png" />
            </a>

            <a href="logout" class="icon-header">
                <img src="${root}/asset/image/icon_logout.png" />
            </a>
        </div>
    </div>

    <div class="sidebar-staff">
        <ul>
            <c:set var="current" value="${param.currentscreen}"/> 
            <li>
                <a class="sidebar-item <c:if test="${current == 'dashboard'}">active</c:if>" 
                   href="${root}/staff/dashboard">DashBoard</a>
            </li>
            <li>
                <a class="sidebar-item <c:if test="${current == 'customer'}">active</c:if>" 
                   href="${root}/staff/customer/view">Customer</a>
            </li>
            <li>
                <a class="sidebar-item <c:if test="${current == 'contract'}">active</c:if>" 
                   href="${root}/staff/contract/view">Contract</a>        
            </li>
            <li>
                <a class="sidebar-item <c:if test="${current == 'compensation'}">active</c:if>" 
                   href="${root}/staff/compensation/resolve-request">Compensation</a>    
            </li>
        </ul>
    </div>
</header>

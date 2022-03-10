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

    <div class="sidebar-staff" id="sidebarStaff">
        <ul>
            <li>
                <a class="sidebar-item" 
                   href="${root}/staff/dashboard">DashBoard</a>
            </li>
            <li>
                <a class="sidebar-item" 
                   href="${root}/staff/customer/view">Customer</a>
            </li>
            <li>
                <a class="sidebar-item" 
                   href="${root}/staff/contract/view">Contract</a>        
            </li>
            <li>
                <a class="sidebar-item" 
                   href="${root}/staff/compensation">Compensation</a>    
            </li>
        </ul>
    </div>
</header>

<!-- active sidebar item based on url -->
<script>
    var nav = document.getElementById('sidebarStaff'),
            anchor = nav.getElementsByTagName('a'),
            current = "${root}/staff/" + window.location.pathname.split('/')[3];
    for (var i = 0; i < anchor.length; i++) {
        if (anchor[i].href.toString().includes(current)) {
            anchor[i].classList.add("active");
        }
    }
</script>

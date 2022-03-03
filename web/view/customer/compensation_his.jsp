<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 
<%@ taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %> 
<%@page contentType="text/html" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
    <jsp:include page="../header_customer.jsp">
        <jsp:param name="currentscreen" value="customer" />
    </jsp:include>

    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
        <title>Insurance Card</title>
        <base href="${pageContext.servletContext.contextPath}/" />
        <link
            rel="icon"
            href="asset/image/favicon.png"
            type="image/png"
            sizes="16x16"
            />
        <link rel="stylesheet" href="asset/style/customer/compensation_his.css" />
    </head>
    <body>
        <main>
            <div class="header">
                <h1 class="header__title">Compensation History</h1>
                <a href="" class="header__btn">Request compensation</a>
            </div>

            <div class="filter">
                <div class="filter__search">
                    <img src="asset/image/customer/compensation_his/icon_magnifier.png" class="filter__icon" />
                    <input
                        type="text"
                        name=""
                        class="filter__input"
                        placeholder="Search..."
                        />
                </div>

                <div class="filter__advance">
                    <div class="filter__icon-btn">
                        <img src="asset/image/customer/compensation_his/icon_filters.png" class="filter__icon"></img>
                    </div>

                    <div class="filter__item">
                        <div class="filter__text">From</div>
                        <input type="text" class="filter__input"></input>
                    </div>

                    <div class="filter__item">
                        <div class="filter__text">To</div>
                        <input type="text" class="filter__input"></input>
                    </div>

                    <div class="filter__item">
                        <div class="filter__text">Status</div>
                        <select class="filter__input">
                            <option value="">All</option>
                        </select>
                    </div>
                </div>
            </div>

            <table>
                <thead>
                    <tr>
                        <th>STT</th>
                        <th>Driver</th>
                        <th>Created Date</th>
                        <th>Resolve Date</th>
                        <th>Status</th>
                        <th>Contract</th>
                        <th>Detail</th>
                    </tr>
                </thead>
                <tbody>
                    <c:forEach items="${requestScope.compensations}" var="c">
                        <tr>
                            <td></td>
                            <td class="text-left">${c.driverName}</td>
                            <td class="text-left">${c.createDate}</td>
                            <td class="text-left">${c.resolveDate}</td>
                            <td style="color: #${c.status.statusCode == 0 ? 'D62A25' : 
                                                 (c.status.statusCode == 1 ? '1AC36B' : 
                                                 '4BBDDF')};">${c.status.statusName}</td>
                            <td>${c.accident.contract.id}</td>
                            <td>
                                <a href="customer/history/compensation?id=${c.driverName}" 
                                   class="table-btn">View</a>
                            </td>
                        </tr>
                    </c:forEach>
                </tbody>
            </table>

            <ul class="paging" id="pagging">
            </ul>
        </main>

        <jsp:include page="../footer_full.jsp">
            <jsp:param name="currentscreen" value="customer" />
        </jsp:include>

        <script>
            function createPagger(url, div, before, pageIndex, after, gap, totalPage) {
                var container = document.getElementById(div);
                if (totalPage > 1) {
                    if (pageIndex - 1 > 0) {
                        container.innerHTML += '<li class="paging__item"><a class="paging__icon" href="' + url + '?page=' + before + '"><img src="asset/image/customer/compensation_his/icon_arrow_left.png"></a></li>';
                    } else {
                        container.innerHTML += '<li class="paging__item"><li class="paging__item"><a class="paging__icon paging__icon--disabled" onclick="return false;"><img src="asset/image/customer/compensation_his/icon_arrow_left.png"></a></li>';
                    }

                    if (pageIndex - gap > 1) {
                        container.innerHTML += '<li class="paging__item"><a class="paging__icon" href="' + url + '?page=1">1</a></li>';
                    }

                    for (var i = pageIndex - gap; i < pageIndex; i++) {
                        if (i > 0) {
                            container.innerHTML += '<li class="paging__item"><a class="paging__link" href="' + url + '?page=' + i + '">' + i + '</a></li>';
                        }
                    }

                    container.innerHTML += '<li class="paging__item"><a class="paging__link paging__link--active">' + pageIndex + '</a></li>';

                    for (var i = pageIndex + 1; i <= pageIndex + gap; i++) {
                        if (i <= totalPage) {
                            container.innerHTML += '<li class="paging__item"><a class="paging__link" href="' + url + '?page=' + i + '">' + i + '</a></li>';
                        }
                    }

                    if (pageIndex + gap < totalPage) {
                        container.innerHTML += '<li class="paging__item"><a class="paging__icon" href="' + url + '?page=1">' + totalPage + '</a></li>';
                    }

                    if (pageIndex + 1 <= totalPage) {
                        container.innerHTML += '<li class="paging__item"><a class="paging__icon" href="' + url + '?page=' + after + '"><img src="asset/image/customer/compensation_his/icon_arrow_right.png"></a></li>';
                    } else {
                        container.innerHTML += '<li class="paging__item"><a class="paging__icon paging__icon--disabled" onclick="return false;"><img src="asset/image/customer/compensation_his/icon_arrow_right.png"></a></li>';
                    }
                }
            }
        </script>

        <script>
            createPagger('customer/history/compensation', 'pagging', ${requestScope.pageIndex-1}, ${requestScope.pageIndex}, ${requestScope.pageIndex+1}, 2, ${requestScope.totalPage});
        </script> 
    </body>
</html>

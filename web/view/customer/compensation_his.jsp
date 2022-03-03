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
                <th>STT</th>
                <th>Driver</th>
                <th>Created Date</th>
                <th>Resolve Date</th>
                <th>Status</th>
                <th>Contract</th>
                <th>Detail</th>
                </thead>
                <tbody>
                    <c:forEach items="${requestScope.compensations}" var="c">
                        <tr>
                            <td>1</td>
                            <td>${c.driverName}</td>
                            <td class="text-left">${c.createDate}</td>
                            <td class="text-left">${c.resolveDate}</td>
                            <td>${c.status.statusName}</td>
                            <td>${c.accident.contract.id}</td>
                            <td>
                                <a href="customer/history/compensation?id=${c.driverName}" 
                                   class="table-btn">View</a>
                            </td>
                        </tr>
                    </c:forEach>
                </tbody>
            </table>

            <ul class="paging">
                <li class="paging__item">
                    <a class="paging__icon" href="#"><img src="asset/image/customer/compensation_his/icon_arrow_left.png"></a>
                </li>
                <li class="paging__item">
                    <a class="paging__link" href="#">1</a>
                </li>
                <li class="paging__item">
                    <a class="paging__link" href="#">2</a>
                </li>
                <li class="paging__item">
                    <a class="paging__link" href="#">3</a>
                </li>
                <li class="paging__item">
                    <a class="paging__icon" href="#"><img src="asset/image/customer/compensation_his/icon_arrow_right.png"></a>
                </li>
            </ul>
        </main>

        <jsp:include page="../footer_full.jsp">
            <jsp:param name="currentscreen" value="customer" />
        </jsp:include>
    </body>
</html>

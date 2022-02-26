<%-- 
    Document   : payment_history
    Created on : Feb 22, 2022, 5:30:39 PM
    Author     : ASUS
--%>

<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>InsuranceCard</title>
        <link rel="icon" href="asset/image/favicon.png" type="image/png" sizes="16x16">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
        <script src="https://code.iconify.design/2/2.1.2/iconify.min.js"></script>
        <link href="../../asset/style/customer/payment_history.css" rel="stylesheet" type="text/css"/>
        <base href="${pageContext.servletContext.contextPath}/">

        <script>
            function createPagger(url, div, before, pageIndex, after, gap, totalPage) {
                var container = document.getElementById(div);
                if (totalPage > 1) {
                    if (pageIndex - 1 > 0) {
                        container.innerHTML += '<a class="page" href="' + url + '?page=' + before + '"><span class="iconify" data-icon="codicon:triangle-left"></span></a>';
                    } else {
                        container.innerHTML += '<a class="page" onclick="return false;"><span class="iconify" data-icon="codicon:triangle-left"></span></a>';
                    }

                    if (pageIndex - gap > 1) {
                        container.innerHTML += '<a href="' + url + '?page=1"><span class="iconify" data-icon="bx:first-page"></span></a>';
                    }

                    for (var i = pageIndex - gap; i < pageIndex; i++) {
                        if (i > 0) {
                            container.innerHTML += '<a href="' + url + '?page=' + i + '">' + i + '</a>';
                        }
                    }

                    container.innerHTML += '<span>' + pageIndex + '</span>';

                    for (var i = pageIndex + 1; i <= pageIndex + gap; i++) {
                        if (i <= totalPage) {
                            container.innerHTML += '<a href="' + url + '?page=' + i + '">' + i + '</a>';
                        }
                    }

                    if (pageIndex + gap < totalPage) {
                        container.innerHTML += '<a href="' + url + '?page=' + totalPage + '"><span class="iconify" data-icon="bx:last-page"></span></a>';
                    }

                    if (pageIndex + 1 <= totalPage) {
                        container.innerHTML += '<a class="page" href="' + url + '?page=' + after + '"><span class="iconify" data-icon="codicon:triangle-right"></span></a>';
                    } else {
                        container.innerHTML += '<a class="page" onclick="return false;"><span class="iconify" data-icon="codicon:triangle-right"></span></a>';
                    }
                }
            }
        </script>
    </head>

    <body>
        <header>
            <jsp:include page="../header_customer.jsp">
                <jsp:param name="currentscreen" value="history"/>
            </jsp:include>
        </header>

        <section>
            <div class="row">
                <h3 class="col-md-5 title">Payment History</h3>
                <div class="col-md-5 input-date">
                    <input type="date" name="date"/>
                </div>
            </div>
            <table class="table table-hover">
                <thead>
                    <tr>
                        <th scope="col" class="stt">STT</th>
                        <th scope="col" class="proTitle">Product title</th>
                        <th scope="col" class="amount">Amount</th>
                        <th scope="col" class="date">Start date</th>
                        <th scope="col" class="date">Paid date</th>
                        <th scope="col" class="method">Method</th>
                        <th scope="col" class="note">Note</th>
                    </tr>
                </thead>
                <tbody>
                    <c:set var="i" value="0"/>
                    <c:forEach items="${requestScope.payments}" var="p">
                        <c:set var="i" value="${i+1}"/>
                        <tr>
                            <td class="stt">${i}</td>
                            <td class="proTitle">
                                <c:set var="s" value="${p.contractID.statusCode.statusCode}"/>
                                <a href="customer/contract/detail?id=${p.contractID.id}"
                                   style="${s==0?"color:#E02A2A;":""} 
                                   ${s==1?"color:#0DC858;":""}"> 
                                    ${p.contractID.product.title}
                                </a>
                            </td>
                            <td class="amount">
                                <fmt:formatNumber type = "number" 
                                                  value = "${p.amount}"/>
                            </td>
                            <td class="date">
                                <fmt:formatDate pattern = "HH:mm:ss dd-MM-yyyy" 
                                                value = "${p.startDate}"/>
                            </td>
                            <td class="date">
                                <fmt:formatDate pattern = "HH:mm:ss dd-MM-yyyy" 
                                                value = "${p.paidDate}"/>
                            </td>
                            <td class="method">${p.paymentMethod2.paymentMethod}</td>
                            <td class="note">${p.note}</td>
                        </tr>
                    </c:forEach>
                </tbody>
            </table>
                    
            <div class="pagging" id="pagging">
            </div>
                    
            <script>
                createPagger('customer/history/payment', 'pagging',
                ${requestScope.pageIndex-1}, ${requestScope.pageIndex},
                ${requestScope.pageIndex+1}, 2, ${requestScope.totalPage});
            </script> 
        </section>

        <footer>
            <jsp:include page="../footer_full.jsp"></jsp:include>
        </footer>
    </body>
</html>

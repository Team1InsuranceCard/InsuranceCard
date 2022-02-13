<%-- Document : manage_contract Created on : Feb 9, 2022, 4:27:04 PM Author :
area1 --%> <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
        <title>Insurance Card</title>
        <base href="${pageContext.servletContext.contextPath}/" />
        <link
            rel="stylesheet"
            href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/css/bootstrap.min.css"
            integrity="sha384-zCbKRCUGaJDkqS1kPbPd7TveP5iyJE0EjAuZQTgFLD2ylzuqKfdKlfG/eSrtxUkn"
            crossorigin="anonymous"
            />
        <link
            rel="icon"
            href="asset/image/favicon.png"
            type="image/png"
            sizes="16x16"
            />
        <link rel="stylesheet" href="asset/style/staff/manage_contract.css" />
        <!-- <script src="asset/script/staff/manage_contracts.js" defer></script> -->
    </head>
    <body>
        <jsp:include page="../header_staff.jsp">
            <jsp:param name="currentscreen" value="contract" />
        </jsp:include>

        <main>
            <div class="container contract-action">
                <div class="row">
                    <div class="col seach-bar">
                        <form class="form-inline" action="view" method="GET">
                            <input
                                id="search-box"
                                class="form-control mr-sm-2"
                                type="search"
                                placeholder="Search"
                                aria-label="Search"
                                value="${query}"
                                name="query"
                                />
                            <button
                                class="search-button btn-secondary btn  my-2 my-sm-0"
                                type="submit"
                                >
                                Search
                            </button>
                        </form>
                    </div>
                    <div class="col create-contract-button">
                        <a href="">New Contract</a>
                    </div>
                </div>
            </div>
            <div class="contract-list">
                <div class="contract-list-title"><h2>Contract List</h2></div>
                <div class="contract-list-content">
                    <table class="contract-list-table table table-striped">
                        <thead class="contract-list-header">
                        <th scope="col">STT</th>
                        <th scope="col">
                            <a title="${nameorder}" id="customer-filter" href="javascript:void()"
                               >Customers</a
                            >
                        </th>
                        <th scope="col">
                            <a title="ASC" id="product-filter" href="javascript:void()"
                               >Products</a
                            >
                        </th>
                        <th scope="col">
                            <a title="${startoder}" id="start-date-filter" href="javascript:void()"
                               >Start date</a
                            >
                        </th>
                        <th scope="col">
                            <a title="${endorder}" id="end-date-filter" href="javascript:void()"
                               >End date</a
                            >
                        </th>
                        <th scope="col">
                            <select class="status-select" name="" id="status-filter">
                                <c:forEach var="statuscode" items="${status_codes}">
                                    <option value="${statuscode.statusCode}">
                                        ${statusName}
                                    </option>
                                </c:forEach>
                            </select>
                        </th>
                        <th scope="col">Action</th>
                        </thead>
                        <tbody>
                            <c:forEach var="contractMap" items="${contract_list}">
                                <tr>
                                    <th scope="row">contractMap.Key</th>
                                        <c:set var="contract" value="${contractMap.value}" />
                                    <td>
                                        contract.customer.firstName contract.customer.lastName
                                    </td>
                                    <td>contract.product.title</td>
                                    <td>
                            <fmt:formatDate type="both" value="${contract.startDate}" />
                            </td>
                            <td>
                            <fmt:formatDate type="both" value="${contract.endDate}" />
                            </td>
                            <td>
                                <c:set
                                    var="statuscode"
                                    value="${contract.statusCode.statusCode}"
                                    />
                                <c:choose>
                                    <c:when test="${statuscode == 0}">
                                        <span style="color: #5c2941">Out of date</span>
                                    </c:when>
                                    <c:when test="${statuscode == 1}">
                                        <span style="color: #0dc858">Active</span>
                                    </c:when>
                                    <c:when test="${statuscode == 2}">
                                        <span style="color: #ff7d42">Processing</span>
                                    </c:when>
                                    <c:when test="${statuscode == 3}">
                                        <span style="color: #ff7d42">Canceling</span>
                                    </c:when>
                                    <c:when test="${statuscode == 4}">
                                        <span style="color: #5c2941">Canceled</span>
                                    </c:when>
                                    <c:when test="${statuscode == 5}">
                                        <span style="color: #5c2941">Rejected</span>
                                    </c:when>
                                </c:choose>
                            </td>
                            <td>
                                <a href="staff/contract/detail?id=${contract.id}">Detail</a>
                                </tr>
                            </c:forEach>
                        <tr>
                            <th scope="row">1</th>
                            <td>Nguyễn Khánh Huy</td>
                            <td>Bảo hiểm đầu xe</td>
                            <td>2022-10-11 11:02:22</td>
                            <td>2022-10-11 11:02:22</td>
                            <td><span>Pending</span></td>
                            <td><a href="staff/contract/detail">Detail</a></td>
                        </tr>
                        <tr>
                            <th scope="row">1</th>
                            <td>Nguyễn Khánh Huy</td>
                            <td>Bảo hiểm đầu xe</td>
                            <td>2022-10-11 11:02:22</td>
                            <td>2022-10-11 11:02:22</td>
                            <td><span>Pending</span></td>
                        </tr>
                        <tr>
                            <th scope="row">1</th>
                            <td>Nguyễn Khánh Huy</td>
                            <td>Bảo hiểm đầu xe</td>
                            <td>2022-10-11 11:02:22</td>
                            <td>2022-10-11 11:02:22</td>
                            <td><span>Pending</span></td>
                        </tr>
                        <tr>
                            <th scope="row">1</th>
                            <td>Nguyễn Khánh Huy</td>
                            <td>Bảo hiểm đầu xe</td>
                            <td>2022-10-11 11:02:22</td>
                            <td>2022-10-11 11:02:22</td>
                            <td><span>Pending</span></td>
                        </tr>
                        <tr>
                            <th scope="row">1</th>
                            <td>Nguyễn Khánh Huy</td>
                            <td>Bảo hiểm đầu xe</td>
                            <td>2022-10-11 11:02:22</td>
                            <td>2022-10-11 11:02:22</td>
                            <td><span>Pending</span></td>
                        </tr>
                        </tbody>
                    </table>
                </div>
                <nav aria-label="Page navigation example">
                    <ul id="page-list" class="pagination justify-content-end">
                        <!-- <li class="page-item disabled">
                                      <a class="page-link" href="#" tabindex="-1">First</a>
                                    </li>
                                    <li class="page-item"><a class="page-link" href="#"><</a></li>
                                    <li class="page-item">
                                      <a class="page-link active" href="#">1</a>
                                    </li>
                                    <li class="page-item"><a class="page-link" href="#">2</a></li>
                                    <li class="page-item"><a class="page-link" href="#">3</a></li>
                                    <li class="page-item"><a class="page-link" href="#">></a></li>
                        
                                    <li class="page-item item-last">
                                      <a class="page-link" href="#">Last</a>
                                    </li> -->
                    </ul>
                </nav>
            </div>
        </main>

        <jsp:include page="../footer_full.jsp" />
        <script src="asset/script/staff/manage_contracts.js"></script>
        <script>
        createPager("page-list", ${page}, ${totalpage}, window.location.href);
        </script>
    </body>
</html>

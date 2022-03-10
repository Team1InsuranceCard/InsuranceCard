<%-- 
    Document   : cancel-contract
    Created on : Mar 10, 2022, 9:39:44 AM
    Author     : quynm
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>InsuranceCard</title>
        <link rel="icon" href="asset/image/favicon.png" type="image/png" sizes="16x16">
        <!-- CDN to reset CSS -->
        <!--<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/normalize/8.0.1/normalize.min.css" />-->
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous"/>
        <base href="${pageContext.servletContext.contextPath}/">
        <link href="asset/style/cancel_contract.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
        <c:if test="${sessionScope.account eq null and sessionScope.mod_account eq null}">
            <jsp:include page="header_common.jsp"></jsp:include>
        </c:if>
        <c:if test="${sessionScope.account.role eq true}">
            <jsp:include page="header_staff.jsp">
                <jsp:param name="currentscreen" value="contract"/>
            </jsp:include>
        </c:if>
        <c:if test="${sessionScope.account.role eq false}">
            <jsp:include page="header_customer.jsp">
                <jsp:param name="currentscreen" value="contract"/>
            </jsp:include>
        </c:if>
        <c:if test="${sessionScope.mod_account ne null}">
            <jsp:include page="header_moderator.jsp"></jsp:include>
        </c:if>

        <div class="content__container">
            <h2 class="content__title">CANCEL CONTRACT</h2>
            <p class="errorMsg">${requestScope.errorMsg eq null ? "" : requestScope.errorMsg}</p>
            <hr/>
            <form action="cancel-contract" method="POST">
                <div class="content__detail">
                    <table class="content__detail-table">
                        <tr class="content__detail-row">
                            <td class="content__detail-data">Contract ID: </td>
                            <td class="content__detail-data">
                                <input type="text" name="email" disabled 
                                       value="${requestScope.contract.id}"/>
                            </td>
                        </tr>
                        <tr class="content__detail-row">
                            <td class="content__detail-data">Customer name: </td>
                            <td class="content__detail-data">
                                <input type="text" name="email" disabled 
                                       value="${requestScope.contract.customer.firstName} 
                                       ${requestScope.contract.customer.lastName}"/>
                            </td>
                        </tr>
                        <tr class="content__detail-row">
                            <td class="content__detail-data">Cancel reason: </td>
                            <td class="content__detail-data">
                                <textarea cols="70" rows="4" name="reason" required
                                          placeholder="Please tell us the reason why you want to cancel this contract"></textarea>
                            </td>
                        </tr>
                        <tr class="content__detail-row">
                            <td class="content__detail-data">Comment: </td>
                            <td class="content__detail-data">
                                <textarea cols="70" rows="4" name="comment"
                                          placeholder="Do you have any feedback for us? Your comment will help us improve our services!"></textarea>
                            </td>
                        </tr>
                        <tr class="content__detail-row">
                            <td colspan="2">
                                <input class="button button--gray" type="submit" value="Cancel contract"/>
                                <a class="button button--primary" 
                                   href="detail?id=${requestScope.contract.id}">Back</a>
                            </td>
                        </tr>
                    </table>
                </div>
            </form>
        </div>

        <jsp:include page="footer_full.jsp"></jsp:include>

        <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
    </body>
</html>

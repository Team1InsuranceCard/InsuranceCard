<%-- 
    Document   : contract_information
    Created on : Feb 1, 2022, 1:32:44 PM
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
        <link href="../../asset/style/customer/contract_information.css" rel="stylesheet" type="text/css"/>
        <script src="https://cdn.jsdelivr.net/npm/sweetalert2@11"></script>
        <base href="${pageContext.servletContext.contextPath}/">
    </head>

    <body>
        <input type="hidden" id="undo" value="${sessionScope.undo}"/>
        <script>
            var renew = sessionStorage.getItem("renew");
            if (renew == "renew") {
                Swal.fire({
                    timer: 2000,
                    position: 'top',
                    title: 'Renew successfully!',
                    icon: 'success',
                    showConfirmButton: true,
                    allowOutsideClick: false,
                    allowEnterKey: true
                })
                sessionStorage.removeItem("renew");
            }

            var undo = document.getElementById("undo"); //fix
            if (undo == "") {
                Swal.fire({
                    timer: 2000,
                    position: 'top',
                    title: undo,
                    icon: 'success',
                    showConfirmButton: true,
                    allowOutsideClick: false,
                    allowEnterKey: true
                })
            }
        </script>
        <c:set var="c" value="${requestScope.contract}"/>
        <header>
            <jsp:include page="../header_customer.jsp">
                <jsp:param name="currentscreen" value="contract"/>
            </jsp:include>
        </header>

        <section>
            <form action="customer/contract/detail" method="POST">
                <input type="hidden" name="id" value="${requestScope.contractID}"/>
                <div class="product-label">
                    <div class="row">
                        <p class="col-md-8 label-title">${c.product.title}</p>
                        <p class="col-md-4 label-fee">Fee: 
                            <fmt:formatNumber type = "number" 
                                              value = "${c.contractFee}"/> VND</p>
                    </div>
                </div>

                <div class="customer-info">
                    <div class="cus title">
                        <p>Customer information</p>
                    </div>

                    <c:set var="cus" value="${requestScope.contract.customer}"/>
                    <div class="cus-content">
                        <div class="row">
                            <p class="col-md-1 bold">Name:</p>
                            <p class="col-md-3 underline">${cus.firstName} 
                                ${cus.lastName}</p>
                            <p class="col-md-1 space bold">DOB:</p>
                            <p class="col-md-2 underline">${cus.dob}</p>
                        </div>
                        <div class="row">
                            <p class="col-md-1 bold">Phone:</p>
                            <p class="col-md-3 underline">${cus.phone}</p>
                            <p class="col-md-1 space bold">PersonalID:</p>
                            <p class="col-md-2 underline">${cus.personalID}</p>
                        </div>
                        <div class="row">
                            <p class="col-md-1 bold">Address:</p>
                            <p class="col-md-5 underline">${cus.address}</p>
                        </div>
                    </div>
                </div>

                <div class="contract-info">
                    <div class="contract title">
                        <p>Contract information</p>
                    </div>
                    <div class="contract-content">
                        <div class="row">
                            <p class="col-md-2 bold">Staff:</p>
                            <p class="col-md-3 underline">${c.startStaff.firstName} 
                                ${c.startStaff.lastName}</p>
                            <p class="col-md-2 space bold">Status:</p>
                            <c:set var="status" value="${requestScope.contract.statusCode.statusName}"/>
                            <c:set var="s" value="${requestScope.contract.statusCode.statusCode}"/>
                            <c:choose>
                                <c:when test="${s==0}">
                                    <p class="col-md-2 center" style="color:#E02A2A;">
                                        ${status}</p>
                                    </c:when>
                                    <c:when test="${s==1}">
                                    <p class="col-md-2 center" style="color:#0DC858;">
                                        ${status}</p>
                                    </c:when>                                                 
                                    <c:when test="${s==2}">
                                    <p class="col-md-2 center" style="color:#FF7D42;">
                                        ${status}</p>
                                    </c:when>
                                    <c:when test="${s==3}">
                                    <p class="col-md-2 center" style="color:#FF7D42;">
                                        ${status}</p>
                                    </c:when>
                                    <c:when test="${s==4}">
                                    <p class="col-md-2 center" style="color:#E02A2A;">
                                        ${status}</p>
                                    </c:when>
                                    <c:when test="${s==5}">
                                    <p class="col-md-2 center" style="color:#E02A2A;">
                                        ${status}</p>
                                    </c:when>
                                </c:choose>
                        </div>
                        <div class="row">
                            <p class="col-md-2 bold">Cancel Staff:</p>
                            <p class="col-md-3 underline">${c.cancelStaff.firstName} 
                                ${c.cancelStaff.lastName}</p>
                            <p class="col-md-2 space bold">Duration:</p>
                            <p class="col-md-2 underline">${requestScope.duration} year</p>
                        </div>
                        <div class="row">
                            <p class="col-md-2 bold">Request date:</p>
                            <p class="col-md-3 underline">
                                <fmt:formatDate pattern = "yyyy-MM-dd HH:mm:ss" 
                                                value = "${c.requestDate}"/></p>
                            <p class="col-md-2 space bold">Resolve date:</p>
                            <p class="col-md-2 underline">
                                <fmt:formatDate pattern = "yyyy-MM-dd HH:mm:ss" 
                                                value = "${c.resolveDate}"/></p>
                        </div>
                        <div class="row">
                            <p class="col-md-2 bold">Start date:</p>
                            <p class="col-md-3 underline">
                                <fmt:formatDate pattern = "yyyy-MM-dd" 
                                                value = "${c.startDate}"/></p>
                            <p class="col-md-2 space bold">End date:</p>
                            <p class="col-md-2 underline">
                                <fmt:formatDate pattern = "yyyy-MM-dd" 
                                                value = "${c.endDate}"/></p>
                        </div>
                        <div class="row">
                            <p class="col-md-2 bold">Cancel request date:</p>
                            <p class="col-md-3 underline">
                                <fmt:formatDate pattern = "yyyy-MM-dd HH:mm:ss" 
                                                value = "${c.cancelRequestDate}"/></p>
                            <p class="col-md-2 space bold">Cancel date:</p>
                            <p class="col-md-2 underline">
                                <fmt:formatDate pattern = "yyyy-MM-dd HH:mm:ss" 
                                                value = "${c.cancelDate}"/></p>
                        </div>
                        <div class="row">
                            <p class="col-md-2 bold">Cancel reason:</p>
                            <textarea class="col-md-3 text-area" disabled>
                                ${c.cancelReason}</textarea>
                            <p class="col-md-2 space bold">Cancel comment:</p>
                            <textarea class="col-md-2 text-area" disabled>
                                ${c.cancelComment}</textarea>
                        </div>
                    </div>
                </div>

                <div class="vehicle-info">
                    <div class="vehicle title">
                        <p>Vehicle information</p>
                    </div>

                    <div class="vehicle-content">
                        <div class="row">
                            <div class="col-md-6">
                                <div class="row">
                                    <p class="col-md-4 bold">Vehicle type:</p>
                                    <p class="col-md-6 underline">${c.vehicleType}</p>
                                </div>
                                <div class="row">
                                    <p class="col-md-4 bold">Engine:</p>
                                    <p class="col-md-6 underline">${c.engine}</p>
                                </div>
                                <div class="row">
                                    <p class="col-md-4 bold">License plate:</p>
                                    <p class="col-md-6 underline">${c.licensePlate}</p>
                                </div>
                                <div class="row">
                                    <p class="col-md-4 bold">Color:</p>
                                    <p class="col-md-6 underline">${c.color}</p>
                                </div>
                                <div class="row">
                                    <p class="col-md-4 bold">Brand:</p>
                                    <p class="col-md-6 underline">${c.brand}</p>
                                </div>
                                <div class="row">
                                    <p class="col-md-4 bold">Owner:</p>
                                    <p class="col-md-6 underline">${c.owner}</p>
                                </div>
                                <div class="row">
                                    <p class="col-md-4 bold">Chassis:</p>
                                    <p class="col-md-6 underline">${c.chassis}</p>
                                </div>

                            </div>
                            <div class="col-md-6">
                                <p class="bold space">CertImage:</p>
                                <div class="row">
                                    <img class="col-md-12" src="${c.certImage}.png" alt="cert image"/>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>

                <div class="product-info">
                    <div class="product title">
                        <p>Product information</p>
                    </div>

                    <div class="product-content">
                        <p>${c.product.contentDetail}</p>
                    </div>
                </div>
                <div class="submit">
                    <c:set var="check" value="${requestScope.checkRenew}"/>
                    <input type="${requestScope.pro==0||c.status==5||check!=""?"hidden":"submit"}" 
                           name="btn" value="${requestScope.btn}"/>
                    <h4 ${requestScope.pro!=0?"":"style=\"color:#FFFFFF;background-color:#E5333A;display:inline;padding: 0.5rem 1rem;\""}>
                        ${requestScope.mess}</h4>
                    <h6 ${check==""?"":"style=\"color:#FFFFFF;background-color:#E5333A;display:inline;padding: 0.5rem 1rem;\""}>
                        ${check}</h6>
                </div>
            </form>
        </section>

        <footer>
            <jsp:include page="../footer_full.jsp"></jsp:include>
        </footer>
    </body>
</html>

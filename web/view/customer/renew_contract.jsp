<%-- 
    Document   : renew_contract
    Created on : Feb 9, 2022, 11:40:48 AM
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
        <link href="../../asset/style/customer/renew_contract.css" rel="stylesheet" type="text/css"/>
        <script src="https://cdn.jsdelivr.net/npm/sweetalert2@11"></script>
        <script src="../../asset/script/customer/renew_contract.js" type="text/javascript"></script>
        <base href="${pageContext.servletContext.contextPath}/">
    </head>

    <body>
        <c:set var="c" value="${requestScope.contract}"/>
        <c:set var="d" value="${requestScope.delivery}"/>
        <header>
            <jsp:include page="../header_customer.jsp">
                <jsp:param name="currentscreen" value="contract"/>
            </jsp:include>
        </header>

        <section>
            <form id="myForm" action="customer/contract/renew" method="POST">
                <input type="hidden" id="price" value="${c.product.price}"/>
                <div class="product-label">
                    <div class="row">
                        <p class="col-md-8 label-title">${c.product.title}</p>
                        <p class="col-md-4 label-fee" id="fee">Fee: 
                            <fmt:formatNumber type = "number" 
                                              value = "${c.product.price}"/> VND</p>
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

                <div class="delivery-info">
                    <div class="delivery title">
                        <p>Delivery information</p>
                    </div>
                    <div class="delivery-content">
                        <div class="row">
                            <p class="col-md-2 bold">Fullname:</p>
                            <p class="col-md-3 underline">${d.fullName}</p>
                            <p class="col-md-2 space bold">Phone:</p>
                            <p class="col-md-3 underline">${d.phone}</p>
                        </div>
                        <div class="row">
                            <p class="col-md-2 bold">Email:</p>
                            <p class="col-md-3 underline">${d.email}</p>
                            <p class="col-md-2 space bold">Address:</p>
                            <p class="col-md-3 underline">${d.address}</p>
                        </div>
                        <div class="row">
                            <p class="col-md-2 bold">Province:</p>
                            <p class="col-md-3 underline">${d.province}</p>
                            <p class="col-md-2 space bold">District:</p>
                            <p class="col-md-3 underline">${d.district}</p>
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
                        </div>
                        <div class="row">
                            <p class="col-md-2 bold">Cancel Staff:</p>
                            <p class="col-md-3 underline"></p>
                            <p class="col-md-2 space bold">Duration:</p>
                            <p class="col-md-2">
                                <select id="duration" name="duration" 
                                        onchange="fillEndDate()" required>
                                    <option value="0" hidden>Select year</option>
                                    <option value="1">1 year</option>
                                    <option value="2">2 year</option>
                                    <option value="3">3 year</option>
                                </select>
                            </p>
                        </div>
                        <div class="row">
                            <p class="col-md-2 bold">Request date:</p>
                            <p class="col-md-3 underline"></p>
                            <p class="col-md-2 space bold">Resolve date:</p>
                            <p class="col-md-2 underline"></p>
                        </div>
                        <div class="row">
                            <p class="col-md-2 bold">Start date:</p>
                            <p class="col-md-3">
                                <input type="date" id="startDate" name="startDate"
                                       min="${requestScope.minDate}" 
                                       value="${requestScope.minDate}"
                                       onchange="fillEndDate()" required/></p>
                            <p class="col-md-2 space bold">End date:</p>
                            <p class="col-md-2 underline" id="endDate">
                            </p>
                        </div>
                        <div class="row">
                            <p class="col-md-2 bold">Cancel request date:</p>
                            <p class="col-md-3 underline"></p>
                            <p class="col-md-2 space bold">Cancel date:</p>
                            <p class="col-md-2 underline"></p>
                        </div>
                        <div class="row">
                            <p class="col-md-2 bold">Cancel reason:</p>
                            <textarea class="col-md-3 text-area" disabled>
                            </textarea>
                            <p class="col-md-2 space bold">Cancel comment:</p>
                            <textarea class="col-md-2 text-area" disabled>
                            </textarea>
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
                                    <p class="col-md-6 underline">${c.vehicleType2.vehicleType}</p>
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
                                    <p class="col-md-6 underline">${c.brand2.brand}</p>
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
                                    <img class="col-md-12" src="${c.certImage}" alt="cert image"/>
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
                    <input type="button" value="Submit" onclick="renew()"/>
                </div>
            </form>
        </section>

        <footer>
            <jsp:include page="../footer_full.jsp"></jsp:include>
        </footer>
    </body>
</html>

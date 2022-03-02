<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <base href="${pageContext.servletContext.contextPath}/">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Insurance Card</title>
        <link rel="icon" href="asset/image/favicon.png" type="image/png" sizes="16x16">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
              integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
              crossorigin="anonymous">
        <link rel = "stylesheet" href = "https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.3/css/all.min.css"/>
        <link href="asset/style/staff/resolve_compensation.css" rel="stylesheet" type="text/css"/>
<!--
        <style>
        </style>-->
    </head>
    <body>
        <header>
            <jsp:include page="../header_staff.jsp">
                <jsp:param name="currentscreen" value="" />
            </jsp:include>
        </header>

        <main>
            ${param.currentscreen}
            <form action="staff/compensation/resolve-compensation" method="POST"
                  onSubmit="submit(this)">

                <div class="row header">
                    <h1 class="header__heading">Compensation request contract ${requestScope.contract.id}</h1>
                </div>


                <div class="row mess-box mess-box--success" 
                     style="${requestScope.isSuccess ? "display:flex;" : "display:none;"}">
                    <p class="mess-box__mess">
                        Action succeed!
                    </p>
                </div>
                <!--
                                                <div class="mess-box mess-box--danger" 
                                                     style="${!requestScope.check && !requestScope.isSuccess ? "display:flex;" : "display:none;"}">
                                                    <img src="asset/image/staff/customer_create_edit/icon_close.png" class="mess-box__icon" />
                                                    <p class="mess-box__mess">The customer has a contract with a similar product that is active or the contract's status is processing!</p>
                                                </div>
                                
                                                <div class="mess-box mess-box--danger" 
                                                     style="${requestScope.contract.product.statusCode.statusCode == 0 ? "display:flex;" : "display:none;"}">
                                                    <img src="asset/image/staff/customer_create_edit/icon_close.png" class="mess-box__icon" />
                                                    <p class="mess-box__mess">Product is inactive!</p>
                                                </div>
                -->


                <input type="hidden" name="id" value="${requestScope.contract.id}" />

                <div class="row section">
                    <h2 class="col-lg-12 section__heading">Contract Information</h2>

                    <div class="row col-lg-12 section__main">
                        <div class="row col-lg-6 section__item">
                            <div class="col-lg-6 section__title">Contract ID</div>
                            <div class="col-lg-6 section__text">${requestScope.contract.id}</div>
                        </div>

                        <div class="row col-lg-6 section__item">
                            <div class="col-lg-6 section__title">Status</div>
                            <div class="col-lg-6 section__text" id="contractStatus">${requestScope.contract.statusCode.statusName}</div>
                        </div>

                        <div class="row col-lg-6 section__item">
                            <div class="col-lg-6 section__title">Start Date</div>
                            <div class="col-lg-6 section__text"><fmt:formatDate type = "both" dateStyle = "short"
                                                                                value = "${requestScope.contract.startDate}"/></div>
                        </div>

                        <div class="row col-lg-6 section__item">
                            <div class="col-lg-6 section__title">End Date</div>
                            <div class="col-lg-6 section__text"><fmt:formatDate type = "both" dateStyle = "short" 
                                                                                value = "${requestScope.contract.endDate}" /></div>
                        </div>

                        <div class="row col-lg-6 section__item">
                            <div class="col-lg-6 section__title">Contract term</div>
                            <div class="col-lg-6 section__text" id="contractStatus">${requestScope.contract.term}</div>
                        </div>

                        <div class="row col-lg-6 section__item">
                            <div class="col-lg-6 section__title">Payment method</div>
                            <div class="col-lg-6 section__text">Cash</div>
                        </div>

                        <div class="row col-lg-6 section__item">
                            <div class="col-lg-6 section__title">New start date</div>
                            <div class="col-lg-6 section__text"><fmt:formatDate type = "both" dateStyle = "short"
                                                                                value = "${requestScope.contract.newStartDate}"/></div>
                        </div>

                        <div class="row col-lg-6 section__item">
                            <div class="col-lg-6 section__title">Compensation package</div>
                            <select name="compense_package" class="col-lg-6 section__input" required>
                                <option value="1">0%</option>
                                <option value="2">10%</option>
                                <option value="3">20%</option>
                                <option value="4">30%</option>
                                <option value="5">40%</option>
                                <option value="6">50%</option>
                                <option value="7">60%</option>
                                <option value="8">70%</option>
                                <option value="9">80%</option>
                                <option value="10">90%</option>
                                <option value="11">100%</option>
                            </select>
                        </div>

                        <div class="row col-lg-6 section__item">
                            <div class="col-lg-6 section__title">New end date</div>
                            <div class="col-lg-6 section__text"><fmt:formatDate type = "both" dateStyle = "short"
                                                                                value = "${requestScope.contract.newEndDate}"/></div>
                        </div>

                        <div class="row col-lg-6 section__item">
                            <div class="col-lg-6 section__title">Compensation amount</div>
                            <div class="col-lg-6 section__text">fee+(fee*package)</div>
                        </div>
                    </div>
                </div>

                <div class="row section">
                    <h2 class="col-lg-12 section__heading">Customer Information</h2>

                    <div class="row col-lg-12 section__main">
                        <div class="row col-lg-6 section__item">
                            <div class="col-lg-6 section__title">Name</div>
                            <div class="col-lg-6 section__text">${requestScope.contract.customer.firstName} ${requestScope.contract.customer.lastName}</div>
                        </div>

                        <div class="row col-lg-6 section__item">
                            <div class="col-lg-6 section__title">Email</div>
                            <div class="col-lg-6 section__text">${requestScope.contract.customer.account.email}</div>
                        </div>

                        <div class="row col-lg-6 section__item">
                            <div class="col-lg-6 section__title">Date of Birth</div>
                            <div class="col-lg-6 section__text"><fmt:formatDate type = "date" dateStyle = "short" 
                                                                                value = "${requestScope.contract.customer.dob}" /></div>
                        </div>

                        <div class="row col-lg-6 section__item">
                            <div class="col-lg-6 section__title">Personal ID</div>
                            <div class="col-lg-6 section__text">${requestScope.contract.customer.personalID}</div>
                        </div>

                        <div class="row col-lg-6 section__item">
                            <div class="col-lg-6 section__title">Phone</div>
                            <div class="col-lg-6 section__text">${requestScope.contract.customer.phone}</div>
                        </div>

                        <div class="row col-lg-6 section__item">
                            <div class="col-lg-6 section__title">Address</div>
                            <div class="col-lg-6 section__text">${requestScope.contract.customer.address}</div>
                        </div>
                    </div>
                </div>

                <div class="row section">
                    <h2 class="col-lg-12 section__heading">Vehicle Information</h2>

                    <div class="row col-lg-12 section__main">
                        <div class="col-lg-5 section__left">
                            <div class="row col-lg-7 section__item">
                                <div class="col-lg-6 section__title">Vehicle type</div>
                                <div class="col-lg-6 section__text">${requestScope.contract.vehicleType2.vehicleType}</div>
                            </div>

                            <div class="row col-lg-5 section__item">
                                <div class="col-lg-6 section__title">Engine</div>
                                <div class="col-lg-6 section__text">${requestScope.contract.engine}</div>
                            </div>

                            <div class="row col-lg-7 section__item">
                                <div class="col-lg-6 section__title">License Plate</div>
                                <div class="col-lg-6 section__text">${requestScope.contract.licensePlate}</div>
                            </div>

                            <div class="row col-lg-5 section__item">
                                <div class="col-lg-6 section__title">Color</div>
                                <div class="col-lg-6 section__text">${requestScope.contract.color}</div>
                            </div>

                            <div class="row col-lg-7 section__item">
                                <div class="col-lg-6 section__title">Brand</div>
                                <div class="col-lg-6 section__text">${requestScope.contract.brand2.brand}</div>
                            </div>

                            <div class="row col-lg-5 section__item">
                                <div class="col-lg-6 section__title">Owner</div>
                                <div class="col-lg-6 section__text">${requestScope.contract.owner}</div>
                            </div>

                            <div class="row col-lg-7 section__item">
                                <div class="col-lg-6 section__title">Chassis</div>
                                <div class="col-lg-6 section__text">${requestScope.contract.chassis}</div>
                            </div>
                        </div>

                        <div class="col-lg-7 section__right">
                            <div class="row col-lg-6 section__item">
                                <div class="col-lg-6 section__title">Cert Image</div>
                                <img class="col-lg-6 section__img" src="${requestScope.contract.certImage}"></img>
                            </div>
                        </div>          
                    </div>
                </div>

                <div class="row section">
                    <h2 class="col-lg-12 section__heading">Product Information</h2>

                    <div class="row col-lg-12 section__main">
                        <div class="row col-lg-6 section__item">
                            <div class="col-lg-6 section__title">Product ID</div>
                            <div class="col-lg-6 section__text">${requestScope.contract.product.id}</div>
                        </div>

                        <div class="row col-lg-6 section__item">
                            <div class="col-lg-6 section__title">Product Title</div>
                            <div class="col-lg-6 section__text">${requestScope.contract.product.title}</div>
                        </div>

                        <div class="row col-lg-6 section__item">
                            <div class="col-lg-6 section__title">Status</div>
                            <div class="col-lg-6 section__text" id="productStatus">${requestScope.contract.product.statusCode.statusName}</div>
                        </div>

                        <div class="row col-lg-6 section__item">
                            <div class="col-lg-6 section__title">Content detail</div>
                            <div class="col-lg-6 section__text">${requestScope.contract.product.contentDetail}</div>
                        </div>
                    </div>
                </div>

                <div class="row section">
                    <h2 class="col-lg-12 section__heading">Accident Information</h2>

                    <div class="row col-lg-12 section__main">
                        <div class="row col-lg-6 section__item">
                            <div class="col-lg-6 section__title">Title</div>
                            <div class="col-lg-6 section__text">title</div>
                        </div>

                        <div class="row col-lg-6 section__item">
                            <div class="col-lg-6 section__title">Attachment</div>
                            <div class="col-lg-6 section__text"><a href="#">Attach</a></div>
                        </div>

                        <div class="row col-lg-6 section__item">
                            <div class="col-lg-6 section__title">Vehicle damage</div>
                            <div class="col-lg-6 section__text">V-damage</div>
                        </div>

                        <div class="row col-lg-6 section__item">
                            <div class="col-lg-6 section__title">Date</div>
                            <div class="col-lg-6 section__text">${requestScope.contract.product.contentDetail}</div>
                        </div>

                        <div class="row col-lg-6 section__item">
                            <div class="col-lg-6 section__title">Human damage</div>
                            <div class="col-lg-6 section__text">H-damage</div>
                        </div>
                    </div>
                </div>

                <div class="row section">
                    <h2 class="col-lg-12 section__heading">Staff Note</h2>

                    <div class="row col-lg-12 section__main">
                        <div class="row col-lg-12 section__item">
                            <div class="col-lg-3 section__title">Resolve note</div>
                            <textarea class="col-lg-8 section__input" type="text" 
                                      name="resolve_note" style="resize: none; height: 5rem;"></textarea>
                        </div>
                    </div>
                </div>
                <div class="row header__btn justify-content-around">
                    <input class="col-lg-2 btn btn--primary <%--${(requestScope.contract.statusCode.statusCode == 0 
                                                     || requestScope.contract.statusCode.statusCode == 1)
                                                     && requestScope.contract.product.statusCode.statusCode == 1
                                                     && requestScope.check
                                                     ? '' : 'btn--disabled'}--%>" 
                           type="submit" value="Accept" />

                    <a class="col-lg-2 btn btn--secondary"
                       onclick="confirmBox('Are you sure you want to cancel?', 'staff/contract/view')">Reject</a>
                </div>
            </form>
        </main>

        <footer>
            <jsp:include page="../footer_full.jsp"></jsp:include>
        </footer>
    </body>
</html>

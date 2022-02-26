<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> <%@page
    contentType="text/html" pageEncoding="UTF-8"%>
    <!DOCTYPE html>
    <html>
        <head>
            <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
            <title>Insurance Card</title>
            <base href="${pageContext.servletContext.contextPath}/" />
            <link rel="icon" href="asset/image/favicon.png" type="image/png" sizes="16x16">
            <link rel="stylesheet" href="asset/style/staff/customer_edit.css" />
        </head>
        <body>
            <jsp:include page="../header_staff.jsp">
                <jsp:param name="currentscreen" value="customer" />
            </jsp:include>

            <main>
                <div class="card">
                    <h1 class="card__heading">EDIT CUSTOMER</h1>

                    <div class="mess-box mess-box--danger" 
                         style="${requestScope.isExistEmail ? "display:flex;" : "display:none;"}">
                        <img src="asset/image/staff/customer_create_edit/icon_close.png" alt="" class="mess-box__icon" />
                        <p class="mess-box__mess">The email address is already taken!</p>
                    </div>

                    <div class="mess-box mess-box--success" 
                         style="${requestScope.isSuccess ? "display:flex;" : "display:none;"}">
                        <img src="asset/image/staff/customer_create_edit/icon_approve.png" class="mess-box__icon" />
                        <p class="mess-box__mess">Success! Your submission has been saved!</p>
                    </div>

                    <form action="staff/customer/edit" method="POST" autocomplete="off">                 
                        <input type="hidden" name="aid" value="${requestScope.aid}">

                        <div class="section">
                            <h2 class="section__heading">Account Information</h2>

                            <div class="section__main">
                                <div class="section__item">
                                    <p class="section__label">Email</p>
                                    <input
                                        class="section__input"
                                        type="text"
                                        name="email"
                                        value="${requestScope.email}"
                                        pattern="[a-z0-9._%+-]+@[a-z0-9.-]+\.[a-z]{2,}$"
                                        required
                                        />
                                </div>

                                <div class="section__item">
                                    <p class="section__label">Status</p>
                                    <select name="status" class="section__input" required>
                                        <option ${requestScope.status == 0 ? "selected" : ""} 
                                            value="0">Inactive</option>
                                        <option ${requestScope.status == 1 ? "selected" : ""}
                                            value="1">Active</option>
                                        <option ${requestScope.status == 2 ? "selected" : ""}
                                            value="2" disabled>Pending</option>
                                    </select>
                                </div>
                            </div>
                        </div> 

                        <div class="section">
                            <h2 class="section__heading">Personal Information</h2>

                            <div class="section__main">
                                <div class="section__item">
                                    <p class="section__label">First Name</p>
                                    <input
                                        class="section__input"
                                        type="text"
                                        name="fname"
                                        value="${requestScope.fname}"
                                        pattern="/[^a-z0-9A-Z_\x{00C0}-\x{00FF}\x{1EA0}-\x{1EFF}]/u"
                                        required
                                        />
                                </div>

                                <div class="section__item">
                                    <p class="section__label">Personal ID</p>
                                    <input
                                        class="section__input"
                                        type="text"
                                        name="pid"
                                        value="${requestScope.pid}"
                                        pattern="[0-9]+"
                                        minlength="12"
                                        maxlength="12"
                                        required
                                        />
                                </div>

                                <div class="section__item">
                                    <p class="section__label">Last Name</p>
                                    <input
                                        class="section__input"
                                        type="text"
                                        name="lname"
                                        value="${requestScope.lname}"
                                        pattern="/[^a-z0-9A-Z_\x{00C0}-\x{00FF}\x{1EA0}-\x{1EFF}]/u"
                                        required
                                        />
                                </div>

                                <div class="section__item">
                                    <p class="section__label">Province</p>
                                    <select class="section__input" 
                                            name="calc_shipping_provinces" 
                                            id="province" 
                                            required
                                            >
                                        <option value=""></option>
                                    </select>
                                    <input
                                        class="billing_address_1"
                                        name="province"
                                        type="hidden"
                                        value="${requestScope.province}"
                                        />
                                </div>

                                <div class="section__item">
                                    <p class="section__label">Date of Birth</p>
                                    <input
                                        class="section__input"
                                        type="date"
                                        name="dob"
                                        value="${requestScope.dob}"
                                        required
                                        />
                                </div>

                                <div class="section__item">
                                    <p class="section__label">District</p>
                                    <select class="section__input" 
                                            name="calc_shipping_district" 
                                            id="district" required>
                                        <option value=""></option>
                                    </select>
                                    <input
                                        class="billing_address_2"
                                        name="district"
                                        type="hidden"
                                        value="${requestScope.district}"
                                        />
                                </div>

                                <div class="section__item">
                                    <p class="section__label">Phone</p>
                                    <input
                                        class="section__input"
                                        type="text"
                                        name="phone"
                                        value="${requestScope.phone}"
                                        pattern="0[0-9]{9}"
                                        required
                                        />
                                </div>

                                <div class="section__item">
                                    <p class="section__label">Address</p>
                                    <input
                                        class="section__input"
                                        type="text"
                                        name="address"
                                        value="${requestScope.address}"
                                        pattern="^[^-\s][\S\s]*"
                                        required
                                        />
                                </div>
                            </div>
                        </div>

                        <div class="section">
                            <h2 class="section__heading">Other Information</h2>

                            <div class="section__main">
                                <div class="section__item autocomplete">
                                    <p class="section__label">Staff</p>
                                    <input
                                        class="section__input"
                                        type="text"
                                        name="staff"
                                        value="${requestScope.staff.account.id} - ${requestScope.staff.firstName} ${requestScope.staff.lastName}"
                                        readonly
                                        />
                                </div>

                                <div class="section__item">
                                    <p class="section__label">Joining Date</p>
                                    <input
                                        class="section__input"
                                        type="datetime-local"
                                        name="joinDate"
                                        value="${requestScope.joinDate}"
                                        readonly
                                        />
                                </div>
                            </div>
                        </div>                   

                        <div class="form-btn">
                            <input class="btn btn--primary" type="submit" value="Update" />
                            <a href="staff/customer/view" class="btn btn--secondary">Cancel</a>
                        </div>
                    </form>
                </div>
            </main>

            <jsp:include page="../footer_full.jsp">
                <jsp:param name="currentscreen" value="customer" />
            </jsp:include>

            <!-- province, district -->
            <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
            <script src="https://cdn.jsdelivr.net/gh/vietblogdao/js/districts.min.js"></script>
            <script>
                    $('select[name="calc_shipping_provinces"]').each(function () {
                        var $this = $(this),
                                stc = "";
                        c.forEach(function (i, e) {
                            e += +1;
                            stc += "<option value=" + e + ">" + i + "</option>";
                            $this.html('<option value="">Provinces</option>' + stc);
                            $this.on("change", function (i) {
                                i = $this.children("option:selected").index() - 1;
                                var str = "",
                                        r = $this.val();
                                arr[i].forEach(function (el) {
                                    str += '<option value="' + el + '">' + el + "</option>";
                                    $('select[name="calc_shipping_district"]').html(
                                            '<option value="">Districts</option>' + str
                                            );
                                });
                                var address_1 = $this.children("option:selected").text();
                                var district = $('select[name="calc_shipping_district"]').html();
                                $('select[name="calc_shipping_district"]').on(
                                        "change",
                                        function () {
                                            var target = $(this).children("option:selected");
                                            target.attr("selected", "");
                                            $('select[name="calc_shipping_district"] option')
                                                    .not(target)
                                                    .removeAttr("selected");
                                            var address_2 = target.text();
                                            $("input.billing_address_2").attr("value", address_2);
                                            district = $('select[name="calc_shipping_district"]').html();
                                        }
                                );
                                $("input.billing_address_1").attr("value", address_1);
                            });
                        });
                    });

                    var district = $('select[name="calc_shipping_district"]').html();
                    $('select[name="calc_shipping_district"]').on(
                            "change",
                            function () {
                                var target = $(this).children("option:selected");
                                target.attr("selected", "");
                                $('select[name="calc_shipping_district"] option')
                                        .not(target)
                                        .removeAttr("selected");
                                var address_2 = target.text();
                                $("input.billing_address_2").attr("value", address_2);
                                district = $('select[name="calc_shipping_district"]').html();
                            }
                    );
            </script>

            <!-- set previous value for province, district -->
            <script>
                var pro = document.getElementById("province").options;
                var proVal = "${requestScope.province}";
                for (var i = 0; i < province.length; i++) {
                    if (pro[i].text === proVal) {
                        pro[i].selected = true;
                        var str = "";
                        arr[i - 1].forEach(function (el) {
                            str += '<option value="' + el + '">' + el + "</option>";
                            $('select[name="calc_shipping_district"]').html(
                                    '<option value="">Districts</option>' + str
                                    );
                        });
                    }
                }

                var dis = document.getElementById("district").options;
                var disVal = "${requestScope.district}";
                for (var i = 0; i < dis.length; i++) {
                    if (dis[i].text === disVal) {
                        dis[i].selected = true;
                    }
                }
            </script>
        </body>
    </html>

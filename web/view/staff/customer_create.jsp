<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 
<%@page contentType="text/html" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
    <jsp:include page="../header_staff.jsp">
        <jsp:param name="currentscreen" value="customer" />
    </jsp:include>
    
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
        <title>Insurance Card</title>
        <base href="${pageContext.servletContext.contextPath}/" />
        <link rel="icon" href="asset/image/favicon.png" type="image/png" sizes="16x16">
        <link rel="stylesheet" href="asset/style/staff/customer_create.css" />
    </head>
    <body>
        <main>
            <div class="card">
                <h1 class="card__heading">NEW CUSTOMER</h1>

                <div class="mess-box mess-box--danger" 
                     style="${requestScope.isExistEmail ? "display:flex;" : ""}">
                    <img src="asset/image/staff/customer_create_edit/icon_close.png" class="mess-box__icon" />
                    <p class="mess-box__mess">The email address is already taken!</p>
                </div>

                <div class="mess-box mess-box--success" 
                     style="${requestScope.isSuccess ? "display:flex;" : ""}">
                    <img src="asset/image/staff/customer_create_edit/icon_approve.png" class="mess-box__icon" />
                    <p class="mess-box__mess">Your customer has been sucessfully created!</p>
                </div>

                <form action="staff/customer/create" method="POST">
                    <div class="form">
                        <div class="form__item">
                            <p class="form__label">First Name</p>
                            <input
                                class="form__input"
                                type="text"
                                name="fname"
                                value="${requestScope.fname}"
                                pattern="/[^a-z0-9A-Z_\x{00C0}-\x{00FF}\x{1EA0}-\x{1EFF}]/u"
                                required
                                />
                        </div>

                        <div class="form__item">
                            <p class="form__label">Last Name</p>
                            <input
                                class="form__input"
                                type="text"
                                name="lname"
                                value="${requestScope.lname}"
                                pattern="/[^a-z0-9A-Z_\x{00C0}-\x{00FF}\x{1EA0}-\x{1EFF}]/u"
                                required
                                />
                        </div>

                        <div class="form__item">
                            <p class="form__label">Personal ID</p>
                            <input
                                class="form__input"
                                type="text"
                                name="pid"
                                value="${requestScope.pid}"
                                pattern="[0-9]+"
                                minlength="12"
                                maxlength="12"
                                required
                                />
                        </div>

                        <div class="form__item">
                            <p class="form__label">Email</p>
                            <input
                                class="form__input"
                                type="text"
                                name="email"
                                value="${requestScope.email}"
                                pattern="[a-z0-9._%+-]+@[a-z0-9.-]+\.[a-z]{2,}$"
                                required
                                />
                        </div>

                        <div class="form__item">
                            <p class="form__label">Date of Birth</p>
                            <input
                                class="form__input"
                                type="date"
                                name="dob"
                                value="${requestScope.dob}"
                                required
                                />
                        </div>

                        <div class="form__item">
                            <p class="form__label">Phone</p>
                            <input
                                class="form__input"
                                type="text"
                                name="phone"
                                value="${requestScope.phone}"
                                pattern="0[0-9]{9}"
                                required
                                />
                        </div>

                        <div class="form__item">
                            <p class="form__label">Province</p>
                            <select class="form__input" name="calc_shipping_provinces" id="province" required>
                                <option value=""></option>
                            </select>
                            <input
                                class="billing_address_1"
                                name="province"
                                type="hidden"
                                value="${requestScope.province}"
                                />
                        </div>

                        <div class="form__item">
                            <p class="form__label">District</p>
                            <select class="form__input" name="calc_shipping_district" id="district" required>
                                <option value=""></option>
                            </select>
                            <input
                                class="billing_address_2"
                                name="district"
                                type="hidden"
                                value="${requestScope.district}"
                                />
                        </div>

                        <div class="form__item">
                            <p class="form__label">Address</p>
                            <input
                                class="form__input"
                                type="text"
                                name="address"
                                value="${requestScope.address}"
                                pattern="^[^-\s][\S\s]*"
                                required
                                />
                        </div>

                        <div class="form__item">
                            <p class="form__label">Joining Date</p>
                            <input
                                class="form__input"
                                type="datetime-local"
                                id="joinDate"
                                name="joinDate"
                                value="${requestScope.joinDate}"
                                required
                                />
                        </div>
                    </div>

                    <div class="form__btn">
                        <input class="btn btn--primary" type="submit" value="Create" />
                        <a href="staff/dashboard" class="btn btn--secondary">Cancel</a>
                    </div>
            </div>
        </form>
    </main>

    <!-- auto joinDate = current date -->
    <script>
        if (${empty requestScope.joinDate}) {
            var joinDateElm = document.getElementById("joinDate");
            var now = new Date();
            var month = now.getMonth() + 1;
            var day = now.getDate();
            var date = now.getFullYear() + '-' + (month < 10 ? '0' : '') + month + '-' + (day < 10 ? '0' : '') + day;
            joinDateElm.value = date + "T" + datetime.toLocaleTimeString().substring(0, 5);
        }
    </script>

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
                    if (r != "") {
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
                    } else {
                        $('select[name="calc_shipping_district"]').html(
                                '<option value="">Districts</option>'
                                );
                        district = $('select[name="calc_shipping_district"]').html();
                    }
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

<jsp:include page="../footer_full.jsp">
    <jsp:param name="currentscreen" value="customer" />
</jsp:include>
</html>



<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>InsuranceCard</title>
        <link rel="icon" href="../asset/image/favicon.png" type="image/png" sizes="16x16">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">
        <Link rel = "stylesheet" href = "https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.3/css/all.min.css"/>
        <link href="../asset/style/register.css" rel="stylesheet" type="text/css"/>
        
    </head>

    <body>
        <div class="signUp">
            <h1>Sign Up</h1>
        </div>
        <form action="register" method="POST">
            <div>
                <%-- Email + Phone --%>
                <div class="row">
                    <div class="col-md-6">
                        <input type="email" name="email" 
                               placeholder="Email *" required/>
                    </div>
                    <div class="col-md-6">
                        <input type="tel" name="phone" pattern="[0]{1}[0-9]{9}"  
                               placeholder="Phone *" required/>
                    </div>
                </div>

                <%-- Pass + PersonalID --%>
                <div class="row">
                    <div class="col-md-6">
                        <input type="password" name="password" 
                               placeholder="Password *" required/>
                    </div>
                    <div class="col-md-6">
                        <input type="number" name="personalID" 
                               placeholder="Personal ID *" required/>
                    </div>
                </div>

                <%-- Pass2 + Address --%>
                <div class="row">
                    <div class="col-md-6">
                        <input type="password" name="password2" 
                               placeholder="Confirm password *" required/>
                    </div>
                    <div class="col-md-6">
                        <input type="text" name="address" 
                               placeholder="Address *" required/>
                    </div>
                </div>

                <%-- First name + Province --%>
                <div class="row">
                    <div class="col-md-6">
                        <input type="text" name="firstName" 
                               placeholder="First name *" 
                               pattern="[a-zA-Z]+[ a-zA-Z]*" required/>
                    </div>
                    <div class="col-md-6">
                        <select name="calc_shipping_provinces" required>
                        </select>
                        <input class="billing_address_1" name="province" 
                               type="hidden" value=""/>
                    </div>
                </div>

                <%-- Last name + District --%>
                <div class="row">
                    <div class="col-md-6">
                        <input type="text" name="lastName" 
                               placeholder="Last name *" 
                               pattern="[a-zA-Z]+[ a-zA-Z]*" required/>
                    </div>
                    <div class="col-md-6">
                        <select name="calc_shipping_district" required>
                            <option hidden>District</option>
                        </select>
                        <input class="billing_address_2" name="district" 
                               type="hidden" value=""/>
                    </div>
                </div>

                <%-- DOB --%>
                <div class="row">
                    <div class="col-md-6">
                        <input type="date" name="dob" placeholder="DOB *" 
                               required/>
                    </div>
                    <div class="col-md-6">
                        <div class="icon-login">
                            <p style="color:#5C2941;font-size:15px;
                               font-weight:bold;">Or register by</p>
                            <i class="fab fa-facebook"></i>
                            <i class="fab fa-google-plus"></i>
                        </div>
                    </div>
                </div>
            </div>

            <div class="register">
                <input type="submit" value="Register"/>
            </div>
            <div class="login">
                <a href="login">Login</a>
            </div>
        </form>

        <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
        <script src='https://cdn.jsdelivr.net/gh/vietblogdao/js/districts.min.js'></script>
        <script>
            if ((address_2 = localStorage.getItem("address_2_saved"))) {
                $('select[name="calc_shipping_district"] option').each(function () {
                    if ($(this).text() == address_2) {
                        $(this).attr("selected", "");
                    }
                });
                $("input.billing_address_2").attr("value", address_2);
            }
            if ((district = localStorage.getItem("district"))) {
                $('select[name="calc_shipping_district"]').html(district);
                $('select[name="calc_shipping_district"]').on("change", function () {
                    var target = $(this).children("option:selected");
                    target.attr("selected", "");
                    $('select[name="calc_shipping_district"] option')
                            .not(target)
                            .removeAttr("selected");
                    address_2 = target.text();
                    $("input.billing_address_2").attr("value", address_2);
                    district = $('select[name="calc_shipping_district"]').html();
                    localStorage.setItem("district", district);
                    localStorage.setItem("address_2_saved", address_2);
                });
            }
            $('select[name="calc_shipping_provinces"]').each(function () {
                var $this = $(this),
                        stc = "";
                c.forEach(function (i, e) {
                    e += +1;
                    stc += "<option value=" + e + ">" + i + "</option>";
                    $this.html('<option value="">Province</option>' + stc);
                    if ((address_1 = localStorage.getItem("address_1_saved"))) {
                        $('select[name="calc_shipping_provinces"] option').each(
                                function () {
                                    if ($(this).text() == address_1) {
                                        $(this).attr("selected", "");
                                    }
                                }
                        );
                        $("input.billing_address_1").attr("value", address_1);
                    }
                    $this.on("change", function (i) {
                        i = $this.children("option:selected").index() - 1;
                        var str = "",
                                r = $this.val();
                        if (r != "") {
                            arr[i].forEach(function (el) {
                                str += '<option value="' + el + '">' + el + "</option>";
                                $('select[name="calc_shipping_district"]').html(
                                        '<option value="">District</option>' + str
                                        );
                            });
                            var address_1 = $this.children("option:selected").text();
                            var district = $('select[name="calc_shipping_district"]').html();
                            localStorage.setItem("address_1_saved", address_1);
                            localStorage.setItem("district", district);
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
                                        localStorage.setItem("district", district);
                                        localStorage.setItem("address_2_saved", address_2);
                                    }
                            );
                        } else {
                            $('select[name="calc_shipping_district"]').html(
                                    '<option value="">District</option>'
                                    );
                            district = $('select[name="calc_shipping_district"]').html();
                            localStorage.setItem("district", district);
                            localStorage.removeItem("address_1_saved", address_1);
                        }
                    });
                });
            });
        </script>
    </body>
</html>

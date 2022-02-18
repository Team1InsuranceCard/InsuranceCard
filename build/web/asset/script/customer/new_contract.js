/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

//select province and district script
//variable c and arr shown in district.js file (embeded in jsp)
$('select[name="calc_shipping_provinces"]').each(function () {
    var $this = $(this),
            stc = "";
    c.forEach(function (i, e) {
        e += +1;
        stc += "<option value=" + e + ">" + i + "</option>";
        $this.html('<option value="">--Select province--</option>' + stc);
        $this.on("change", function (i) {
            i = $this.children("option:selected").index() - 1;
            var str = "",
                    r = $this.val();
            if (r != "") {
                arr[i].forEach(function (el) {
                    str += '<option value="' + el + '">' + el + "</option>";
                    $('select[name="calc_shipping_district"]').html(
                            '<option value="">--Select district--</option>' + str
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
                $("input.billing_address_1").attr("value", address_1)
            } else {
                $('select[name="calc_shipping_district"]').html(
                        '<option value="">--Select district--</option>'
                        );
                district = $('select[name="calc_shipping_district"]').html();
            }
        });
    });
});

//main script
$(document).ready(function () {
    var startdate = new Date($("#startdate").val());
    //oneday = hour * minute * second * milliseconds
    var oneday = 24 * 60 * 60 * 1000;
    var enddate = $.datepicker.formatDate('yy-mm-dd',
            new Date(startdate.getTime() + 365 * oneday));
    $("#enddate").val(enddate);
})

function calculateEndDate() {
    var startdate = new Date($("#startdate").val());
    //oneday = hour * minute * second * milliseconds
    var oneday = 24 * 60 * 60 * 1000;
    var enddate
    if ($("#select2").val() === "1") {
        enddate = $.datepicker.formatDate('yy-mm-dd',
                new Date(startdate.getTime() + 365 * oneday));
    } else if ($("#select2").val() === "2") {
        enddate = $.datepicker.formatDate('yy-mm-dd',
                new Date(startdate.getTime() + 2 * 365 * oneday));
    } else if ($("#select2").val() === "3") {
        enddate = $.datepicker.formatDate('yy-mm-dd',
                new Date(startdate.getTime() + 3 * 365 * oneday));
    }
    $("#enddate").val(enddate);
}

function fillOwnerInfo(firstName, lastName, personalID) {
    if ($("#chk-1").prop('checked')) {
        $("#txt1").val(firstName + ' ' + lastName);
        $("#txt2").val(personalID);
    } else {
        $("#txt1").val("")
        $("#txt2").val("");
    }
}

function fillDeliveryInfo(firstName, lastName, phone, email, address, province, district) {
    if ($("#chk-2").prop('checked')) {
        $("#txt5").val(firstName + ' ' + lastName);
        $("#txt6").val(phone);
        $("#txt7").val(email);
        $("#txt8").val(address);
        var provinces = $("#province").children();
        for (var i = 1; i < provinces.length; i++) {
            if (provinces[i].innerText === province) {
                $("#province").val(provinces[i].value);
                console.log($("#province").val());
                break;
            }
        }
        //manually trigger a onchange event for province select
        var event = new Event("change");
        document.getElementById("province").dispatchEvent(event);
        
        $("#district").val(district);
        //manually trigger a onchange event for district select
        document.getElementById("district").dispatchEvent(event);
    } else {
        $("#txt5").val("");
        $("#txt6").val("");
        $("#txt7").val("");
        $("#txt8").val("");
        $("#province").val("");
        $("#district").val("");
    }
}
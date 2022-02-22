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

/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

function confirmBox(mess, url) {
    if (confirm(mess)) {
        location.href = url;
    }
}
function calculateEndDate() {
    var startdate = new Date($("#startdate").val());
    //oneday = hour * minute * second * milliseconds
    var oneday = 24 * 60 * 60 * 1000;
    var enddate;
    if ($("#selectContractType").val() === "1") {
        enddate = $.datepicker.formatDate('yy-mm-dd',
                new Date(startdate.getTime() + 365 * oneday));
    } else if ($("#selectContractType").val() === "2") {
        enddate = $.datepicker.formatDate('yy-mm-dd',
                new Date(startdate.getTime() + 2 * 365 * oneday));
    } else if ($("#selectContractType").val() === "3") {
        enddate = $.datepicker.formatDate('yy-mm-dd',
                new Date(startdate.getTime() + 3 * 365 * oneday));
    }
    return enddate;
}

function fillEndDate() {
    $("#enddate").val(calculateEndDate() + " 23:59:59.0");
    $("#endDateSent").val($("#enddate").val());
}

function changePeriod() {
    fillEndDate();
    changeContractFee();
}

function changeContractFee() {
    var productPrice = $("#currentProductPrice").val();
    var contractFee;
    if ($("#selectContractType").val() === "1") {
        contractFee = productPrice;
    } else if ($("#selectContractType").val() === "2") {
        contractFee = productPrice * 2;
    } else if ($("#selectContractType").val() === "3") {
        contractFee = productPrice * 3;
    }

    var formatter = new Intl.NumberFormat('en-US', {
        style: 'currency',
        currency: 'VND',
    });
    var fee = formatter.format(contractFee);

    $("#contractFee").val(fee);
    $("#contractFeeSent").val(contractFee);
}

function changeProduct() {
    var productTitle = document.getElementById("productTitle");
    var productStatus = document.getElementById("productStatus");
    var productPrice = document.getElementById("currentProductPrice");
    var pid = $("#productID").val();
    $.ajax({
        type: "GET",
        data: {id: pid},
        url: "get-product-info",
        success: function (responseJson) {
            if (responseJson.id != null) {
                productPrice.value = responseJson.price;
                productTitle.innerHTML = responseJson.title;
                productStatus.innerHTML = responseJson.statusCode.statusName;
                changeContractFee();
            } else {
                productPrice.value = "0";
                productTitle.text = "";
                productStatus.text = "";
                changeContractFee();
            }
        }
    });
}

function checkCustomerID() {
    var msgSpan = document.getElementById("msgCustomer");
    var txtCustomerName = document.getElementById("txt11");
    var txtCustomerNameHidden = document.getElementById("txt12");
    var cid = $("#txt2").val();
    if (cid.trim() === "") {
        msgSpan.innerHTML = "";
        txtCustomerName.value = "";
    } else {
        $.ajax({
            type: "GET",
            data: {id: cid},
            url: "get-customer-info",
            success: function (responseJson) {
                if (responseJson.account != null) {
                    txtCustomerName.value = responseJson.firstName + " " + responseJson.lastName;
                    txtCustomerNameHidden.value = txtCustomerName.value;
                    msgSpan.innerHTML = "";
                } else {
                    txtCustomerName.value = "";
                    msgSpan.innerHTML = "Customer is not existed or not activated!";
                }
            }
        });
    }
}
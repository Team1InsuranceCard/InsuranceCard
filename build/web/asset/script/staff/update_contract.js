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
    var msgSpan = document.getElementById("msgProduct");
    var productTitle = document.getElementById("productTitle");
    var contractProductTitle = document.getElementById("contractProduct");
    var productStatus = document.getElementById("productStatus");
    var productPrice = document.getElementById("currentProductPrice");
    var btnUpdate = document.getElementById("btnUpdate");
    var pid = $("#productID").val();
    if (pid.trim() === "") {
        msgSpan.innerHTML = "Invalid product ID";
        productTitle.innerHTML = "";
        contractProductTitle.innerHTML = "";
        productStatus.innerHTML = "";
        productPrice.value = "0";
        changeContractFee();
        if (!btnUpdate.classList.contains("btn--disabled"))
            btnUpdate.classList.add("btn--disabled");
        else {
        }
    } else {
        $.ajax({
            type: "GET",
            data: {id: pid},
            url: "get-product-info",
            success: function (responseJson) {
                if (responseJson.id != 0) {
                    productPrice.value = responseJson.price;
                    productTitle.innerHTML = responseJson.title;
                    contractProductTitle.innerHTML = productTitle.innerHTML;
                    productStatus.innerHTML = responseJson.statusCode.statusName;
                    changeContractFee();
                    if (btnUpdate.classList.contains("btn--disabled"))
                        btnUpdate.classList.remove("btn--disabled");
                    else {
                    }
                    msgSpan.innerHTML = "";
                } else {
                    productPrice.value = "0";
                    productTitle.innerHTML = "";
                    contractProductTitle.innerHTML = "";
                    productStatus.innerHTML = "";
                    changeContractFee();
                    if (!btnUpdate.classList.contains("btn--disabled"))
                        btnUpdate.classList.add("btn--disabled");
                    else {
                    }
                    msgSpan.innerHTML = "Product is not existed or not activated!";
                }
            }
        });
    }
}
function checkCustomerID() {
    var msgSpan = document.getElementById("msgCustomer");
    var customerName = document.getElementById("customerName");
    var customerEmail = document.getElementById("customerEmail");
    var customerDob = document.getElementById("customerDob");
    var customerPersonalID = document.getElementById("customerPersonalID");
    var customerPhone = document.getElementById("customerPhone");
    var customerAddress = document.getElementById("customerAddress");
    var btnUpdate = document.getElementById("btnUpdate");

    var cid = $("#customerID").val();
    if (cid.trim() === "") {
        msgSpan.innerHTML = "Invalid customer ID";
        customerName.innerHTML = "";
        customerEmail.innerHTML = "";
        customerDob.innerHTML = "";
        customerPersonalID.innerHTML = "";
        customerPhone.innerHTML = "";
        customerAddress.innerHTML = "";
        if (!btnUpdate.classList.contains("btn--disabled"))
            btnUpdate.classList.add("btn--disabled");
        else {
        }
    } else {
        $.ajax({
            type: "GET",
            data: {id: cid},
            url: "get-customer-info",
            success: function (responseJson) {
                if (responseJson.account != null) {
                    customerName.innerHTML = responseJson.firstName + " " + responseJson.lastName;
                    customerEmail.innerHTML = responseJson.account.email;
                    customerDob.innerHTML = responseJson.dob;
                    customerPersonalID.innerHTML = responseJson.personalID;
                    customerPhone.innerHTML = responseJson.phone;
                    customerAddress.innerHTML = responseJson.address;
                    if (btnUpdate.classList.contains("btn--disabled"))
                        btnUpdate.classList.remove("btn--disabled");
                    else {
                    }
                    msgSpan.innerHTML = "";
                } else {
                    customerName.innerHTML = "";
                    customerEmail.innerHTML = "";
                    customerDob.innerHTML = "";
                    customerPersonalID.innerHTML = "";
                    customerPhone.innerHTML = "";
                    customerAddress.innerHTML = "";
                    if (!btnUpdate.classList.contains("btn--disabled"))
                        btnUpdate.classList.add("btn--disabled");
                    else {
                    }
                    msgSpan.innerHTML = "Customer is not existed or not activated!";
                }
            }
        });
    }
}
/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

function methodClick() {
    var paypalRadio = $("#paypal");
    var cashRadio = $("#cash");
    var paypalDesc = document.getElementById("paypal-desc");
    var cashDesc = document.getElementById("cash-desc");
    var btnCheckout = document.getElementById("btnCheckout");

    if (paypalRadio.prop("checked")) {
        paypalDesc.classList.remove("invisible-row");
        cashDesc.classList.add("invisible-row");
        btnCheckout.value = "PAY";
        btnCheckout.disabled = false;
        if (btnCheckout.classList.contains("btnDisable")) {
            btnCheckout.classList.remove("btnDisable");
        }
    } else if (cashRadio.prop("checked")) {
        paypalDesc.classList.add("invisible-row");
        cashDesc.classList.remove("invisible-row");
        btnCheckout.value = "SAVE";
        btnCheckout.disabled = false;
        if (btnCheckout.classList.contains("btnDisable")) {
            btnCheckout.classList.remove("btnDisable");
        }
    } else {
        btnCheckout.disabled = true;
        if (!btnCheckout.classList.contains("btnDisable")) {
            btnCheckout.classList.add("btnDisable");
        }
        if (!cashDesc.classList.contains("invisible-row"))
            cashDesc.classList.add("invisible-row");
        if (!paypalDesc.classList.contains("invisible-row"))
            paypalDesc.classList.add("invisible-row");
    }
}
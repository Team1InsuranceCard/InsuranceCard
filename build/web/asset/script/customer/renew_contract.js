
function renew() {
    var startDate = document.getElementById("startDate").value;
    var duration = document.getElementById("duration").value;

    if (startDate == "" || duration == "Select year") {
        Swal.fire({
            position: 'top',
            text: "Fill Duration and Start date!",
            icon: 'error',
            showCancelButton: true,
            cancelButtonColor: '#1F74B6',
            cancelButtonText: 'OK',
            showConfirmButton: false
        })
    } else {
        var price = document.getElementById("price").value;
        var fee = duration * price.valueOf();
        Swal.fire({
            position: 'top',
            title: 'Are you sure?',
            text: "Total: " + fee.toString().replace(/(\d)(?=(\d{3})+(?!\d))/g, '$1,') + " VND",
            icon: 'warning',
            showCancelButton: true,
            confirmButtonColor: '#3085d6',
            cancelButtonColor: '#d33',
            confirmButtonText: 'Yes'
        }).then((result) => {
            if (result.isConfirmed) {
                var renew = "renew";
                sessionStorage.setItem("renew", renew);
                document.getElementById("myForm").submit();
            }
        })
    }
}



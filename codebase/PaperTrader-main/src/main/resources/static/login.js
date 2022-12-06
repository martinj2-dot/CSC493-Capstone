$(document).ready(function () {

    $("#submitButton").click(function () {

        let email = $("#emailInput").val()
        let password = $("#passwordInput").val()

        console.log(email)
        console.log(password)

        $.ajax({
            type:"POST",
            url: "/login",
            data: {email: email, password: password},
            success: function (response) {
                console.log(response)
            },
            error: function(error){
                console.log(error)
            }
        });
    });


})
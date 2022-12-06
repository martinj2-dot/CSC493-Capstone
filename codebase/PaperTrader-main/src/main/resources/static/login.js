$(document).ready(function () {

    $("#submitButton").click(function () {
        /**
         * Tied to the Registration modal submission button
         * retrieves submitted email and password to be stored in the database*/

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
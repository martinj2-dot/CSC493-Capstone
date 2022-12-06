$(document).ready(function(){
    $("#investmentSearch").click(function () {
        document.cookie = $('#investment').val().toUpperCase()
        console.log(document.cookie)

    });

})
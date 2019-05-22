/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

//this is where login page handles.. password check process and page loading
//process
$("#sends").click(function () {
    var form = $("#log-forma").serialize();
    $.post("log", form, function (response) {
        if (response === "Manager") {
            $("#result-message").text("PassWord Ok");
            window.location.href = "managerView/managerview.jsp";
        } else if (response === "in") {
            $("#result-message").text("You are Alredy Logedin");
        } else if (response === "Branch Manager") {
            $("#result-message").text("PassWord Ok");
            window.location.href = "branchView/branchheadview.jsp";
        } else if (response === "Employe") {
            $("#result-message").text("PassWord Ok");
            window.location.href = "employeView/employeeview.jsp";
        } else {
            $("#result-message").text("PassWord Wrong");

        }
    });

});




//login out events
$("#outem").click(function () {
    var emid = $("#emid").text();
    $.getJSON("log?id=" + emid + "&pos=em", function (response) {

    });
    window.location.href = "../login.jsp";
});

//
$("#outm").click(function () {
    var mid = $("#mid").text();
    $.getJSON("log?id=" + mid + "&pos=m", function (response) {

    });
    window.location.href = "../login.jsp";
});

////
$("#outbm").click(function () {
    var bmid = $("#bm-id").text();
    $.getJSON("log?id=" + bmid + "&pos=bm", function (response) {

    });
    window.location.href = "../login.jsp";
});





//loging from
$("#cre-new").click(function (){
    $("#log-fo").fadeOut(10);
    $("#new-user").fadeIn(1000);
});
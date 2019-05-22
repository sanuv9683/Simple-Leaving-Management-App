//add a request to the manager from employee
$("#eReqSend").click(function () {
    var se = $("#reqF").serialize();
    $.post("req", se, function (response) {
        alert(response);
    });
});

//wheen the date is change genarate a request message
$("#date").change(function () {
    $("#etext").empty();
    var date = $(this).val();
    var defMessage = "Sir Please Can i Have a Leave on " + date;
    $("#etext").append(defMessage);
});

//genarating req id again and again
function loadID() {
    $.getJSON("reqID", function (response) {
        var a = parseInt(response);
        var tot = a + 1;
        $("#rid").val(tot);
    });
}
loadID();
setInterval("loadID()", 6000);



//load ruest of which i send 
//from my depaerment and employee id
function sendReq() {
    $("#reL").fadeOut(1000);
    $("#reL").empty();
    var id = $("#hid").val();
    var depert = $("#hdepartment").val();
    var url = "?select=my&id=" + id + "&department=" + depert + "";
    $("#reL").fadeIn(1000);
    $.getJSON("req" + url, function (response) {
        var temp = response;
        for (var i in temp) {
            var array = temp[i];
            var idd = array["id"];
            var mes = array["req"];
            var html = "<li><a href=''>" + idd + " : " + mes + " <span class='badge pull-right'>|</span></a></li>";
            $("#reL").append(html);
        }
    });
}
sendReq();
setInterval("sendReq()", 7000);


//load brach managers employees
function loadForBranch() {
    var did = $("#did").text().trim();
    $("#bEm").fadeOut(1000);
    $("#bEm").empty();
    $.getJSON("emp?branch=" + did + "", function (response) {
        $("#bEm").fadeIn(1000);
        var m = response;
        for (var i in m) {
            var array = m[i];
            var id = array['id'];
            var fname = array['firstName'];
            var lName = array['lastSName'];
            var address = array['address'];
            var depart = array['departmet'];
            var email = array['email'];

            var html = "<tr><td>" + id + "</td><td>" + fname + "</td><td>" + lName + "</td><td>" + address + "</td><td>" + depart + "</td><td>" + email + "</td></tr>";
            $("#bEm").append(html);
        }
    });
}
loadForBranch();
setInterval("loadForBranch()", 8000);


//load employees  request for brach managers
function sendReqt() {
    $("#employes-reqs").fadeOut(1000);
    $("#employes-reqs").empty();
    var id = $("#hid").val();
    var depert = $("#hdepartment").val();
    var url = "?select=branch&department=" + depert + "&bm=" + id + "";
    $("#employes-reqs").fadeIn(1000);
    $.getJSON("req" + url, function (response) {
        var p = response;
        for (var i in p) {
            var array = p[i];
            var idd = array["name"];
            var rid = array['id'];
            var mes = array["req"];
            var sd = "<li><a href='mreq?rid=" + rid + "'>" + idd + " : " + mes + " <span class='badge pull-right'>|</span></a></li>";
            $("#employes-reqs").append(sd);
        }


    });

}
sendReqt();
setInterval("sendReqt()", 9000);



//add brach managers request to manger
$("#ReqSends").click(function () {
    var se = $("#reqFs").serialize();
    $.post("mreq", se, function (response) {
        alert(response);
    });
});

//view brach managers request on the manager
function viewManagersR() {
    $("#maner-req").empty();
    $.post("reqID", function (response) {
        var c = response;
        for (var a in c) {
            var arr = c[a];
            var idd = arr['id'];
            var mes = arr['req'];
            var sd = "<li><a href='res?reqID=" + idd + "'>" + idd + " : " + mes + " <span class='badge pull-right'>|</span></a></li>";
            $("#maner-req").append(sd);
        }
    });
}
viewManagersR();
setInterval("viewManagersR()", 9500);



//check for all the responses for employess
function responseChecking() {
    $("#emp-res").empty();
    var id = $("#emid").text();
    var a = {"rid": id};
    $.post("res", a, function (response) {
        var d = response;
        for (var i in d) {
            var arry = d[i];
            var id = arry['id'];
            var to = arry['to'];
            var from = arry['from'];
            var response = arry['response'];
            var sd = "<li><a style='color:green'>" + id + " : " + response + " <i style='color:green' class='fa fa-check pull-right' aria-hidden='true'></i></a></li>";
            $("#emp-res").append(sd);
        }
    });

}
responseChecking();
setInterval("responseChecking()", 8500);


//function for get response for brach managers from manager
function getResponsesFromManagers() {
    var res = $("#bm-id").text();
    $("#bm-res").empty();
    $.getJSON("bmres?rid=" + res + "", function (response) {
        var r = response;
        for (var i in r) {
            var arry = r[i];
            var id = arry.id;
            var to = arry.to;
            var from = arry.from;
            var response = arry.response;
            var sd = "<li><a style='color:green'>" + id + " : " + response + " <i class='fa fa-check pull-right' style='color:green' aria-hidden='true'></i></a></li>";
            $("#bm-res").append(sd);
        }
    });
}
getResponsesFromManagers();
setInterval("getResponsesFromManagers()", 7500);



//employee adding
$("#sing").click(function () {
    var mf = $("#sing-form").serialize();
    $.post("emp", mf, function (response) {
        alert(response);

    });
});

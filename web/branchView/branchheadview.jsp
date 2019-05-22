<%-- 
    Document   : branchHed
    Created on : Jul 16, 2017, 4:19:35 PM
    Author     : Sanu
--%>

<%@page import="lk.ijse.lms.dto.BranchManagerDTO"%>
<%@page import="lk.ijse.lms.dto.ManagerDTO"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <title>Sanu-Leaving-Management-System</title>
        <link href='http://fonts.googleapis.com/css?family=Open+Sans:400,800italic,800,700italic,700,600italic,400italic,600,300italic,300|Oswald:400,300,700' rel='stylesheet' type='text/css'>
        <link href="../css/bootstrap.min.css" rel="stylesheet">
        <link href="../css/font-awesome.min.css" rel="stylesheet">
        <link href="../css/owl.carousel.css" rel="stylesheet">
        <link href="../css/owl.theme.css" rel="stylesheet">
        <link href="../css/owl.transitions.css" rel="stylesheet">
        <link href="../css/style.css" rel="stylesheet">
    </head>
    <body data-spy="scroll" data-target=".main-nav">
        <%
//            if there is no current thread and no user loged in
            if (!session.isNew() && request.getSession().getAttribute("user") != null) {
            } else {
                response.sendRedirect("../login.jsp");
            }
        %>
        <header class="st-navbar">
            <nav class="navbar navbar-default navbar-fixed-top clearfix" role="navigation">
                <div class="container">
                    <div class="navbar-header">
                        <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#sept-main-nav">
                            <span class="sr-only">Toggle navigation</span>
                            <span class="icon-bar"></span>
                            <span class="icon-bar"></span>
                            <span class="icon-bar"></span>
                        </button>
                        <a class="navbar-brand" href="#"><img src="../photos/logo3.png" alt="" class="img-responsive"></a>
                    </div>
                    <div class="collapse navbar-collapse main-nav" id="sept-main-nav">
                        <ul class="nav navbar-nav navbar-right">
                            <li class="active"><a href="#home">Home</a></li>
                            <li><a href="#about">Profile</a></li>
                            <li><a href="#blog">Request</a></li>
                            <li><a href="#service">Departments</a></li>
                            <li><a href="#portfolio">Ofiicers</a></li>
                            <li><a href="#pricing">Employees</a></li>
                            <li><a id="outbm">Logout</a></li>
                        </ul>
                    </div>
                </div>
            </nav>
        </header>
        <!--header is over from here sanu-->


        <!--home section strats from here-->
        <section class="home" id="home" data-stellar-background-ratio="0.4">
            <div class="container">
                <div class="row">
                    <div class="col-md-12">
                        <div class="st-home-unit">
                            <div class="hero-txt">
                                <p class="hero-work">Desinged-By Sanu Vithanage IJSE Galle</p>
                                <h2 class="hero-title">Sanu Leave Manage System</h2>
                                <a href="#" class="btn btn-main btn-lg">Login & Leave</a>
                            </div>

                        </div>
                    </div>
                </div>
            </div>
            <div class="mouse-icon"><div class="wheel"></div></div>
        </section>
        <!--home ends-->

        <!--sanus branch manager from-->
        <section class="contact" id="contact">
            <div class="container">
                <div class="row" style="height: 410px;">
                    <div class="col-md-12">
                        <%            
                            BranchManagerDTO list = (BranchManagerDTO) request.getSession().getAttribute("user");
                            if (list != null) {

                        %> 


                    </div>
                    <div class="container">
                        <div class="row">
                            <div class="col-md-5">
                                <img src="../photos/ghj.png" alt="" class="img-responsive">
                            </div>
                            <div class="col-md-7">
                                <h3 class="bottom-line" style="color: white;font-size: 50px"><%=list.getFirstName() + " "%><%=list.getLastSName()%></h3>
                                <p style="color: white">
                                    Fist Name : <%=list.getFirstName()%><br>
                                    Last Name : <%=list.getLastSName()%><br>
                                    Email : <%=list.getEmail()%><br>
                                    Address : <%=list.getAddress()%><br>
                                    ID : <span id="bm-id"><%=list.getId()%></span><br>
                                    Branch ID :<span id="did"> <%=list.getDepartmet()%></span><br>

                                </p>
                                <a href="#" class="btn btn-main btn-lg">Edit Profile</a>
                            </div>
                        </div>
                    </div>
                    <%
                        }
                    %>
                </div>
            </div>
        </section>

        <!--employee-->
        <section class="pricing" id="pricing">
            <div class="container">
                <div class="row">
                    <div class="col-md-12">
                        <div class="section-title st-center">
                            <h3>My Employees</h3>
                        </div>
                    </div>
                </div>
                <div class="row">
                    <div class="col-md-12">
                        <table class="table table-bordered table-hover table-responsive">
                            <thead>
                                <tr>
                                    <th>Employee ID</th>
                                    <th>First Name</th>
                                    <th>LastName</th>
                                    <th>Department ID</th>
                                    <th>Address</th>
                                    <th>Email</th>
                                </tr>
                            </thead>
                            <tbody id="bEm">
                            </tbody>
                        </table>

                    </div>

                </div>
            </div>
        </section>

        <!--requset of employees-->
        <section class="blog" id="blog">
            <div class="container">
                <div class="row">
                    <div class="col-md-12">
                        <div class="section-title st-center">
                            <p>Leaving Request From Managers</p>
                        </div>
                    </div>
                </div>
                <div class="row" style="height: 450px;">
                    <%            
                        BranchManagerDTO list2 = (BranchManagerDTO) request.getSession().getAttribute("user");
                        if (list != null) {

                    %> 

                    <div class="col-md-6">
                        <div class="widgets">
                            <div class="widget">
                                <h2 class="widget-title">Ruquests I Send</h2>
                                <div class="form-group">
                                    <form id="reqFs">
                                        <!--//hideen fieds-->
                                        <input type="text" id="hid" name="id" value="<%=list2.getId()%>" class="form-control" style="display: none"/>
                                        <input type="text" id="hname" name="name" value="<%=list2.getFirstName() + " "%><%=list2.getLastSName()%>" class="form-control" style="display: none"/>
                                        <input type="text" id="hdepartment" value="<%=list2.getDepartmet()%>" name="department" class="form-control" style="display: none"/>
                                        <label>Select Leave Date :</label>
                                        <div class="form-inline">
                                            <input type="date" id="date" name="date" class="form-control"/>
                                            <label>Req ID :</label>
                                            <input type="text" id="rid" name="rid" class="form-control"/>
                                        </div>
                                        <label>Further Explain :</label>
                                        <textarea type="text" rows="5" id="etext" name="message" class="form-control"></textarea>
                                        <button type="button" id="ReqSends" class="btn btn-primary">Send</button>
                                    </form>
                                </div>
                                <hr>
                                <ul id="reL">
                                </ul>
                            </div>
                        </div>
                    </div>
                    <%                            }

                    %>
                    <div class="col-md-3">
                        <div class="widgets">

                            <div class="widget">
                                <h2 class="widget-title">Request</h2>
                                <ul id="employes-reqs">                
                                </ul>
                            </div>
                        </div>
                    </div>
                    <div class="col-md-3">
                        <div class="widgets">

                            <div class="widget">
                                <h2 class="widget-title">Responses</h2>
                                <ul id="bm-res">
                                    
                                </ul>
                            </div>


                        </div>
                    </div>
                </div>
            </div>
        </section>

       




        <!--Import links-->
        <script src="../js/jquery.min.js"></script>
        <script src="../js/bootstrap.min.js"></script>
        <script src="../js/jquery.easing.min.js"></script>
        <script src="../js/jquery.stellar.js"></script>
        <script src="../js/jquery.appear.js"></script>
        <script src="../js/jquery.nicescroll.min.js"></script>
        <script src="../js/jquery.countTo.js"></script>
        <script src="../js/jquery.shuffle.modernizr.js"></script>
        <script src="../js/jquery.shuffle.js"></script>
        <script src="../js/owl.carousel.js"></script>
        <script src="../js/jquery.ajaxchimp.min.js"></script>
        <script src="../js/script.js"></script>
        <script src="../controllers/managerscipt.js"></script>
        <script src="../controllers/logingscript.js"></script>
    </body>
</html>

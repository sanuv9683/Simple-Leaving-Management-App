<%-- 
    Document   : index
    Created on : Jul 15, 2017, 4:05:12 PM
    Author     : Sanu
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page import="lk.ijse.lms.dto.DepartmentDTO"%>
<%@page import="lk.ijse.lms.dto.ManagerDTO"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <title>Sanu-Leaving-Management-System</title>
        <link href='http://fonts.googleapis.com/css?family=Open+Sans:400,800italic,800,700italic,700,600italic,400italic,600,300italic,300|Oswald:400,300,700' rel='stylesheet' type='text/css'>
        <link href="css/bootstrap.min.css" rel="stylesheet">
        <link href="css/font-awesome.min.css" rel="stylesheet">
        <link href="css/owl.carousel.css" rel="stylesheet">
        <link href="css/owl.theme.css" rel="stylesheet">
        <link href="css/owl.transitions.css" rel="stylesheet">
        <link href="css/style.css" rel="stylesheet">
    </head>
    <body data-spy="scroll" data-target=".main-nav">
        <%
//            if there is no current thread and no user loged in
            if (!session.isNew() && request.getSession().getAttribute("user") != null) {
            } else {
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
                        <a class="navbar-brand" href="#"><img src="photos/logo3.png" alt="" class="img-responsive"></a>
                    </div>
                    <div class="collapse navbar-collapse main-nav" id="sept-main-nav">
                        <ul class="nav navbar-nav navbar-right">
                            <li class="active"><a href="#home">Home</a></li>
                            <li><a href="#about">Profile</a></li>
                            <li><a href="#blog">Request</a></li>
                            <li><a href="#service">Departments</a></li>
                            <li><a href="#portfolio">Ofiicers</a></li>
                            <li><a href="#pricing">Employees</a></li>
                            <li><a href="#contact">Login</a></li>
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

        <!--sanus login from-->
        <section class="contact" id="contact">
            <div class="container">
                <div class="row" style="height: 410px;">
                    <div class="col-md-5" id="log-fo">
                        <div class="" style="margin-top: 100px;">
                            <form class="form-group"  id="log-forma">
                                <input type="text" class="form-control"  name="email" placeholder="Email">
                                <input type="password" class="form-control"  name="password" placeholder="Password">
                                <div class="form-inline">
                                    <select name="pos" class="form-control"  style="width: 30%">
                                        <option>Manager</option>
                                        <option>Branch Manager</option>
                                        <option>Employe</option>
                                    </select>
                                    <button type="button"  class="btn btn-primary"  id="sends"/> <i class="fa fa-paper-plane "></i> Login</button>
                                    <a id="cre-new" class="pull-right">Create new Account</a>                                                                     
                                </div>                               
                            </form>
                        </div>
                        <div id="result-message"  style="color: white;background-color: rgba(13, 16, 10, 0.47);width: 60%" role="alert"></div>
                    </div>
                    <div class="col-md-5 col-sm-12 col-xs-12" style="display:none" id="new-user">
                        <div class="" style="margin-top: 20px;">
                            <form class="form-group"  id="sing-form">
                                <input type="email" class="form-control"  name="email" placeholder="Email">
                                <input type="password" class="form-control"  name="pass" placeholder="Password">
                                <div class="form-inline">        
                                    <input type="text" class="form-control"  name="fname" placeholder="First-Name">
                                    <input type="text" class="form-control pull-right"  name="lname" placeholder="Last-Name">
                                </div>
                                <div class="form-inline">                                 
                                    <input type="text" id="inp" class="form-control"  name="address" placeholder="Address" style="margin-top: 0px;">
                                </div>
                                <select name="department" id="pos-sele" class="form-control" style="margin-bottom: 25px;">


                                    <%-- <%
                                         ArrayList<DepartmentDTO> list2 = (ArrayList<DepartmentDTO>) getServletContext().getAttribute("branch");
                                         if (list2 != null) {
                                             for (int i = 0; i < list2.size(); i++) {
                                                 DepartmentDTO elem = list2.get(i);
                                     %>--%>

                                    <!-- replaced el expressions-->

                                    <c:forEach var="a" items="${branch}">
                                        <option>${a.name}</option>
                                    </c:forEach>                                   

                                    <%--<option><%=elem.getName()%></option>-->
                                    <%--  <%                                }
                                          }
                                      %> --%>
                                </select>
                                <select name="pos" id="" class="form-control" >
                                    <option>Branch Manager</option>
                                    <option>Employe</option>
                                </select>
                            </form>
                            <button type="button"   class="btn btn-primary pull-right"  id="sing"/>SingIn</button>
                        </div>
                        <div id="result-message"  style="color: white;background-color: rgba(13, 16, 10, 0.47);width: 60%" role="alert"></div>
                    </div>
                </div>
            </div>
        </section>



        <!--Import links-->
        <script src="js/jquery.min.js"></script>
        <script src="js/bootstrap.min.js"></script>
        <script src="js/jquery.easing.min.js"></script>
        <script src="js/jquery.stellar.js"></script>
        <script src="js/jquery.appear.js"></script>
        <script src="js/jquery.nicescroll.min.js"></script>
        <script src="js/jquery.countTo.js"></script>
        <script src="js/jquery.shuffle.modernizr.js"></script>
        <script src="js/jquery.shuffle.js"></script>
        <script src="js/owl.carousel.js"></script>
        <script src="js/jquery.ajaxchimp.min.js"></script>
        <script src="js/script.js"></script>
        <script src="controllers/managerscipt.js"></script>
        <script src="controllers/logingscript.js"></script>
    </body>
</html>


<%-- 
    Document   : index
    Created on : Jul 15, 2017, 4:05:12 PM
    Author     : Sanu
--%>


<%@page import="lk.ijse.lms.dto.EmployeeDTO"%>
<%@page import="lk.ijse.lms.dto.BranchManagerDTO"%>
<%@page import="lk.ijse.lms.dto.DepartmentDTO"%>
<%@page import="lk.ijse.lms.dto.ManagerDTO"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
//            if there is a current thread and a user loged in
            if (!session.isNew() && request.getSession().getAttribute("user") != null) {
//                response.sendRedirect("login.jsp");
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
                            <li><a id="outm">Logout</a></li>
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

        <!--sanus manager from-->
        <section class="contact" id="contact">
            <div class="container">
                <div class="row" style="height: 410px;">
                    <div class="col-md-12">
                        <%                            ArrayList<ManagerDTO> list = (ArrayList<ManagerDTO>) getServletContext().getAttribute("manager");
                            if (list != null) {
                                for (ManagerDTO elem : list) {
                        %> 


                    </div>
                    <div class="container">
                        <div class="row">
                            <div class="col-md-5">
                                <img src="../photos/ghj.png" alt="" class="img-responsive">
                            </div>
                            <div class="col-md-7">
                                <h3 class="bottom-line" style="color: white;font-size: 50px"><%=elem.getFirstName() + " "%><%=elem.getLastSName()%></h3>
                                <p style="color: white">
                                    Fist Name : <%=elem.getFirstName()%><br>
                                    Last Name : <%=elem.getLastSName()%><br>
                                    Email : <%=elem.getEmail()%><br>
                                    Address : <%=elem.getAddress()%><br>
                                    ID : <span id="mid"><%=elem.getId()%></span><br>

                                </p>
                                <a href="#" class="btn btn-main btn-lg">Edit Profile</a>
                            </div>
                        </div>
                    </div>
                    <%
                            }
                        }

                    %>
                </div>
            </div>
        </section>

        <!--department section-->
        <section class="service" id="service">
            <div class="container">
                <div class="row" style="height: 450px;">
                    <div class="col-md-12">
                        <div class="section-title st-center">
                            <p>Our Deparments</p>
                        </div>
                        <div class="row">
                            <%-- <%        
                                ArrayList<DepartmentDTO> list2 = (ArrayList<DepartmentDTO>) getServletContext().getAttribute("branch");
                                 if (list2 != null) {
                                     for (int i = 0; i < list2.size(); i++) {
                                         DepartmentDTO elem = list2.get(i);
                            %> --%>
                            <c:forEach var="bran" items="${branch}">
                                <div class="col-md-3">
                                    <div class="st-feature">
                                        <div class="st-feature-icon"><i class="fa fa-university"></i></div>
                                        <strong class="st-feature-title"><%--<%=elem.getName()%>--%></strong>
                                        <p>${bran.name}<br>${bran.bmID}<%--<%=elem.getName()%><br><%=elem.getBmID()%>--%></p>
                                    </div>
                                </div>
                            </c:forEach>
                            <%--   <%                                }
                                   }
                               %>--%>
                        </div>
                    </div>
                </div>
            </div>
        </section>

        <!--oficers-->           
        <section class="about" id="about">
            <div class="container">
                <div class="row">
                    <div class="col-md-12">
                        <div class="section-title st-center">
                            <p>Our Branch Managers</p>
                        </div>

                        <div class="row">
                            <%--   <%         
                                   ArrayList<BranchManagerDTO> bmList = (ArrayList<BranchManagerDTO>) getServletContext().getAttribute("branchm");
                                   if (bmList != null) {
                                       for (BranchManagerDTO elem : bmList) {
                               %> --%>
                            <c:forEach items="${branchm}" var="branM">
                                <div class="col-md-3">
                                    <div class="st-member">
                                        <div class="st-member-img">
                                            <img src="../photos/member1.png" alt="" class="img-responsive">
                                        </div>
                                        <div class="st-member-info">
                                            <strong class="st-member-name" style="font-size: 18px">${branM.firstName}${branM.lastSName}<%--<%= elem.getFirstName()%><%=" " + elem.getLastSName()%>--%></strong>
                                            <p class="st-member-pos">${branM.firstName}<%--<%= elem.getEmail()%>--%></p>
                                            <div class="skills">
                                                <div class="skill">
                                                    <strong>${branM.email}<%--<%= elem.getAddress()%>--%></strong>
                                                    <span>90%</span>
                                                    <div class="progress">
                                                        <div class="progress-bar progress-bar-sept" role="progressbar" aria-valuenow="90" aria-valuemin="0" aria-valuemax="100" style="width: 90%;">
                                                            <span class="sr-only">90% Complete</span>
                                                        </div>
                                                    </div>
                                                </div>
                                                <div class="skill">
                                                    <strong>${branM.departmet}<%--<%= elem.getDepartmet()%>--%></strong>
                                                    <span>70%</span>
                                                    <div class="progress">
                                                        <div class="progress-bar progress-bar-sept" role="progressbar" aria-valuenow="70" aria-valuemin="0" aria-valuemax="100" style="width: 70%;">
                                                            <span class="sr-only">70% Complete</span>
                                                        </div>
                                                    </div>
                                                </div>
                                                <div class="skill">
                                                    <strong>${branM.id}<%--<%= elem.getId()%>--%></strong>
                                                    <span>86%</span>
                                                    <div class="progress">
                                                        <div class="progress-bar progress-bar-sept" role="progressbar" aria-valuenow="86" aria-valuemin="0" aria-valuemax="100" style="width: 86%;">
                                                            <span class="sr-only">86% Complete</span>
                                                        </div>
                                                    </div>
                                                </div>
                                            </div>
                                            <div class="st-member-social">

                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </c:forEach>
                            <%--  <%
                                      }
                                  }
                              %> --%>

                            <!--employees-->









                        </div>

                    </div>
                </div>
            </div>
        </section>

        <!--requset of managers-->
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

                    <div class="col-md-4">
                        <div class="widgets">

                            <div class="widget">
                                <h2 class="widget-title">Ruquests</h2>
                                <ul id="maner-req">

                                </ul>
                            </div>


                        </div>
                    </div>
                </div>
            </div>
        </section>


        <!--employee-->
        <section class="pricing" id="pricing">
            <div class="container">
                <div class="row">
                    <div class="col-md-12">
                        <div class="section-title st-center">
                            <h3>Our Employees</h3>
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
                            <tbody>
                                <%-- <%       
                                     ArrayList<EmployeeDTO> empList = (ArrayList<EmployeeDTO>) getServletContext().getAttribute("emp");
                                     if (empList != null) {
                                         for (EmployeeDTO elem : empList) {
                                 %>--%>
                                <c:forEach items="${emp}" var="em">
                                    <tr>
                                        <td><%--<%=elem.getId()%>--%>${em.id}</td>
                                        <td><%--<%=elem.getFirstName()%>--%>${em.firstName}</td>
                                        <td><%--<%=elem.getLastSName()%>--%>${em.lastSName}</td>
                                        <td><%--<%=elem.getAddress()%>--%>${em.address}</td>
                                        <td><%--<%=elem.getDepartmet()%>--%>${em.departmet}</td>
                                        <td><%--<%=elem.getEmail()%>--%>${em.email}</td>
                                    </tr>
                                    <%-- <%
                                               }
                                           }
                                       %>--%>

                                </c:forEach>
                            </tbody>
                        </table>

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
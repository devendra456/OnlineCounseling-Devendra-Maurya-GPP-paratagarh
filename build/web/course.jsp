<%-- 
    Document   : course
    Created on : Aug 8, 2019, 9:16:58 PM
    Author     : nadir
--%>

<%@page import="java.sql.ResultSet"%>
<%@page import="mypack.ConnectionManager"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Courses</title>
        <link rel="shortcut icon" href="images/download1.png" />
<link href="css/bootstrap.min.css" rel="stylesheet"/>
<link href="css/font-awesome.min.css" rel="stylesheet"/>
<link href="css/hover.css" rel="stylesheet"/>
<script src="js/jquery-2.1.0.min.js"></script>
<script src="js/jquery-3.3.1.min.js"></script>
<script src="js/bootstrap.min.js"></script>
    </head>
    <body>
       <div class="container-fluid">
<div class="row" style="background:#acacac">
<div class="col-sm-1"><img src="images/download1.png" style="height:100px;width:100px;border-radius: 50%;padding:1%" ></div>
<div class="col-sm-10"><center><label class="text text-uppercase" style="font-weight: bolder; padding-top:1%; font-family:'times new roman'; font-size:50px;background:#acacac;color:brown;">Online Counseling Management System</center></label></div>
<div class="col-sm-1"><div class="row"><img src="images/download.png" style="height:100px;width:97px;border-radius: 50%" ></div></div>
</div>
           <div class="row">
<nav class="navbar navbar-default">
 <!-- Collect the nav links, forms, and other content for toggling -->
    <div class="collapse navbar-collapse"  style="background:teal;">
      <ul class="nav navbar-nav" style="font-size:14px;color:white">
        <li ><a href="index.jsp"style="font-size:14px;color:white">Home </a></li>
        <li><a href="course.jsp"style="font-size:14px;color:white">Course</a></li>
		<li><a href="registration.jsp" style="font-size:14px;color:white">Online form</a></li>
		<li><a href="ContactUs.jsp" style="font-size:14px;color:white">Contact Us</a></li>	
                <li><a href="login.jsp" style="font-size:14px;color:white">Login</a> </li>
		
		<li><form class="navbar-form" role="search">
       
          <input type="text" class="form-control" placeholder="You can Search here">
       
        <button type="submit" class="btn btn-default">Submit</button>
      </form>
		</li>
      </ul>
      
    </div><!-- /.navbar-collapse -->
</nav>
           </div>     
           
           <div clas="row" style="margin-top: -21px;background: #e6f7d7;height: 600px;text-align: center; overflow: scroll" >
               <center><h2 style="color:teal">Courses For Students </h2></center>
               <div class="col-sm-1"></div>
                <div class="col-sm-10">
                    <table border="1px" cellspacing="0px" class="table table-striped"width="100%" style="font-size:18px">
                   <tr style="font-size: 20px;background:activecaption">
                       <th style="text-align: center">Collage Code</th>
                       <th style="text-align: center">Collage Name</th>
                       <th style="text-align: center">Course</th>
                       <th style="text-align: center">Year</th>
                   </tr>
                   
                   <%
                        ConnectionManager cm=new ConnectionManager();
                        String command="select * from course ";
                        ResultSet rs=cm.getData(command);
                        while(rs.next())
                        {
                        %>
                        <tr>
                            <td><%=rs.getString(1)%></td>
                            <td><%=rs.getString(2)%></td>
                            <td><%=rs.getString(3)%></td>
                            <td><%=rs.getString(4)%></td>
                        </tr>
                        <%}%>
                    </table> 
                </div>
                      <div class="col-sm-1"></div>
                      
           </div>
           
           
               
    <div class="row" style="min-height: 160px;text-align: center;background: #37474F;color:white;">
        <div class="col-sm-4"><h2>Important Links</h2>
        <div class="row" >
    <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
      <ul class="nav navbar-nav">
       <li style="font-size: 18px;color:white"><a href="#">Feedback</a></li>
       <li style="font-size: 18px;color:white"><a href="#">Language</a></li>
        <li style="font-size: 18px;color:white"><a href="#">About Us</a></li>
        <li style="font-size: 18px;color:white"><a href="#">Site Map</a></li>
         <li style="font-size: 18px;color:white"><a href="#">Help</a></li>
</ul>
    </div>
</div>
        </div>
        <div class="col-sm-4"><h2>Address</h2><br><h4>KOTHAR MANGOLEPUR POST-SAGRA SUNDERPUR <br> DIS.-PRATAPGARH (U.P.)<br> Mob.-: +91 7897430432</h4>
  </div>
        <div class="col-sm-4"><h2>Follow On</h2><br>
        <a href="https://www.facebook.com" class="hvr hvr-pulse"><img src="images/facebook.png" style="height:30px;width:30px"></a>
        &nbsp;  &nbsp;	<a href="https://www.whatsapp.com" class="hvr hvr-pulse"><img src="images/whatsapp.png" style="height:30px;width:30px"></a>
    &nbsp;  &nbsp;    <a href="https://www.twitter.com" class="hvr hvr-pulse"><img src="images/twitter.png" style="height:30px;width:30px"></a>
	 &nbsp;  &nbsp;  	<a href="https://www.youtube.com" class="hvr hvr-pulse"><img src="images/youtube.png" style="height:30px;width:30px"></a>
	 &nbsp;  &nbsp;  	<a href="https://www.instagram.com" class="hvr hvr-pulse"><img src="images/instagram.png" style="height:30px;width:30px"></a>
	 &nbsp;  &nbsp;  	<a href="https://www.google-plus.com" class="hvr hvr-pulse"><img src="images/google-plus.png" style="height:30px;width:30px"></a>       
    </div>
  </div>
    <div class="row"style="text-align: center;background: #37474F;color:white;">
        <span>Created By</span>&nbsp;  &nbsp; <lable style="font-size: 17px">Er. Devendra Maurya</lable>&nbsp;  &nbsp;<lable> &COPY; 2019 Copyright</lable>
    </div>
</div>
    </body>
</html>

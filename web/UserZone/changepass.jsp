<%-- 
    Document   : dasboard
    Created on : Jul 31, 2019, 2:23:04 PM
    Author     : nadir
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Change Password</title>
        <link href="css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
        <link href="css/font-awesome.min.css" rel="stylesheet" type="text/css"/>
        <script src="js/jquery-3.3.1.min.js" type="text/javascript"></script>
        <script src="js/bootstrap.js" type="text/javascript"></script>
        <style>
#h1{
  list-style-type: symbols;
  margin-left:-15px;
  margin-top: -12px;
  padding:0;
  width: 225px;
  background-color:slategrey;
  font-size: 20px;
  text-align: center;
  height: 600px;
  
}

#h2{
  display: block;
  color: #000;
  padding: 8px 16px;
  text-decoration: none;
  color: white;
}

#h3 {
    display: block;
  color: #000;
  padding: 8px 16px;
  text-decoration: none;
  background-color: #4CAF50;
  color: white;
  
}

li a:hover:not(.active) {
  background-color: #555;
  color: white;
}
</style>
    </head>
    <body>
        <%@include file="header.jsp" %>
        <div class="container-fluid">
            <h2 style="text-align:center;color: #0F9E5E;border-bottom: 2px solid">Student Zone (Dashboard)</h2>
            <div class="row" style="min-height: 200px">
                <div class="col-sm-2" style="min-height: 200px">
                    <ul id="h1">
                      <center>  <span style="font-size:38px;color:firebrick;font-family: sans-serif">Menus</span></center><hr>
  <li><a href="dasboard.jsp" id="h2">Home</a></li><hr>
                      <li><a href="registrationsdetails.jsp" id="h2">Registrations Details</a></li><hr>
  <li><a href="submitfee.jsp" id="h2">Submit Fee</a></li><hr>
  <li><a href="Rank.jsp" id="h2">Download Admit Card</a></li><hr>
  
  <li><a href="review.jsp" id="h2">Review</a></li><hr>
  <div class="dropdown">
    <button  data-toggle="dropdown">Settings
    <span class="caret"></span></button>
    <ul class="dropdown-menu" style="font-size:16px;padding:2%; text-align: center;">
      <li><a href="viewprofile.jsp">My Profile</a></li>
      
      <li role="separator" class="divider"></li>
      <li><a href="changepass.jsp">Change Password</a></li>
      <li role="separator" class="divider"></li>
      <li><a href="logout.jsp">LogOut</a></li>
    </ul>
  </div> 
</ul>
                </div>
                <div class="col-sm-10">
                  
                    
                    <div class="row" >
        <h1 style="text-align: center;font-family: serif;color:#006228">Change Password</h1>
        <div class="col-sm-3"></div>
        <form action="../codes/changepasscode.jsp" method="post">
        <div class="col-sm-7 " style="font-size: 23px;font-family: serif;color:#003333;border:2px solid yellowgreen;padding:2%;background:#99c"> 
            <lable> Old Password:</lable>
        <div class="input-group">
            <span class="input-group-addon" id="basic-addon1"><span class="glyphicon glyphicon-lock"></span></span>
  <input type="password" name="oldpass" class="form-control" placeholder="Old Password" aria-describedby="basic-addon1">
</div>
            <br>
            <lable>New Password :</lable>
    <div class="input-group">
            <span class="input-group-addon" id="basic-addon1"><span class="glyphicon glyphicon-lock"></span></span>
  <input type="password" name="newpass"class="form-control" placeholder="New Password" aria-describedby="basic-addon1">
</div>   
            <br>
            <lable>Confirm Password</lable>
       <div class="input-group">
            <span class="input-group-addon" id="basic-addon1"><span class="glyphicon glyphicon-lock"></span></span>
  <input type="password" name="cpass" class="form-control" placeholder="Confirm Password" aria-describedby="basic-addon1">
</div>       
<br>
            <input type="submit" value="Change" class="btn btn-info" style="width:150px;font-size:20px">

        </div>
        </form>
    <div class="col-sm-3"></div>
    </div>
                    
                </div>
            </div>
            <div class="row" style="background: #37474F;height: 10px;margin-top: -9px"></div>
        </div>
        <%@include file="footer.jsp"%>
</body>
</html>


  
                   
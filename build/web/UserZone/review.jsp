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
        <title>Review</title>
        <link href="css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
        <link href="css/font-awesome.min.css" rel="stylesheet" type="text/css"/>
        <script src="js/jquery-3.3.1.min.js" type="text/javascript"></script>
        <script src="js/bootstrap.js" type="text/javascript"></script>
        <script>
    $(document).ready(function(){
        $(".im").click(function(){
            var d=$(this).attr("data");
            $("#hd1").val(d);
            for(var i=1;i<=5;i++)
            {
             if(i<=d)
             {
                $("#img"+i).attr("src","images/golden.jpg") 
             }
             else
             {
               $("#img"+i).attr("src","images/star.png")  
             }
        }
        })
    })
    
</script>
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
                <div class="col-sm-10" style="background: whitesmoke;height: 600px;margin-top: -10px">
                  
                   <form action="../codes/reviewcode.jsp" method="post">
      <div class="col-sm-4" style="background: white;margin-left: 250px;margin-top: 80px;height:400px;width: 600px;border: 1px solid;border-top-left-radius: 50px;border-bottom-right-radius: 50px;padding:3%">
          <label style="margin-left: 140px;font-size: 30px;text-shadow: 1px;"> Please Give Review </label><br>
        <lable style="font-size: 18px;color:#2b6d85"> Name : </lable><input type="text" name="name" placeholder="Enter Name" class="form-control">
      
      <br>
      <a href="#"><img id="img1" src="images/star.png" class="im" data="1" alt="" style="height: 40px;width: 40px"/></a>
      <a href="#"><img id="img2" src="images/star.png" class="im" data="2" alt="" style="height: 40px;width: 40px"/></a>
      <a href="#"><img id="img3" src="images/star.png" class="im" data="3" alt="" style="height: 40px;width: 40px"/></a>
      <a href="#"><img id="img4" src="images/star.png" class="im" data="4" alt="" style="height: 40px;width: 40px"/></a>
      <a href="#"><img id="img5" src="images/star.png" class="im" data="5" alt="" style="height: 40px;width: 40px"/></a><br><br>
     <lable style="font-size: 18px;color:#2b6d85">Mobile No. : </lable><input type="number" name="mobno" placeholder="Enter mobile no." class="form-control"><br>
     <input type="hidden" id="hd1" name="hd1"> 
     &nbsp;  &nbsp;  &nbsp;  &nbsp; <input type="submit" value="submit" class="btn-lg" style="background:green;color:white">
      </div>
  </form> 
                    
                </div>
            </div>
            <div class="row" style="background: #37474F;height: 10px;margin-top: -9px"></div>
        </div>
        <%@include file="footer.jsp"%>
</body>
</html>


  
                   















<html>
<head>
<title>LogIn</title>
<link rel="shortcut icon" href="images/download.png" />
<link href="css/bootstrap.min.css" rel="stylesheet"/>
<link href="css/font-awesome.min.css" rel="stylesheet"/>
<link href="css/hover.css" rel="stylesheet"/>
<script src="js/jquery-2.1.0.min.js"></script>
<script src="js/jquery-3.3.1.min.js"></script>
<script src="js/bootstrap.min.js"></script>

</head>
<body style="background-image:url('images/login.jpg');background-size: cover">
<div class="container-fluid">
<div class="row" style="background:#acacac">
<div class="col-sm-1"><img src="images/download.png" style="height:100px;width:100px;border-radius: 50%;padding:1%" ></div>
<div class="col-sm-10"><center><label class="text text-uppercase" style="font-weight: bolder; padding-top:1%; font-family:'times new roman'; font-size:50px;background: #acacac;color:brown;">Online Counseling Management System</center></label></div>
<div class="col-sm-1"><div class="row"><img src="images/download1.png" style="height:100px;width:97px;border-radius: 50%" ></div></div>
</div>
<div class="row">
<nav class="navbar navbar-default">
 <!-- Collect the nav links, forms, and other content for toggling -->
    <div class="collapse navbar-collapse"  style="background:teal;">
      <ul class="nav navbar-nav" style="font-size:14px;color:white">
        <li ><a href="index.jsp" style="font-size:14px;color:white">Home </a></li>
        <li><a href="course.jsp" style="font-size:14px;color:white">Course</a></li>
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
    <div class="row" >
        <h1 style="text-align: center;font-family: serif;color:#006228"><img src="images/user.png" style="height: 100px;width: 100px;background: white;border-radius: 50%"></h1>
        <div class="col-sm-3"></div>
        <form action="codes/logincode.jsp" method="post">
        <div class="col-sm-6 hvr hvr-back-pulse" style="font-size: 23px;font-family: serif;color:#003333;border:2px solid yellowgreen;padding:2%"> 
            <lable style="color:white"> UserId :</lable>
        <div class="input-group">
            <span class="input-group-addon" id="basic-addon1"><span class="glyphicon glyphicon-user"></span></span>
  <input type="text" name="userid"class="form-control" placeholder="UserId" aria-describedby="basic-addon1">
</div>
            <br>
            <lable style="color:white">Password :</lable>
    <div class="input-group">
            <span class="input-group-addon" id="basic-addon1"><span class="glyphicon glyphicon-lock"></span></span>
  <input type="password" name="pass"class="form-control" placeholder="Password" aria-describedby="basic-addon1">
</div>        
<br>
<input type="submit" value="LogIn" class="btn btn-success" style="width:150px;font-size:20px"> &nbsp; &nbsp;<span style="color:white;font-size:17px;">If you have not user Id </span>&nbsp; &nbsp;<a href="registration.jsp" style="color:white">Register Now</a><br>
<br><a href="#" style="color:white;font-size: 18px">Forgot Password</a>

        </div>
        </form>
    <div class="col-sm-3"></div>
    </div>
    <br>
        <hr>
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
    &nbsp;  &nbsp;  <a href="https://www.twitter.com" class="hvr hvr-pulse"><img src="images/twitter.png" style="height:30px;width:30px"></a>
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
<%@page import="java.sql.ResultSet"%>
<%@page import="mypack.ConnectionManager"%>
<html>
<head>
<title>Online Counseling Management System</title>
<link rel="shortcut icon" href="images/download1.png" />
<link href="css/bootstrap.min.css" rel="stylesheet"/>
<link href="css/font-awesome.min.css" rel="stylesheet"/>
<link href="css/hover.css" rel="stylesheet"/>
<script src="js/jquery-2.1.0.min.js"></script>
<script src="js/jquery-3.3.1.min.js"></script>
<script src="js/bootstrap.min.js"></script>
<!-- Start of  Zendesk Widget script -->
<script id="ze-snippet" src="https://static.zdassets.com/ekr/snippet.js?key=84dd4030-048f-454f-99d8-b55891e868f3"> </script>
<!-- End of  Zendesk Widget script -->
<script>
$(document).ready(function(){$("#btn").trigger("click");})
</script>
<style>
    ul.enlarge{
list-style-type:none; /*remove the bullet point*/
margin-left:0;
}
ul.enlarge li{
display:inline-block; /*places the images in a line*/
position: relative;
z-index: 0; /*resets the stack order of the list items - later we'll increase this*/
margin:10px 40px 0 20px;
}
ul.enlarge img{
background-color:#eae9d4;
padding: 6px;
-webkit-box-shadow: 0 0 6px rgba(132, 132, 132, .75);
-moz-box-shadow: 0 0 6px rgba(132, 132, 132, .75);
box-shadow: 0 0 6px rgba(132, 132, 132, .75);
-webkit-border-radius: 4px; 
-moz-border-radius: 4px; 
border-radius: 4px; 
}
ul.enlarge span{
position:absolute;
left: -9999px;
background-color:#eae9d4;
padding: 10px;
font-family: 'Droid Sans', sans-serif;
font-size:.9em;
text-align: center; 
color: #495a62; 
-webkit-box-shadow: 0 0 20px rgba(0,0,0, .75);
-moz-box-shadow: 0 0 20px rgba(0,0,0, .75);
box-shadow: 0 0 20px rgba(0,0,0, .75);
-webkit-border-radius: 8px; 
-moz-border-radius: 8px; 
border-radius:8px;
}
ul.enlarge li:hover{
z-index: 50;
cursor:pointer;
}
ul.enlarge span img{
padding:2px;
background:#ccc;
}
ul.enlarge li:hover span{ 
top: -300px; /*the distance from the bottom of the thumbnail to the top of the popup image*/
left: -20px; /*distance from the left of the thumbnail to the left of the popup image*/
}
ul.enlarge li:hover:nth-child(2) span{
left: -100px; 
}
ul.enlarge li:hover:nth-child(3) span{
left: -200px; 
}
/**IE Hacks - see http://css3pie.com/ for more info on how to use CS3Pie and to download the latest version**/
ul.enlarge img, ul.enlarge span{
behavior: url(pie/PIE.htc); 
}
body
{
    overflow-x: hidden;
}
</style>
</head>
<body style="background: #FFFCF3">
    <button type="button" class="btn btn-primary btn-lg" data-toggle="modal" data-target="#myModal" id="btn" style="display:none">
  Launch demo modal
</button>

<!-- Modal -->
<div class="modal fade" id="myModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
  <div class="modal-dialog" role="document">
    <div class="modal-content" style="height: 300px;">
      <div class="modal-header" style="background: saddlebrown;color:whitesmoke;border-top-left-radius: 5px;border-top-right-radius: 5px">
        <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
        <h4 class="modal-title" id="myModalLabel" style="font-size: 40px;font-family: serif">Welcome To Our Project</h4>
      </div>
        <div class="modal-body" style="margin-top: -50px;font-size: 35px;color:#1b6d85;text-align: center">
      <br><br>
            Online Counseling Management System
      </div>
      </div>
  </div>
</div>
<div  class="container-fluid">
<div class="row" style="background:#acacac">
<div class="col-sm-1"><img src="images/download1.png" style="background: #acacac ;height:100px;width:100px;border-radius: 50%;padding:1%" ></div>
<div class="col-sm-10"><center><label class="text text-uppercase" style="font-weight: bolder; padding-top:1%; font-family:'times new roman'; font-size:50px;background:#acacac;color:brown;">Online Counseling Management System</center></label></div>
<div class="col-sm-1"><div class="row"><img src="images/download.png" style="height:100px;width:97px;border-radius: 50%" ></div></div>
</div>
<div class="row">
    <div class="col-sm-12" >
<nav class="navbar navbar-default">
    <div class="container-fluid">
        <div class="navbar-header">
            <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#myNavbar" >
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>                        
      </button>
        </div>
    <div class="collapse navbar-collapse" id="myNavbar" style="background:teal">
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
    </div>
    </div>
</nav> 
    </div>
</div> 
 <div class="row">   
<div id="carousel-example-generic" class="carousel slide" data-ride="carousel" style="margin-top:-20px">
  <!-- Indicators -->
  <ol class="carousel-indicators">
    <li data-target="#carousel-example-generic" data-slide-to="0" class="active"></li>
    <li data-target="#carousel-example-generic" data-slide-to="1"></li>
    <li data-target="#carousel-example-generic" data-slide-to="2"></li>
    <li data-target="#carousel-example-generic" data-slide-to="3"></li>
    <li data-target="#carousel-example-generic" data-slide-to="4"></li>
    <li data-target="#carousel-example-generic" data-slide-to="5"></li>
  </ol>

  <!-- Wrapper for slides -->
    <div class="carousel-inner" role="listbox" style="background:#e3f2fd">
    <div class="item active">
      <center><img src="images/slider44.jpg" alt="..." style="height:500px;width:100%"></center>
      <div class="carousel-caption">
        <h1 style="color:red">A.K.T.U. University</h1>
      </div>
    </div>
        <div class="item">
     <center> <img src="images/d.jpg" alt="..." style="height:500px;width:100%"></center>
      <div class="carousel-caption">
        <h1 style="color:red">Our Mentors</h1>
      </div>
    </div>  
    <div class="item">
      <center><img src="images/1.jpg" alt="..." style="height:500px;width:100%"></center>
      <div class="carousel-caption">
        <h1 style="color:red">Govt. Polytechnic Premdhar Patti Pratapgarh </h1>
      </div>
    </div>
        	<div class="item">
     <center> <img src="images/Campus.jpg" alt="..." style="height:500px;width:100%"></center>
      <div class="carousel-caption">
        <h1 style="color:red">Lucknow Polytechnic</h1>
      </div>
    </div> 
<div class="item">
     <center> <img src="images/Training.jpg" alt="..." style="height:500px;width:100%"></center>
      <div class="carousel-caption">
        <h1 style="color:red">Library</h1>
      </div>
    </div>  
<div class="item">
     <center> <img src="images/Student.jpg" alt="..." style="height:500px;width:100%"></center>
      <div class="carousel-caption">
        <h1 style="color:red">STUDENTS</h1>
      </div>
    </div>  	
  </div>
  
  <!-- Controls -->
  <a class="left carousel-control" href="#carousel-example-generic" role="button" data-slide="prev">
    <span class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span>
    <span class="sr-only">Previous</span>
  </a>
  <a class="right carousel-control" href="#carousel-example-generic" role="button" data-slide="next">
    <span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
    <span class="sr-only">Next</span>
  </a>
  </div>
</div>
    <div class="row">
        <div class="col-sm-12" style="background:#fff7dd;border:dashed 1px ">
            <marquee scrolldelay="100" behavior="alternate" direction="left" onmouseover="this.stop();" onmouseout="this.start();"><a href="registration.jsp"><h1> <leble style="color:#843534">Click Here</leble>&nbsp;For The Registration <img src="images/bd.gif" style="height:50px;width:140px"></h1></a></marquee>   
        </div>
    </div>
<div class="row" style="height:400px;">

<div class="col-sm-4" style="text-align: center;"><h1 style="border-bottom: 2px solid; ">Latest News<img src="images/new.jpeg" style="height:40px;width:51px"></h1>
<marquee style="background:#F4FEF3"direction="up" height="315px" scrolldelay="100" onmouseover="this.stop();" onmouseout="this.start();"> 
 <ul style="font-size: 16px">
     
         <%
                        ConnectionManager cm=new ConnectionManager();
                        String command="select * from notification ";
                        String command1="select * from registration order by date limit 5";
                                //"select name from registration limit 5";
                        ResultSet rs=cm.getData(command);
                        ResultSet r=cm.getData(command1);
                        while(rs.next())
                        {
                        %>
                        
                       
                        <span style="color:#3d80ba"> <%=rs.getString(1)%></span><img src="images/new.gif" style="height:30px;width:40px">
                        
                        <hr>
                        <%}%>
 
</ul>
 </marquee>
</div>
<div class="col-sm-8">
<div class="row">
<img src="images/14.jpg"class="img-thumbnail" style="opacity: 0.7;height:395px;width:95%;margin-left: 47px">
</div>
</div>
</div>
   <div class="row"> 
  <div class="col-sm-2"><img src="images/career.jpg" style="padding:1%;border-radius: 100%"></div>
<div class="col-sm-6"><h2 style="font-family: serif"><center>Process For The Counseling.....</center></h2>
<ul style="font-size:18px;margin-left: 100px;margin-top: 20px;color: #200d74">
<li>Registration</li>
<li>LogIn</li>
<li>Fill The Online Form</li>
<li>Make Payment</li>
<li>Get The Admit Card</li>
</ul>
</div>
  <div class="col-sm-4" style="height: 210px"><br>
      
      <lable style="font-family: sans-serif;font-size: 30px">Top Five Registered Students</lable><br>
      <%
         while(r.next())
         {
             %>
         
     
      <li><span style="color:#200d74;font-size: 20px ">
        
              <%=r.getString(1)%></span><br></li></ul>
      
      <%}%>
  </div>  
   </div>
    <div class="row">
        <div class="col-sm-12">
            <h1 style="text-align: center"></h1>
        </div>
    </div>
    <div class="row" style="margin-top:-22px;min-height: 400px;border:px solid;padding:0%">   
        
        <div class="col-sm-12" style="margin-left:100px"> <h2 style="margin-left:450px;margin-top: -10px">Images Gallery</h2>
        <ul class="enlarge">
<li><img src="images/6.jpg" width="200px" height="150px" alt="Dechairs" /><span><img src="images/6.jpg" alt="Deckchairs" width="500px" height="400px"/></span></li>
<li><img src="images/7.jpg" width="200px" height="150px" alt="Blackpool sunset" /><span><img src="images/7.jpg" alt="Blackpool sunset" width="500px" height="400px"/></span></li>
<li><img src="images/10.jpg" width="200px" height="150px" alt="Blackpool pier" /><span><img src="images/10.jpg" alt="Blackpool pier" width="500px" height="400px"/></span></li>
<li><img src="images/ds.jpg" width="200px" height="150px" alt="Blackpool pier" /><span><img src="images/ds.jpg" alt="Blackpool pier" width="500px" height="400px"/></span></li>
<li><img src="images/join.jpg" width="200px" height="150px" alt="Blackpool pier" /><span><img src="images/join.jpg" alt="Blackpool pier" width="500px" height="400px"/></span></li>
<li><img src="images/19.jpg" width="200px" height="150px" alt="Blackpool pier" /><span><img src="images/19.jpg" alt="Blackpool pier" width="500px" height="400px"/></span></li>
<li><img src="images/24.jpg" width="200px" height="150px" alt="Blackpool pier" /><span><img src="images/24.jpg" alt="Blackpool pier" width="500px" height="400px"/></span></li>
<li> <a href="#"style="font-size:22px;margin: inherit"><b>View More</b></a> </li> 
        </ul>
    </div>
       <!-- <div class="col-sm-3"></div>-->
    </div>
    <div class="row" >
        
         </div>
    <div class="row">
        <div class="col-sm-9" style="background: #FCF7E5;height:300px">
            <h2> Documents For The Counseling</h2>
            <ul style="font-size:18px;margin-left: 300px;color: #006228">
                <li> Admit Card.</li>
 <li>Result/Rank Letter.</li>
<li>Class X Certificate and Mark sheet.</li>
<li>Class XII Certificate and Mark sheet.</li>
<li>8 passport sized photographs (Same as the one affixed on the application form)</li>
<li>Seat Allotment letter.</li>
            </ul>
        </div>
        <div class="col-sm-3" >
            <img src="images/Document.jpg" alt="" style="height:300;width:300px">
            </div>
        </div>
    
    <hr>
    <div class="row" style="min-height: 160px;text-align: center;background: #37474F;color:white;">
        <div class="col-sm-4"><h2>Important Links</h2>
        <div class="row" >
    <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
      <ul class="nav navbar-nav">
       <li style="font-size: 18px;color:white"><a href="UserZone/review.jsp">Feedback</a></li>
       <li style="font-size: 18px;color:white"><a href="#">Language</a></li>
        <li style="font-size: 18px;color:white"><a href="#">About Us</a></li>
        <li style="font-size: 18px;color:white"><a href="#">Site Map</a></li>
         <li style="font-size: 18px;color:white"><a href="#">Help</a></li>
</ul>
    </div>
</div>
        </div>
        <div class="col-sm-4"><h2>Address</h2><br><h4>KOTHAR MANGOLEPUR POST-SAGRA SUNDERPUR <br> DIS:-PRATAPGARH (U.P.)<br> Mob.-: +91 7897430432</h4>
  </div>
        <div class="col-sm-4"><h2>Follow On</h2><br>
        <a href="https://www.facebook.com/devender.raurya/" class="hvr hvr-pulse"><img src="images/facebook.png" style="height:30px;width:30px"></a>
        &nbsp;  &nbsp;	<a href=" https://api.whatsapp.com/send?phone=7897430432" class="hvr hvr-pulse"><img src="images/whatsapp.png" style="height:30px;width:30px"></a>
    &nbsp;  &nbsp;    <a href="https://twitter.com/Devendra7897430" class="hvr hvr-pulse"><img src="images/twitter.png" style="height:30px;width:30px"></a>
	 &nbsp;  &nbsp;  	<a href="https://www.youtube.com/channel/UCFaM_Xh0HY4pvoaueM3n9Ng/featured?view_as=subscriber" class="hvr hvr-pulse"><img src="images/youtube.png" style="height:30px;width:30px"></a>
	 &nbsp;  &nbsp;  	<a href="https://www.instagram.com/devendramaurya456/" class="hvr hvr-pulse"><img src="images/instagram.png" style="height:30px;width:30px"></a>
	 &nbsp;  &nbsp;  	<a href="https://www.google-plus.com" class="hvr hvr-pulse"><img src="images/google-plus.png" style="height:30px;width:30px"></a>       
    </div>
  </div>
    <div class="row"style="text-align: center;background: #37474F;color:white;">
        <span>Created By</span>&nbsp;  &nbsp; <lable style="font-size: 17px">Er. Devendra Maurya</lable>&nbsp;  &nbsp;<lable> &COPY; 2020 Copyright</lable>
    </div>
</div>
</body>
</html>
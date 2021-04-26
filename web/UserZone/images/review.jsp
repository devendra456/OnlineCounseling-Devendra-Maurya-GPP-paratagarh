<%-- 
    Document   : review
    Created on : Aug 8, 2019, 1:36:41 PM
    Author     : nadir
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Review</title>
            
<link href="css/bootstrap.min.css" rel="stylesheet"/>
<link href="css/font-awesome.min.css" rel="stylesheet"/>

<script src="js/jquery-2.1.0.min.js"></script>
<script src="js/jquery-3.3.1.min.js"></script>
<script src="js/bootstrap.min.js"></script>
<script>
    $(document).ready(function(){
        $(".im").click(function(){
            var d=$(this).attr("data");
            for(var i=1;i<=d;i++)
            {
                
        }
        })
    })
</script>
    </head>
    <body>
        <form action="#" method="post">
      <div class="col-sm-4" style="height:250px;border: 1px solid;border-top-left-radius: 10%;border-bottom-right-radius: 10%">
          <label style="margin-left: 140px;font-size: 30px;text-shadow: 1px;"> Feedback </label><br>
        <lable style="font-size: 18px;color:#2b6d85"> Name : </lable><input type="text" name="feed" placeholder="Enter Name" class="form-control">
      <lable style="font-size: 18px;color:#2b6d85">Email : </lable><input type="email" name="email" placeholder="Enter Email" class="form-control">
      <br>
      <a href="#"><img src="images/star.png"  alt="" style="height: 40px;width: 40px"class="im" data="1"/></a>
      <a href="#"><img src="images/star.png" class="im" data="2" alt="" style="height: 40px;width: 40px"/></a>
      <a href="#"><img src="images/star.png" class="im" data="3" alt="" style="height: 40px;width: 40px"/></a>
      <a href="#"><img src="images/star.png" class="im" data="4" alt="" style="height: 40px;width: 40px"/></a>
      <a href="#"><img src="images/star.png" class="im" data="5" alt="" style="height: 40px;width: 40px"/></a>
     &nbsp;  &nbsp;  &nbsp;  &nbsp; <input type="submit" value="submit" class="btn-lg">
      </div>
  </form>
    </body>
</html>

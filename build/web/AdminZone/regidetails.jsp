<%-- 
    Document   : dasboard
    Created on : Jul 31, 2019, 2:23:04 PM
    Author     : nadir
--%>
<%@page import="java.sql.ResultSet"%>
<%@page import="mypack.ConnectionManager"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Registration Details</title>
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
  background-color:silver;
  font-size: 20px;
  text-align: center;
  height: 679px;
}

#h2{
  display: block;
  color: #000;
  padding: 8px 16px;
  text-decoration: none;
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
<script>
       $(document).ready(function () {
    $("#posuvnik").click();
});
        </script>
    </head>
    <body>
        <%@include file='../UserZone/header.jsp' %>
        <div class="container-fluid">
            <div class="row" style="background:#c1e2b3"> <span style="margin-left: 500px;color: #0F9E5E;font-family: sans-serif;font-size: 40px;text-decoration-color: #555;text-shadow: 2px 2px 9px">Welcome To Admin Zone</span></div>
            <div class="row"style="height:2px;background: teal"></div>
            <div class="row" style="min-height:100%;margin-top: -9px">
                <div class="col-sm-2">
                    <ul id="h1">
                        <h2>Menus</h2><hr>
  <li><a href="regidetails.jsp" onclick="setPosuvnik(1)">Registration Details</a></li><hr>
  <li><a href="admitcard.jsp" onclick="setPosuvnik(2)">Admit Card</a></li><hr>
  <li><a href="courses.jsp" onclick="setPosuvnik(3)">Courses</a></li><hr>
  <li><a href="notification.jsp" onclick="setPosuvnik(4)">Notification</a></li><hr>
  <li><a href="enquirymgmt.jsp" onclick="setPosuvnik(5)">Enquiry MGMT</a></li><hr>
  <li><a href="reveiwmgmt.jsp" onclick="setPosuvnik(6)">Review MGMT</a></li><hr>
  <li><a href="smsmgmt.jsp" onclick="setPosuvnik(7)">Send SMS MGMT</a></li><hr>
  <li><a href="feemgmt.jsp" onclick="setPosuvnik(8)">Fees MGMT</a></li><hr>
  <div class="dropdown">
    <button  data-toggle="dropdown">Settings
    <span class="caret"></span></button>
    <ul class="dropdown-menu" style="font-size:16px;padding:2%; text-align: center;">
      
      <li><a href="changepass.jsp" onclick="setPosuvnik(11)">Change Password</a></li>
      <li role="separator" class="divider"></li>
      <li><a href="logout.jsp" onclick="setPosuvnik(12)">LogOut</a></li>
    </ul>
  </div>
</ul>
                </div>
                <div class="col-sm-10" style="margin-top: 10px;height: 600px;overflow: scroll">
                     <br>
              <div class="row" style="text-align:center;font-size: 35px;font-family: monospace"><b>Registration Details</b></div> 
                    <br><table class="table-striped" border="1px" cellspacing="0" width="100%" style="text-align:center;font-size: 16px">
                        <tr style="font-size: 18px;background: activecaption">
                            <th style="text-align:center">Name</th>
                       <th style="text-align:center">Father Name</th>
                       <th style="text-align:center">Gender</th>
                       <th style="text-align:center">Mobile No.</th>
                       <th style="text-align:center">Email</th>
                        <th style="text-align:center">Picture</th>
                        <th style="text-align:center">Address</th>
                        <th style="text-align:center">Registration Date</th>
                       <th style="text-align:center">Delete Record</th>
                        </tr>
                    <%
                ConnectionManager cm=new ConnectionManager();
                String command="select * from registration";
                ResultSet rs=cm.getData(command);
                while(rs.next())
                { 
                %>
                <tr>
                    <td><%=rs.getString(1)%></td>
                    <td><%=rs.getString(2)%></td>
                    <td><%=rs.getString(3)%></td>
                    <td><%=rs.getString(4)%></td>
                    <td><%=rs.getString(5)%></td>
                    <td><img src="../userpics/<%=rs.getString(7)%>" height="60px" width="50px"</td>
                    <td><%=rs.getString(8)%></td>
                    <td><%=rs.getString(9)%></td>
                    <td><a href="../codes/deleteusers.jsp?del=<%=rs.getString(5)%>"><span title="click here to delete user" class="fa fa-trash-o" style="font-size:18px;color:red"></span></a></td>
                </tr>
                
                <%}%>
                    </table>
                </div>
            </div>
                    
                </div>
            </div>
            
        </div>
        <%@include file='adminfooter.jsp' %>
    </body>
</html>


  
                   
































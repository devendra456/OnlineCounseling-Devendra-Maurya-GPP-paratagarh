<%@page import="mypack.ConnectionManager"%>
<%
String name=request.getParameter("name");
String email=request.getParameter("email");
String mobile=request.getParameter("mob");
String msg=request.getParameter("msg");
String command="insert into enquiry values('"+name+"','"+email+"','"+mobile+"','"+msg+"')";
ConnectionManager cm=new ConnectionManager();
boolean x=cm.ExecuteInsertUpdateOrDelete(command);
if(x==true)
    out.print("record saved");
else
    out.print("record not saved");


%>
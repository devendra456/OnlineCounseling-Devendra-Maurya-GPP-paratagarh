<%@page import="mypack.ConnectionManager"%>
<%
String msg=request.getParameter("noti");
String command="insert into notification values('"+msg+"')";
ConnectionManager cm=new ConnectionManager();
boolean x=cm.ExecuteInsertUpdateOrDelete(command);
if(x==true)
    out.print("<script>alert('notification saved');window.location.href='../AdminZone/notification.jsp'</script>");
else
    out.print("<script>alert('notification not saved');window.location.href='../AdminZone/notification.jsp'</script>");


%>
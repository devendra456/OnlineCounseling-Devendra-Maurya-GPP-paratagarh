<%@page import="mypack.ConnectionManager"%>
<%
String name=request.getParameter("name");
String star=request.getParameter("hd1");
String mobile=request.getParameter("mobno");
String command="insert into review values('"+name+"','"+star+"','"+mobile+"')";
ConnectionManager cm=new ConnectionManager();
if(cm.ExecuteInsertUpdateOrDelete(command))
{
out.print("<script>alert('Thanks for Review');window.location.href='../UserZone/review.jsp'</script>");
}
else
{
out.print("<script>alert('your review is not submitted');window.location.href='../UserZone/review.jsp'</script>");
}

%>
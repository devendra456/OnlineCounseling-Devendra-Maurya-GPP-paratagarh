<%@page import="mypack.ConnectionManager"%>
<%
String mob=request.getParameter("d");
String command="delete from enquiry where mob='"+mob+"'";
ConnectionManager cm=new ConnectionManager();
if(cm.ExecuteInsertUpdateOrDelete(command))
{
out.print("<script>alert('this enquiry data is delete from database');window.location.href='../AdminZone/enquirymgmt.jsp'</script>");
}
else
{
out.print("<script>alert('this enquiry data is not delete from database');window.location.href='../AdminZone/enquirymgmt.jsp'</script>");
}
%>
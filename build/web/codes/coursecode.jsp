<%@page import="mypack.ConnectionManager"%>
<%
String code=request.getParameter("code");
String name=request.getParameter("name");
String course=request.getParameter("course");
String year=request.getParameter("year");
String command="insert into course values('"+code+"','"+name+"','"+course+"','"+year+"')";
ConnectionManager cm=new ConnectionManager();
boolean x=cm.ExecuteInsertUpdateOrDelete(command);
if(x==true)
    out.print("<script>alert('course Added');window.location.href='../AdminZone/courses.jsp'</script>");
else
    out.print("<script>alert('Course  not Added');window.location.href='../AdminZone/courses.jsp'</script>");


%>
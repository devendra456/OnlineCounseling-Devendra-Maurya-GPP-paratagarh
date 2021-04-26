<%@page import="mypack.ConnectionManager"%>
<%
String name=request.getParameter("name");
String course=request.getParameter("course");
String branch=request.getParameter("branch");
String year=request.getParameter("year");
String fees="500";
String command="insert into  submitfee values('"+name+"','"+course+"','"+branch+"','"+year+"','"+fees+"')";
ConnectionManager cm=new ConnectionManager();
boolean x=cm.ExecuteInsertUpdateOrDelete(command);
if(x==true)
    out.print("<script>alert('Your Payment Submited Successfully');window.location.href='../UserZone/submitfee.jsp'</script>");
else
    out.print("<script>alert('Transaction failed');window.location.href='../UserZone/submitfee.jsp'</script>");


%>
<%@page import="java.lang.String"%>
<%@page import="mypack.EncryptionManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="mypack.ConnectionManager"%>
<%
ConnectionManager cm=new ConnectionManager();
    String uid=request.getParameter("userid");
String passwd=request.getParameter("pass");
EncryptionManager em=new EncryptionManager();
String Encryptpass=em.encryptData(passwd);
String command="select * from login where email ='"+uid+"' and pass ='"+Encryptpass+"'";
ResultSet rs=cm.getData(command);
if(rs.next())
{
String email=rs.getString(1);
String pass=rs.getString(2);
String utype=rs.getString(3);
if(email.equals(uid)&&utype.equals("user"))
{
    session.setAttribute("userid", uid);
out.print("<script>alert('welcome to next zone');window.location.href='../UserZone/dasboard.jsp'</script>");
}
else if(email.equals(uid)&&utype.equals("admin"))
{
    session.setAttribute("aid", email);
out.print("<script>alert('welcome to admin zone');window.location.href='../AdminZone/dashboard.jsp'</script>");
}
}
else
{
out.print("<script>alert('Invalid User Id Or password');window.location.href='../login.jsp'</script>");
}
%>
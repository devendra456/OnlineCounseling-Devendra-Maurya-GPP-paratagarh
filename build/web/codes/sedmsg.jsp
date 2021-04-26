<%@page import="mypack.SMSSender"%>
<%
String mobile=request.getParameter("mobile");
String message=request.getParameter("message");
SMSSender ss=new SMSSender();
boolean x=ss.SendSms(mobile, message);
if(x==true)
{
out.print("<script>alert('message send successfully');window.location.href='../UserZone/message.jsp'</script>");
}
else
{
out.print("<script>alert('message not send');window.location.href='../UserZone/message.jsp'</script>");
}
%>
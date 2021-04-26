<%@page import="mypack.EncryptionManager"%>
<%@page import="mypack.ConnectionManager"%>
<%
    String oldpass=request.getParameter("oldpass");
    String newpass=request.getParameter("newpass");
    String cpass=request.getParameter("cpass");
    ConnectionManager cm=new ConnectionManager();
    EncryptionManager em=new EncryptionManager();
    if(newpass.equals(cpass))
    {
        String emai=session.getAttribute("userid").toString();
    String command="update login set pass='"+em.encryptData(newpass)+"' where email='"+emai+"'";
    boolean x=cm.ExecuteInsertUpdateOrDelete(command);
    if(x)
    {
    out.print("<script>alert('Your Password Changed');window.location.href='../login.jsp'</script>");    
    }
    else
    {
    out.print("<script>alert('Your Password is not Changed');window.location.href='../UserZone/changepass.jsp'</script>");    
    }
    }
    else
    {
    out.print("<script>alert('Please Confirm Password');window.location.href='../UserZone/changepass.jsp'</script>");
    }
    
%>        
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mypack;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.nio.file.Files;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;
import javax.servlet.annotation.MultipartConfig;
/**
 *
 * @author pawan
 */@MultipartConfig
@WebServlet(name = "registration", urlPatterns = {"/registration"})
public class registration extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet registration</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Welcome into servlet</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       String name=request.getParameter("name");
        String fatherName=request.getParameter("fatherName");
       String gender=request.getParameter("gender");
       String checkGender="";
       if(gender.equals("Male"))
       { checkGender="Male";}
       else
       {checkGender="Female";}
       String mobile=request.getParameter("mob");
       String email=request.getParameter("email");
       String passwd=request.getParameter("pass");
       Part file=request.getPart("profile");
       String fileName=file.getSubmittedFileName();
      InputStream is = file.getInputStream();
      File f=new File(request.getRealPath("/userpics"),email+fileName);
      Files.copy(is,f.toPath());
      EncryptionManager em=new EncryptionManager();
      String encryptPass = em.encryptData(passwd);
      String address=request.getParameter("address");
      java.util.Date dt=new java.util.Date();
      String captcha=request.getParameter("hdn1");
      String ConfirmCaptcha=request.getParameter("cc1");
      PrintWriter out=response.getWriter();
      if(captcha.equals(ConfirmCaptcha))
      {
String command1="insert into registration values('"+name+"','"+fatherName+"','"+checkGender+"','"+mobile+"','"+email+"','"+encryptPass+"','"+email+fileName+"','"+address+"','"+dt.toString()+"')";     
String command2="insert into login values('"+email+"','"+encryptPass+"','user')";
ConnectionManager cm=new ConnectionManager();

if(cm.ExecuteInsertUpdateOrDelete(command1))
{
if(cm.ExecuteInsertUpdateOrDelete(command2))
{
    out.print("<script>alert('your registration successfully');window.location.href='login.jsp'</script>");
    
}
}
else 
{
out.print("<script>alert('your registration not Compiled');window.location.href='registration.jsp'</script>");
}
    }
      else
      {
         out.print("<script>alert('invalid captcha');window.location.href='registration.jsp'</script>");
      }
 }
    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}

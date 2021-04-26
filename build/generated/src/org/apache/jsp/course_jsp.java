package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import mypack.ConnectionManager;

public final class course_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Courses</title>\n");
      out.write("        <link rel=\"shortcut icon\" href=\"images/download1.png\" />\n");
      out.write("<link href=\"css/bootstrap.min.css\" rel=\"stylesheet\"/>\n");
      out.write("<link href=\"css/font-awesome.min.css\" rel=\"stylesheet\"/>\n");
      out.write("<link href=\"css/hover.css\" rel=\"stylesheet\"/>\n");
      out.write("<script src=\"js/jquery-2.1.0.min.js\"></script>\n");
      out.write("<script src=\"js/jquery-3.3.1.min.js\"></script>\n");
      out.write("<script src=\"js/bootstrap.min.js\"></script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("       <div class=\"container-fluid\">\n");
      out.write("<div class=\"row\" style=\"background:#acacac\">\n");
      out.write("<div class=\"col-sm-1\"><img src=\"images/download1.png\" style=\"height:100px;width:100px;border-radius: 50%;padding:1%\" ></div>\n");
      out.write("<div class=\"col-sm-10\"><center><label class=\"text text-uppercase\" style=\"font-weight: bolder; padding-top:1%; font-family:'times new roman'; font-size:50px;background:#acacac;color:brown;\">Online Counseling Management System</center></label></div>\n");
      out.write("<div class=\"col-sm-1\"><img src=\"images/download.png\" style=\"height:100px;width:97px;border-radius: 50%\" ></div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<nav class=\"navbar navbar-default\">\n");
      out.write(" <!-- Collect the nav links, forms, and other content for toggling -->\n");
      out.write("    <div class=\"collapse navbar-collapse\"  style=\"background:teal;\">\n");
      out.write("      <ul class=\"nav navbar-nav\" style=\"font-size:14px;color:white\">\n");
      out.write("        <li ><a href=\"index.jsp\"style=\"font-size:14px;color:white\">Home </a></li>\n");
      out.write("        <li><a href=\"course.jsp\"style=\"font-size:14px;color:white\">Course</a></li>\n");
      out.write("\t\t<li><a href=\"registration.jsp\" style=\"font-size:14px;color:white\">Online form</a></li>\n");
      out.write("\t\t<li><a href=\"ContactUs.jsp\" style=\"font-size:14px;color:white\">Contact Us</a></li>\t\n");
      out.write("                <li><a href=\"login.jsp\" style=\"font-size:14px;color:white\">Login</a> </li>\n");
      out.write("\t\t\n");
      out.write("\t\t<li><form class=\"navbar-form\" role=\"search\">\n");
      out.write("       \n");
      out.write("          <input type=\"text\" class=\"form-control\" placeholder=\"You can Search here\">\n");
      out.write("       \n");
      out.write("        <button type=\"submit\" class=\"btn btn-default\">Submit</button>\n");
      out.write("      </form>\n");
      out.write("\t\t</li>\n");
      out.write("      </ul>\n");
      out.write("      \n");
      out.write("    </div><!-- /.navbar-collapse -->\n");
      out.write("</nav>\n");
      out.write("         \n");
      out.write("           \n");
      out.write("           <div clas=\"row\" style=\"margin-top: -21px;background: #e6f7d7;height: 600px;text-align: center; overflow: scroll\" >\n");
      out.write("               <center><h2 style=\"color:teal\">Courses For Students </h2></center>\n");
      out.write("               <div class=\"col-sm-1\"></div>\n");
      out.write("                <div class=\"col-sm-10\">\n");
      out.write("                    <table border=\"1px\" cellspacing=\"0px\" class=\"table table-striped\"width=\"100%\" style=\"font-size:18px\">\n");
      out.write("                   <tr style=\"font-size: 20px;background:activecaption\">\n");
      out.write("                       <th style=\"text-align: center\">Collage Code</th>\n");
      out.write("                       <th style=\"text-align: center\">Collage Name</th>\n");
      out.write("                       <th style=\"text-align: center\">Course</th>\n");
      out.write("                       <th style=\"text-align: center\">Year</th>\n");
      out.write("                   </tr>\n");
      out.write("                   \n");
      out.write("                   ");

                        ConnectionManager cm=new ConnectionManager();
                        String command="select * from course ";
                        ResultSet rs=cm.getData(command);
                        while(rs.next())
                        {
                        
      out.write("\n");
      out.write("                        <tr>\n");
      out.write("                            <td>");
      out.print(rs.getString(1));
      out.write("</td>\n");
      out.write("                            <td>");
      out.print(rs.getString(2));
      out.write("</td>\n");
      out.write("                            <td>");
      out.print(rs.getString(3));
      out.write("</td>\n");
      out.write("                            <td>");
      out.print(rs.getString(4));
      out.write("</td>\n");
      out.write("                        </tr>\n");
      out.write("                        ");
}
      out.write("\n");
      out.write("                    </table> \n");
      out.write("                </div>\n");
      out.write("                      <div class=\"col-sm-1\"></div>\n");
      out.write("                      \n");
      out.write("           </div>\n");
      out.write("           \n");
      out.write("           \n");
      out.write("               \n");
      out.write("    <div class=\"row\" style=\"min-height: 160px;text-align: center;background: #37474F;color:white;\">\n");
      out.write("        <div class=\"col-sm-4\"><h2>Important Links</h2>\n");
      out.write("        <div class=\"row\" >\n");
      out.write("    <div class=\"collapse navbar-collapse\" id=\"bs-example-navbar-collapse-1\">\n");
      out.write("      <ul class=\"nav navbar-nav\">\n");
      out.write("       <li style=\"font-size: 18px;color:white\"><a href=\"#\">Feedback</a></li>\n");
      out.write("       <li style=\"font-size: 18px;color:white\"><a href=\"#\">Language</a></li>\n");
      out.write("        <li style=\"font-size: 18px;color:white\"><a href=\"#\">About Us</a></li>\n");
      out.write("        <li style=\"font-size: 18px;color:white\"><a href=\"#\">Site Map</a></li>\n");
      out.write("         <li style=\"font-size: 18px;color:white\"><a href=\"#\">Help</a></li>\n");
      out.write("</ul>\n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"col-sm-4\"><h2>Address</h2><br><h4>KOTHAR MANGOLEPUR POST-SAGRA SUNDERPUR <br> DIS.-PRATAPGARH (U.P.)<br> Mob.-: +91 7897430432</h4>\n");
      out.write("  </div>\n");
      out.write("        <div class=\"col-sm-4\"><h2>Follow On</h2><br>\n");
      out.write("        <a href=\"https://www.facebook.com\" class=\"hvr hvr-pulse\"><img src=\"images/facebook.png\" style=\"height:30px;width:30px\"></a>\n");
      out.write("        &nbsp;  &nbsp;\t<a href=\"https://www.whatsapp.com\" class=\"hvr hvr-pulse\"><img src=\"images/whatsapp.png\" style=\"height:30px;width:30px\"></a>\n");
      out.write("    &nbsp;  &nbsp;    <a href=\"https://www.twitter.com\" class=\"hvr hvr-pulse\"><img src=\"images/twitter.png\" style=\"height:30px;width:30px\"></a>\n");
      out.write("\t &nbsp;  &nbsp;  \t<a href=\"https://www.youtube.com\" class=\"hvr hvr-pulse\"><img src=\"images/youtube.png\" style=\"height:30px;width:30px\"></a>\n");
      out.write("\t &nbsp;  &nbsp;  \t<a href=\"https://www.instagram.com\" class=\"hvr hvr-pulse\"><img src=\"images/instagram.png\" style=\"height:30px;width:30px\"></a>\n");
      out.write("\t &nbsp;  &nbsp;  \t<a href=\"https://www.google-plus.com\" class=\"hvr hvr-pulse\"><img src=\"images/google-plus.png\" style=\"height:30px;width:30px\"></a>       \n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("    <div class=\"row\"style=\"text-align: center;background: #37474F;color:white;\">\n");
      out.write("        <span>Created By</span>&nbsp;  &nbsp; <lable style=\"font-size: 17px\">Er. Devendra Maurya</lable>&nbsp;  &nbsp;<lable> &COPY; 2019 Copyright</lable>\n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}

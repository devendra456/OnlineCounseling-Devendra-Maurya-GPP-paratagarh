package org.apache.jsp.UserZone;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class dasboard_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/UserZone/header.jsp");
    _jspx_dependants.add("/UserZone/footer.jsp");
  }

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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Dashboard</title>\n");
      out.write("        <link href=\"css/bootstrap.min.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <link href=\"css/font-awesome.min.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <script src=\"js/jquery-3.3.1.min.js\" type=\"text/javascript\"></script>\n");
      out.write("        <script src=\"js/bootstrap.js\" type=\"text/javascript\"></script>\n");
      out.write("        <style>\n");
      out.write("#h1{\n");
      out.write("  list-style-type: symbols;\n");
      out.write("  margin-left:-15px;\n");
      out.write("  margin-top: -12px;\n");
      out.write("  padding:0;\n");
      out.write("  width: 225px;\n");
      out.write("  background-color:slategrey;\n");
      out.write("  font-size: 20px;\n");
      out.write("  text-align: center;\n");
      out.write("  height: 600px;\n");
      out.write("  \n");
      out.write("}\n");
      out.write("\n");
      out.write("#h2{\n");
      out.write("  display: block;\n");
      out.write("  color: #000;\n");
      out.write("  padding: 8px 16px;\n");
      out.write("  text-decoration: none;\n");
      out.write("  color: white;\n");
      out.write("}\n");
      out.write("\n");
      out.write("#h3 {\n");
      out.write("    display: block;\n");
      out.write("  color: #000;\n");
      out.write("  padding: 8px 16px;\n");
      out.write("  text-decoration: none;\n");
      out.write("  background-color: #4CAF50;\n");
      out.write("  color: white;\n");
      out.write("  \n");
      out.write("}\n");
      out.write("\n");
      out.write("li a:hover:not(.active) {\n");
      out.write("  background-color: #555;\n");
      out.write("  color: white;\n");
      out.write("}\n");
      out.write("</style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>header Page</title>\n");
      out.write("        <link rel=\"shortcut icon\" href=\"images/download.png\" />\n");
      out.write("        <link href=\"css/bootstrap.min.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <link href=\"css/font-awesome.min.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <link href=\"css/hover.css\" rel=\"stylesheet\"/>\n");
      out.write("        <script src=\"js/jquery-3.3.1.min.js\" type=\"text/javascript\"></script>\n");
      out.write("        <script src=\"js/bootstrap.js\" type=\"text/javascript\"></script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"container-fluid\">\n");
      out.write("            <div class=\"row\" style=\"background:#acacac\">\n");
      out.write("<div class=\"col-sm-1\"><img src=\"images/download.png\" style=\"height:100px;width:100px;border-radius: 50%;padding:1%\" ></div>\n");
      out.write("<div class=\"col-sm-10\"><center><label class=\"text text-uppercase\" style=\"font-weight: bolder; padding-top:1%; font-family:'times new roman'; font-size:50px;background:#acacac;color:brown;\">Online Counseling Management System</center></label></div>\n");
      out.write("<div class=\"col-sm-1\"><img src=\"images/download1.png\" style=\"height:100px;width:97px;border-radius: 50%\" ></div>\n");
      out.write("</div>\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("        <div class=\"container-fluid\">\n");
      out.write("            <h2 style=\"text-align:center;color: #0F9E5E;border-bottom: 2px solid\">Student Zone (Dashboard)</h2>\n");
      out.write("            <div class=\"row\" >\n");
      out.write("                <div class=\"col-sm-2\">\n");
      out.write("                    <ul id=\"h1\">\n");
      out.write("       <center>  <span style=\"font-size:38px;color:firebrick;font-family: sans-serif\">Menus</span></center><hr>\n");
      out.write("  <li><a href=\"dasboard.jsp\" id=\"h2\">Home</a></li><hr>\n");
      out.write("       <li><a href=\"registrationsdetails.jsp\" id=\"h2\">Registrations Details</a></li><hr>\n");
      out.write("  <li><a href=\"submitfee.jsp\" id=\"h2\">Submit Fee</a></li><hr>\n");
      out.write("  <li><a href=\"Rank.jsp\" id=\"h2\">Download Admit Card</a></li><hr>\n");
      out.write("  \n");
      out.write("  <li><a href=\"review.jsp\" id=\"h2\">Review</a></li><hr>\n");
      out.write("  <div class=\"dropdown\">\n");
      out.write("    <button  data-toggle=\"dropdown\">Settings\n");
      out.write("    <span class=\"caret\"></span></button>\n");
      out.write("    <ul class=\"dropdown-menu\" style=\"font-size:16px;padding:2%; text-align: center;\">\n");
      out.write("      <li><a href=\"viewprofile.jsp\">My Profile</a></li>\n");
      out.write("      <li role=\"separator\" class=\"divider\"></li>\n");
      out.write("      <li><a href=\"changepass.jsp\">Change Password</a></li>\n");
      out.write("      <li role=\"separator\" class=\"divider\"></li>\n");
      out.write("      <li><a href=\"logout.jsp\">LogOut</a></li>\n");
      out.write("    </ul>\n");
      out.write("  </div>\n");
      out.write("</ul>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-sm-10\">\n");
      out.write("                  \n");
      out.write("                               <div class=\"row\" style=\"text-align: center\">\n");
      out.write("                <div class=\"col-sm-12\">\n");
      out.write("                    <div class=\"col-sm-4\">\n");
      out.write("                        <a href=\"#\"><span  class=\"fa fa-home\"style=\"font-size: 100px;margin:40px\"></span></a>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-sm-4\">\n");
      out.write("                        <a href=\"#\"><span  class=\"fa fa-users\"style=\"font-size: 100px;margin:40px\"></span></a>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-sm-4\">\n");
      out.write("                        <a href=\"#\">  <span  class=\"fa fa-cogs\"style=\"font-size: 100px;margin:40px\"></span></a>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>     \n");
      out.write("                <div class=\"row\" style=\"text-align: center\">\n");
      out.write("                <div class=\"col-sm-12\">\n");
      out.write("                    <div class=\"col-sm-4\">\n");
      out.write("                        <a href=\"#\"><span  class=\"fa fa-desktop\"style=\"font-size: 100px;margin:40px\"></span></a>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-sm-4\">\n");
      out.write("                        <a href=\"#\"><span  class=\"fa fa-google-plus\"style=\"font-size: 100px;margin:40px\"></span></a>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-sm-4\">\n");
      out.write("                        <a href=\"#\">  <span  class=\"fa fa-video-camera\"style=\"font-size: 100px;margin:40px\"></span></a>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>       \n");
      out.write("                  <div class=\"row\" style=\"text-align: center\">\n");
      out.write("                <div class=\"col-sm-12\">\n");
      out.write("                    <div class=\"col-sm-4\">\n");
      out.write("                        <a href=\"#\"><span  class=\"fa fa-send-o\"style=\"font-size: 100px;margin:40px\"></span></a>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-sm-4\">\n");
      out.write("                        <a href=\"#\"><span  class=\"fa fa-server\"style=\"font-size: 100px;margin:40px\"></span></a>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-sm-4\">\n");
      out.write("                        <a href=\"#\">  <span  class=\"fa fa-table\"style=\"font-size: 100px;margin:40px\"></span></a>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>     \n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"row\" style=\"background: #37474F;height: 10px;margin-top: -9px\"></div>\n");
      out.write("        </div>\n");
      out.write("        ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <link href=\"css/bootstrap.min.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <link href=\"css/font-awesome.min.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <script src=\"js/jquery-3.3.1.min.js\" type=\"text/javascript\"></script>\n");
      out.write("        <script src=\"js/bootstrap.js\" type=\"text/javascript\"></script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"container-fluid\" >\n");
      out.write("        \n");
      out.write("       <div class=\"row\" style=\"min-height: 160px;text-align: center;background: #37474F;color:white\">\n");
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
      out.write("        </div>\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("\n");
      out.write("  \n");
      out.write("                   ");
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

package org.apache.jsp.AdminZone;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class dashboard_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/AdminZone/../UserZone/header.jsp");
    _jspx_dependants.add("/AdminZone/adminfooter.jsp");
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
      out.write("  background-color:silver;\n");
      out.write("  font-size: 20px;\n");
      out.write("  text-align: center;\n");
      out.write("  height: 679px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("#h2{\n");
      out.write("  display: block;\n");
      out.write("  color: #000;\n");
      out.write("  padding: 8px 16px;\n");
      out.write("  text-decoration: none;\n");
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
      out.write("<script>\n");
      out.write("       $(document).ready(function () {\n");
      out.write("    $(\"#posuvnik\").click();\n");
      out.write("});\n");
      out.write("        </script>\n");
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
      out.write("            <div class=\"row\" style=\"background:#c1e2b3\"> <span style=\"margin-left: 500px;color: #0F9E5E;font-family: sans-serif;font-size: 40px;text-decoration-color: #555;text-shadow: 2px 2px 9px\">Welcome To Admin Zone</span></div>\n");
      out.write("            <div class=\"row\"style=\"height:2px;background: teal\"></div>\n");
      out.write("            <div class=\"row\" style=\"min-height:100%;margin-top: -9px\">\n");
      out.write("                <div class=\"col-sm-2\">\n");
      out.write("                    <ul id=\"h1\">\n");
      out.write("                        <h2>Menus</h2><hr>\n");
      out.write("  <li><a href=\"regidetails.jsp\" onclick=\"setPosuvnik(1)\">Registration Details</a></li><hr>\n");
      out.write("  <li><a href=\"admitcard.jsp\" onclick=\"setPosuvnik(2)\">Admit Card</a></li><hr>\n");
      out.write("  <li><a href=\"courses.jsp\" onclick=\"setPosuvnik(3)\">Courses</a></li><hr>\n");
      out.write("  <li><a href=\"notification.jsp\" onclick=\"setPosuvnik(4)\">Notification</a></li><hr>\n");
      out.write("  <li><a href=\"enquirymgmt.jsp\" onclick=\"setPosuvnik(5)\">Enquiry MGMT</a></li><hr>\n");
      out.write("  <li><a href=\"reveiwmgmt.jsp\" onclick=\"setPosuvnik(6)\">Review MGMT</a></li><hr>\n");
      out.write("  <li><a href=\"smsmgmt.jsp\" onclick=\"setPosuvnik(7)\">Send SMS MGMT</a></li><hr>\n");
      out.write("  <li><a href=\"feemgmt.jsp\" onclick=\"setPosuvnik(8)\">Fees MGMT</a></li><hr>\n");
      out.write("  <div class=\"dropdown\">\n");
      out.write("    <button  data-toggle=\"dropdown\">Settings\n");
      out.write("    <span class=\"caret\"></span></button>\n");
      out.write("    <ul class=\"dropdown-menu\" style=\"font-size:16px;padding:2%; text-align: center;\">\n");
      out.write("      \n");
      out.write("      <li><a href=\"changepass.jsp\" onclick=\"setPosuvnik(11)\">Change Password</a></li>\n");
      out.write("      <li role=\"separator\" class=\"divider\"></li>\n");
      out.write("      <li><a href=\"logout.jsp\" onclick=\"setPosuvnik(12)\">LogOut</a></li>\n");
      out.write("    </ul>\n");
      out.write("  </div>\n");
      out.write("</ul>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-sm-10\">\n");
      out.write("                     \n");
      out.write("                <div class=\"row\" style=\"text-align: center\">\n");
      out.write("                <div class=\"col-sm-12\">\n");
      out.write("                    <div class=\"col-sm-4\">\n");
      out.write("                        <a href=\"#\"><span  class=\"fa fa-home\"style=\"font-size: 100px;margin:40px\"></span></a>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-sm-4\">\n");
      out.write("                        <a href=\"#\"><span  class=\"fa fa-users\"style=\"font-size: 100px;margin:40px\"></span></a>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-sm-4\">\n");
      out.write("                        <a href=\"#\">  <span  class=\"fa fa-envelope\"style=\"font-size: 100px;margin:40px\"></span></a>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"row\" style=\"text-align: center\">\n");
      out.write("                <div class=\"col-sm-12\">\n");
      out.write("                    <div class=\"col-sm-4\">\n");
      out.write("                       <a href=\"#\"> <span  class=\"fa fa-newspaper-o\"style=\"font-size: 100px;margin:40px\"></span></a>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-sm-4\">\n");
      out.write("                       <a href=\"#\"> <span  class=\"fa fa-paperclip\"style=\"font-size: 100px;margin:40px\"></span></a>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-sm-4\">\n");
      out.write("                        <a href=\"#\"> <span  class=\"fa fa-cogs\"style=\"font-size: 100px;margin:40px\"></span></a>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("                    <div class=\"row\" style=\"text-align: center\">\n");
      out.write("                <div class=\"col-sm-12\">\n");
      out.write("                    <div class=\"col-sm-4\">\n");
      out.write("                       <a href=\"#\"> <span  class=\"fa fa-eye-slash\"style=\"font-size: 100px;margin:40px\"></span></a>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-sm-4\">\n");
      out.write("                       <a href=\"#\"> <span  class=\"fa fa-adn\"style=\"font-size: 100px;margin:40px\"></span></a>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-sm-4\">\n");
      out.write("                        <a href=\"#\"> <span  class=\"fa fa-\"style=\"font-size: 100px;margin:40px\"></span></a>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("        </div>\n");
      out.write("        ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Admin footer</title>\n");
      out.write("        <link href=\"css/bootstrap.min.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <link href=\"css/font-awesome.min.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <script src=\"js/jquery-3.3.1.min.js\" type=\"text/javascript\"></script>\n");
      out.write("        <script src=\"js/bootstrap.js\" type=\"text/javascript\"></script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"container-fluid\">\n");
      out.write("        <div class=\"row\" style=\"margin-top:-10px;padding:1%;height:125px;background: #555;color:white;text-align: center\">\n");
      out.write("            <div class=\"col-sm-4\"><img src=\"images/Devendra.png\" style=\"height: 80px;width: 70px;\"><br><span style=\"font-size: 16px\">Admin -: <b>Devendra Maurya</b></span></div>\n");
      out.write("            <div class=\"col-sm-4\"><span style=\"margin-top: 60px\"><br> &copy Copyright 2019<br>Created & Design By -:<b>Devendra Maurya</b><br>Mob. No. -: 7897430432</span></div>\n");
      out.write("                <div class=\"col-sm-4\"><h4>About Us</h4>\n");
      out.write("                    <span>Kothar Mangole pur <br>POST- Sagara Sunder pur <br>DIS- Pratapgarh (U.P.)</span>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            </div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("    </body>\n");
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

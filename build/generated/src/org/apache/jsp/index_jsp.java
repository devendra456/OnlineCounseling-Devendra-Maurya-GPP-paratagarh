package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import mypack.ConnectionManager;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
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
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<title>Online Counseling Management System</title>\n");
      out.write("<link rel=\"shortcut icon\" href=\"images/download1.png\" />\n");
      out.write("<link href=\"css/bootstrap.min.css\" rel=\"stylesheet\"/>\n");
      out.write("<link href=\"css/font-awesome.min.css\" rel=\"stylesheet\"/>\n");
      out.write("<link href=\"css/hover.css\" rel=\"stylesheet\"/>\n");
      out.write("<script src=\"js/jquery-2.1.0.min.js\"></script>\n");
      out.write("<script src=\"js/jquery-3.3.1.min.js\"></script>\n");
      out.write("<script src=\"js/bootstrap.min.js\"></script>\n");
      out.write("<!-- Start of  Zendesk Widget script -->\n");
      out.write("<script id=\"ze-snippet\" src=\"https://static.zdassets.com/ekr/snippet.js?key=84dd4030-048f-454f-99d8-b55891e868f3\"> </script>\n");
      out.write("<!-- End of  Zendesk Widget script -->\n");
      out.write("<script>\n");
      out.write("$(document).ready(function(){$(\"#btn\").trigger(\"click\");})\n");
      out.write("</script>\n");
      out.write("<style>\n");
      out.write("    ul.enlarge{\n");
      out.write("list-style-type:none; /*remove the bullet point*/\n");
      out.write("margin-left:0;\n");
      out.write("}\n");
      out.write("ul.enlarge li{\n");
      out.write("display:inline-block; /*places the images in a line*/\n");
      out.write("position: relative;\n");
      out.write("z-index: 0; /*resets the stack order of the list items - later we'll increase this*/\n");
      out.write("margin:10px 40px 0 20px;\n");
      out.write("}\n");
      out.write("ul.enlarge img{\n");
      out.write("background-color:#eae9d4;\n");
      out.write("padding: 6px;\n");
      out.write("-webkit-box-shadow: 0 0 6px rgba(132, 132, 132, .75);\n");
      out.write("-moz-box-shadow: 0 0 6px rgba(132, 132, 132, .75);\n");
      out.write("box-shadow: 0 0 6px rgba(132, 132, 132, .75);\n");
      out.write("-webkit-border-radius: 4px; \n");
      out.write("-moz-border-radius: 4px; \n");
      out.write("border-radius: 4px; \n");
      out.write("}\n");
      out.write("ul.enlarge span{\n");
      out.write("position:absolute;\n");
      out.write("left: -9999px;\n");
      out.write("background-color:#eae9d4;\n");
      out.write("padding: 10px;\n");
      out.write("font-family: 'Droid Sans', sans-serif;\n");
      out.write("font-size:.9em;\n");
      out.write("text-align: center; \n");
      out.write("color: #495a62; \n");
      out.write("-webkit-box-shadow: 0 0 20px rgba(0,0,0, .75);\n");
      out.write("-moz-box-shadow: 0 0 20px rgba(0,0,0, .75);\n");
      out.write("box-shadow: 0 0 20px rgba(0,0,0, .75);\n");
      out.write("-webkit-border-radius: 8px; \n");
      out.write("-moz-border-radius: 8px; \n");
      out.write("border-radius:8px;\n");
      out.write("}\n");
      out.write("ul.enlarge li:hover{\n");
      out.write("z-index: 50;\n");
      out.write("cursor:pointer;\n");
      out.write("}\n");
      out.write("ul.enlarge span img{\n");
      out.write("padding:2px;\n");
      out.write("background:#ccc;\n");
      out.write("}\n");
      out.write("ul.enlarge li:hover span{ \n");
      out.write("top: -300px; /*the distance from the bottom of the thumbnail to the top of the popup image*/\n");
      out.write("left: -20px; /*distance from the left of the thumbnail to the left of the popup image*/\n");
      out.write("}\n");
      out.write("ul.enlarge li:hover:nth-child(2) span{\n");
      out.write("left: -100px; \n");
      out.write("}\n");
      out.write("ul.enlarge li:hover:nth-child(3) span{\n");
      out.write("left: -200px; \n");
      out.write("}\n");
      out.write("/**IE Hacks - see http://css3pie.com/ for more info on how to use CS3Pie and to download the latest version**/\n");
      out.write("ul.enlarge img, ul.enlarge span{\n");
      out.write("behavior: url(pie/PIE.htc); \n");
      out.write("}\n");
      out.write("body\n");
      out.write("{\n");
      out.write("    overflow-x: hidden;\n");
      out.write("}\n");
      out.write("</style>\n");
      out.write("</head>\n");
      out.write("<body style=\"background: #FFFCF3\">\n");
      out.write("    <button type=\"button\" class=\"btn btn-primary btn-lg\" data-toggle=\"modal\" data-target=\"#myModal\" id=\"btn\" style=\"display:none\">\n");
      out.write("  Launch demo modal\n");
      out.write("</button>\n");
      out.write("\n");
      out.write("<!-- Modal -->\n");
      out.write("<div class=\"modal fade\" id=\"myModal\" tabindex=\"-1\" role=\"dialog\" aria-labelledby=\"myModalLabel\">\n");
      out.write("  <div class=\"modal-dialog\" role=\"document\">\n");
      out.write("    <div class=\"modal-content\" style=\"height: 300px;\">\n");
      out.write("      <div class=\"modal-header\" style=\"background: saddlebrown;color:whitesmoke;border-top-left-radius: 5px;border-top-right-radius: 5px\">\n");
      out.write("        <button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-label=\"Close\"><span aria-hidden=\"true\">&times;</span></button>\n");
      out.write("        <h4 class=\"modal-title\" id=\"myModalLabel\" style=\"font-size: 40px;font-family: serif\">Welcome To Our Project</h4>\n");
      out.write("      </div>\n");
      out.write("        <div class=\"modal-body\" style=\"margin-top: -50px;font-size: 35px;color:#1b6d85;text-align: center\">\n");
      out.write("      <br><br>\n");
      out.write("            Online Counseling Management System\n");
      out.write("      </div>\n");
      out.write("      </div>\n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write("<div  class=\"container-fluid\">\n");
      out.write("<div class=\"row\" style=\"background:#acacac\">\n");
      out.write("<div class=\"col-sm-1\"><img src=\"images/download1.png\" style=\"background: #acacac ;height:100px;width:100px;border-radius: 50%;padding:1%\" ></div>\n");
      out.write("<div class=\"col-sm-10\"><center><label class=\"text text-uppercase\" style=\"font-weight: bolder; padding-top:1%; font-family:'times new roman'; font-size:50px;background:#acacac;color:brown;\">Online Counseling Management System</center></label></div>\n");
      out.write("<div class=\"col-sm-1\"><div class=\"row\"><img src=\"images/download.png\" style=\"height:100px;width:97px;border-radius: 50%\" ></div></div>\n");
      out.write("</div>\n");
      out.write("<div class=\"row\">\n");
      out.write("    <div class=\"col-sm-12\" >\n");
      out.write("<nav class=\"navbar navbar-default\">\n");
      out.write("    <div class=\"container-fluid\">\n");
      out.write("        <div class=\"navbar-header\">\n");
      out.write("            <button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\" data-target=\"#myNavbar\" >\n");
      out.write("        <span class=\"icon-bar\"></span>\n");
      out.write("        <span class=\"icon-bar\"></span>\n");
      out.write("        <span class=\"icon-bar\"></span>                        \n");
      out.write("      </button>\n");
      out.write("        </div>\n");
      out.write("    <div class=\"collapse navbar-collapse\" id=\"myNavbar\" style=\"background:teal\">\n");
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
      out.write("    </div>\n");
      out.write("    </div>\n");
      out.write("</nav> \n");
      out.write("    </div>\n");
      out.write("</div> \n");
      out.write(" <div class=\"row\">   \n");
      out.write("<div id=\"carousel-example-generic\" class=\"carousel slide\" data-ride=\"carousel\" style=\"margin-top:-20px\">\n");
      out.write("  <!-- Indicators -->\n");
      out.write("  <ol class=\"carousel-indicators\">\n");
      out.write("    <li data-target=\"#carousel-example-generic\" data-slide-to=\"0\" class=\"active\"></li>\n");
      out.write("    <li data-target=\"#carousel-example-generic\" data-slide-to=\"1\"></li>\n");
      out.write("    <li data-target=\"#carousel-example-generic\" data-slide-to=\"2\"></li>\n");
      out.write("    <li data-target=\"#carousel-example-generic\" data-slide-to=\"3\"></li>\n");
      out.write("    <li data-target=\"#carousel-example-generic\" data-slide-to=\"4\"></li>\n");
      out.write("    <li data-target=\"#carousel-example-generic\" data-slide-to=\"5\"></li>\n");
      out.write("  </ol>\n");
      out.write("\n");
      out.write("  <!-- Wrapper for slides -->\n");
      out.write("    <div class=\"carousel-inner\" role=\"listbox\" style=\"background:#e3f2fd\">\n");
      out.write("    <div class=\"item active\">\n");
      out.write("      <center><img src=\"images/slider44.jpg\" alt=\"...\" style=\"height:500px;width:100%\"></center>\n");
      out.write("      <div class=\"carousel-caption\">\n");
      out.write("        <h1 style=\"color:red\">A.K.T.U. University</h1>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("        <div class=\"item\">\n");
      out.write("     <center> <img src=\"images/d.jpg\" alt=\"...\" style=\"height:500px;width:100%\"></center>\n");
      out.write("      <div class=\"carousel-caption\">\n");
      out.write("        <h1 style=\"color:red\">Our Mentors</h1>\n");
      out.write("      </div>\n");
      out.write("    </div>  \n");
      out.write("    <div class=\"item\">\n");
      out.write("      <center><img src=\"images/1.jpg\" alt=\"...\" style=\"height:500px;width:100%\"></center>\n");
      out.write("      <div class=\"carousel-caption\">\n");
      out.write("        <h1 style=\"color:red\">Govt. Polytechnic Premdhar Patti Pratapgarh </h1>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("        \t<div class=\"item\">\n");
      out.write("     <center> <img src=\"images/Campus.jpg\" alt=\"...\" style=\"height:500px;width:100%\"></center>\n");
      out.write("      <div class=\"carousel-caption\">\n");
      out.write("        <h1 style=\"color:red\">Lucknow Polytechnic</h1>\n");
      out.write("      </div>\n");
      out.write("    </div> \n");
      out.write("<div class=\"item\">\n");
      out.write("     <center> <img src=\"images/Training.jpg\" alt=\"...\" style=\"height:500px;width:100%\"></center>\n");
      out.write("      <div class=\"carousel-caption\">\n");
      out.write("        <h1 style=\"color:red\">Library</h1>\n");
      out.write("      </div>\n");
      out.write("    </div>  \n");
      out.write("<div class=\"item\">\n");
      out.write("     <center> <img src=\"images/Student.jpg\" alt=\"...\" style=\"height:500px;width:100%\"></center>\n");
      out.write("      <div class=\"carousel-caption\">\n");
      out.write("        <h1 style=\"color:red\">STUDENTS</h1>\n");
      out.write("      </div>\n");
      out.write("    </div>  \t\n");
      out.write("  </div>\n");
      out.write("  \n");
      out.write("  <!-- Controls -->\n");
      out.write("  <a class=\"left carousel-control\" href=\"#carousel-example-generic\" role=\"button\" data-slide=\"prev\">\n");
      out.write("    <span class=\"glyphicon glyphicon-chevron-left\" aria-hidden=\"true\"></span>\n");
      out.write("    <span class=\"sr-only\">Previous</span>\n");
      out.write("  </a>\n");
      out.write("  <a class=\"right carousel-control\" href=\"#carousel-example-generic\" role=\"button\" data-slide=\"next\">\n");
      out.write("    <span class=\"glyphicon glyphicon-chevron-right\" aria-hidden=\"true\"></span>\n");
      out.write("    <span class=\"sr-only\">Next</span>\n");
      out.write("  </a>\n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write("    <div class=\"row\">\n");
      out.write("        <div class=\"col-sm-12\" style=\"background:#fff7dd;border:dashed 1px \">\n");
      out.write("            <marquee scrolldelay=\"100\" behavior=\"alternate\" direction=\"left\" onmouseover=\"this.stop();\" onmouseout=\"this.start();\"><a href=\"registration.jsp\"><h1> <leble style=\"color:#843534\">Click Here</leble>&nbsp;For The Registration <img src=\"images/bd.gif\" style=\"height:50px;width:140px\"></h1></a></marquee>   \n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("<div class=\"row\" style=\"height:400px;\">\n");
      out.write("\n");
      out.write("<div class=\"col-sm-4\" style=\"text-align: center;\"><h1 style=\"border-bottom: 2px solid; \">Latest News<img src=\"images/new.jpeg\" style=\"height:40px;width:51px\"></h1>\n");
      out.write("<marquee style=\"background:#F4FEF3\"direction=\"up\" height=\"315px\" scrolldelay=\"100\" onmouseover=\"this.stop();\" onmouseout=\"this.start();\"> \n");
      out.write(" <ul style=\"font-size: 16px\">\n");
      out.write("     \n");
      out.write("         ");

                        ConnectionManager cm=new ConnectionManager();
                        String command="select * from notification ";
                        String command1="select * from registration order by date limit 5";
                                //"select name from registration limit 5";
                        ResultSet rs=cm.getData(command);
                        ResultSet r=cm.getData(command1);
                        while(rs.next())
                        {
                        
      out.write("\n");
      out.write("                        \n");
      out.write("                       \n");
      out.write("                        <span style=\"color:#3d80ba\"> ");
      out.print(rs.getString(1));
      out.write("</span><img src=\"images/new.gif\" style=\"height:30px;width:40px\">\n");
      out.write("                        \n");
      out.write("                        <hr>\n");
      out.write("                        ");
}
      out.write("\n");
      out.write(" \n");
      out.write("</ul>\n");
      out.write(" </marquee>\n");
      out.write("</div>\n");
      out.write("<div class=\"col-sm-8\">\n");
      out.write("<div class=\"row\">\n");
      out.write("<img src=\"images/14.jpg\"class=\"img-thumbnail\" style=\"opacity: 0.7;height:395px;width:95%;margin-left: 47px\">\n");
      out.write("</div>\n");
      out.write("</div>\n");
      out.write("</div>\n");
      out.write("   <div class=\"row\"> \n");
      out.write("  <div class=\"col-sm-2\"><img src=\"images/career.jpg\" style=\"padding:1%;border-radius: 100%\"></div>\n");
      out.write("<div class=\"col-sm-6\"><h2 style=\"font-family: serif\"><center>Process For The Counseling.....</center></h2>\n");
      out.write("<ul style=\"font-size:18px;margin-left: 100px;margin-top: 20px;color: #200d74\">\n");
      out.write("<li>Registration</li>\n");
      out.write("<li>LogIn</li>\n");
      out.write("<li>Fill The Online Form</li>\n");
      out.write("<li>Make Payment</li>\n");
      out.write("<li>Get The Admit Card</li>\n");
      out.write("</ul>\n");
      out.write("</div>\n");
      out.write("  <div class=\"col-sm-4\" style=\"height: 210px\"><br>\n");
      out.write("      \n");
      out.write("      <lable style=\"font-family: sans-serif;font-size: 30px\">Top Five Registered Students</lable><br>\n");
      out.write("      ");

         while(r.next())
         {
             
      out.write("\n");
      out.write("         \n");
      out.write("     \n");
      out.write("      <li><span style=\"color:#200d74;font-size: 20px \">\n");
      out.write("        \n");
      out.write("              ");
      out.print(r.getString(1));
      out.write("</span><br></li></ul>\n");
      out.write("      \n");
      out.write("      ");
}
      out.write("\n");
      out.write("  </div>  \n");
      out.write("   </div>\n");
      out.write("    <div class=\"row\">\n");
      out.write("        <div class=\"col-sm-12\">\n");
      out.write("            <h1 style=\"text-align: center\"></h1>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"row\" style=\"margin-top:-22px;min-height: 400px;border:px solid;padding:0%\">   \n");
      out.write("        \n");
      out.write("        <div class=\"col-sm-12\" style=\"margin-left:100px\"> <h2 style=\"margin-left:450px;margin-top: -10px\">Images Gallery</h2>\n");
      out.write("        <ul class=\"enlarge\">\n");
      out.write("<li><img src=\"images/6.jpg\" width=\"200px\" height=\"150px\" alt=\"Dechairs\" /><span><img src=\"images/6.jpg\" alt=\"Deckchairs\" width=\"500px\" height=\"400px\"/></span></li>\n");
      out.write("<li><img src=\"images/7.jpg\" width=\"200px\" height=\"150px\" alt=\"Blackpool sunset\" /><span><img src=\"images/7.jpg\" alt=\"Blackpool sunset\" width=\"500px\" height=\"400px\"/></span></li>\n");
      out.write("<li><img src=\"images/10.jpg\" width=\"200px\" height=\"150px\" alt=\"Blackpool pier\" /><span><img src=\"images/10.jpg\" alt=\"Blackpool pier\" width=\"500px\" height=\"400px\"/></span></li>\n");
      out.write("<li><img src=\"images/ds.jpg\" width=\"200px\" height=\"150px\" alt=\"Blackpool pier\" /><span><img src=\"images/ds.jpg\" alt=\"Blackpool pier\" width=\"500px\" height=\"400px\"/></span></li>\n");
      out.write("<li><img src=\"images/join.jpg\" width=\"200px\" height=\"150px\" alt=\"Blackpool pier\" /><span><img src=\"images/join.jpg\" alt=\"Blackpool pier\" width=\"500px\" height=\"400px\"/></span></li>\n");
      out.write("<li><img src=\"images/19.jpg\" width=\"200px\" height=\"150px\" alt=\"Blackpool pier\" /><span><img src=\"images/19.jpg\" alt=\"Blackpool pier\" width=\"500px\" height=\"400px\"/></span></li>\n");
      out.write("<li><img src=\"images/24.jpg\" width=\"200px\" height=\"150px\" alt=\"Blackpool pier\" /><span><img src=\"images/24.jpg\" alt=\"Blackpool pier\" width=\"500px\" height=\"400px\"/></span></li>\n");
      out.write("<li> <a href=\"#\"style=\"font-size:22px;margin: inherit\"><b>View More</b></a> </li> \n");
      out.write("        </ul>\n");
      out.write("    </div>\n");
      out.write("       <!-- <div class=\"col-sm-3\"></div>-->\n");
      out.write("    </div>\n");
      out.write("    <div class=\"row\" >\n");
      out.write("        \n");
      out.write("         </div>\n");
      out.write("    <div class=\"row\">\n");
      out.write("        <div class=\"col-sm-9\" style=\"background: #FCF7E5;height:300px\">\n");
      out.write("            <h2> Documents For The Counseling</h2>\n");
      out.write("            <ul style=\"font-size:18px;margin-left: 300px;color: #006228\">\n");
      out.write("                <li> Admit Card.</li>\n");
      out.write(" <li>Result/Rank Letter.</li>\n");
      out.write("<li>Class X Certificate and Mark sheet.</li>\n");
      out.write("<li>Class XII Certificate and Mark sheet.</li>\n");
      out.write("<li>8 passport sized photographs (Same as the one affixed on the application form)</li>\n");
      out.write("<li>Seat Allotment letter.</li>\n");
      out.write("            </ul>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"col-sm-3\" >\n");
      out.write("            <img src=\"images/Document.jpg\" alt=\"\" style=\"height:300;width:300px\">\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    \n");
      out.write("    <hr>\n");
      out.write("    <div class=\"row\" style=\"min-height: 160px;text-align: center;background: #37474F;color:white;\">\n");
      out.write("        <div class=\"col-sm-4\"><h2>Important Links</h2>\n");
      out.write("        <div class=\"row\" >\n");
      out.write("    <div class=\"collapse navbar-collapse\" id=\"bs-example-navbar-collapse-1\">\n");
      out.write("      <ul class=\"nav navbar-nav\">\n");
      out.write("       <li style=\"font-size: 18px;color:white\"><a href=\"UserZone/review.jsp\">Feedback</a></li>\n");
      out.write("       <li style=\"font-size: 18px;color:white\"><a href=\"#\">Language</a></li>\n");
      out.write("        <li style=\"font-size: 18px;color:white\"><a href=\"#\">About Us</a></li>\n");
      out.write("        <li style=\"font-size: 18px;color:white\"><a href=\"#\">Site Map</a></li>\n");
      out.write("         <li style=\"font-size: 18px;color:white\"><a href=\"#\">Help</a></li>\n");
      out.write("</ul>\n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"col-sm-4\"><h2>Address</h2><br><h4>KOTHAR MANGOLEPUR POST-SAGRA SUNDERPUR <br> DIS:-PRATAPGARH (U.P.)<br> Mob.-: +91 7897430432</h4>\n");
      out.write("  </div>\n");
      out.write("        <div class=\"col-sm-4\"><h2>Follow On</h2><br>\n");
      out.write("        <a href=\"https://www.facebook.com/devender.raurya/\" class=\"hvr hvr-pulse\"><img src=\"images/facebook.png\" style=\"height:30px;width:30px\"></a>\n");
      out.write("        &nbsp;  &nbsp;\t<a href=\" https://api.whatsapp.com/send?phone=7897430432\" class=\"hvr hvr-pulse\"><img src=\"images/whatsapp.png\" style=\"height:30px;width:30px\"></a>\n");
      out.write("    &nbsp;  &nbsp;    <a href=\"https://twitter.com/Devendra7897430\" class=\"hvr hvr-pulse\"><img src=\"images/twitter.png\" style=\"height:30px;width:30px\"></a>\n");
      out.write("\t &nbsp;  &nbsp;  \t<a href=\"https://www.youtube.com/channel/UCFaM_Xh0HY4pvoaueM3n9Ng/featured?view_as=subscriber\" class=\"hvr hvr-pulse\"><img src=\"images/youtube.png\" style=\"height:30px;width:30px\"></a>\n");
      out.write("\t &nbsp;  &nbsp;  \t<a href=\"https://www.instagram.com/devendramaurya456/\" class=\"hvr hvr-pulse\"><img src=\"images/instagram.png\" style=\"height:30px;width:30px\"></a>\n");
      out.write("\t &nbsp;  &nbsp;  \t<a href=\"https://www.google-plus.com\" class=\"hvr hvr-pulse\"><img src=\"images/google-plus.png\" style=\"height:30px;width:30px\"></a>       \n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("    <div class=\"row\"style=\"text-align: center;background: #37474F;color:white;\">\n");
      out.write("        <span>Created By</span>&nbsp;  &nbsp; <lable style=\"font-size: 17px\">Er. Devendra Maurya</lable>&nbsp;  &nbsp;<lable> &COPY; 2020 Copyright</lable>\n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write("</body>\n");
      out.write("</html>");
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
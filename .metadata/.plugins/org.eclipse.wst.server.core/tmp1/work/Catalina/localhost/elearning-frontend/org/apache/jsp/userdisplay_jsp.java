/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.46
 * Generated at: 2021-08-23 05:20:26 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import java.io.*;

public final class userdisplay_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("java.sql");
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("java.io");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("           \r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\r\n");
      out.write("<title>User Admin Page</title>\r\n");
      out.write("<style>\r\n");
      out.write("body{\r\n");
      out.write("	background-image: radial-gradient(#33B7FF,#5633ff);\r\n");
      out.write("	color: white;\r\n");
      out.write("	height: 100vh;\r\n");
      out.write("}\r\n");
      out.write(".heading{\r\n");
      out.write("font-size:40px;\r\n");
      out.write("margin-top: 50px;\r\n");
      out.write("}\r\n");
      out.write(".submitbutton{\r\n");
      out.write("	margin-left:580px;\r\n");
      out.write("	padding:8px;\r\n");
      out.write("	font-size:20px;\r\n");
      out.write("	color: midnightblue;\r\n");
      out.write("	background-color:lightblue;\r\n");
      out.write("	border-radius:5px;\r\n");
      out.write("	margin-top: 20px;\r\n");
      out.write("}\r\n");
      out.write(".submitbutton:hover{\r\n");
      out.write("	margin-left:580px;\r\n");
      out.write("	padding:8px;\r\n");
      out.write("	font-size:20px;\r\n");
      out.write("	color: midnightblue;\r\n");
      out.write("	background-color:cyan;\r\n");
      out.write("	border-radius:5px;\r\n");
      out.write("	margin-top: 20px;\r\n");
      out.write("}\r\n");
      out.write(".deletebutton{\r\n");
      out.write("	margin-left:500px;\r\n");
      out.write("	padding:8px;\r\n");
      out.write("	font-size:20px;\r\n");
      out.write("	color: midnightblue;\r\n");
      out.write("	background-color:lightblue;\r\n");
      out.write("	border-radius:5px;\r\n");
      out.write("	margin-top: 20px;\r\n");
      out.write("}\r\n");
      out.write(".deletebutton:hover{\r\n");
      out.write("	margin-left:500px;\r\n");
      out.write("	padding:8px;\r\n");
      out.write("	font-size:20px;\r\n");
      out.write("	color: midnightblue;\r\n");
      out.write("	background-color:cyan;\r\n");
      out.write("	border-radius:5px;\r\n");
      out.write("	margin-top: 20px;\r\n");
      out.write("}\r\n");
      out.write(".inputfld{\r\n");
      out.write("	margin-left: 430px;\r\n");
      out.write("	padding: 5px;\r\n");
      out.write("	broder-radius:10px;\r\n");
      out.write("	font-size:12px;\r\n");
      out.write("	width:30%;\r\n");
      out.write("}\r\n");
      out.write(".inputfld1{\r\n");
      out.write("	margin-left: 420px;\r\n");
      out.write("	padding: 5px;\r\n");
      out.write("	broder-radius:10px;\r\n");
      out.write("	font-size:12px;\r\n");
      out.write("	width:30%;\r\n");
      out.write("}\r\n");
      out.write(".inputfld2{\r\n");
      out.write("	margin-left: 438px;\r\n");
      out.write("	padding: 5px;\r\n");
      out.write("	broder-radius:10px;\r\n");
      out.write("	font-size:12px;\r\n");
      out.write("	width:30%;\r\n");
      out.write("}\r\n");
      out.write(".txtfld{\r\n");
      out.write("	font-size:20px;\r\n");
      out.write("	margin-left:440px;\r\n");
      out.write("}\r\n");
      out.write("ul {\r\n");
      out.write("  list-style-type: none;\r\n");
      out.write("  margin: 0;\r\n");
      out.write("  padding: 0;\r\n");
      out.write("  overflow: hidden;\r\n");
      out.write("  background-color: #333;\r\n");
      out.write("  width:100%;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("li {\r\n");
      out.write("  float: left;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("li a {\r\n");
      out.write("  display: block;\r\n");
      out.write("  color: white;\r\n");
      out.write("  text-align: center;\r\n");
      out.write("  padding: 14px 16px;\r\n");
      out.write("  text-decoration: none;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("li a:hover:not(.active) {\r\n");
      out.write("  background-color: #111;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".active {\r\n");
      out.write("  background-color: #33A1FF;\r\n");
      out.write("  color: black;\r\n");
      out.write("}\r\n");
      out.write(".tableedit{\r\n");
      out.write("	margin-left:250px;\r\n");
      out.write("	border-radius:5px;\r\n");
      out.write("	background-color:white;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<ul>\r\n");
      out.write("  <li><a href=\"afterloginadm.jsp\">Home</a></li>\r\n");
      out.write("  <li><a href=\"course.jsp\">Course</a></li>\r\n");
      out.write("\r\n");
      out.write("  <li><a href=\"contactdisplay.jsp\">Contact</a></li>\r\n");
      out.write("  <li><a class=\"active\"  href=\"userdisplay.jsp\">User</a></li>\r\n");
      out.write("  <li><a href=\"feedbackdisplay.jsp\">Feedback</a></li>\r\n");
      out.write("</ul>\r\n");
      out.write("\r\n");
      out.write("<center><p class=\"heading\">Delete User</p></center> \r\n");
      out.write("<form action=\"userdelete\" method=\"POST\">\r\n");
      out.write("    <pre>\r\n");
      out.write("                \r\n");
      out.write("               \r\n");
      out.write("     <p class=\"txtfld\">User ID</p><input class=\"inputfld\" type=\"number\" name=\"userid\">\r\n");
      out.write("     	<input class=\"deletebutton\" type=\"submit\" value=\"Delete User\"><br>\r\n");
      out.write("                \r\n");
      out.write("     \r\n");
      out.write("    </pre>\r\n");
      out.write("</form>\r\n");
      out.write("<center><p class=\"heading\">User Table</p></center> \r\n");

try {
/* Create string of connection url within specified format with machine
name, port number and database name. Here machine name id localhost and 
database name is student. */
String connectionURL = "jdbc:mysql://localhost:3306/elearningschema";
// declare a connection by using Connection interface
Connection connection = null;
/* declare object of Statement interface that is used for executing sql 
statements. */
Statement statement = null;
// declare a resultset that uses as a table for output data from tha table.
ResultSet rs = null;
// Load JBBC driver "com.mysql.jdbc.Driver"
Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
/* Create a connection by using getConnection() method that takes parameters 
of string type connection url, user name and password to connect to database.*/
connection = DriverManager.getConnection(connectionURL, "root", "root");
/* createStatement() is used for create statement object that is used for 
sending sql statements to the specified database. */
statement = connection.createStatement();
// sql query to retrieve values from the secified table.
String QueryString = "SELECT * from user1";
rs = statement.executeQuery(QueryString);

      out.write("\r\n");
      out.write("<TABLE class=\"tableedit\" cellpadding=\"10\" style=\" color:midnightblue;\">\r\n");
      out.write("<TR>\r\n");
      out.write("<TD>User ID</TD>\r\n");
      out.write("<TD>Name</TD>\r\n");
      out.write("<TD>Phone</TD>\r\n");
      out.write("<TD>Email</TD>\r\n");
      out.write("<TD>Address</TD>\r\n");
      out.write("<TD>Date</TD>\r\n");
      out.write("<TD>Password</TD>\r\n");
      out.write("<TD>Photo</TD>\r\n");
      out.write("</TR>\r\n");

while (rs.next()) {

      out.write("\r\n");
      out.write("<TR>\r\n");
      out.write("<TD>");
      out.print(rs.getInt(1));
      out.write("</TD>\r\n");
      out.write("<TD>");
      out.print(rs.getString(2));
      out.write("</TD>\r\n");
      out.write("<TD>");
      out.print(rs.getLong(3));
      out.write("</TD>\r\n");
      out.write("<TD>");
      out.print(rs.getString(4));
      out.write("</TD>\r\n");
      out.write("<TD>");
      out.print(rs.getString(5));
      out.write("</TD>\r\n");
      out.write("<TD>");
      out.print(rs.getString(6));
      out.write("</TD>\r\n");
      out.write("<TD>");
      out.print(rs.getString(7));
      out.write("</TD>\r\n");
      out.write("<TD>");
      out.print(rs.getString(8));
      out.write("</TD>\r\n");
      out.write("</TR>\r\n");
 } 
      out.write('\r');
      out.write('\n');

// close all the connections.
rs.close();
statement.close();
connection.close();
} catch (Exception ex) {

      out.write("\r\n");
      out.write("</font>\r\n");
      out.write("<font size=\"+3\" color=\"red\"></b>\r\n");

out.println("Unable to connect to database.");
}

      out.write("\r\n");
      out.write("</TABLE><TABLE>\r\n");
      out.write("<TR>\r\n");
      out.write("<TD><FORM ACTION=\"userdisplay.jsp\" method=\"get\" >\r\n");
      out.write("<button class=\"submitbutton\" type=\"refresh\">Refresh</button></TD>\r\n");
      out.write("</TR>\r\n");
      out.write("</TABLE>\r\n");
      out.write("</font>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}

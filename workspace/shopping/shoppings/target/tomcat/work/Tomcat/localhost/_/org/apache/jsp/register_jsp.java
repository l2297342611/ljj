/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2018-10-23 06:44:15 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class register_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


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

      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<!--\r\n");
      out.write("作者：2451132069@qq.com\r\n");
      out.write("时间：2018-10-17\r\n");
      out.write("描述：注册页面\r\n");
      out.write("-->\r\n");
      out.write("<html>\r\n");
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("    <meta charset=\"UTF-8\">\r\n");
      out.write("    <title></title>\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"register/css/register.css\" />\r\n");
      out.write("    <script type=\"text/javascript\" src=\"register/js/register.js\" ></script>\r\n");
      out.write("    <script type=\"text/javascript\" src=\"register/js/test.js\"></script>\r\n");
      out.write("\r\n");
      out.write("    <script>\r\n");
      out.write("        function myReload() {\r\n");
      out.write("            document.getElementById(\"CreateCheckCode\").src = document\r\n");
      out.write("                    .getElementById(\"CreateCheckCode\").src\r\n");
      out.write("                + \"?nocache=\" + new Date().getTime();\r\n");
      out.write("        }\r\n");
      out.write("    </script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<div>\r\n");
      out.write("    <div align=\"center\" class=\"title\">\r\n");
      out.write("        <span><b>注册用户</b></span>\r\n");
      out.write("    </div>\r\n");
      out.write("    <form id=\"my-form\" action=\"register.do\" method=\"post\">\r\n");
      out.write("        <table>\r\n");
      out.write("            <tr>\r\n");
      out.write("                <td width=\"80px\">昵称:</td>\r\n");
      out.write("                <td width=\"280px\"><input class=\"t_color\" id=\"uuname\" name=\"uname\" type=\"text\" /></td>\r\n");
      out.write("                <td id=\"unames\" class=\"td3\" width=\"260px\"></td>\r\n");
      out.write("            </tr>\r\n");
      out.write("            <tr>\r\n");
      out.write("                <td>出生日期:</td>\r\n");
      out.write("                <td><input id=\"date\" name=\"birth\" class=\"datepicker\" data-ideal=\"date\" type=\"date\" placeholder=\"月/日/年\" /></td>\r\n");
      out.write("                <td id=\"\" class=\"td3\"></td>\r\n");
      out.write("            </tr>\r\n");
      out.write("            <tr>\r\n");
      out.write("                <td>账号:</td>\r\n");
      out.write("                <td><input id=\"account\" class=\"t_color\" name=\"account\" type=\"text\" /></td>\r\n");
      out.write("                <td id=\"test\" class=\"td3\" name=\"test\"></td>\r\n");
      out.write("            </tr>\r\n");
      out.write("            <tr>\r\n");
      out.write("                <td>密码:</td>\r\n");
      out.write("                <td><input id=\"password1\" class=\"t_color\" name=\"password\" type=\"password\" /></td>\r\n");
      out.write("                <td id=\"pwds1\" class=\"td3\"></td>\r\n");
      out.write("            </tr>\r\n");
      out.write("            <tr>\r\n");
      out.write("                <td>确认密码:</td>\r\n");
      out.write("                <td><input id=\"password2\" class=\"t_color\" name=\"password\" type=\"password\" /></td>\r\n");
      out.write("                <td id=\"pwds2\" class=\"td3\"></td>\r\n");
      out.write("            </tr>\r\n");
      out.write("            <tr>\r\n");
      out.write("                <td>邮箱:</td>\r\n");
      out.write("                <td><input id=\"email\" class=\"t_color\" name=\"mail\" value=\"youxiang123@qq.com\" type=\"text\" /></td><!--data-ideal=\"required email\"  type=\"email\"-->\r\n");
      out.write("                <td id=\"emails\" class=\"td3\"></td>\r\n");
      out.write("            </tr>\r\n");
      out.write("            <tr>\r\n");
      out.write("                <td>电话:</td>\r\n");
      out.write("                <td><input type=\"tel\" class=\"t_color\" id=\"phone\" name=\"phone\" /></td><!--data-ideal=\"phone\"-->\r\n");
      out.write("                <td id=\"phones\" class=\"td3\"></td>\r\n");
      out.write("            </tr>\r\n");
      out.write("            <tr>\r\n");
      out.write("                <td>验证码：</td>\r\n");
      out.write("                <td><input name=\"code\" type=\"text\" id=\"checkCode\" title=\"不区分大小写\"\r\n");
      out.write("                           size=\"8\" ,maxlength=\"4\" />\r\n");
      out.write("                </td><!--data-ideal=\"phone\"-->\r\n");
      out.write("                <td id=\"check\" class=\"td3\"><img src=\"checkcode.do\" id=\"CreateCheckCode\" align=\"middle\"><a href=\"javascript:myReload()\"> 看不清,换一个</a></td>\r\n");
      out.write("            </tr>\r\n");
      out.write("        </table>\r\n");
      out.write("        <div class=\"hr\">\r\n");
      out.write("            <hr/>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <div class=\"but\">\r\n");
      out.write("            <button type=\"submit\">提交</button>\r\n");
      out.write("            <button id=\"reset\" type=\"button\">重置</button>\r\n");
      out.write("        </div>\r\n");
      out.write("    </form>\r\n");
      out.write("</div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}

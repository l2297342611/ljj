/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2018-10-18 08:27:31 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class test_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("    <title>Title</title>\r\n");
      out.write("    <script>\r\n");
      out.write("        window.onload = function () {\r\n");
      out.write("            document.getElementById(\"uname\").onblur = function () {\r\n");
      out.write("                if(this.value==\"\")\r\n");
      out.write("                {\r\n");
      out.write("                    document.getElementById(\"test\").innerHTML=\"请输入用户名\";\r\n");
      out.write("                    this.focus();\r\n");
      out.write("                }\r\n");
      out.write("                var xmlHttp = getXHR();\r\n");
      out.write("                xmlHttp.onreadystatechange = function () {\r\n");
      out.write("                    if(xmlHttp.readyState == 4){\r\n");
      out.write("                        if(xmlHttp.status == 200){\r\n");
      out.write("                                document.getElementById(\"test\").innerHTML = \"<font color='red'>\"+xmlHttp.responseText+\"</font>\";\r\n");
      out.write("                        }else{\r\n");
      out.write("                            alter(\"请求错误\"+xmlHttp.status);\r\n");
      out.write("                        }\r\n");
      out.write("                    }\r\n");
      out.write("                }\r\n");
      out.write("                var url = \"test.do?uname=\"+this.value+\"&time=\"+new Date().getTime();\r\n");
      out.write("                xmlHttp.open(\"get\",url,true);\r\n");
      out.write("                \r\n");
      out.write("                xmlHttp.send();\r\n");
      out.write("            }\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("        function getXHR(){\r\n");
      out.write("            var xmlHttp;\r\n");
      out.write("            try {\r\n");
      out.write("                xmlHttp=new XMLHttpRequest();\r\n");
      out.write("            }catch(e)\r\n");
      out.write("            {\r\n");
      out.write("                try{\r\n");
      out.write("                    xmlHttp=new ActiveXObject(\"Msxml2.XMLHTTP\");\r\n");
      out.write("                }\r\n");
      out.write("                catch(e)\r\n");
      out.write("                {\r\n");
      out.write("                    try{\r\n");
      out.write("                        xmlHttp=new ActiveXObject(\"Microsoft.XMLHTTP\");\r\n");
      out.write("                    }\r\n");
      out.write("                    catch(e)\r\n");
      out.write("                    {\r\n");
      out.write("                        alert(\"你的浏览器不支持ajax\");\r\n");
      out.write("                        return false;\r\n");
      out.write("                    }\r\n");
      out.write("\r\n");
      out.write("                }\r\n");
      out.write("\r\n");
      out.write("            }\r\n");
      out.write("            return xmlHttp;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("    </script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<form id=\"my-form\" action=\"/register.do\">\r\n");
      out.write("    <div><label>用户名:</label><input id=\"username\" name=\"account\" type=\"text\" onchange=\"teset()\"/></div>\r\n");
      out.write("    <div><label>密码:</label><input id=\"pass\" name=\"password\" type=\"password\"/></div>\r\n");
      out.write("    <div><label>邮箱:</label><input id=\"email\" name=\"mail\" data-ideal=\"required email\" type=\"email\"/></div>\r\n");
      out.write("    <div><label>出生日期:</label><input name=\"birth\" class=\"datepicker\" data-ideal=\"date\" type=\"text\" placeholder=\"月/日/年\"/></div>\r\n");
      out.write("    <div><label>姓名:</label><input name=\"uname\"  type=\"text\"  id=\"uname\"/><span id=\"test\"></span></div>\r\n");
      out.write("    <div><label>年龄:</label><input name=\"age\"  type=\"text\"/></div>\r\n");
      out.write("    <div><label>手机号码:</label><input id=\"phone\" name=\"phone\" type=\"text\"/></div>\r\n");
      out.write("    <div><input type=\"submit\" value=\"提交\"/></div>\r\n");
      out.write("</form>\r\n");
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
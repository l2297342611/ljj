/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2018-10-17 12:58:48 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.ccps_005f28_005fber;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fif_0026_005ftest;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.release();
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
      out.write("<html lang=\"en\" class=\"ie8\"> <![endif]-->\r\n");
      out.write("<!--[if IE 9 ]> <html lang=\"en\" class=\"ie9\"> <![endif]-->\r\n");
      out.write("<!--[if (gt IE 9)|!(IE)]><!--> <html lang=\"en\"> <!--<![endif]-->\r\n");
      out.write("<head>\r\n");
      out.write("    <meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\">\r\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\" />\r\n");
      out.write("    <title>html5用户注册页面模板</title>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    <!--[if lt IE 9]>\r\n");
      out.write("    <script src=\"js/html5shiv.js\"></script>\r\n");
      out.write("    <![endif]-->\r\n");
      out.write("\r\n");
      out.write("    <link href=\"css/normalize.css\" rel=\"stylesheet\"/>\r\n");
      out.write("    <link href=\"css/jquery-ui.css\" rel=\"stylesheet\"/>\r\n");
      out.write("    <link href=\"css/jquery.idealforms.min.css\" rel=\"stylesheet\" media=\"screen\"/>\r\n");
      out.write("\r\n");
      out.write("    <style type=\"text/css\">\r\n");
      out.write("        body{font:normal 15px/1.5 Arial, Helvetica, Free Sans, sans-serif;color: #222;background:url(pattern.png);overflow-y:scroll;padding:60px 0 0 0;}\r\n");
      out.write("        #my-form{width:755px;margin:0 auto;border:1px solid #ccc;padding:3em;border-radius:3px;box-shadow:0 0 2px rgba(0,0,0,.2);}\r\n");
      out.write("        #comments{width:350px;height:100px;}\r\n");
      out.write("    </style>\r\n");
      out.write("\r\n");
      out.write("    <script type=\"javascript\">\r\n");
      out.write("        function test() {\r\n");
      out.write("            var uname = document.getElementsByName(\"uname\").values();\r\n");
      out.write("            document.chatform.action=\"/test_servlet.do\";\r\n");
      out.write("            document.chatform.submit();\r\n");
      out.write("        }\r\n");
      out.write("    </script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<div class=\"row\">\r\n");
      out.write("\r\n");
      out.write("    <div class=\"eightcol last\">\r\n");
      out.write("\r\n");
      out.write("        <!-- Begin Form -->\r\n");
      out.write("\r\n");
      out.write("        <form id=\"my-form\" action=\"/register.do\">\r\n");
      out.write("\r\n");
      out.write("            <section name=\"第一步\">\r\n");
      out.write("\r\n");
      out.write("                <div><label>用户名:</label><input id=\"username\" name=\"account\" type=\"text\"/></div>\r\n");
      out.write("                <div><label>密码:</label><input id=\"pass\" name=\"password\" type=\"password\"/></div>\r\n");
      out.write("                <div><label>邮箱:</label><input id=\"email\" name=\"mail\" data-ideal=\"required email\" type=\"email\"/></div>\r\n");
      out.write("                <div><label>出生日期:</label><input name=\"birth\" class=\"datepicker\" data-ideal=\"date\" type=\"text\" placeholder=\"月/日/年\"/></div>\r\n");
      out.write("                <div><label>姓名:</label><input id=\"file\" name=\"uname\" multiple type=\"file\" onchange=\"teset()\"/></div>\r\n");
      out.write("                ");
      if (_jspx_meth_c_005fif_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                <div><label>年龄:</label><input name=\"age\"  type=\"text\"/></div>\r\n");
      out.write("                <div><label>手机号码:</label><input id=\"phone\" name=\"phone\" type=\"text\"/></div>\r\n");
      out.write("            </section>\r\n");
      out.write("\r\n");
      out.write("            <section name=\"第二步\">\r\n");
      out.write("                <div id=\"languages\">\r\n");
      out.write("                    <label>语言:</label>\r\n");
      out.write("                    <label><input type=\"checkbox\" name=\"langs[]\" value=\"English\"/>英文</label>\r\n");
      out.write("                    <label><input type=\"checkbox\" name=\"langs[]\" value=\"Chinese\"/>中文</label>\r\n");
      out.write("                    <label><input type=\"checkbox\" name=\"langs[]\" value=\"Spanish\"/>西班牙文</label>\r\n");
      out.write("                    <label><input type=\"checkbox\" name=\"langs[]\" value=\"French\"/>法文</label>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div><label>精通几门:</label>\r\n");
      out.write("                    <label><input type=\"radio\" name=\"radio\" checked/>1</label>\r\n");
      out.write("                    <label><input type=\"radio\" name=\"radio\"/>2</label>\r\n");
      out.write("                    <label><input type=\"radio\" name=\"radio\"/>3</label>\r\n");
      out.write("                    <label><input type=\"radio\" name=\"radio\"/>4</label>\r\n");
      out.write("                </div>\r\n");
      out.write("            </section>\r\n");
      out.write("\r\n");
      out.write("            <section name=\"第三步\">\r\n");
      out.write("                <div><label>电话:</label><input type=\"tel\" name=\"phone\" data-ideal=\"phone\"/></div>\r\n");
      out.write("                <div><label>国籍:</label>\r\n");
      out.write("                    <select id=\"states\" name=\"states\">\r\n");
      out.write("                        <option value=\"default\">&ndash; 选择国籍 &ndash;</option>\r\n");
      out.write("                        <option value=\"AL\">阿拉伯</option>\r\n");
      out.write("                        <option value=\"AK\">中国</option>\r\n");
      out.write("                        <option value=\"AZ\">美国</option>\r\n");
      out.write("                        <option value=\"AR\">法国</option>\r\n");
      out.write("                        <option value=\"CA\">英国</option>\r\n");
      out.write("                        <option value=\"CO\">德国</option>\r\n");
      out.write("                        <option value=\"CT\">西班牙</option>\r\n");
      out.write("                        <option value=\"DE\">俄罗斯</option>\r\n");
      out.write("                    </select>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div><label>邮编:</label><input type=\"text\" name=\"zip\" data-ideal=\"zip\"/></div>\r\n");
      out.write("                <div><label>备注:</label><textarea id=\"comments\" name=\"comments\"></textarea></div>\r\n");
      out.write("            </section>\r\n");
      out.write("\r\n");
      out.write("            <div><hr/></div>\r\n");
      out.write("\r\n");
      out.write("            <div>\r\n");
      out.write("                <button type=\"submit\">提交</button>\r\n");
      out.write("                <button id=\"reset\" type=\"button\">重置</button>\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("        </form>\r\n");
      out.write("\r\n");
      out.write("        <!-- End Form -->\r\n");
      out.write("\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\" src=\"js/jquery-1.8.2.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"js/jquery-ui.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"js/jquery.idealforms.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("    var options = {\r\n");
      out.write("\r\n");
      out.write("        onFail: function(){\r\n");
      out.write("            alert( $myform.getInvalid().length +' invalid fields.' )\r\n");
      out.write("        },\r\n");
      out.write("\r\n");
      out.write("        inputs: {\r\n");
      out.write("            'password': {\r\n");
      out.write("                filters: 'required pass',\r\n");
      out.write("            },\r\n");
      out.write("            'username': {\r\n");
      out.write("                filters: 'required username',\r\n");
      out.write("                data: {\r\n");
      out.write("                    //ajax: { url:'validate.php' }\r\n");
      out.write("                }\r\n");
      out.write("            },\r\n");
      out.write("            'file': {\r\n");
      out.write("                filters: 'extension',\r\n");
      out.write("                data: { extension: ['jpg'] }\r\n");
      out.write("            },\r\n");
      out.write("            'comments': {\r\n");
      out.write("                filters: 'min max',\r\n");
      out.write("                data: { min: 50, max: 200 }\r\n");
      out.write("            },\r\n");
      out.write("            'states': {\r\n");
      out.write("                filters: 'exclude',\r\n");
      out.write("                data: { exclude: ['default'] },\r\n");
      out.write("                errors : {\r\n");
      out.write("                    exclude: '选择国籍.'\r\n");
      out.write("                }\r\n");
      out.write("            },\r\n");
      out.write("            'langs[]': {\r\n");
      out.write("                filters: 'min max',\r\n");
      out.write("                data: { min: 2, max: 3 },\r\n");
      out.write("                errors: {\r\n");
      out.write("                    min: 'Check at least <strong>2</strong> options.',\r\n");
      out.write("                    max: 'No more than <strong>3</strong> options allowed.'\r\n");
      out.write("                }\r\n");
      out.write("            }\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("    };\r\n");
      out.write("\r\n");
      out.write("    var $myform = $('#my-form').idealforms(options).data('idealforms');\r\n");
      out.write("\r\n");
      out.write("    $('#reset').click(function(){\r\n");
      out.write("        $myform.reset().fresh().focusFirst()\r\n");
      out.write("    });\r\n");
      out.write("\r\n");
      out.write("    $myform.focusFirst();\r\n");
      out.write("</script>\r\n");
      out.write("<div style=\"text-align:center;\">\r\n");
      out.write("    <p>来源：More Templates <a href=\"http://www.cssmoban.com/\" target=\"_blank\" title=\"模板之家\">模板之家</a> - Collect from <a href=\"http://www.cssmoban.com/\" title=\"网页模板\" target=\"_blank\">网页模板</a></p>\r\n");
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

  private boolean _jspx_meth_c_005fif_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f0.setParent(null);
    // /ccps_28_ber/index.jsp(59,16) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f0.setTest(false);
    int _jspx_eval_c_005fif_005f0 = _jspx_th_c_005fif_005f0.doStartTag();
    if (_jspx_eval_c_005fif_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("alter(\"用户名重复\")");
        int evalDoAfterBody = _jspx_th_c_005fif_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f0);
    return false;
  }
}
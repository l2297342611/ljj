/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2018-10-17 09:27:29 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.btst_005f76_005fzpets;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("    <title>Free 4Pets Website Template | Home </title>\r\n");
      out.write("    <link href=\"css/style.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\" />\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, maximum-scale=1\">\r\n");
      out.write("    <meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\r\n");
      out.write("    <link href='css/a1.css' rel='stylesheet' type='text/css'>\r\n");
      out.write("    <!--slider-->\r\n");
      out.write("    <link href=\"css/slider.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\"/>\r\n");
      out.write("    <script type=\"text/javascript\" src=\"js/jquery-1.9.0.min.js\"></script>\r\n");
      out.write("    <script type=\"text/javascript\" src=\"js/jquery.nivo.slider.js\"></script>\r\n");
      out.write("    <script type=\"text/javascript\">\r\n");
      out.write("        $(window).load(function() {\r\n");
      out.write("            $('#slider').nivoSlider();\r\n");
      out.write("        });\r\n");
      out.write("    </script>\r\n");
      out.write("    <!--light-box-->\r\n");
      out.write("    <script type=\"text/javascript\" src=\"js/jquery.lightbox.js\"></script>\r\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"css/lightbox.css\" media=\"screen\">\r\n");
      out.write("    <script type=\"text/javascript\">\r\n");
      out.write("        $(function() {\r\n");
      out.write("            $('.gallery a').lightBox();\r\n");
      out.write("        });\r\n");
      out.write("    </script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<div class=\"header\">\r\n");
      out.write("    <div class=\"wrap\">\r\n");
      out.write("        <div class=\"header-top\">\r\n");
      out.write("            <div class=\"logo\">\r\n");
      out.write("                <a href=\"/btst_76_zpets/index.jsp\"><img src=\"images/logo.png\" alt=\"\"/></a>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"phone\">\r\n");
      out.write("                <span class=\"order\">order online:</span><br>\r\n");
      out.write("                <h5 class=\"ph-no\">+1 800 253 2560</h5>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"clear\"></div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"header-bottom\">\r\n");
      out.write("        <div class=\"wrap\">\r\n");
      out.write("            <div id=\"cssmenu\">\r\n");
      out.write("                <ul>\r\n");
      out.write("                    <li class=\"active\"><a href=\"/btst_76_zpets/index.jsp\"><span>Home</span></a></li>\r\n");
      out.write("                    <li><a href=\"/btst_76_zpets/about.jsp\"><span>About</span></a></li>\r\n");
      out.write("                    <li class=\"has-sub\"><a href=\"/btst_76_zpets/services.jsp\"><span>Services</span></a>\r\n");
      out.write("                        <ul>\r\n");
      out.write("                            <li class=\"has-sub\"><a href=\"/btst_76_zpets/services.jsp\"><span>Service 1</span></a></li>\r\n");
      out.write("                            <li class=\"has-sub\"><a href=\"/btst_76_zpets/services.jsp\"><span>Service 2</span></a></li>\r\n");
      out.write("                        </ul>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    <li class=\"last\"><a href=\"/btst_76_zpets/contact.jsp\"><span>Contact</span></a></li>\r\n");
      out.write("                </ul>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"clear\"></div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("<!------ Slider ------------>\r\n");
      out.write("<div class=\"slider\">\r\n");
      out.write("    <div class=\"slider-wrapper theme-default\">\r\n");
      out.write("        <div id=\"slider\" class=\"nivoSlider\">\r\n");
      out.write("            <img src=\"images/banner4.jpg\" alt=\"\" />\r\n");
      out.write("            <img src=\"images/banner3.jpg\" alt=\"\" />\r\n");
      out.write("            <img src=\"images/banner2.jpg\" alt=\"\" />\r\n");
      out.write("            <img src=\"images/banner1.jpg\" alt=\"\" />\r\n");
      out.write("            <img src=\"images/banner5.jpg\" alt=\"\" />\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("<!------End Slider ------------>\r\n");
      out.write("<div class=\"main\">\r\n");
      out.write("    <div class=\"top-box\">\r\n");
      out.write("        <div class=\"wrap\">\r\n");
      out.write("            <div class=\"content-top\">\r\n");
      out.write("                <div class=\"section group\">\r\n");
      out.write("                    <div class=\"col_1_of_3 span_1_of_3\">\r\n");
      out.write("                        <div class=\"grid_4\">\r\n");
      out.write("                            <div class=\"box-1\">\r\n");
      out.write("                                <img src=\"images/pic3.jpg\" alt=\"\" class=\"wrapper\">\r\n");
      out.write("                                <div class=\"inside\">\r\n");
      out.write("                                    <h2 class=\"v1\">Lorem ipsum </h2>\r\n");
      out.write("                                    <p class=\"desc\">Lorem ipsum dolor sitamet, consect tad ipis ctets. Tincidunt dolor nunce putate ulr ipco.</p>\r\n");
      out.write("                                    <a href=\"#\"><div class=\"clearfix\"><span class=\"box-btn\"></span></div></a>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"col_1_of_3 span_1_of_3\">\r\n");
      out.write("                        <div class=\"grid_4\">\r\n");
      out.write("                            <div class=\"box-1\">\r\n");
      out.write("                                <img src=\"images/pic4.jpg\" alt=\"\" class=\"wrapper\">\r\n");
      out.write("                                <div class=\"inside\">\r\n");
      out.write("                                    <h2 class=\"v1\">Lorem ipsum </h2>\r\n");
      out.write("                                    <p class=\"desc\">Lorem ipsum dolor sitamet, consect tad ipis ctets. Tincidunt dolor nunce putate ulr ipco.</p>\r\n");
      out.write("                                    <a href=\"#\"><div class=\"clearfix\"><span class=\"box-btn\"></span></div></a>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"col_1_of_3 span_1_of_3\">\r\n");
      out.write("                        <div class=\"grid_4\">\r\n");
      out.write("                            <div class=\"box-1\">\r\n");
      out.write("                                <img src=\"images/pic5.jpg\" alt=\"\" class=\"wrapper\">\r\n");
      out.write("                                <div class=\"inside\">\r\n");
      out.write("                                    <h2 class=\"v1\">Lorem ipsum</h2>\r\n");
      out.write("                                    <p class=\"desc\">Lorem ipsum dolor sitamet, consect tad ipis ctets. Tincidunt dolor nunce putate ulr ipco.</p>\r\n");
      out.write("                                    <a href=\"#\"><div class=\"clearfix\"><span class=\"box-btn\"></span></div></a>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"clear\"></div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"copyrights\">Collect from <a href=\"http://www.cssmoban.com/\"  title=\"网站模板\">网站模板</a></div>\r\n");
      out.write("    <div class=\"content-middle\">\r\n");
      out.write("        <div class=\"wrap\">\r\n");
      out.write("            <h5 class=\"head\">Lorem ipsum</h5>\r\n");
      out.write("            <div class=\"middle-top\">\r\n");
      out.write("                <div class=\"col_1_of_3 span_1_of_3\">\r\n");
      out.write("                    <div class=\"dc-head\">\r\n");
      out.write("                        <div class=\"dc-head-img\">\r\n");
      out.write("                            <a href=\"#\"><img src=\"images/pic.jpg\" title=\"dc-name\"></a>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"dc-head-info\">\r\n");
      out.write("                            <h3>Perspiciatis</h3>\r\n");
      out.write("                            <span>totam rem aperiam</span>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"clear\"> </div>\r\n");
      out.write("                        <div class=\"dc-profile\">\r\n");
      out.write("                            <p>Eaque ipsa quae ab illo inventore veritatis et quasi architecto beatae vitae dicta sunt explicabo.</p>\r\n");
      out.write("                            <button class=\"btn btn-6 btn-6a\">Read More</button>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"col_1_of_3 span_1_of_3\">\r\n");
      out.write("                    <div class=\"dc-head\">\r\n");
      out.write("                        <div class=\"dc-head-img\">\r\n");
      out.write("                            <a href=\"#\"><img src=\"images/pic1.jpg\" title=\"dc-name\"></a>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"dc-head-info\">\r\n");
      out.write("                            <h3>Perspiciatis</h3>\r\n");
      out.write("                            <span>totam rem aperiam</span>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"clear\"> </div>\r\n");
      out.write("                        <div class=\"dc-profile\">\r\n");
      out.write("                            <p>Eaque ipsa quae ab illo inventore veritatis et quasi architecto beatae vitae dicta sunt explicabo.</p>\r\n");
      out.write("                            <button class=\"btn btn-6 btn-6a\">Read More</button>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"col_1_of_3 span_1_of_3\">\r\n");
      out.write("                    <div class=\"dc-head\">\r\n");
      out.write("                        <div class=\"dc-head-img\">\r\n");
      out.write("                            <a href=\"#\"><img src=\"images/pic2.jpg\" title=\"dc-name\"></a>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"dc-head-info\">\r\n");
      out.write("                            <h3>Perspiciatis</h3>\r\n");
      out.write("                            <span>totam rem aperiam</span>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"clear\"> </div>\r\n");
      out.write("                        <div class=\"dc-profile\">\r\n");
      out.write("                            <p>Eaque ipsa quae ab illo inventore veritatis et quasi architecto beatae vitae dicta sunt explicabo.</p>\r\n");
      out.write("                            <button class=\"btn btn-6 btn-6a\">Read More</button>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"clear\"></div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"top-box\">\r\n");
      out.write("        <div class=\"wrap\">\r\n");
      out.write("            <div class=\"content-top\">\r\n");
      out.write("                <div class=\"middle-top\">\r\n");
      out.write("                    <h5 class=\"head\">Our Gallery</h5>\r\n");
      out.write("                    <div class=\"gallery\">\r\n");
      out.write("                        <ul>\r\n");
      out.write("                            <li><a href=\"images/t-pic6.jpg\" class=\"magnifier\"><img src=\"images/pic6.jpg\" alt=\"\"><span></span></a>\r\n");
      out.write("                                <div class=\"dc-head1\">\r\n");
      out.write("                                    <h3>Perspiciatis</h3>\r\n");
      out.write("                                    <span>totam rem aperiam</span>\r\n");
      out.write("                                </div></li>\r\n");
      out.write("                            <li><a href=\"images/t-pic7.jpg\" class=\"magnifier\"><img src=\"images/pic7.jpg\" alt=\"\"><span></span></a>\r\n");
      out.write("                                <div class=\"dc-head1\">\r\n");
      out.write("                                    <h3>Perspiciatis</h3>\r\n");
      out.write("                                    <span>totam rem aperiam</span>\r\n");
      out.write("                                </div></li>\r\n");
      out.write("                            <li class=\"last\"><a href=\"images/t-pic8.jpg\" class=\"magnifier\"><img src=\"images/pic8.jpg\" alt=\"\"><span></span></a>\r\n");
      out.write("                                <div class=\"dc-head1\">\r\n");
      out.write("                                    <h3>Perspiciatis</h3>\r\n");
      out.write("                                    <span>totam rem aperiam</span>\r\n");
      out.write("                                </div></li>\r\n");
      out.write("                            <div class=\"clear\"> </div>\r\n");
      out.write("                        </ul><br>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"clear\"></div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("<div class=\"footer-box\">\r\n");
      out.write("    <div class=\"wrap\">\r\n");
      out.write("        <h4 class=\"f-head\">\r\n");
      out.write("            Lorem ipsum dolor\r\n");
      out.write("        </h4>\r\n");
      out.write("        <div id=\"slideshow\">\r\n");
      out.write("            <div class=\"f-desc1\">\r\n");
      out.write("                <p>Lorem ipsum dolor sit amet, consectetuer adipiscing elit, sed diam nonummy nibh euismod tincidunt ut laoreet dolore magna aliquam erat volutpat. Ut wisi enim ad minim veniam, quis nostrud exerci tation ullamcorper suscipit lobortis nisl ut aliquip ex ea commodo consequat. Duis autem vel eum iriure dolor in hendrerit in vulputate velit esse</p>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"f-desc1\">\r\n");
      out.write("                <p>Lorem ipsum dolor sit amet, consectetuer adipiscing elit, sed diam nonummy nibh euismod tincidunt ut laoreet dolore magna aliquam erat volutpat. Ut wisi enim ad minim veniam, quis nostrud exerci tation ullamcorper suscipit lobortis nisl ut aliquip ex ea commodo consequat. Duis autem vel eum iriure dolor in hendrerit in vulputate velit esse</p>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <script>\r\n");
      out.write("            $(\"#slideshow > div:gt(0)\").hide();\r\n");
      out.write("            setInterval(function() {\r\n");
      out.write("                $('#slideshow > div:first')\r\n");
      out.write("                    .fadeOut(00)\r\n");
      out.write("                    .next()\r\n");
      out.write("                    .fadeIn(500)\r\n");
      out.write("                    .end()\r\n");
      out.write("                    .appendTo('#slideshow');\r\n");
      out.write("            },  2000);\r\n");
      out.write("        </script>\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("<div class=\"footer\">\r\n");
      out.write("    <div class=\"wrap\">\r\n");
      out.write("        <div class=\"copy\">\r\n");
      out.write("            <p> © 2013 All rights Reserved | Design by  W3Layouts.More Templates <a href=\"http://www.cssmoban.com/\" target=\"_blank\" title=\"模板之家\">模板之家</a> - Collect from <a href=\"http://www.cssmoban.com/\" title=\"网页模板\" target=\"_blank\">网页模板</a></p>\r\n");
      out.write("        </div>\r\n");
      out.write("        <ul class=\"follow_icon\">\r\n");
      out.write("            <li><a href=\"#\" style=\"opacity: 1;\"><img src=\"images/fb.png\" alt=\"\"></a></li>\r\n");
      out.write("            <li><a href=\"#\" style=\"opacity: 1;\"><img src=\"images/tw.png\" alt=\"\"></a></li>\r\n");
      out.write("            <li><a href=\"#\" style=\"opacity: 1;\"><img src=\"images/rss.png\" alt=\"\"></a></li>\r\n");
      out.write("            <li><a href=\"#\" style=\"opacity: 1;\"><img src=\"images/g+.png\" alt=\"\"></a></li>\r\n");
      out.write("        </ul>\r\n");
      out.write("        <div class=\"clear\"></div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"footer-bot\">\r\n");
      out.write("        <a href=\"#toTop\" class=\"toTop\">&uarr;</a>\r\n");
      out.write("        <script type=\"text/javascript\">\r\n");
      out.write("            $('.toTop ').click(function(){\r\n");
      out.write("                $(\"html, body\").animate({ scrollTop: 0 }, 600);\r\n");
      out.write("                return false;\r\n");
      out.write("            });\r\n");
      out.write("            $('.toBottom').click(function(){\r\n");
      out.write("                $('html,body').animate({scrollTop: $(document).height()}, 600);\r\n");
      out.write("                return false;\r\n");
      out.write("            });\r\n");
      out.write("        </script>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"clear\"></div>\r\n");
      out.write("</div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
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

/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.37
 * Generated at: 2022-12-07 15:46:06 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class type_005fadd_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html >\r\n");
      out.write("<html >\r\n");
      out.write("<head>\r\n");
      out.write("    <meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\r\n");
      out.write("    <meta http-equiv=\"keywords\"  content = \"图书 java jsp\"/>\r\n");
      out.write("    <meta http-equiv=\"author\" content=\"phenix\"/>\r\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"./Style/skin.css\" />\r\n");
      out.write("</head>\r\n");
      out.write("    <body>\r\n");
      out.write("        <table width=\"100%\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\r\n");
      out.write("            <!-- 头部开始 -->\r\n");
      out.write("            <tr>\r\n");
      out.write("                <td width=\"17\" valign=\"top\" background=\"./Images/mail_left_bg.gif\">\r\n");
      out.write("                    <img src=\"./Images/left_top_right.gif\" width=\"17\" height=\"29\" />\r\n");
      out.write("                </td>\r\n");
      out.write("                <td valign=\"top\" background=\"./Images/content_bg.gif\">\r\n");
      out.write("                    \r\n");
      out.write("                </td>\r\n");
      out.write("                <td width=\"16\" valign=\"top\" background=\"./Images/mail_right_bg.gif\"><img src=\"./Images/nav_right_bg.gif\" width=\"16\" height=\"29\" /></td>\r\n");
      out.write("            </tr>\r\n");
      out.write("            <!-- 中间部分开始 -->\r\n");
      out.write("            <tr>\r\n");
      out.write("                <!--第一行左边框-->\r\n");
      out.write("                <td valign=\"middle\" background=\"./Images/mail_left_bg.gif\">&nbsp;</td>\r\n");
      out.write("                <!--第一行中间内容-->\r\n");
      out.write("                <td valign=\"top\" bgcolor=\"#F7F8F9\">\r\n");
      out.write("                    <table width=\"100%\" border=\"0\" align=\"center\" cellpadding=\"0\" cellspacing=\"0\">\r\n");
      out.write("                        <!-- 空白行-->\r\n");
      out.write("                        <tr><td colspan=\"2\" valign=\"top\">&nbsp;</td><td>&nbsp;</td><td valign=\"top\">&nbsp;</td></tr>\r\n");
      out.write("                        <tr>\r\n");
      out.write("                            <td colspan=\"4\">\r\n");
      out.write("                                <table>\r\n");
      out.write("                                    <tr>\r\n");
      out.write("                                        <td width=\"100\" align=\"center\"><img src=\"./Images/mime.gif\" /></td>\r\n");
      out.write("                                        <td valign=\"bottom\"><h3 style=\"letter-spacing:1px;\">图书类型管理 > 添加类型 </h3></td>\r\n");
      out.write("                                    </tr>\r\n");
      out.write("                                </table>\r\n");
      out.write("                            </td>\r\n");
      out.write("                        </tr>\r\n");
      out.write("                        <!-- 一条线 -->\r\n");
      out.write("                        <tr>\r\n");
      out.write("                            <td height=\"40\" colspan=\"4\">\r\n");
      out.write("                                <table width=\"100%\" height=\"1\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" bgcolor=\"#CCCCCC\">\r\n");
      out.write("                                    <tr><td></td></tr>\r\n");
      out.write("                                </table>\r\n");
      out.write("                            </td>\r\n");
      out.write("                        </tr>\r\n");
      out.write("                        <!-- 添加栏目开始 -->\r\n");
      out.write("                        <tr>\r\n");
      out.write("                            <td width=\"2%\">&nbsp;</td>\r\n");
      out.write("                            <td width=\"96%\">\r\n");
      out.write("                                <table width=\"100%\">\r\n");
      out.write("                                    <tr>\r\n");
      out.write("                                        <td colspan=\"2\">\r\n");
      out.write("                                            <form action=\"viptype.let?type=add\" method=\"post\">\r\n");
      out.write("                                                <table width=\"40%\" class=\"cont\">\r\n");
      out.write('\r');
      out.write('\n');
      out.write('\r');
      out.write('\n');
      out.write('\r');
      out.write('\n');
      out.write('\r');
      out.write('\n');
      out.write('\r');
      out.write('\n');
      out.write('\r');
      out.write('\n');
      out.write('\r');
      out.write('\n');
      out.write('\r');
      out.write('\n');
      out.write('\r');
      out.write('\n');
      out.write('\r');
      out.write('\n');
      out.write('\r');
      out.write('\n');
      out.write('\r');
      out.write('\n');
      out.write('\r');
      out.write('\n');
      out.write('\r');
      out.write('\n');
      out.write('\r');
      out.write('\n');
      out.write('\r');
      out.write('\n');
      out.write('\r');
      out.write('\n');
      out.write('\r');
      out.write('\n');
      out.write('\r');
      out.write('\n');
      out.write('\r');
      out.write('\n');
      out.write("\r\n");
      out.write("                                                    <tr>\r\n");
      out.write("                                                        <td width=\"2%\">&nbsp;</td>\r\n");
      out.write("                                                        <td>会员名称</td>\r\n");
      out.write("                                                        <td>\r\n");
      out.write("                                                            <input class=\"text\" type=\"text\" name=\"name\" required />\r\n");
      out.write("                                                        </td>\r\n");
      out.write("                                                        <td></td>\r\n");
      out.write("                                                        <td width=\"2%\">&nbsp;</td>\r\n");
      out.write("                                                    </tr>\r\n");
      out.write("                                                    <tr>\r\n");
      out.write("                                                        <td width=\"2%\">&nbsp;</td>\r\n");
      out.write("                                                        <td>押金</td>\r\n");
      out.write("                                                        <td>\r\n");
      out.write("                                                            <input class=\"text\" type=\"number\" name=\"deposit\" required />\r\n");
      out.write("                                                        </td>\r\n");
      out.write("                                                        <td></td>\r\n");
      out.write("                                                        <td width=\"2%\">&nbsp;</td>\r\n");
      out.write("                                                    </tr>\r\n");
      out.write("                                                    <tr>\r\n");
      out.write("                                                        <td width=\"2%\">&nbsp;</td>\r\n");
      out.write("                                                        <td>借阅折扣</td>\r\n");
      out.write("                                                        <td>\r\n");
      out.write("                                                            <input class=\"text\" type=\"number\" step=\"0.01\" name=\"rentDiscount\" required />\r\n");
      out.write("                                                        </td>\r\n");
      out.write("                                                        <td></td>\r\n");
      out.write("                                                        <td width=\"2%\">&nbsp;</td>\r\n");
      out.write("                                                    </tr>\r\n");
      out.write("                                                    <tr>\r\n");
      out.write("                                                        <td width=\"2%\">&nbsp;</td>\r\n");
      out.write("                                                        <td>销售折扣</td>\r\n");
      out.write("                                                        <td>\r\n");
      out.write("                                                            <input class=\"text\" type=\"number\" step=\"0.01\" name=\"sellDiscount\" required />\r\n");
      out.write("                                                        </td>\r\n");
      out.write("                                                        <td></td>\r\n");
      out.write("                                                        <td width=\"2%\">&nbsp;</td>\r\n");
      out.write("                                                    </tr>\r\n");
      out.write("                                                    <tr>\r\n");
      out.write("                                                        <td width=\"2%\">&nbsp;</td>\r\n");
      out.write("                                                        <td>借阅数量</td>\r\n");
      out.write("                                                        <td>\r\n");
      out.write("                                                            <input class=\"text\" type=\"number\" name=\"borrowNum\" required />\r\n");
      out.write("                                                        </td>\r\n");
      out.write("                                                        <td></td>\r\n");
      out.write("                                                        <td width=\"2%\">&nbsp;</td>\r\n");
      out.write("                                                    </tr>\r\n");
      out.write("                                                    <tr>\r\n");
      out.write("                                                        <td width=\"2%\">&nbsp;</td>\r\n");
      out.write("                                                        <td>续借数量</td>\r\n");
      out.write("                                                        <td>\r\n");
      out.write("                                                            <input class=\"text\" type=\"number\" name=\"renew\" required />\r\n");
      out.write("                                                        </td>\r\n");
      out.write("                                                        <td></td>\r\n");
      out.write("                                                        <td width=\"2%\">&nbsp;</td>\r\n");
      out.write("                                                    </tr>\r\n");
      out.write("                                                    <tr>\r\n");
      out.write("                                                        <td width=\"2%\">&nbsp;</td>\r\n");
      out.write("                                                        <td>借阅日期</td>\r\n");
      out.write("                                                        <td>\r\n");
      out.write("                                                            <input class=\"text\" type=\"number\" name=\"borrowDate\" required />\r\n");
      out.write("                                                        </td>\r\n");
      out.write("                                                        <td></td>\r\n");
      out.write("                                                        <td width=\"2%\">&nbsp;</td>\r\n");
      out.write("                                                    </tr>\r\n");
      out.write("                                                    <tr>\r\n");
      out.write("                                                        <td width=\"2%\">&nbsp;</td>\r\n");
      out.write("                                                        <td>预约时长</td>\r\n");
      out.write("                                                        <td>\r\n");
      out.write("                                                            <input class=\"text\" type=\"number\" name=\"time\" required />\r\n");
      out.write("                                                        </td>\r\n");
      out.write("                                                        <td></td>\r\n");
      out.write("                                                        <td width=\"2%\">&nbsp;</td>\r\n");
      out.write("                                                    </tr>\r\n");
      out.write("                                                    <tr>\r\n");
      out.write("                                                        <td width=\"2%\">&nbsp;</td>\r\n");
      out.write("                                                        <td>逾期罚款额度</td>\r\n");
      out.write("                                                        <td>\r\n");
      out.write("                                                            <input class=\"text\" type=\"number\" step=\"0.01\" name=\"overdue\" required />\r\n");
      out.write("                                                        </td>\r\n");
      out.write("                                                        <td></td>\r\n");
      out.write("                                                        <td width=\"2%\">&nbsp;</td>\r\n");
      out.write("                                                    </tr>\r\n");
      out.write("                                                    <tr>\r\n");
      out.write("                                                        <td width=\"2%\">&nbsp;</td>\r\n");
      out.write("                                                        <td>损坏罚款额度</td>\r\n");
      out.write("                                                        <td>\r\n");
      out.write("                                                            <input class=\"text\" type=\"number\" step=\"0.01\" name=\"damage\" required />\r\n");
      out.write("                                                        </td>\r\n");
      out.write("                                                        <td></td>\r\n");
      out.write("                                                        <td width=\"2%\">&nbsp;</td>\r\n");
      out.write("                                                    </tr>\r\n");
      out.write("                                                    <tr>\r\n");
      out.write("                                                        <td width=\"2%\">&nbsp;</td>\r\n");
      out.write("                                                        <td>丢失罚款额度</td>\r\n");
      out.write("                                                        <td>\r\n");
      out.write("                                                            <input class=\"text\" type=\"number\" step=\"0.01\" name=\"lose\" required />\r\n");
      out.write("                                                        </td>\r\n");
      out.write("                                                        <td></td>\r\n");
      out.write("                                                        <td width=\"2%\">&nbsp;</td>\r\n");
      out.write("                                                    </tr>\r\n");
      out.write("                                                    <tr>\r\n");
      out.write("                                                        <td>&nbsp;</td>\r\n");
      out.write("                                                        <td colspan=\"3\"><input class=\"btn\" type=\"submit\" value=\"提交\" /></td>\r\n");
      out.write("                                                        <td>&nbsp;</td>\r\n");
      out.write("                                                    </tr>\r\n");
      out.write("                                                </table>\r\n");
      out.write("                                            </form>\r\n");
      out.write("                                        </td>\r\n");
      out.write("                                    </tr>\r\n");
      out.write("                                </table>\r\n");
      out.write("                            </td>\r\n");
      out.write("                            <td width=\"2%\">&nbsp;</td>\r\n");
      out.write("                        </tr>\r\n");
      out.write("                        <!-- 添加栏目结束 -->\r\n");
      out.write("                        <tr>\r\n");
      out.write("                            <td height=\"40\" colspan=\"4\">\r\n");
      out.write("                                <table width=\"100%\" height=\"1\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" bgcolor=\"#CCCCCC\">\r\n");
      out.write("                                    <tr><td></td></tr>\r\n");
      out.write("                                </table>\r\n");
      out.write("                            </td>\r\n");
      out.write("                        </tr>\r\n");
      out.write("                        <tr>\r\n");
      out.write("                            <td width=\"2%\">&nbsp;</td>\r\n");
      out.write("                            <td width=\"51%\" class=\"left_txt\">\r\n");
      out.write("                                <img src=\"./Images/icon_mail.gif\" width=\"16\" height=\"11\"> 2019217192-周布伟，2019218139-朱紫晨<br />\r\n");
      out.write("                            </td>\r\n");
      out.write("                            <td>&nbsp;</td><td>&nbsp;</td>\r\n");
      out.write("                        </tr>\r\n");
      out.write("                    </table>\r\n");
      out.write("                </td>\r\n");
      out.write("                <td background=\"./Images/mail_right_bg.gif\">&nbsp;</td>\r\n");
      out.write("            </tr>\r\n");
      out.write("            <!-- 底部部分 -->\r\n");
      out.write("            <tr>\r\n");
      out.write("                <td valign=\"bottom\" background=\"./Images/mail_left_bg.gif\">\r\n");
      out.write("                    <img src=\"./Images/buttom_left.gif\" width=\"17\" height=\"17\" />\r\n");
      out.write("                </td>\r\n");
      out.write("                <td background=\"./Images/buttom_bgs.gif\">\r\n");
      out.write("                    <img src=\"./Images/buttom_bgs.gif\" width=\"17\" height=\"17\">\r\n");
      out.write("                </td>\r\n");
      out.write("                <td valign=\"bottom\" background=\"./Images/mail_right_bg.gif\">\r\n");
      out.write("                    <img src=\"./Images/buttom_right.gif\" width=\"16\" height=\"17\" />\r\n");
      out.write("                </td>           \r\n");
      out.write("            </tr>\r\n");
      out.write("        </table>\r\n");
      out.write("    </body>\r\n");
      out.write("</html>");
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

/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.37
 * Generated at: 2022-12-07 02:16:42 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class book_005frent_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html >\r\n");
      out.write("<html >\r\n");
      out.write("<head>\r\n");
      out.write("    <meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\r\n");
      out.write("    <meta http-equiv=\"keywords\"  content = \"?????? java jsp\"/>\r\n");
      out.write("    <meta http-equiv=\"author\" content=\"phenix\"/>\r\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"./Style/skin.css\" />\r\n");
      out.write("    <script src=\"Js/jquery-3.3.1.min.js\"></script>\r\n");
      out.write("    <script>\r\n");
      out.write("        /**\r\n");
      out.write("         * ???????????????????????????\r\n");
      out.write("         *  2021-02-12\r\n");
      out.write("         **/\r\n");
      out.write("        function getCurrentDate(){\r\n");
      out.write("            var dateObj = new Date();\r\n");
      out.write("            var year = dateObj.getFullYear();\r\n");
      out.write("            var month = dateObj.getMonth()+1;//0~ 11\r\n");
      out.write("            var date = dateObj.getDate();\r\n");
      out.write("            var dateStr = year+\"-\"+(month>=10?month:\"0\"+month)+\"-\"+(date>=10?date:\"0\"+date);\r\n");
      out.write("            return dateStr;\r\n");
      out.write("        }\r\n");
      out.write("        /**\r\n");
      out.write("         * ??????????????????\r\n");
      out.write("         * count:????????????\r\n");
      out.write("         * 2012-12-1 : 20\r\n");
      out.write("         * 2012-12-21:??????\r\n");
      out.write("         * ??????: 1s = 1000ms   1m = 60s   1h= 60m   1d = 24h\r\n");
      out.write("         *\r\n");
      out.write("         * */\r\n");
      out.write("        function getBackDate(count){\r\n");
      out.write("              //1.???????????????????????????\r\n");
      out.write("            var dateObj = new Date();\r\n");
      out.write("            //2.???????????????\r\n");
      out.write("            var mills = dateObj.getMilliseconds();\r\n");
      out.write("            //3\r\n");
      out.write("            mills += count*24*60*60*1000;\r\n");
      out.write("            //4.??????????????????\r\n");
      out.write("            dateObj.setMilliseconds(mills);\r\n");
      out.write("\r\n");
      out.write("            //5.?????????????????????\r\n");
      out.write("            var year = dateObj.getFullYear();\r\n");
      out.write("            var month = dateObj.getMonth()+1;//0~ 11\r\n");
      out.write("            var date = dateObj.getDate();\r\n");
      out.write("            var dateStr = year+\"-\"+(month>=10?month:\"0\"+month)+\"-\"+(date>=10?date:\"0\"+date);\r\n");
      out.write("            return dateStr;\r\n");
      out.write("\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        $(function(){\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("            $(\"#btnQueryBook\").prop(\"disabled\",\"disabled\");\r\n");
      out.write("            $(\"#btnSubmit\").prop(\"disabled\",\"disabled\");\r\n");
      out.write("            var member = null;\r\n");
      out.write("            $(\"#btnQuery\").click(function(){\r\n");
      out.write("                //???????????????\r\n");
      out.write("                var content = $(\"#memberId\").val();\r\n");
      out.write("                //?????????null ,\"\"\r\n");
      out.write("                if(!content){\r\n");
      out.write("                   alert(\"????????????????????????\");\r\n");
      out.write("                   return;\r\n");
      out.write("                }\r\n");
      out.write("                //2.??????js-ajax()/post()/get\r\n");
      out.write("                var url=\"vip.let?type=doajax&idn=\"+content;\r\n");
      out.write("                $.get(url,function(data,status){\r\n");
      out.write("                    //json?????????\r\n");
      out.write("                    //{\"balance\":145.0,\"id\":1,\"idNumber\":\"300312199506150011\",\"name\":\"andy\",\"pwd\":\"andyliu\",\"regdate\":1627747200000,\"tel\":\"13374645654\",\"type\":{\"amount\":\"5\",\"discount\":100.0,\"id\":1,\"keepDay\":30,\"name\":\"????????????\",\"recharge\":100},\"typeId\":1}\r\n");
      out.write("                    console.log(data);\r\n");
      out.write("                    //json?????????--???json??????\r\n");
      out.write("                    member = JSON.parse(data);\r\n");
      out.write("                    if(null == member){\r\n");
      out.write("                        alert(\"????????????\");\r\n");
      out.write("                        $(\"#name\").val(\"\");\r\n");
      out.write("                        $(\"#type\").val(\"\");\r\n");
      out.write("                        $(\"#amount\").val(0);\r\n");
      out.write("                        $(\"#balance\").val(0);\r\n");
      out.write("                        return;\r\n");
      out.write("                    }\r\n");
      out.write("\r\n");
      out.write("                    console.log(member.clientBalance+\",\"+member.clientGrade+\",\"+member.clientBorrowNum+\",\"+member.clientName);\r\n");
      out.write("                    //???????????????\r\n");
      out.write("                    $(\"#name\").val(member.clientName);\r\n");
      out.write("                    $(\"#type\").val(member.clientGrade);\r\n");
      out.write("                    $(\"#amount\").val(member.clientBorrowNum);\r\n");
      out.write("                    $(\"#balance\").val(member.clientBalance);\r\n");
      out.write("\r\n");
      out.write("                    //???????????????????????????\r\n");
      out.write("                    $(\"#btnQuery\").prop(\"disabled\",\"disabled\");\r\n");
      out.write("                    //??????????????????????????????\r\n");
      out.write("                    $(\"#btnQueryBook\").removeAttr(\"disabled\");\r\n");
      out.write("                });\r\n");
      out.write("            });\r\n");
      out.write("\r\n");
      out.write("            //??????????????????????????????\r\n");
      out.write("            var bookNameList = new Array();\r\n");
      out.write("            $(\"#btnQueryBook\").click(function(){\r\n");
      out.write("                var name=$(\"#bookContent\").val();\r\n");
      out.write("                var url = \"booknew.let?type=doajax&name=\"+name;\r\n");
      out.write("                $.get(url,function(data,status){\r\n");
      out.write("                    //{}/????????????json\r\n");
      out.write("                    console.log(data);\r\n");
      out.write("                    //???????????? {}\r\n");
      out.write("                    if(data===\"{}\"){\r\n");
      out.write("                        alert(\"????????????????????????????????????\");\r\n");
      out.write("                        $(\"#bookContent\").val(\"\");\r\n");
      out.write("                        return;\r\n");
      out.write("                    }\r\n");
      out.write("                    //?????????????????????????????????\r\n");
      out.write("                    if(bookNameList.indexOf(name)>=0){\r\n");
      out.write("                        alert(\"????????????????????????????????????\");\r\n");
      out.write("                        return;\r\n");
      out.write("                    }\r\n");
      out.write("                    //?????????????????????\r\n");
      out.write("                    bookNameList.push(name);\r\n");
      out.write("                    var book = JSON.parse(data);\r\n");
      out.write("                    /**\r\n");
      out.write("                     *<tr align=\"center\" class=\"d\">\r\n");
      out.write("                     <td><input type=\"checkbox\" value=\"1\" checked  class=\"ck\" /></td>\r\n");
      out.write("                     <td>???????????????</td>\r\n");
      out.write("                     <td>2010-10-01</td>\r\n");
      out.write("                     <td>2010-10-31</td>\r\n");
      out.write("                     <td>?????????????????????</td>\r\n");
      out.write("                     <td>??????-01-02</td>\r\n");
      out.write("                     <td>39.9</td>\r\n");
      out.write("                     </tr>\r\n");
      out.write("                     */\r\n");
      out.write("                    //1.?????????\r\n");
      out.write("                    var tr = $(\"<tr align=\\\"center\\\" class=\\\"d\\\">\");\r\n");
      out.write("                    //2.???????????????\r\n");
      out.write("                    var tdCheck = $(\"<td><input type=\\\"checkbox\\\" value=\\\"\"+book.bookIsbn+\"\\\" class=\\\"ck\\\" checked /></td>\");\r\n");
      out.write("                    var tdName = $(\"<td>\"+book.bookName+\"</td>\");\r\n");
      out.write("                    //?????????????????????????????????\r\n");
      out.write("                    //????????????????????????????????? +???????????????.keeyDay\r\n");
      out.write("                    console.log(member);\r\n");
      out.write("                    var tdRentDate = $(\"<td>\"+getCurrentDate()+\"</td>\");\r\n");
      out.write("                    var tdBackDate = $(\"<td>\"+getBackDate(member.clientVip.vipBorrowDate)+\"</td>\");\r\n");
      out.write("                    var tdPublish = $(\"<td>\"+book.bookPublish+\"</td>\");\r\n");
      out.write("                    var tdAddress = $(\"<td>\"+book.bookNowNum+\"</td>\");\r\n");
      out.write("                    var tdPrice = $(\"<td>\"+book.bookPrice+\"</td>\");\r\n");
      out.write("\r\n");
      out.write("                    //3.?????????\r\n");
      out.write("                    tr.append(tdCheck);\r\n");
      out.write("                    tr.append(tdName);\r\n");
      out.write("                    tr.append(tdRentDate);\r\n");
      out.write("                    tr.append(tdBackDate);\r\n");
      out.write("                    tr.append(tdPublish);\r\n");
      out.write("                    tr.append(tdAddress);\r\n");
      out.write("                    tr.append(tdPrice);\r\n");
      out.write("                    //4.?????????\r\n");
      out.write("                    $(\"#tdBook\").append(tr);\r\n");
      out.write("                    $(\"#bookContent\").val(\"\");\r\n");
      out.write("                    $(\"#btnSubmit\").removeAttr(\"disabled\");\r\n");
      out.write("                });\r\n");
      out.write("\r\n");
      out.write("            });\r\n");
      out.write("\r\n");
      out.write("            //????????????\r\n");
      out.write("            $(\"#ckAll\").click(function(){\r\n");
      out.write("                $(\".ck\").prop(\"checked\",$(this).prop(\"checked\"));\r\n");
      out.write("            });\r\n");
      out.write("            //??????????????????\r\n");
      out.write("            $(\"#btnSubmit\").click(function(){\r\n");
      out.write("\r\n");
      out.write("                //1.?????????????????????????????????(?????? 1,2,3  1_2_3)\r\n");
      out.write("                var ids =  new Array();\r\n");
      out.write("                var count = 0;\r\n");
      out.write("                $(\".ck\").each(function () {\r\n");
      out.write("                   if($(this).prop(\"checked\")){\r\n");
      out.write("                       ids.push($(this).val());\r\n");
      out.write("                       count++;\r\n");
      out.write("                   }\r\n");
      out.write("                });\r\n");
      out.write("                if(count===0){\r\n");
      out.write("                    alert(\"?????????????????????\");\r\n");
      out.write("                    return;\r\n");
      out.write("                }\r\n");
      out.write("                if(count>member.clientBorrowNum){\r\n");
      out.write("                    alert(\"????????????????????????\");\r\n");
      out.write("                    return;\r\n");
      out.write("                }\r\n");
      out.write("               //??????servlet http://localhost:8888/mybook_war_exploded/record.let?type=add&mid=1&ids=5_4_9_10\r\n");
      out.write("                location.href=\"borrow.let?type=add&mid=\"+member.clientPhone+\"&ids=\"+ids.join(\"_\");\r\n");
      out.write("            });\r\n");
      out.write("        });\r\n");
      out.write("\r\n");
      out.write("    </script>\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("    <body>\r\n");
      out.write("        <table width=\"100%\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\r\n");
      out.write("            <!-- ???????????? -->\r\n");
      out.write("            <tr>\r\n");
      out.write("                <td width=\"17\" valign=\"top\" background=\"./Images/mail_left_bg.gif\">\r\n");
      out.write("                    <img src=\"./Images/left_top_right.gif\" width=\"17\" height=\"29\" />\r\n");
      out.write("                </td>\r\n");
      out.write("                <td valign=\"top\" background=\"./Images/content_bg.gif\">\r\n");
      out.write("                    \r\n");
      out.write("                </td>\r\n");
      out.write("                <td width=\"16\" valign=\"top\" background=\"./Images/mail_right_bg.gif\"><img src=\"./Images/nav_right_bg.gif\" width=\"16\" height=\"29\" /></td>\r\n");
      out.write("            </tr>\r\n");
      out.write("            <!-- ?????????????????? -->\r\n");
      out.write("            <tr>\r\n");
      out.write("                <!--??????????????????-->\r\n");
      out.write("                <td valign=\"middle\" background=\"./Images/mail_left_bg.gif\">&nbsp;</td>\r\n");
      out.write("                <!--?????????????????????-->\r\n");
      out.write("                <td valign=\"top\" bgcolor=\"#F7F8F9\">\r\n");
      out.write("                    <table width=\"100%\" border=\"0\" align=\"center\" cellpadding=\"0\" cellspacing=\"0\">\r\n");
      out.write("                        <!-- ?????????-->\r\n");
      out.write("                        <tr><td colspan=\"2\" valign=\"top\">&nbsp;</td><td>&nbsp;</td><td valign=\"top\">&nbsp;</td></tr>\r\n");
      out.write("                        <tr>\r\n");
      out.write("                            <td colspan=\"4\">\r\n");
      out.write("                                <table>\r\n");
      out.write("                                    <tr>\r\n");
      out.write("                                        <td width=\"100\" align=\"center\"><img src=\"./Images/mime.gif\" /></td>\r\n");
      out.write("                                        <td valign=\"bottom\"><h3 style=\"letter-spacing:1px;\">???????????? > ???????????? </h3></td>\r\n");
      out.write("                                    </tr>\r\n");
      out.write("                                </table>\r\n");
      out.write("                            </td>\r\n");
      out.write("                        </tr>\r\n");
      out.write("                        <!-- ????????? -->\r\n");
      out.write("                        <tr>\r\n");
      out.write("                            <td height=\"20\" colspan=\"4\">\r\n");
      out.write("                                <table width=\"100%\" height=\"1\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" bgcolor=\"#CCCCCC\">\r\n");
      out.write("                                    <tr><td></td></tr>\r\n");
      out.write("                                </table>\r\n");
      out.write("                            </td>\r\n");
      out.write("                        </tr>\r\n");
      out.write("                        <!-- ?????????????????? -->\r\n");
      out.write("                        <tr>\r\n");
      out.write("                            <td width=\"2%\">&nbsp;</td>\r\n");
      out.write("                            <td width=\"96%\">\r\n");
      out.write("                                <fieldset>\r\n");
      out.write("                                    <legend>????????????</legend>\r\n");
      out.write("                                    <table width=\"100%\" border=\"0\" class=\"cont\"  >\r\n");
      out.write("                                        <tr>\r\n");
      out.write("                                            <td width=\"8%\" class=\"run-right\"> ???????????????</td>\r\n");
      out.write("                                            <td colspan=\"7\"><input class=\"text\" type=\"text\" id=\"memberId\" name=\"memberId\"/> \r\n");
      out.write("                                                 <input type=\"button\" id=\"btnQuery\" value=\"??????\" style=\"width: 80px;\"/></td>\r\n");
      out.write("                           \r\n");
      out.write("                                            </td>\r\n");
      out.write("                                         \r\n");
      out.write("                                        </tr>\r\n");
      out.write("                                        <tr>\r\n");
      out.write("                                            <td width=\"8%\" class=\"run-right\">????????????</td>\r\n");
      out.write("                                            <td width=\"17%\"><input class=\"text\" type=\"text\" id=\"name\" disabled/></td>\r\n");
      out.write("                                            <td width=\"8%\" class=\"run-right\">????????????:</td>\r\n");
      out.write("                                            <td width=\"17%\"><input class=\"text\" type=\"text\" id=\"type\" disabled/></td>\r\n");
      out.write("                                            <td width=\"8%\" class=\"run-right\">????????????</td>\r\n");
      out.write("                                            <td width=\"17%\"><input class=\"text\" type=\"text\" id=\"amount\"  disabled/></td>\r\n");
      out.write("                                            <td width=\"8%\" class=\"run-right\">????????????</td>\r\n");
      out.write("                                            <td width=\"17%\"><input class=\"text\" type=\"text\" id=\"balance\"  disabled/></td>\r\n");
      out.write("                                        </tr>\r\n");
      out.write("                                    </table>\r\n");
      out.write("                                </fieldset>\r\n");
      out.write("                            </td>\r\n");
      out.write("                            <td width=\"2%\">&nbsp;</td>\r\n");
      out.write("                        </tr>\r\n");
      out.write("                      \r\n");
      out.write("                        <!--??????-->\r\n");
      out.write("                        <tr>\r\n");
      out.write("                            <td height=\"40\" colspan=\"3\">\r\n");
      out.write("                            </td>\r\n");
      out.write("                        </tr>\r\n");
      out.write("                        \r\n");
      out.write("                        <!--???????????????-->\r\n");
      out.write("                        <tr>\r\n");
      out.write("                            <td width=\"2%\">&nbsp;</td>\r\n");
      out.write("                            <td width=\"96%\">\r\n");
      out.write("                                <fieldset>\r\n");
      out.write("                                    <legend>????????????</legend>\r\n");
      out.write("                                    <table width=\"100%\" border=\"1\" class=\"cont\"  >\r\n");
      out.write("                                        <tr>\r\n");
      out.write("                                            <td colspan=\"8\">\r\n");
      out.write("                                               \r\n");
      out.write("                                                ?????????:&nbsp;&nbsp;<input class=\"text\" type=\"text\" id=\"bookContent\" name=\"bookContent\" placeholder=\"????????????\"/>\r\n");
      out.write("                                                <input type=\"button\" id=\"btnQueryBook\" value=\"??????\" style=\"width: 80px;\"/>\r\n");
      out.write("                                                <input type=\"button\" id=\"btnSubmit\" value=\"????????????\" style=\"width: 80px;\"/>\r\n");
      out.write("                                            </td>\r\n");
      out.write("                                         \r\n");
      out.write("                                        </tr>\r\n");
      out.write("                                       \r\n");
      out.write("                                    </table>\r\n");
      out.write("                                </fieldset>\r\n");
      out.write("                            </td>\r\n");
      out.write("                            <td width=\"2%\">&nbsp;</td>\r\n");
      out.write("                        </tr>\r\n");
      out.write("                        <tr><td height=\"20\" colspan=\"3\"></td></tr>\r\n");
      out.write("                        <tr>\r\n");
      out.write("                            <td width=\"2%\">&nbsp;</td>\r\n");
      out.write("                            <td width=\"96%\">\r\n");
      out.write("                                <table width=\"100%\">\r\n");
      out.write("                                    <tr>\r\n");
      out.write("                                        <td colspan=\"2\">\r\n");
      out.write("                                            <form action=\"\" method=\"\">\r\n");
      out.write("                                                <table width=\"100%\"  class=\"cont tr_color\" id=\"tdBook\">\r\n");
      out.write("                                                    <tr>\r\n");
      out.write("                                                        <th><input type=\"checkbox\" id=\"ckAll\" checked/>??????/?????????</th>\r\n");
      out.write("                                                        <th>?????????</th>\r\n");
      out.write("                                                        <th>????????????</th>\r\n");
      out.write("                                                        <th>????????????</th>\r\n");
      out.write("                                                        <th>?????????</th>\r\n");
      out.write("                                                        <th>????????????</th>\r\n");
      out.write("                                                        <th>??????(???)</th>\r\n");
      out.write("                                                    </tr>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                                                </table>\r\n");
      out.write("                                            </form>\r\n");
      out.write("                                        </td>\r\n");
      out.write("                                    </tr>\r\n");
      out.write("                                </table>\r\n");
      out.write("                            </td>\r\n");
      out.write("                            <td width=\"2%\">&nbsp;</td>\r\n");
      out.write("                        </tr>\r\n");
      out.write("                        <!-- ?????????????????? -->\r\n");
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
      out.write("                                <img src=\"./Images/icon_mail.gif\" width=\"16\" height=\"11\"> 2019217192-????????????2019218139-?????????<br />\r\n");
      out.write("                            </td>\r\n");
      out.write("                            <td>&nbsp;</td><td>&nbsp;</td>\r\n");
      out.write("                        </tr>\r\n");
      out.write("                    </table>\r\n");
      out.write("                </td>\r\n");
      out.write("                <td background=\"./Images/mail_right_bg.gif\">&nbsp;</td>\r\n");
      out.write("            </tr>\r\n");
      out.write("            <!-- ???????????? -->\r\n");
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

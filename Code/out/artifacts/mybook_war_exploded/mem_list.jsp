<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html >
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <meta http-equiv="keywords"  content = "图书 java jsp"/>
    <meta http-equiv="author" content="phenix"/>
    <link rel="stylesheet" type="text/css" href="./Style/skin.css" />
</head>
    <body>
        <table width="100%" border="0" cellpadding="0" cellspacing="0">
            <!-- 头部开始 -->
            <tr>
                <td width="17" valign="top" background="./Images/mail_left_bg.gif">
                    <img src="./Images/left_top_right.gif" width="17" height="29" />
                </td>
                <td valign="top" background="./Images/content_bg.gif">
                    
                </td>
                <td width="16" valign="top" background="./Images/mail_right_bg.gif"><img src="./Images/nav_right_bg.gif" width="16" height="29" /></td>
            </tr>
            <!-- 中间部分开始 -->
            <tr>
                <!--第一行左边框-->
                <td valign="middle" background="./Images/mail_left_bg.gif">&nbsp;</td>
                <!--第一行中间内容-->
                <td valign="top" bgcolor="#F7F8F9">
                    <table width="100%" border="0" align="center" cellpadding="0" cellspacing="0">
                        <!-- 空白行-->
                        <tr><td colspan="2" valign="top">&nbsp;</td><td>&nbsp;</td><td valign="top">&nbsp;</td></tr>
                        <tr>
                            <td colspan="4">
                                <table>
                                    <tr>
                                        <td width="100" align="center"><img src="./Images/mime.gif" /></td>
                                        <td valign="bottom"><h3 style="letter-spacing:1px;">会员管理 > 管理会员 </h3></td>
                                    </tr>
                                </table>
                            </td>
                        </tr>
                        <!-- 一条线 -->
                        <tr>
                            <td height="40" colspan="4">
                                <table width="100%" height="1" border="0" cellpadding="0" cellspacing="0" bgcolor="#CCCCCC">
                                    <tr><td></td></tr>
                                </table>
                            </td>
                        </tr>
                        <!-- 产品列表开始 -->
                        <tr>
                            <td width="2%">&nbsp;</td>
                            <td width="96%">
                                <table width="100%">
                                    <tr>
                                        <td colspan="2">
                                            <form action="" method="">
                                                <table width="100%"  class="cont tr_color">
                                                    <tr>
                                                        <th>用户名</th>
                                                        <th>联系方式</th>
                                                        <th>性别</th>
                                                        <th>会员等级</th>
                                                        <th>余额</th>
                                                        <th>状态</th>
                                                        <th>借阅数量</th>
                                                        <th>可借数量</th>
                                                        <th>操作</th>
                                                    </tr>
                                                    <c:forEach items="${clientList}" var="m">
                                                        <c:if test="${m.clientStatus=='注销' || m.clientStatus=='冻结'}">
                                                            <tr align="center" class="d" bgcolor=#fecdcd>
                                                                <td>${m.clientName}</td>
                                                                <td>${m.clientPhone}</td>
                                                                <td>${m.clientSex}</td>
                                                                <td>${m.clientGrade}</td>
                                                                <td>${m.clientBalance}</td>
                                                                <td>${m.clientStatus}</td>
                                                                <td>${m.clientBorrowNum}</td>
                                                                <td>${m.clientVip.vipBorrowNum-m.clientBorrowNum}</td>
                                                                <td>
                                                                    <a onclick="return confirm('确认修改');" href="vip.let?type=modifypre&id=${m.clientPhone}">修改</a>&nbsp;&nbsp;
                                                                    <a onclick="return confirm('确认注销');" href="vip.let?type=remove&id=${m.clientPhone}">注销</a>&nbsp;&nbsp;
                                                                    <a onclick="return confirm('确认激活');" href="vip.let?type=activate&id=${m.clientPhone}">激活</a>
                                                                </td>
                                                            </tr>
                                                        </c:if>
                                                        <c:if test="${m.clientStatus=='正常'}">
                                                            <tr align="center" class="d">
                                                                <td>${m.clientName}</td>
                                                                <td>${m.clientPhone}</td>
                                                                <td>${m.clientSex}</td>
                                                                <td>${m.clientGrade}</td>
                                                                <td>${m.clientBalance}</td>
                                                                <td>${m.clientStatus}</td>
                                                                <td>${m.clientBorrowNum}</td>
                                                                <td>${m.clientVip.vipBorrowNum-m.clientBorrowNum}</td>
                                                                <td>
                                                                    <a onclick="return confirm('确认修改');" href="vip.let?type=modifypre&id=${m.clientPhone}">修改</a>&nbsp;&nbsp;
                                                                    <a onclick="return confirm('确认注销');" href="vip.let?type=remove&id=${m.clientPhone}">注销</a>&nbsp;&nbsp;
                                                                    <a onclick="return confirm('确认注销');" href="vip.let?type=activate&id=${m.clientPhone}">激活</a>
                                                                </td>
                                                            </tr>
                                                        </c:if>
                                                    </c:forEach>
                                                </table>
                                            </form>
                                        </td>
                                    </tr>
                                </table>
                            </td>
                            <td width="2%">&nbsp;</td>
                        </tr>
                        <!-- 产品列表结束 -->
                        <tr>
                            <td height="40" colspan="4">
                                <table width="100%" height="1" border="0" cellpadding="0" cellspacing="0" bgcolor="#CCCCCC">
                                    <tr><td></td></tr>
                                </table>
                            </td>
                        </tr>
                        <tr>
                            <td width="2%">&nbsp;</td>
                            <td width="51%" class="left_txt">
                                <img src="./Images/icon_mail.gif" width="16" height="11"> 2019217192-周布伟，2019218139-朱紫晨<br />
                            </td>
                            <td>&nbsp;</td><td>&nbsp;</td>
                        </tr>
                    </table>
                </td>
                <td background="./Images/mail_right_bg.gif">&nbsp;</td>
            </tr>
            <!-- 底部部分 -->
            <tr>
                <td valign="bottom" background="./Images/mail_left_bg.gif">
                    <img src="./Images/buttom_left.gif" width="17" height="17" />
                </td>
                <td background="./Images/buttom_bgs.gif">
                    <img src="./Images/buttom_bgs.gif" width="17" height="17">
                </td>
                <td valign="bottom" background="./Images/mail_right_bg.gif">
                    <img src="./Images/buttom_right.gif" width="16" height="17" />
                </td>           
            </tr>
        </table>
    </body>
</html>
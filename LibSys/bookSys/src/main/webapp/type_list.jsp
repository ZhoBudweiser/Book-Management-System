<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html >
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
                                        <td valign="bottom"><h3 style="letter-spacing:1px;"> 会员类型管理 > 管理类型</h3></td>
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
                        <!-- 添加栏目开始 -->
                        <tr>
                            <td width="2%">&nbsp;</td>
                            <td width="96%">
                                <table width="100%">
                                    <tr>
                                        <td colspan="2">

                                                <table width="80%"  class="cont tr_color">
                                                    <tr>
                                                       
                                                        <th>会员名称</th>
                                                        <th>押金</th>
                                                        <th>出租折扣</th>
<%--                                                        <th>销售折扣</th>--%>
                                                        <th>可借阅数量</th>
                                                        <th>可续借次数</th>
                                                        <th>可借阅天数</th>
                                                        <th>预约保留时间</th>
                                                        <th>逾期扣费额度</th>
                                                        <th>损坏扣费额度</th>
                                                        <th>丢失扣费额度</th>
                                                    </tr>
                                                    <c:forEach items="${types}" var="t">
                                                        <tr align="center" class="d">
                                                            <td>${t.vipName}</td>
                                                            <td>${t.vipDeposit}</td>
                                                            <td>${t.vipRentDiscount}</td>
<%--                                                            <td>${t.vipSellDiscount}</td>--%>
                                                            <td>${t.vipBorrowNum}</td>
                                                            <td>${t.vipRenew}</td>
                                                            <td>${t.vipBorrowDate}</td>
                                                            <td>${t.vipTime}</td>
                                                            <td>${t.vipOverdue}</td>
                                                            <td>${t.vipDamage}</td>
                                                            <td>${t.vipLose}</td>
                                                            <td>
                                                                <a onclick="return confirm('确认修改');" href="viptype.let?type=modifypre&id=${t.vipName}">修改</a>
                                                                <a onclick="return confirm('确认删除');" href="viptype.let?type=remove&id=${t.vipName}">删除</a>
                                                            </td>
                                                        </tr>
                                                    </c:forEach>
                                                </table>
                                        </td>
                                    </tr>
                                </table>
                            </td>
                            <td width="2%">&nbsp;</td>
                        </tr>
                        <!-- 添加栏目结束 -->
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
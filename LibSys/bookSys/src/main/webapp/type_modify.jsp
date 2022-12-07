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
                                        <td valign="bottom"><h3 style="letter-spacing:1px;">图书类型管理 >  修改类型 </h3></td>
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
                                            <form action="viptype.let?type=modify" method="post">
                                                <table width="40%" class="cont">
<%--                                                    <tr>--%>
<%--                                                        <td width="2%">&nbsp;</td>--%>
<%--                                                        <td width="25%">类型编号：</td>--%>
<%--                                                        <td width="40%"><input type="text" id="typeId" class="text"  name="txtTypeId"  value="${type.id}" disabled />--%>
<%--                                                            <input type="hidden"  class="text"  name="typeId"  value="${type.id}"  />--%>
<%--                                                        </td>--%>
<%--                                                        <td class="err">*类型已存在</td>--%>
<%--                                                        <td width="2%">&nbsp;</td>--%>
<%--                                                    </tr>--%>
<%--                                                    <tr>--%>
<%--                                                        <td width="2%">&nbsp;</td>--%>
<%--                                                        <td width="25%">类型名称：</td>--%>
<%--                                                        <td width="40%"><input type="text" id="typeName" class="text"  name="typeName" value="${type.name}" /></td>--%>
<%--                                                        <td class="err">*类型已存在</td>--%>
<%--                                                        <td width="2%">&nbsp;</td>--%>
<%--                                                    </tr>--%>
<%--                                                    <tr>--%>
<%--                                                        <td>&nbsp;</td>--%>
<%--                                                        <td>父类型：</td>--%>
<%--                                                        <td>--%>
<%--                                                            <select id="parentType" name="parentType" >--%>
<%--                                                                <c:if test="${type.parentId==0}">--%>
<%--                                                                    <option value="0" selected>无</option>--%>
<%--                                                                </c:if>--%>
<%--                                                                <c:if test="${type.parentId!=0}">--%>
<%--                                                                    <option value="0">无</option>--%>
<%--                                                                    <c:forEach items = "${types}" var="t">--%>
<%--                                                                        <c:if test="${t.id==type.parentId}">--%>
<%--                                                                            <option value="${t.id}" selected>${t.name}</option>--%>
<%--                                                                        </c:if>--%>
<%--                                                                        <c:if test="${t.id!=type.parentId}">--%>
<%--                                                                            <option value="${t.id}">${t.name}</option>--%>
<%--                                                                        </c:if>--%>
<%--                                                                    </c:forEach>--%>
<%--                                                                </c:if>--%>
<%--                                                            </select>--%>
<%--                                                        </td>--%>
<%--                                                        <td></td>--%>
<%--                                                        <td>&nbsp;</td>--%>
<%--                                                    </tr>--%>
<%--                                                    <tr>--%>
<%--                                                        <td>&nbsp;</td>--%>
<%--                                                        <td colspan="3"><input class="btn" type="submit" value="提交" /></td>--%>
<%--                                                        <td>&nbsp;</td>--%>
<%--                                                    </tr>--%>
                                                        <tr>
                                                            <td width="2%">&nbsp;</td>
                                                            <td>会员名称</td>
                                                            <td>
                                                                <input class="text" type="text" name="name"  value="${type.vipName}" required />
                                                            </td>
                                                            <td></td>
                                                            <td width="2%">&nbsp;</td>
                                                        </tr>
                                                        <tr>
                                                            <td width="2%">&nbsp;</td>
                                                            <td>押金</td>
                                                            <td>
                                                                <input class="text" type="number" name="deposit" value="${type.vipDeposit}" required />
                                                            </td>
                                                            <td></td>
                                                            <td width="2%">&nbsp;</td>
                                                        </tr>
                                                        <tr>
                                                            <td width="2%">&nbsp;</td>
                                                            <td>借阅折扣</td>
                                                            <td>
                                                                <input class="text" type="number" step="0.01" name="rentDiscount" value="${type.vipRentDiscount}" required />
                                                            </td>
                                                            <td></td>
                                                            <td width="2%">&nbsp;</td>
                                                        </tr>
                                                        <tr>
                                                            <td width="2%">&nbsp;</td>
                                                            <td>销售折扣</td>
                                                            <td>
                                                                <input class="text" type="number" step="0.01" name="sellDiscount" value="${type.vipSellDiscount}" required />
                                                            </td>
                                                            <td></td>
                                                            <td width="2%">&nbsp;</td>
                                                        </tr>
                                                        <tr>
                                                            <td width="2%">&nbsp;</td>
                                                            <td>借阅数量</td>
                                                            <td>
                                                                <input class="text" type="number" name="borrowNum" value="${type.vipBorrowNum}" required />
                                                            </td>
                                                            <td></td>
                                                            <td width="2%">&nbsp;</td>
                                                        </tr>
                                                        <tr>
                                                            <td width="2%">&nbsp;</td>
                                                            <td>续借数量</td>
                                                            <td>
                                                                <input class="text" type="number" name="renew" value="${type.vipRenew}" required />
                                                            </td>
                                                            <td></td>
                                                            <td width="2%">&nbsp;</td>
                                                        </tr>
                                                        <tr>
                                                            <td width="2%">&nbsp;</td>
                                                            <td>借阅日期</td>
                                                            <td>
                                                                <input class="text" type="number" name="borrowDate" value="${type.vipBorrowDate}" required />
                                                            </td>
                                                            <td></td>
                                                            <td width="2%">&nbsp;</td>
                                                        </tr>
                                                        <tr>
                                                            <td width="2%">&nbsp;</td>
                                                            <td>预约时长</td>
                                                            <td>
                                                                <input class="text" type="number" name="time" value="${type.vipTime}" required />
                                                            </td>
                                                            <td></td>
                                                            <td width="2%">&nbsp;</td>
                                                        </tr>
                                                        <tr>
                                                            <td width="2%">&nbsp;</td>
                                                            <td>逾期罚款额度</td>
                                                            <td>
                                                                <input class="text" type="number" step="0.01" name="overdue" value="${type.vipOverdue}" required />
                                                            </td>
                                                            <td></td>
                                                            <td width="2%">&nbsp;</td>
                                                        </tr>
                                                        <tr>
                                                            <td width="2%">&nbsp;</td>
                                                            <td>损坏罚款额度</td>
                                                            <td>
                                                                <input class="text" type="number" step="0.01" name="damage" value="${type.vipDamage}" required />
                                                            </td>
                                                            <td></td>
                                                            <td width="2%">&nbsp;</td>
                                                        </tr>
                                                        <tr>
                                                            <td width="2%">&nbsp;</td>
                                                            <td>丢失罚款额度</td>
                                                            <td>
                                                                <input class="text" type="number" step="0.01" name="lose" value="${type.vipLose}" required />
                                                            </td>
                                                            <td></td>
                                                            <td width="2%">&nbsp;</td>
                                                        </tr>
                                                        <tr>
                                                            <td>&nbsp;</td>
                                                            <td colspan="3"><input class="btn" type="submit" value="提交" /></td>
                                                            <td>&nbsp;</td>
                                                        </tr>
                                                </table>
                                            </form>
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
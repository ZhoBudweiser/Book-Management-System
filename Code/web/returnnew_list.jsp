<%--
  Created by IntelliJ IDEA.
  User: 86147
  Date: 2022/6/16
  Time: 7:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java"  import="com.enjoy.book.bean.Borrow" %>
<%@ page import="java.util.List" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html >
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <meta http-equiv="keywords"  content = "图书 java jsp"/>
    <meta http-equiv="author" content="phenix"/>
    <link rel="stylesheet" type="text/css" href="./Style/skin.css" />
    <script src="Js/jquery-3.3.1.min.js"></script>
    <script>
        $(function(){
            $("#btnQuery").click(function(){
                //拿到ClientPhone
                var idn = $("#clientPhone").val();

                //发送请求
                location.href = "borrow.let?type=queryback&idn="+idn
            });
            $("#btnReturn").click(function(){

                if(!$("#clientPhone").val()){
                    alert("请输入会员信息");
                    return;
                }

                //获取所有选中的编号
                var idList = new Array();
                $(".ck").each(function(){
                    if($(this).prop("checked")) {
                        idList.push($(this).val());
                    }
                });
                if(idList.length==0){
                    alert("请选择需要归还的书籍信息");
                    return;
                }
                console.log(idList);
                //2.连城一个字符串
                var idStr = idList.join("_");

                //3.发送请求  record.let?type=back&mid=1&ids=1_2  record.let?type=back&mid=1&ids=1___
                var path = "borrow.let?type=back&mid="+$("#clientPhone").val()+"&ids="+idStr;
                location.href=path;
                console.log(path);

            });

        });

    </script>
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
                                <td valign="bottom"><h3 style="letter-spacing:1px;">常用功能 > 图书归还 </h3></td>
                            </tr>
                        </table>
                    </td>
                </tr>
                <!-- 一条线 -->
                <tr>
                    <td height="20" colspan="4">
                        <table width="100%" height="1" border="0" cellpadding="0" cellspacing="0" bgcolor="#CCCCCC">
                            <tr><td></td></tr>
                        </table>
                    </td>
                </tr>
                <!-- 会员信息开始 -->
                <tr>
                    <td width="2%">&nbsp;</td>
                    <td width="96%">
                        <fieldset>
                            <legend>查询会员</legend>
                            <c:if test="${member==null}">
                                <table width="100%"  class="cont"  >
                                    <tr>
                                        <td width="8%" class="run-right"> 会员编号</td>
                                        <td colspan="7"><input class="text" type="text" id="clientPhone" />
                                            <input type="button" id="btnQuery" value="确定" style="width: 80px;"/>
                                            <input type="button" id="btnReturn" value="批量归还" style="width: 80px;"/>
                                        </td>
                                        </td>

                                    </tr>

                                    <tr>
                                        <td width="8%" class="run-right">会员名称</td>
                                        <td width="17%"><input class="text" type="text"   disabled/>
                                            <input type="hidden" id="clientPhone" value=""/>
                                        </td>
                                        <td width="8%" class="run-right">会员类型:</td>
                                        <td width="17%"><input class="text" type="text" disabled /></td>
                                        <td width="8%" class="run-right">可借数量</td>
                                        <td width="17%"><input class="text" type="text"  disabled /></td>
                                        <td width="8%" class="run-right">账户余额</td>
                                        <td width="17%"><input class="text" type="text"  disabled /></td>
                                    </tr>
                                </table>
                            </c:if>
                            <c:if test="${member!=null}">
                                <table width="100%"  class="cont"  >
                                    <tr>
                                        <td width="8%" class="run-right"> 会员编号</td>
                                        <td colspan="7"><input class="text" type="text" id="clientPhone"  value = "${member.clientPhone}"/>
                                            <input type="button" id="btnQuery" value="确定" disabled style="width: 80px;"/>
                                            <input type="button" id="btnReturn" value="批量归还" style="width: 80px;"/>
                                        </td>
                                        </td>

                                    </tr>

                                    <tr>
                                        <td width="8%" class="run-right">会员名称</td>

                                        <td width="17%"><input class="text" type="text"  name="clientName"  value="${member.clientName}" disabled/>
                                            <input type="hidden" id="clientName" value="${member.clientName}"/>
                                        </td>
                                        <td width="8%" class="run-right">会员类型:</td>
                                        <td width="17%"><input class="text" type="text" name="clientGrade"  value="${member.clientGrade}"  disabled /></td>
                                        <td width="8%" class="run-right">已借数量</td>
                                        <%
                                            List<Borrow>  records =(List<Borrow>)  request.getAttribute("records");
                                        %>
                                        <td width="17%"><input class="text" type="text"  name="clientPhone" value="${member.clientBorrowNum}"  disabled /></td>
                                        <td width="8%" class="run-right">账户余额</td>
                                        <td width="17%"><input class="text" type="text"  name="clientPhone" value="${member.clientBalance}"  disabled /></td>
                                    </tr>
                                </table>

                            </c:if>
                        </fieldset>
                    </td>
                    <td width="2%">&nbsp;</td>
                </tr>
                <!-- 会员信息开始 -->
<%--                <tr>--%>
<%--                    <td width="2%">&nbsp;</td>--%>
<%--                    <td width="96%">--%>
<%--                        <fieldset>--%>
<%--                            <legend>查询会员</legend>--%>
<%--                            <table width="100%" border="0" class="cont"  >--%>
<%--                                <tr>--%>
<%--                                    <td width="8%" class="run-right"> 会员手机号</td>--%>
<%--                                    <td colspan="7"><input class="text" type="text" id="memberId" name="memberId"/>--%>
<%--                                        <input type="button" id="btnQuery" value="确定" style="width: 80px;"/></td>--%>

<%--                                    </td>--%>

<%--                                </tr>--%>
<%--                                <tr>--%>
<%--                                    <td width="8%" class="run-right">会员名称</td>--%>
<%--                                    <td width="17%"><input class="text" type="text" id="name" disabled/></td>--%>
<%--                                    <td width="8%" class="run-right">会员类型:</td>--%>
<%--                                    <td width="17%"><input class="text" type="text" id="type" disabled/></td>--%>
<%--                                    <td width="8%" class="run-right">可借数量</td>--%>
<%--                                    <td width="17%"><input class="text" type="text" id="amount"  disabled/></td>--%>
<%--                                    <td width="8%" class="run-right">账户余额</td>--%>
<%--                                    <td width="17%"><input class="text" type="text" id="balance"  disabled/></td>--%>
<%--                                </tr>--%>
<%--                            </table>--%>
<%--                        </fieldset>--%>
<%--                    </td>--%>
<%--                    <td width="2%">&nbsp;</td>--%>
<%--                </tr>--%>
                <!--空行-->
                <tr>
                    <td height="20" colspan="3">
                    </td>
                </tr>

<%--                <!--详细信息-->--%>
                <tr>
                    <td width="2%">&nbsp;</td>
                    <td width="96%">
                        <table width="100%">
                            <tr>
                                <td colspan="2">
                                    <form action="" method="">
                                        <table width="100%"  class="cont tr_color">
                                            <tr>
                                                <th><input type="checkbox" value="" id="ckAll"/>全选/全不选</th>
                                                <th>图书编号</th>
                                                <th>借阅时间</th>
                                                <th>应还时间</th>
<%--                                                <th>出版社</th>--%>
<%--                                                <th>书架</th>--%>
                                                <th>赔偿金额</th>
                                                <th>操作</th>
                                            </tr>
                                            <c:if test="${records==null}">
                                                <tr align="center" class="d">
                                                    <td colspan="8" ALIGN="center"><h2>暂无数据展示</h2></td>
                                                </tr>
                                            </c:if>
                                            <c:if test ="${records!=null}">
                                                <c:forEach items="${records}" var="r" >
                                                    <!--逾期的处理-->
                                                    <%
                                                        Borrow record=(Borrow)pageContext.getAttribute("r");
                                                        //系统的当前时间
                                                        java.sql.Date  date = new java.sql.Date(System.currentTimeMillis());
                                                        if(record.getExpiryDate().before(date)){
                                                    %>
                                                    <tr align="center" class="d" style="background-color:#f08080">
                                                        <td><input type="checkbox" value="${r.bookIsbn}"  class="ck" checked /></td>
                                                        <td>${r.bookIsbn}</td>
                                                        <td>${r.borrowDate}</td>
                                                        <td>${r.expiryDate}</td>
<%--                                                        <td>${r.bookIsbn.bookPublish}</td>--%>
<%--                                                        <td>${r.book.address}</td>--%>
                                                        <td>${r.deductionAmount}</td>
                                                        <td></td>
                                                    </tr>
                                                    <%
                                                    }else{
                                                    %>
                                                    <tr align="center" class="d">
                                                        <td><input type="checkbox" value="${r.bookIsbn}"  class="ck" checked /></td>
                                                        <td>${r.bookIsbn}</td>
                                                        <td>${r.borrowDate}</td>
                                                        <td>${r.expiryDate}</td>
<%--                                                        <td>${r.bookIsbn.bookPublish}</td>--%>
<%--                                                                                                                    <td>${r.book.address}</td>--%>
                                                        <td>${r.deductionAmount}</td>
                                                        <td><a href="borrow.let?type=keep&id=${r.bookIsbn}">续借</a></td>
                                                    </tr>
                                                    <%
                                                        }
                                                    %>

                                                </c:forEach>
                                            </c:if>
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
                        <img src="./Images/icon_mail.gif" width="16" height="11"> 客户服务邮箱：2087924818@qq.com<br />
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

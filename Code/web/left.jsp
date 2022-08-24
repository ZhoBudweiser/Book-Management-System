<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html >
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <meta http-equiv="keywords"  content = "图书 java jsp"/>
    <meta http-equiv="author" content="phenix"/>
    <script src="./Js/prototype.lite.js" type="text/javascript"></script>
    <script src="./Js/moo.fx.js" type="text/javascript"></script>
    <script src="./Js/moo.fx.pack.js" type="text/javascript"></script>
    <link rel="stylesheet" type="text/css" href="./Style/skin.css" />
    <script type="text/javascript">
        window.onload = function () {
            var contents = document.getElementsByClassName('content');
            var toggles = document.getElementsByClassName('type');

            var myAccordion = new fx.Accordion(
            toggles, contents, {opacity: true, duration: 400}
            );
            myAccordion.showThisHideOpen(contents[0]);
            for(var i=0; i<document .getElementsByTagName("a").length; i++){
                var dl_a = document.getElementsByTagName("a")[i];
                    dl_a.onfocus=function(){
                        this.blur();
                    }
            }
        }
    </script>
</head>

<body>
    <table width="100%" height="200" border="0" cellpadding="0" cellspacing="0" >
        <tr>
            <td width="182" valign="top">
                <div id="container">
                    <h1 class="type"><a href="javascript:void(0)">客户管理</a></h1>
                    <div class="content">
                        <table width="100%" border="0" cellspacing="0" cellpadding="0">
                            <tr>
                                <td><img src="./Images/menu_top_line.gif" width="182" height="5" /></td>
                            </tr>
                        </table>
                        <ul class="RM">
                            <li><a href="./vip.let?type=addpre" target="main">会员开卡</a></li>
                            <li><a href="./vip.let?type=query" target="main">会员管理</a></li>
                            <li><a href="./mem_recharge.jsp" target="main">充值与提现</a></li>
                        </ul>
                    </div>
                    <h1 class="type"><a href="javascript:void(0)">图书管理</a></h1>
                    <div class="content">
                        <table width="100%" border="0" cellspacing="0" cellpadding="0">
                            <tr>
                                <td><img src="./Images/menu_top_line.gif" width="182" height="5" /></td>
                            </tr>
                        </table>
                        <ul class="RM">
                            <li><a href="./booknew_add.jsp" target="main">添加图书</a></li>
                            <li><a href="./booknew.let?type=query&pageIndex=1" target="main">图书列表</a></li>
                            <%--                            <li><a href="./booknew_list.jsp" target="main">图书列表</a></li>--%>
                        </ul>
                    </div>
                    <h1 class="type"><a href="javascript:void(0)">会员类型管理</a></h1>
                    <div class="content">
                        <table width="100%" border="0" cellspacing="0" cellpadding="0">
                            <tr>
                                <td><img src="./Images/menu_top_line.gif" width="182" height="5" /></td>
                            </tr>
                        </table>
                        <ul class="RM">
                            <li><a href="type_add.jsp" target="main">添加类型</a></li>
                            <li><a href="./viptype.let?type=query" target="main">类型列表</a></li>
                        </ul>
                    </div>
                    <h1 class="type"><a href="javascript:void(0)">常用操作</a></h1>
                    <div class="content">
                        <table width="100%" border="0" cellspacing="0" cellpadding="0">
                            <tr>
                                <td><img src="./Images/menu_top_line.gif" width="182" height="5" /></td>
                            </tr>
                        </table>
                        <ul class="RM">
                            <li><a href="./book_rent.jsp" target="main">图书借阅</a></li>
                            <li><a href="./book_sell.jsp" target="main">图书零售</a></li>
                            <li><a href="./returnnew_list.jsp" target="main">图书归还</a></li>
                        </ul>
                    </div>
                    <h1 class="type"><a href="javascript:void(0)">信息查询</a></h1>
                    <div class="content">
                        <table width="100%" border="0" cellspacing="0" cellpadding="0">
                            <tr>
                                <td><img src="./Images/menu_top_line.gif" width="182" height="5" /></td>
                            </tr>
                        </table>
                        <ul class="RM">
                            <li><a href="./rent_list.jsp" target="main">借阅历史信息</a></li>
                            <li><a href="./sell_list.jsp" target="main">销售历史信息</a></li>
                            <li><a href="./rent_timelist.jsp" target="main">借阅时间段信息</a></li>
                            <li><a href="./sell_timelist.jsp" target="main">销售时间段信息</a></li>
                            <li><a href="./client_borrowlist.jsp" target="main">用户借阅数量信息</a></li>
                            <li><a href="./client_selllist.jsp" target="main">用户销售数量信息</a></li>
                        </ul>
                    </div>
                    <!-- *********** -->
                    <h1 class="type"><a href="javascript:void(0)">个人中心</a></h1>
                    <div class="content">
                        <table width="100%" border="0" cellspacing="0" cellpadding="0">
                            <tr>
                                <td><img src="./Images/menu_top_line.gif" width="182" height="5" /></td>
                            </tr>
                        </table>
                        <ul class="RM">
                            <li><a href="./set_pwd.jsp" target="main">修改密码</a></li>
                            <li><a href="./type.let?type=save" target="main">数据库备份</a></li>
                            <li><a href="./type.let?type=data" target="main">数据库导入</a></li>
                        
                        </ul>
                    </div>
                   
                    <!-- *********** -->
                   
<%--                    <div class="content">--%>
<%--                        <table width="100%" border="0" cellspacing="0" cellpadding="0">--%>
<%--                            <tr>--%>
<%--                                <td><img src="./Images/menu_top_line.gif" width="182" height="5" /></td>--%>
<%--                            </tr>--%>
<%--                        </table>--%>
<%--                        <ul class="RM">--%>
<%--                            <li><a href="javascript:void(0)" target="main">友情连接</a></li>--%>
<%--                            <li><a href="javascript:void(0)" target="main">在线留言</a></li>--%>
<%--                            <li><a href="javascript:void(0)" target="main">网站投票</a></li>--%>
<%--                            <li><a href="javascript:void(0)" target="main">邮箱设置</a></li>--%>
<%--                            <li><a href="javascript:void(0)" target="main">图片上传</a></li>--%>
<%--                        </ul>--%>
<%--                    </div>--%>
                    <!-- *********** -->
                </div>
            </td>
        </tr>
    </table>
</body>
</html>
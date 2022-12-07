<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html >
<head>
  <title>网上图书馆后台管理中心</title>
  <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
  <meta name="description" content="网上图书馆后台管理系统" />
  <meta name="keywords" content="书刊,出租,网站管理系统" />
  <meta name="Author" content="周布伟,朱紫晨" />
  <meta name="CopyRight" content="合肥工业大学" />
</head>
<frameset rows="64,*"  frameborder="no" border="0" framespacing="0">
  <!--头部-->
  <frame src="./top.jsp" name="top" noresize="noresize" frameborder="0"  scrolling="no" marginwidth="0" marginheight="0" />
  <!--主体部分-->
  <frameset cols="185,*">
    <!--主体左部分-->
    <frame src="./left.jsp" name="left" noresize="noresize" frameborder="0" scrolling="no" marginwidth="0" marginheight="0" />
    <!--主体右部分-->
    <frame src="./main.jsp" name="main" frameborder="0" scrolling="auto" marginwidth="0" marginheight="0" />
  </frameset>
</html>

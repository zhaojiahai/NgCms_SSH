<%@ page language="java" import="java.util.*" pageEncoding="UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
    <base href="<%=basePath%>">
    <%@include file="../../common/head.jsp" %>
    <title>欢迎登录客户经理信息管理系统</title>
    <script type="text/javascript">
        $(function () {
            //顶部导航切换
            $(".nav li a").click(function () {
                $(".nav li a.selected").removeClass("selected")
                $(this).addClass("selected");
            })
        })
    </script>
</head>
<body style="background:url(/images/topbg.gif) repeat-x;">

<div class="topleft">
    <a href="main.jsp" target="_parent"><img src="/images/logo.png" title="系统首页"/></a>
</div>
<div class="topright">
    <ul>
        <li><span><img src="/images/help.png" title="帮助" class="helpimg"/></span><a href="#">帮助</a></li>
        <li><span><img src="/images/i10.png" title="注销" class="helpimg" height="16" width="16"/></span><a
                href="loginAction_logout.action" target="_parent">注销</a></li>
    </ul>

    <div class="user">
        <span>欢迎${user.loginName}登录！</span>
    </div>
</div>

</body>
</html>
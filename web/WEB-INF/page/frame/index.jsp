<%@ page language="java" import="java.util.*" pageEncoding="UTF-8" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>

<!DOCTYPE HTML>
<html>
<head>
    <%@include file="../../common/head.jsp" %>
    <base href="<%=basePath%>">
    <title>欢迎登录客户经理信息管理系统</title>
</head>

<body>

<div class="place">
    <span>位置：</span>
    <ul class="placeul">
        <li><a href="#">首页</a></li>
    </ul>
</div>

<div class="mainindex">
    <div class="welinfo">
        <span><img src="/images/sun.png" alt="天气"/></span>
        <b>${user.loginName}${am}好，欢迎访问山东农村信用社信贷管理系统</b>
    </div>
</div>

</body>
</html>

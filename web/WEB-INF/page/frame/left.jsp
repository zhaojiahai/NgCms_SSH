<%@ page language="java" import="java.util.*" pageEncoding="UTF-8" %>
<%@ page language="java" import="com.inspur.cmis.entity.User" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
    User user = (User) session.getAttribute("user");
//System.out.println("role========"+user.getRoleid());
%>

<!DOCTYPE HTML>
<html>
<head>
    <base href="<%=basePath%>">
    <%@include file="../../common/head.jsp" %>
    <title>欢迎登录客户经理信息管理系统</title>

    <script type="text/javascript">
        $(function () {
            //导航切换
            $(".menuson li").click(function () {
                $(".menuson li.active").removeClass("active")
                $(this).addClass("active");
            });

            $('.title').click(function () {
                var $ul = $(this).next('ul');
                $('dd').find('ul').slideUp();
                if ($ul.is(':visible')) {
                    $(this).next('ul').slideUp();
                } else {
                    $(this).next('ul').slideDown();
                }
            });
        })
    </script>
</head>
<body style="background:#f0f9fd;">
<div class="lefttop"><span></span>菜单</div>
<!-- 系统管理员 -->
<s:if test='#session.user.roleid =="01"'>
    <dl class="leftmenu">
        <dd>
            <div class="title">
                <span><img src="/images/leftico01.png"/></span>统计查询
            </div>
            <ul class="menuson">
                <li>
                    <cite></cite>
                    <a style="height: 30px;" href="/mi/miLoanStat.html" target="rightFrame">贷款信息统计</a>
                    <i></i>
                </li>
            </ul>
        </dd>
        <dd>
            <div class="title">
                <span><img src="/images/leftico01.png"/></span>系统管理
            </div>
            <ul class="menuson">
                <li><cite></cite><a href="/pm/userInfo.html" target="rightFrame">用户管理</a><i></i></li>
                <li><cite></cite><a href="/pm/groupInfoAction_init" target="rightFrame">机构管理</a><i></i></li>
                <li><cite></cite><a href="/pm/paramClassInfo.html" target="rightFrame">参数管理</a><i></i></li>
            </ul>
        </dd>
    </dl>
</s:if>
<!-- 系统管理员之外的角色 -->
<s:if test='#session.user.roleid  != "01"'>
    <dl class="leftmenu">
        <dd>
            <div class="title">
                <span><img src="/images/leftico01.png" /></span>客户信息管理
            </div>
            <ul class="menuson">
                <li><cite></cite><a style="height: 30px;margin-left: -70px" href="ci/ciCustBaseInfo.html" target="rightFrame">对公客户基本信息维护</a><i></i></li>
                <li><cite></cite><a style="height: 30px;" href="ci/cipersonBaseInfo.html"  target="rightFrame">对私客户基本信息维护</a><i></i></li>
            </ul>
        </dd>
        <dd>
            <div class="title">
                <span><img src="/images/leftico01.png" /></span>授信管理
            </div>
            <ul class="menuson">
                <li><cite></cite><a href="cl/clCreditApply.html" target="rightFrame">授信申请</a><i></i></li>
            </ul>
        </dd>
        <dd>
            <div class="title">
                <span><img src="/images/leftico01.png" /></span>合同放款
            </div>
            <ul class="menuson">
                <li><cite></cite><a href="gc/gcContract.html" target="rightFrame">合同签订</a><i></i></li>
                <li><cite></cite><a href="gc/gcCredit.html" target="rightFrame">贷款发放</a><i></i></li>
            </ul>
        </dd>
        <dd>
            <div class="title">
                <span><img src="/images/leftico01.png" /></span>统计查询
            </div>
            <ul class="menuson">
                <li><cite></cite><a href="/mi/miLoanStat.html" target="rightFrame">贷款信息统计</a><i></i></li>
            </ul>
        </dd>
        <dd>
            <div class="title">
                <span><img src="/images/leftico01.png" /></span>系统管理
            </div>
            <ul class="menuson">
                <li><cite></cite><a href="/loginAction_userInfo.action" target="rightFrame">用户管理</a><i></i></li>
                <li><cite></cite><a href="pm/groupInfo.html" target="rightFrame">机构管理</a><i></i></li>
                <li><cite></cite><a href="pm/paramClassInfo.html" target="rightFrame">参数管理</a><i></i></li>
            </ul>
        </dd>

    </dl>

</s:if>
</body>
</html>

<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/8/20
  Time: 13:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>用户管理---添加</title>
    <%@include file="../../common/head.jsp" %>
    <script type="text/javascript">
        $(document).ready(function(){
            $(".click").click(function(){
                $(".tip").fadeIn(200);
            });

            $(".tiptop a").click(function(){
                $(".tip").fadeOut(200);
            });

            $(".sure").click(function(){
                $(".tip").fadeOut(100);
            });

            $(".cancel").click(function(){
                $(".tip").fadeOut(100);
            });

        });
    </script>
</head>
<body>
<div class="place">
    <span>位置：</span>
    <ul class="placeul">
        <li><a href="userInfo.html">用户管理</a></li>
        <li><a href="/loginAction_userAddHtml.action">添加</a></li>
    </ul>
</div>

<form action="/loginAction_userAddHtml.action" method="post">
    <div class="formbody">
        <div class="formtitle"><span>用户基本信息</span></div>

        <ul class="forminfo">
            <li><label>账号</label>
                <input name="" type="text" class="dfinput" value=""/>
            </li>
            <li>
                <label>姓名</label>
                <input name="" type="text" class="dfinput" value=""/>
            </li>
            <li>
                <label>性别</label><cite>
                <input name="sex" type="radio" value="" checked="checked" />
                男&nbsp;&nbsp;&nbsp;&nbsp;
                <input name="sex" type="radio" value="" />女</cite>
            </li>
            <li>
                <label>出生日期</label>
                <input name="" type="text" class="dfinput" value=""/>
            </li>
            <li>
                <label>所属机构</label>
                <cite>
                    <select class="dfselect">
                        <option value="0">请选择</option>
                        <option value="000000" >山东农村信用社省联社</option>
                        <option value="0100000">山东农村信用社济南分行</option>
                        <option value="011000">山东农村信用社高新区支行</option>
                    </select>
                </cite>
            </li>
            <li>
                <label>角色</label>
                <cite>
                    <select class="dfselect">
                        <option value="0">请选择</option>
                        <option value="1" >管理员</option>
                        <option value="2">客户经理</option>
                        <option value="2">支行行长</option>
                    </select>
                </cite>
            </li>
            <li>
                <label>&nbsp;</label>
                <input name="" type="submit" class="btn" value="添加"/>
                &nbsp;&nbsp;&nbsp;&nbsp;
                <input name="" type="reset" class="btn" value="重置"/>
            </li>
        </ul>

    </div>
</form>
</body>
</html>

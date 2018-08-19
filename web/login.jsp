<%@ page language="java" import="java.util.*" pageEncoding="UTF-8" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>

<!DOCTYPE HTML>
<html>
<head>
    <base href="<%=basePath%>">
    <title>后台系统--登录</title>
    <link href="/css/style.css" rel="stylesheet" type="text/css" />
    <link href="/css/dl_menu.css" rel="stylesheet" type="text/css"/>
    <script type="text/javascript">
        function login() {
            var loginName = document.forms[0].elements["user.loginName"];
            var loginPass = document.forms[0].elements["user.passWord"];
            if (loginName.value == "" || loginPass.value == "") {
                alert("用户名或密码不能为空!");
                return;
            }
            document.forms[0].action = "loginAction_doLogin.action";
            document.forms[0].submit();//提交表单
        }
    </script>
</head>

<body style="background-color:#1c77ac; background-image:url(images/dl_back.jpg); background-repeat:no-repeat; background-position:center top; overflow:hidden;">
<form action="loginAction_doLogin.action" method="post" id="loginForm" name="loginForm">
    <div class="loginbody">
        <div class="loginbox">
            <ul>
                <li>
                    <strong>用&nbsp;户&nbsp;名：&nbsp;</strong>
                    <input name="user.loginName" type="text" class="loginuser" value="admin"/>
                </li>
                <li><strong>密&nbsp;&nbsp;码：&nbsp;&nbsp;&nbsp;&nbsp;</strong>
                    <input name="user.passWord" type="password" class="loginpwd" value="admin"/>
                </li>
                <li>
                    <input name="" type="button" class="loginbtn"
                           value="登录" onclick="login()"/><label>
                    <input name="" type="checkbox" value="" checked="checked"/>记住密码</label>
                </li>
                <s:if test="#request.msg!=null">
                    <li>
                        <span style="color: red;">${msg}</span>
                    </li>
                </s:if>

            </ul>
        </div>
    </div>
</form>
</body>
</html> 


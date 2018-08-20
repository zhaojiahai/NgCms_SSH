<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/8/18
  Time: 19:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>密码重置</title>
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
        function changePwd() {
            var loginName = $("#loginName").val();
            var oldPass = $("#passWord").val();
            var newPass = $("#newPass").val();
            var confirmPass = $("#confirmPass").val();

            if (objIsNull(loginName) || objIsNull(oldPass) ||
                objIsNull(newPass) || objIsNull(confirmPass)) {
                alert("内容填写不完整!");
                return false;
            }
            if (newPass!=confirmPass){
                alert("两次密码输入不一致!");
                return false;
            }
            return true;
        }

    </script>

</head>

<body>
<div class="place">
    <span>位置：</span>
    <ul class="placeul">
        <li><a href="#">重置密码</a></li>
    </ul>
</div>

<form action="loginAction_resetPassWord.action" method="post" onsubmit="return changePwd();">
    <div class="formbody">
        <div class="formtitle"><span>密码重置</span></div>

        <ul class="forminfo">
            <s:if test="#request.pwdMsg!=null">
                <li>
                    <span style="color: red;">${pwdMsg}</span>
                </li>
            </s:if>
            <li>
                <label>登录名</label>
                <input name="user.loginName" readonly="readonly"
                        id="loginName" type="text"
                       class="dfinput"
                       value="${user.loginName}"/>
            </li>
            <li>
                <label>原始密码</label><input id="passWord" name="user.passWord" type="password" class="dfinput" value=""/>
            </li>
            <li>
                <label>新密码</label><input id="newPass" name="newPass" type="password" class="dfinput" value=""/>
            </li>
            <li>
                <label>确认密码</label><input id="confirmPass" name="confirmPass" type="password" class="dfinput" value=""/></li>
            </li>
            <li>
                <label>&nbsp;</label>
                <input type="submit" class="btn" value="修改"/>
                &nbsp;&nbsp;&nbsp;&nbsp;
                <input name="" type="button" class="btn" value="关闭" onclick="window.close()"/>
            </li>
        </ul>

    </div>
</form>
</body>
</html>

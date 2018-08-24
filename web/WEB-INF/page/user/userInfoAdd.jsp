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
        <li><a href="/loginAction_userInfo.action">用户管理</a></li>
        <li><a href="javascript:;">添加</a></li>
    </ul>
</div>

<form id="userForm" action="/loginAction_userAdd.action" onsubmit="return checkForm();" method="post">
    <div class="formbody">
        <div class="formtitle"><span>用户基本信息</span></div>

        <ul class="forminfo">
            <li><label>账号</label>
                <input name="user.loginName" req="req" msg="账号" id="loginName" type="text" class="dfinput" value=""/>
            </li>
            <li>
                <label>姓名</label>
                <input name="user.name" req="req" msg="姓名" type="text" id="name" class="dfinput" value=""/>
            </li>
            <li>
                <label>性别</label><cite>
                <input name="user.sex" type="radio" value="1" checked="checked" />
                男&nbsp;&nbsp;&nbsp;&nbsp;
                <input name="user.sex" type="radio" value="0" />女</cite>
            </li>
            <li>
                <label>邮箱</label>
                <input name="user.email" req="req" msg="邮箱" type="text" id="email" class="dfinput" value=""/>
            </li>

            <li>
                <label>密码提示问题</label>
                <input name="user.remark" req="req" msg="密码提示问题" type="text" id="remark" class="dfinput" value=""/>
            </li>

            <li>
                <label>出生日期</label>
                <input name="user.birth" req="req" msg="出生日期" readonly="readonly" id="birth" type="text" class="dfinput" value=""/>
            </li>
            <li>
                <label>所属机构</label>
                <cite>
                    <s:if test="#request.groups == null || #request.groups.size() == 0">
                        没有机构 请先增加机构
                    </s:if>
                    <s:else>
                        <select req="req" msg="所属机构" class="dfselect" id="groupId" name="user.groupId">
                            <option value="0">请选择</option>
                            <c:forEach items="${groups}" var="group">
                                <option value="${group.id}" >${group.name}</option>
                            </c:forEach>
                        </select>
                    </s:else>
                </cite>
            </li>
            <li>
                <label>角色</label>
                <cite>
                    <select req="req" msg="角色" class="dfselect" id="roleid" name="user.roleid">
                        <option value="0">请选择</option>
                        <option value="1" >管理员</option>
                        <option value="2">客户经理</option>
                        <option value="2">支行行长</option>
                    </select>
                </cite>
            </li>
            <li>
                <label>&nbsp;</label>

                <input type="submit" class="btn" value="添加"/>
                &nbsp;&nbsp;&nbsp;&nbsp;
                <input type="reset" class="btn" value="重置"/>
            </li>
        </ul>

    </div>
</form>
</body>
</html>
<script>
    $(function () {
        layui.use('laydate', function(){
            var laydate = layui.laydate;

            //执行一个laydate实例
            laydate.render({
                elem: '#birth' //指定元素
            });
        });

    })

    function checkForm() {
        //检查表单
        return formValueCheck('userForm');
    }
</script>
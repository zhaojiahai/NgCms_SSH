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

<form action="/loginAction_userAdd.action" onsubmit="return checkForm();" method="post">
    <div class="formbody">
        <div class="formtitle"><span>用户基本信息</span></div>

        <ul class="forminfo">
            <li><label>账号</label>
                <input name="user.loginName" id="loginName" type="text" class="dfinput" value=""/>
            </li>
            <li>
                <label>姓名</label>
                <input name="user.name" type="text" id="name" class="dfinput" value=""/>
            </li>
            <li>
                <label>性别</label><cite>
                <input name="user.sex" type="radio" value="1" checked="checked" />
                男&nbsp;&nbsp;&nbsp;&nbsp;
                <input name="user.sex" type="radio" value="0" />女</cite>
            </li>
            <li>
                <label>邮箱</label>
                <input name="user.email" type="text" id="email" class="dfinput" value=""/>
            </li>

            <li>
                <label>密码提示问题</label>
                <input name="user.remark" type="text" id="remark" class="dfinput" value=""/>
            </li>

            <li>
                <label>出生日期</label>
                <input name="user.birth" readonly="readonly" id="birth" type="text" class="dfinput" value=""/>
            </li>
            <li>
                <label>所属机构</label>
                <cite>
                    <s:if test="#request.groups == null || #request.groups.size() == 0">
                        没有机构 请先增加机构
                    </s:if>
                    <s:else>
                        <select class="dfselect" id="groupId" name="user.groupId">
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
                    <select class="dfselect" id="roleid" name="user.roleid">
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

    //检查表单完整性
    function checkForm() {
        var loginName = $("#loginName").val();
        if (objIsNull(loginName)){
            layer.msg('请输入账号');
            return false;
        }
        var name = $("#name").val();
        if (objIsNull(name)){
            layer.msg('请输入姓名');
            return false;
        }
        var birth = $("#birth").val();
        if (objIsNull(birth)){
            layer.msg('请选择生日');
            return false;
        }
        var email = $("#email").val();
        if (objIsNull(birth)){
            layer.msg('请输入邮箱');
            return false;
        }
        var remark = $("#remark").val();
        if (objIsNull(birth)){
            layer.msg('请输入密码提示问题');
            return false;
        }

        var groupId = $("#groupId").val();
        if (objIsNull(groupId) || groupId=='0'){
            layer.msg('请选择所属机构');
            return false;
        }
        var roleid = $("#roleid").val();
        if (objIsNull(roleid) || roleid=='0'){
            layer.msg('请选择角色');
            return false;
        }
        return true;
    }
</script>
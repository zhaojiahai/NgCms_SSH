<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/8/20
  Time: 13:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>用户信息修改</title>
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
        <li><a href="javascript:;">修改</a></li>
    </ul>
</div>

<form id="updateForm" action="/loginAction_userInfo.action" method="post" onsubmit="return checkUpdate();">
    <div class="formbody">
        <div class="formtitle"><span>用户基本信息</span></div>

        <ul class="forminfo">
            <li>
                <label>用户编号</label>
                <input name="user.id" id="userId"  readonly="readonly"
                       type="text" class="dfinput" value="${updateUser.id}"/><i>编号不允许修改</i>
            </li>
            <li>
                <label>姓名</label>
                <input name="upName" id="username"
                       type="text" class="dfinput" value="${updateUser.name}"/>
            </li>
            <li>
                <label>性别</label>
                <cite>
                <input name="upSex" <c:if test="${updateUser.sex== 1}">checked="checked"</c:if> type="radio" value="1" />男
                &nbsp;&nbsp;&nbsp;&nbsp;
                <input name="upSex"  <c:if test="${updateUser.sex== 0}">checked="checked"</c:if>  type="radio" value="0" />女</cite>
                </cite>
            </li>
            <li>
                <label>出生日期</label>
                <input name="upBirth" id="birth" readonly="readonly" type="text" class="dfinput"
                       value="<fmt:formatDate value="${updateUser.birth }" pattern="yyyy-MM-dd" />"/>

            </li>
            <li>
                <label>角色</label><cite>
                <select class="dfselect" id="role" name="upRole">
                    <option value="0" >请选择</option>
                    <option value="1" <c:if test="${updateUser.roleid== 1}">selected="selected"</c:if>>管理员</option>
                    <option value="2" <c:if test="${updateUser.roleid== 2}">selected="selected"</c:if>>客户经理</option>
                    <option value="2" <c:if test="${updateUser.roleid== 3}">selected="selected"</c:if>>支行行长</option>
                </select></cite>
            </li>
            <li>
                <label>&nbsp;</label>
                <input name="" type="submit" class="btn" value="修改"/>
                &nbsp;&nbsp;&nbsp;&nbsp;
                <input name="" type="reset" class="btn" value="重置"/>
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


    //检查更新信息完整性
    function checkUpdate() {
        var username = $("#username").val();
        if (objIsNull(username)){
            layer.msg('请输入用户名');
            return false;
        }
        var birth = $("#birth").val();
        if (objIsNull(birth)){
            layer.msg('请选择生日');
            return false;
        }
        var role = $("#role").val();
        if (objIsNull(role) || role=='0'){
            layer.msg('请选择角色');
            return false;
        }
        var fromData = $("#updateForm").serialize();
        //请求数据
        postRequest('/loginAction_userUpdate.action',fromData,function (json) {
            if (json.code==1){
                layer.msg("修改成功");
            }else {
                layer.msg("修改失败");
            }
        });
        return false;
    }
</script>
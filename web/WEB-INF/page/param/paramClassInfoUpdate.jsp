<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/8/24
  Time: 14:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
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
        <li><a href="/paramClassAction_pmClassInfo.action">参数大类管理</a></li>
        <li><a href="javascript:;">修改</a></li>
    </ul>
</div>

<form id="from" action="" onsubmit="return checkForm();" method="post">
    <div class="formbody">
        <div class="formtitle"><span>参数大类基本信息</span></div>

        <ul class="forminfo">
            <li>
                <label>id</label>
                <input name="pmClassId" type="text" readonly="readonly" class="dfinput" value="${updateEntity.id}"/>
                <i>id不允许修改</i>
            </li>
            <li>
                <label>序号</label>
                <input name="" type="text" readonly="readonly" class="dfinput" value="${updateEntity.code}"/>
                <i>编号不允许修改</i>
            </li>
            <li>
                <label>参数大类Key</label>
                <input name="upPmKey" type="text" req="req" msg="参数大类Key" class="dfinput" value="${updateEntity.pmKey}"/>
            </li>
            <li>
                <label>参数大类名称</label>
                <input name="upPmName" type="text" req="req"  msg="参数大类名称" class="dfinput" value="${updateEntity.name}"/>
            </li>
            <li>
                <label>&nbsp;</label>
                <input type="submit" class="btn" value="修改"/>
                &nbsp;&nbsp;&nbsp;&nbsp;
                <input type="reset" class="btn" value="重置"/>
            </li>
        </ul>

    </div>
</form>
</body>
</html>
<script>
    //检查表单
    function checkForm() {
        var flag = formValueCheck('from');

        if (flag){
            var fromData = $("#from").serialize();
            //请求数据
            postRequest('/paramClassAction_pmClassUpdate.action',fromData,function (json) {
                if (json.code==1){
                    layer.msg("修改成功");
                }else {
                    layer.msg("修改失败");
                }
            });
        }
        return false;
    }
</script>
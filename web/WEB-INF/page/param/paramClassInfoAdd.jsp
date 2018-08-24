<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/8/24
  Time: 10:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>参数类别添加</title>
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
        <li><a href="javascript:;">添加</a></li>
    </ul>
</div>

<form id="form" action="" method="post" onsubmit="return checkForm();">
    <div class="formbody">
        <div class="formtitle"><span>参数大类基本信息</span></div>

        <ul class="forminfo">
            <li>
                <label>序号</label>
                <input name="pmClassEntity.code" req="req" msg="序号" type="text" class="dfinput" value=""/>
            </li>
            <li>
                <label>参数大类Key</label>
                <input name="pmClassEntity.pmKey" req="req" msg="参数大类Key" type="text" class="dfinput" value=""/>
            </li>
            <li>
                <label>参数大类名称</label>
                <input name="pmClassEntity.name" req="req" msg="参数大类名称" type="text" class="dfinput" value=""/>
            </li>
            <li>
                <label>&nbsp;</label>
                <input  type="submit" class="btn" value="添加"/>
                &nbsp;&nbsp;&nbsp;&nbsp;
                <input  type="reset" class="btn" value="重置"/>
            </li>
        </ul>

    </div>
</form>
</body>
</html>
<script>
    function checkForm() {
        //检查表单
        var flag =  formValueCheck('form');
        if (flag){
            var fromData = $("#form").serialize();
            //请求数据
            postRequest('/paramClassAction_pmClassAdd.action',fromData,function (json) {
                if (json.code==1){
                    layer.alert("添加成功",function () {
                        window.location.href = pmClassInfoUrl;
                    });
                }else {
                    layer.alert("添加失败");
                }
            });
        }
        return false;
    }

</script>
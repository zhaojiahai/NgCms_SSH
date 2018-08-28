<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/8/23
  Time: 15:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>组织列表</title>
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
        <li><a href="/groupAction_groupInfo.action">机构维护</a></li>
        <li><a href="javascript:;">修改</a></li>
    </ul>
</div>
    <form id="groupForm" onsubmit="return checkUpdate();" action="/groupAction_groupInfo.action" method="post">
        <div class="formbody">
            <div class="formtitle"><span>机构基本信息</span></div>

            <ul class="forminfo">
                <li>
                    <label>机构id</label>
                    <input name="group.id" type="text"
                           readonly="readonly" class="scinput" value="${updateGroup.id}"/><i>id不允许修改</i>
                </li>

                <li>
                    <label>机构编号</label>
                    <input name="upcode" type="text" readonly="readonly"
                           class="scinput" value="${updateGroup.code}"/><i>编号不允许修改</i>
                </li>
                <li>
                    <label>机构名称</label>
                    <input name="upname" msg="机构名称" id="name" req="req" type="text" class="scinput" value="${updateGroup.name}" />
                </li>
                <li>
                    <label>上级机构</label>
                    <input name="upparentid" id="parentid" type="text" class="scinput" value="${updateGroup.parentid}" />
                </li>
                <li>
                    <label>机构简称</label>
                    <input name="upbriefname" msg="机构简称" req="req" id="briefname" type="text" class="scinput" value="${updateGroup.briefname}" />
                </li>
                <li>
                    <label>创建时间</label>
                    <input name="upcreatedtime" msg="创建时间" req="req" id="createdtime" type="text" class="scinput"
                           value="<fmt:formatDate value="${updateGroup.createdtime }" pattern="yyyy-MM-dd" />" />
                </li>
                <li>
                    <label>&nbsp;</label>
                    <input type="submit" class="scbtn" value="修改"/>
                </li>
            </ul>

        </div>
    </form>

</body>

<script type="text/javascript">
    $('.tablelist tbody tr:odd').addClass('odd');
    var checkFlag = true;

    //开关选择
    $("#toggle").click(function () {
        $("input[name='ids']").attr('checked',checkFlag);
        checkFlag = !checkFlag;
    })

    function checkUpdate() {
        //检查表单
        var flag = formValueCheck('groupForm');

        if (flag){
            var fromData = $("#groupForm").serialize();
            //请求数据
            postRequest('/groupAction_groupUpdate.action',fromData,function (json) {
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

</html>

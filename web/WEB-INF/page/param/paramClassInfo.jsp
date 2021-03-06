<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/8/24
  Time: 10:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>类别列表</title>
    <%@include file="../../common/head.jsp" %>

    <script type="text/javascript">
        function confirmMsgDel()
        {
            if(confirm("删除参数大类信息,您确定要删除吗?"))
                window.close();
        }
        function userOpen()
        {
            if(confirm("您确定要启用该用户吗?"))
                window.close();
        }
        function userClose()
        {
            if(confirm("您确定要禁用该用户吗?"))
                window.close();
        }
        function resetPass()
        {
            if(confirm("重置密码,您确定要恢复初始密码吗?"))
                window.close();
        }
    </script>
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

        function goPage(number) {
            //页数校验一下 是否超出范围
            var minPage = 1;
            var maxPage = ${pageBean.totalPage};
            if(number <minPage || number>maxPage){
                layer.msg('页数过大或者过小');
                return;
            }
            //判断是否是本页 如果是就不用跳转
            if(number== ${pageBean.currentPage}){
                return;
            }
            gotoPageNum(number);
        }
        //跳转到指定的页面
        function skip() {
            var index = $("#pageNumber").val();
            //页数校验一下 是否超出范围
            var minPage = 1;
            var maxPage = ${pageBean.totalPage};
            if(index <minPage || index>maxPage){
                layer.msg('页数过大或者过小');
                $("#pageNumber").val('');
                return;
            }

            gotoPageNum(index);
        }
        //提交表单查询
        function gotoPageNum(pageNum){
            $("#currentPage").val(pageNum);
            $("#groupForm").submit();
        }

    </script>
</head>
<body>

<div class="place">
    <span>位置：</span>
    <ul class="placeul">
        <li><a href="javascript:;">参数大类管理</a></li>
    </ul>
</div>
<form action="/paramClassAction_pmClassInfo.action" method="post">
    <div class="formbody">
        <ul class="seachform">
            <%--页数--%>
            <input type="hidden" name="currentPage" id="currentPage">
            <li>
                <label>参数大类key</label>
                <input name="pmClassEntity.pmKey" type="text" class="scinput" value="${pmKey}"/>
            </li>
            <li>
                <label>参数大类名称</label>
                <input name="pmClassEntity.name" type="text" class="scinput" value="${pmName}"/>
            </li>
            <li>
                <label>&nbsp;</label>
                <input type="submit" class="scbtn" value="查询"/>
            </li>
        </ul>
    </div>

    <div class="rightinfo">
        <div class="tools">
            <ul class="toolbar1">
                <li><a href="/paramClassAction_pmClassAddHtml.action"><span><img src="/images/t01.png" /></span>添加</a></li>
                <li><a id="updatePmClass"><span><img src="/images/t02.png" /></span>修改</a></li>
                <li><a id="deletePmClass" ><span><img src="/images/t03.png"/></span>删除</a></li>
                <li><a href="paramParamInfo.html" ><span><img src="/images/t02.png"/></span>参数维护</a></li>
            </ul>
        </div>
        <s:if test="#request.pageBean.list == null || #request.pageBean.list.size() == 0">
            没有任何机构信息
        </s:if>
        <s:else>
            <table class="tablelist">
                <thead>
                <tr class="tablehead"><td colspan="11">参数大类列表</td></tr>
                </thead>
                <thead>
                <tr>
                    <th>
                        <input id="toggle" type="checkbox" value=""/>
                    </th>
                    <th>id</th>
                    <th>序号</th>
                    <th>参数大类Key</th>
                    <th>参数大类名称</th>
                </tr>
                </thead>
                <tbody>
                <s:iterator value="#request.pageBean.list">
                    <tr>
                        <td><input name="ids" type="checkbox" value="${id}" /></td>
                        <td>${id}</td>
                        <td>${code}</td>
                        <td>${pmKey}</td>
                        <td>${name}</td>
                    </tr>
                </s:iterator>
                </tbody>
            </table>

            <div class="pagin">
                <table width="100%" border="0" cellspacing="0" cellpadding="0">
                    <tr>
                        <td class="STYLE4">
                            <div class="message">共<i class="blue">${pageBean.totalCount}</i>
                                条记录，当前显示第&nbsp;
                                <i class="blue">${pageBean.currentPage}&nbsp;</i>页
                            </div>
                        </td>
                        <td><table border="0" align="right" cellpadding="0" cellspacing="0">
                            <tr>
                                <td width="45">
                                    <img src="/images/first.gif" width="33" height="20" style="cursor:hand"
                                         onclick="goPage(1)"/></td>
                                <td width="50">
                                    <img src="/images/back.gif" width="43" height="20" style="cursor:hand"
                                         onclick="goPage(${pageBean.currentPage-1})"/></td>
                                <td width="50">
                                    <img src="/images/next.gif" width="43" height="20" style="cursor:hand"
                                         onclick="goPage(${pageBean.currentPage+1})"/></td>
                                <td width="40">
                                    <img src="/images/last.gif" width="33" height="20" style="cursor:hand"
                                         onclick="goPage(${pageBean.totalPage})"/></td>
                                <td width="100"><div align="center"><span class="STYLE1">转到第
	                    <input name="textfield" id="pageNumber" type="number" step="1" min="1" max="${pageBean.totalPage}" size="4" style="height:16px; width:35px; border:1px solid #999999;" />
	                    页 </span></div></td>
                                <td width="40"><img src="/images/go.gif" width="33" height="17"
                                                    style="cursor:hand"
                                                    onclick="skip()"/></td>
                            </tr>
                        </table>
                        </td>
                    </tr>
                </table>
            </div>
        </s:else>


    </div>
</form>

<script type="text/javascript">
    var checkFlag = true;
    $('.tablelist tbody tr:odd').addClass('odd');

    //开关选择
    $("#toggle").click(function () {
        $("input[name='ids']").attr('checked',checkFlag);
        checkFlag = !checkFlag;
    })

    //修改
    $("#updatePmClass").click(function () {
        var len = $("input[name='ids']:checked").length;
        if (len<=0){
            layer.msg('请选择要修改的内容!');
            return;
        }
        if (len!=1){
            layer.msg('一次只能修改一个!');
            return;
        }
        var updateId = $("input[name='ids']:checked").val();
        window.location.href = "/paramClassAction_pmClassUpdateHtml.action?pmClassId="+updateId;
    })
    //删除
    $("#deletePmClass").click(function () {
        var len = $("input[name='ids']:checked").length;
        if (len<=0){
            layer.msg('请选择要删除的用户!');
            return;
        }
        //弹框
        layer.confirm('确定要删除吗?', function(index){
            if (index==1){
                //读取id
                var param = buildUserSelect();
                console.log(param);

                layer.close(index);
                //调用删除
                postRequest(pmClassDeleteInfoUrl,{'deletes':param},function (json) {
                    if (json.code==1){
                        layer.alert('删除成功', function(){
                            window.location.href = pmClassInfoUrl;
                        });
                    } else {
                        layer.alert("删除失败");
                    }
                });

            }
        });

    })

    function buildUserSelect() {
        //读取id
        var arr = $("input[name='ids']:checked");
        var param = "";
        //拼接id  结果类似  1,2,3,4,5
        for(var i=0;i<arr.length;i++){
            if(i==arr.length-1){
                param+=arr[i].value;
            }else {
                param+=arr[i].value+",";
            }
        }
        return param;
    }

</script>


</body>
</html>

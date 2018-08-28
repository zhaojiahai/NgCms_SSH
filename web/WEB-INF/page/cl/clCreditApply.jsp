<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/8/27
  Time: 14:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>授信申请信息管理</title>
    <%@include file="../../common/head.jsp" %>
    <script type="text/javascript">
        function confirmMsgDel() {
            if (confirm("删除授信申请信息,您确定要删除吗?"))
                window.close();
        }

    </script>
    <script type="text/javascript">
        $(document).ready(function () {
            $(".click").click(function () {
                $(".tip").fadeIn(200);
            });

            $(".tiptop a").click(function () {
                $(".tip").fadeOut(200);
            });

            $(".sure").click(function () {
                $(".tip").fadeOut(100);
            });

            $(".cancel").click(function () {
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
            $("#form").submit();
        }

    </script>

</head>
<body>

<div class="place">
    <span>位置：</span>
    <ul class="placeul">
        <li><a href="#">授信申请信息管理</a></li>
    </ul>
</div>
<form action="/clCreditAction_creditInfo.action" id="form" method="post">
    <div class="formbody">
        <ul class="seachform">
            <%--页数--%>
            <input type="hidden" name="currentPage" id="currentPage">

            <li><label>客户编号</label>
                <input name="entity.custid" value="${custid}" type="text" class="scinput"/>
            </li>
            <li><label>客户名称</label>
                <input name="entity.custname" value="${custname}" type="text" class="scinput"/>
            </li>
            <li><label>授信申请日期</label>
                <input name="entity.createdate"
                       value="<fmt:formatDate value="${searchDate}" pattern="yyyy-MM-dd HH:mm:ss"/>"
                       id="date" type="text" class="scinput"/>
            </li>
            <li><label>&nbsp;</label><input type="submit" class="scbtn" value="查询"/></li>
        </ul>
    </div>

    <div class="rightinfo">
        <div class="tools">
            <ul class="toolbar1">
                <li><a href="/clCreditAction_creditAddHtml.action"><span><img src="/images/t01.png"/></span>添加</a></li>
                <li><a id="creditUpdate"><span><img src="/images/t02.png"/></span>修改</a></li>
                <li><a id="creditDelete"><span><img src="/images/t03.png"/></span>删除</a></li>
            </ul>
        </div>
        <s:if test="#request.pageBean.list == null || #request.pageBean.list.size() == 0">
            没有任何信息
        </s:if>

        <s:else>
        <table class="tablelist">
            <thead>
            <tr class="tablehead">
                <td colspan="11">授信申请信息列表</td>
            </tr>
            </thead>
            <thead>
            <tr>
                <th>
                    <input name="" id="toggle" type="checkbox" value=""/>
                </th>
                <th>客户编号</th>
                <th>客户名称</th>
                <th>业务类型</th>
                <th>金额(元)</th>
                <th>币种</th>
                <th>期限(月)</th>
                <th>使用方式</th>
                <th>主担保方式</th>
                <th>授信申请起始日期</th>
                <th>主办客户经理</th>
            </tr>
            </thead>
            <tbody>
            <s:iterator value="#request.pageBean.list">
                <tr>
                    <td>
                        <input name="ids" type="checkbox" value="${id}"/>
                    </td>
                    <td>${custid}</td>
                    <td>${custname}</td>
                    <td>
                        <c:if test="${busitype=='00'}" >
                            个人经营类贷款
                        </c:if>
                        <c:if test="${busitype=='01'}" >
                            个人消费类贷款
                        </c:if>
                        <c:if test="${busitype=='02'}" >
                            个人购房贷款
                        </c:if>
                        <c:if test="${busitype=='03'}" >
                            助学贷款
                        </c:if>
                        <c:if test="${busitype=='04'}" >
                            个人其他贷款
                        </c:if>
                    </td>
                    <td>${money}</td>

                    <td>
                        <c:if test="${currency=='CNY'}" >
                            人民币
                        </c:if>
                        <c:if test="${currency=='USD'}" >
                            美元
                        </c:if>
                        <c:if test="${currency=='EUR'}" >
                            欧元
                        </c:if>
                        <c:if test="${currency=='HKD'}" >
                            港元
                        </c:if>
                        <c:if test="${currency=='DEM'}" >
                            德国马克
                        </c:if>
                        <c:if test="${currency=='AUD'}" >
                            澳大利亚元
                        </c:if>
                        <c:if test="${currency=='CAD'}" >
                            加拿大元
                        </c:if>
                        <c:if test="${currency=='SEK'}" >
                            瑞典克朗
                        </c:if>
                        <c:if test="${currency=='SGD'}" >
                            新加坡元
                        </c:if>
                        <c:if test="${currency=='NZD'}" >
                            新西兰元
                        </c:if>

                    </td>

                    <td>${climit}</td>
                    <td>
                        <c:if test="${usetype=='00'}" >
                            一次性
                        </c:if>
                        <c:if test="${usetype=='01'}" >
                            循环
                        </c:if>
                    </td>
                    <td></td>
                    <td>
                        <s:date name="createdate" format="yyyy-MM-dd HH:mm:ss"/>
                    </td>
                    <td>${busimanager}</td>
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
                    <td>
                        <table border="0" align="right" cellpadding="0" cellspacing="0">
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
                                <td width="100">
                                    <div align="center"><span class="STYLE1">转到第
	                    <input name="textfield" id="pageNumber" type="number" step="1" min="1"
                               max="${pageBean.totalPage}" size="4"
                               style="height:16px; width:35px; border:1px solid #999999;"/>
	                    页 </span></div>
                                </td>
                                <td width="40"><img src="/images/go.gif" width="33" height="17"
                                                    style="cursor:hand"
                                                    onclick="skip()"/></td>
                            </tr>
                        </table>
                    </td>
                </tr>
            </table>
            </s:else>
        </div>
    </div>
</form>

<script type="text/javascript">
    $('.tablelist tbody tr:odd').addClass('odd');

    var checkFlag = true;

    //开关选择
    $("#toggle").click(function () {
        $("input[name='ids']").attr('checked',checkFlag);
        checkFlag = !checkFlag;
    })


    //日期选择
    layui.use('laydate', function(){
        var laydate = layui.laydate;
        laydate.render({
            elem: '#date'
        });
    });

    //修改
    $("#creditUpdate").click(function () {
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
        window.location.href = "/clCreditAction_creditUpdateHtml.action?entityId="+updateId;
    });

    //删除
    $("#creditDelete").click(function () {
        var len = $("input[name='ids']:checked").length;
        if (len<=0){
            layer.msg('请选择要删除的内容!');
            return;
        }
        //弹框
        layer.confirm('确定要删除吗?', function(index){
            //读取id
            var param = buildUserSelect();
            layer.close(index);
            postRequest(clCreditDeleteUrl,{'deletes':param},function (json) {
                if (json.code==1){
                    layer.alert('删除成功', function(){
                        window.location.href = clCreditInfoUrl;
                    });

                } else {
                    layer.alert("删除失败");
                }
            });
        });
    });

    //是否选中了用户
    function checkSelectUser() {
        var len = $("input[name='ids']:checked").length;
        if (len<=0){
            return false;
        }
        return true;
    }

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

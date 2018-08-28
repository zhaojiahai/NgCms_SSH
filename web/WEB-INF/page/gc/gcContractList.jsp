<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/8/27
  Time: 14:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>合同列表</title>
    <%@include file="../../common/head.jsp" %>
    <link href="/css/select.css" rel="stylesheet" type="text/css"/>
    <script type="text/javascript" src="/js/jquery.idTabs.min.js"></script>
    <script type="text/javascript" src="/js/select-ui.min.js"></script>
    <script type="text/javascript" src="/editor/kindeditor.js"></script>
    <script type="text/javascript">
        function confirmMsgDel() {
            if (confirm("删除例会记录,您确定要删除吗?"))
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
        <li><a href="#">合同签订</a></li>
    </ul>
</div>

<form action="/contractAction_contractInfo.action" method="post" id="form">

    <div class="formbody">
        <ul class="seachform">
            <%--页数--%>
            <input type="hidden" name="currentPage" id="currentPage">

            <li>
                <label>客户编号</label>
                <input name="entity.appcode" type="text" class="scinput" value="${appcode}" />
            </li>
            <li><label>客户名称</label><input name="" type="text" class="scinput" /></li>
            <li><label>审批书号</label><input name="" type="text" class="scinput" /></li>
            <li><label>&nbsp;</label>
                <input type="submit" class="scbtn" value="查询"/>
            </li>
        </ul>
    </div>

    <div class="rightinfo">
        <div class="tools">
            <ul class="toolbar1">
                <li><a href="/contractAction_contractAddHtml.action"><span><img src="/images/t01.png"/></span>新增合同</a>
                </li>
            </ul>
        </div>
        <s:if test="#request.pageBean.list == null || #request.pageBean.list.size() == 0">
            没有任何信息
        </s:if>
        <s:else>
        <table class="tablelist">
            <thead>
            <tr class="tablehead">
                <td colspan="8">合同列表</td>
            </tr>
            </thead>
            <thead>
            <tr>
                <th>
                    <input name="" type="radio" value=""/></th>
                <th>客户编号</th>
                <th>业务品种</th>
                <th>合同金额</th>
                <th>币种</th>
                <th>使用机构</th>
                <th>合同起始日期</th>
                <th>合同到期日期</th>
            </tr>
            </thead>
            <tbody>
            <s:iterator value="#request.pageBean.list">
                <tr>
                    <td>
                        <input name="ids" type="radio" value="${id}"/>
                    </td>
                    <td>${appcode}</td>
                    <td>${id}</td>
                    <td>${id}</td>
                    <td>${currency}</td>
                    <td>${id}</td>
                    <td>${startdate}</td>
                    <td>${enddate}</td>
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
        </div>

    </div>
    </s:else>

</form>

<script type="text/javascript">
    $('.tablelist tbody tr:odd').addClass('odd');
</script>

</body>
</html>

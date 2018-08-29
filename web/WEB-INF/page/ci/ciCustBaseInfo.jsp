<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/8/29
  Time: 11:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>对公客户信息维护</title>
    <%@include file="../../common/head.jsp" %>
    <script type="text/javascript" src="/js/jquery.idTabs.min.js"></script>
    <script type="text/javascript" src="/js/select-ui.min.js"></script>
    <script type="text/javascript" src="/kindeditor/kindeditor.js"></script>

    <script type="text/javascript">
        function confirmMsgDel() {
            if (confirm("删除客户信息,您确定要删除吗?"))
                window.close();
        }
        function exportMsg() {
            if (confirm("您确定要导出吗?"))
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
    </script>
    <script type="text/javascript">
        KE.show({
            id: 'content7',
            cssPath: './index.css'
        });
    </script>

    <script type="text/javascript">
        $(document).ready(function (e) {
            $(".select1").uedSelect({
                width: 100
            });
            $(".select2").uedSelect({
                width: 167
            });
            $(".select3").uedSelect({
                width: 100
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
        <li><a href="#">对公客户信息维护</a></li>
    </ul>
</div>
<form action="/ciCustBaseAction_ciCustBaseInfo.action" method="post">
    <div class="formbody">
        <ul class="seachform">
            <%--页数--%>
            <input type="hidden" name="currentPage" id="currentPage">

            <li><label>客户编号</label>
                <input name="entity.custid" type="text" value="${custid}" class="scinput"/>
            </li>
            <li><label>客户名称</label>
                <input name="entity.cname" type="text" value="${cname}" class="scinput"/>
            </li>
            <li>
                <div class="vocation">
                    <select id="custType" style="height: 32px;"
                            class="dfselect1" name="entity.custtype">
                        <option value="0" selected>请选择客户类型</option>
                        <option value="00" <c:if test="${custtype== '00'}">selected="selected"</c:if> >企业类客户</option>
                        <option value="01" <c:if test="${custtype== '01'}">selected="selected"</c:if>>事业类客户</option>
                        <option value="02" <c:if test="${custtype== '02'}">selected="selected"</c:if>>其他经济组织</option>
                    </select>
                </div>
            </li>
            <li><label>&nbsp;</label>
                <input type="submit" class="scbtn" value="查询"/>
            </li>
        </ul>
    </div>

    <div class="rightinfo">
        <div class="tools">
            <ul class="toolbar1">
                <li><a href="/ciCustBaseAction_ciCustBaseAddHtml.action">
                    <span><img src="/images/t01.png"/></span>添加</a>
                </li>
                <li><a id="update"><span><img src="/images/t02.png"/></span>修改</a></li>
                <li><a><span><img src="/images/t06.png" height="24" width="20"/></span>导出</a></li>
                <li><a><span><img src="/images/t02.png"/></span>辅助信息</a></li>
            </ul>
        </div>

        <s:if test="#request.pageBean.list == null || #request.pageBean.list.size() == 0">
            没有任何信息
        </s:if>
        <s:else>
        <table class="tablelist">
            <thead>
            <tr class="tablehead">
                <td colspan="10">客户信息列表</td>
            </tr>
            </thead>
            <thead>
            <tr>
                <th>
                    <input name="" type="checkbox" value=""/>
                </th>
                <th>客户编号</th>
                <th>客户名称</th>
                <th>客户类型</th>
                <th>组织机构代码证</th>
                <th>主办客户经理</th>
                <th>所属机构</th>
                <th></th>
            </tr>
            </thead>
            <tbody>
            <s:iterator value="#request.pageBean.list">
                <tr>
                    <td>
                        <input name="ids" type="checkbox" value="${id}"/>
                    </td>
                    <td>${custid}</td>
                    <td>${cname}</td>
                    <td>
                        <c:if test="${custtype=='00'}">
                            企业类客户
                        </c:if>
                        <c:if test="${custtype=='01'}">
                            事业类客户
                        </c:if>
                        <c:if test="${custtype=='02'}">
                            其他经济组织
                        </c:if>
                    </td>
                    <td>${orgcertcode}</td>
                    <td>${busimanager}</td>
                    <td>${groupid}</td>
                    <td>
                        <a href="/ciCustBaseAction_ciCustBaseDetailHtml.action?entityId=${id}" class="tablelink">查看</a>
                    </td>
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

    //修改
    $("#update").click(function () {
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
        window.location.href = "ciCustBaseAction_ciCustBaseUpdateHtml.action?entityId="+updateId;
    })
</script>


</body>
</html>

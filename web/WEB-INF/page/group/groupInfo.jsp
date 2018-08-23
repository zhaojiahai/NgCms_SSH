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
        function confirmMsgDel()
        {
            if(confirm("删除机构信息,您确定要删除吗?"))
                window.close();
        }
        function groupOpen()
        {
            if(confirm("您确定要启用该机构吗?"))
                window.close();
        }
        function groupClose()
        {
            if(confirm("您确定要禁用该机构吗?"))
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
        <li><a href="javascript:;">机构维护</a></li>
    </ul>
</div>

    <form id="groupForm" action="/groupAction_groupInfo.action" method="post">
        <div class="formbody">
            <ul class="seachform">
                    <%--页数--%>
                <input type="hidden" name="currentPage" id="currentPage">

                <li>
                    <label>机构编号</label>
                    <input name="group.code" type="text" class="scinput" value="${groupCode}"/>
                </li>
                <li>
                    <label>机构名称</label>
                    <input name="group.name" type="text" class="scinput" value="${groupName}" />
                </li>
                <li>
                    <label>&nbsp;</label>
                    <input name="" type="submit" class="scbtn" value="查询"/>
                </li>
            </ul>
        </div>
        <div class="rightinfo">
            <div class="tools">
                <ul class="toolbar1">
                    <li><a href="/groupAction_groupAddHtml.action"><span><img src="../images/t01.png" /></span>添加</a></li>
                    <li><a id="groupUpdate"><span><img src="../images/t02.png" /></span>修改</a></li>
                    <li><a href="javascript:groupOpen()" ><span><img src="../images/t08.png" height="24" width="24"/></span>启用</a></li>
                    <li><a href="javascript:groupClose()" ><span><img src="../images/t09.png" height="24" width="24"/></span>禁用</a></li>
                </ul>
            </div>
            <s:if test="#request.pageBean.list == null || #request.pageBean.list.size() == 0">
                没有任何机构信息
            </s:if>

            <s:else>
            <table class="tablelist">
                <thead>
                <tr class="tablehead"><td colspan="11">机构列表</td></tr>
                </thead>
                <thead>
                <tr>
                    <th>
                        <input id="toggle" type="checkbox" value=""/>
                    </th>
                    <th>机构id</th>
                    <th>机构编号</th>
                    <th>机构名称</th>
                    <th>上级机构</th>
                    <th>状态</th>
                    <th>注册时间</th>
                </tr>
                </thead>
                <tbody>
                <s:iterator value="#request.pageBean.list">
                    <tr>
                        <td>
                            <input name="ids" type="checkbox" value="${id}" />
                        </td>
                        <td>${id}</td>
                        <td>${code}</td>
                        <td>${name}</td>
                        <td>${parentName}</td>
                        <td>
                                ${valid==0?'启用':'禁用'}
                        </td>
                        <td>
                                <fmt:formatDate value="${createdtime}"/>
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

        </div>
    </form>

</s:else>



</body>

<script type="text/javascript">
    $('.tablelist tbody tr:odd').addClass('odd');
    var checkFlag = true;

    //开关选择
    $("#toggle").click(function () {
        $("input[name='ids']").attr('checked',checkFlag);
        checkFlag = !checkFlag;
    })

    //修改
    $("#groupUpdate").click(function () {
        var len = $("input[name='ids']:checked").length;
        if (len<=0){
            layer.msg('请选择要修改的机构!');
            return;
        }
        if (len!=1){
            layer.msg('一次只能修改一个机构!');
            return;
        }
        var updateId = $("input[name='ids']:checked").val();
        window.location.href = "/groupAction_groupUpdateHtml.action?groupId="+updateId;
    })
</script>

</html>

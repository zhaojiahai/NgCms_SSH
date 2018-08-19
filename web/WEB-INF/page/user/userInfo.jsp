<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/8/18
  Time: 19:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>用户管理</title>
    <%@include file="../../common/head.jsp" %>
    <script type="text/javascript">
        function confirmMsgDel()
        {
            if(confirm("删除用户信息,您确定要删除吗?"))
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
            if(confirm("重置密码,您确定要恢复初始密码吗?")){
                window.location.href = "/loginAction_resetPwd.action";
            }
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
    </script>

</head>

<body>
<div class="place">
    <span>位置：</span>
    <ul class="placeul">
        <li><a href="#">用户管理</a></li>
    </ul>
</div>
<form action="" method="post">
    <div class="formbody">
        <ul class="seachform">
            <li><label>用户编号</label><input name="" type="text" class="scinput" /></li>
            <li><label>姓名</label><input name="" type="text" class="scinput" /></li>
            <li><label>&nbsp;</label><input name="" type="submit" class="scbtn" value="查询"/></li>
        </ul>
    </div>

    <div class="rightinfo">
        <div class="tools">
            <ul class="toolbar1">
                <li><a href="userInfoAdd.html"><span><img src="/images/t01.png" /></span>添加</a></li>
                <li><a href="userInfoUpdate.html"><span><img src="/images/t02.png" /></span>修改</a></li>
                <li><a href="javascript:confirmMsgDel()" ><span><img src="/images/t03.png"/></span>删除</a></li>
                <li><a href="javascript:userOpen()" ><span><img src="/images/t08.png" height="24" width="24"/></span>启用</a></li>
                <li><a href="javascript:userClose()" ><span><img src="/images/t09.png" height="24" width="24"/></span>禁用</a></li>
                <li><a href="javascript:resetPass()" ><span><img src="/images/t07.png" height="20" width="20"/></span>重置密码</a></li>
            </ul>
        </div>
        <table class="tablelist">
            <thead>
            <tr class="tablehead"><td colspan="11">客户信息列表</td></tr>
            </thead>
            <thead>
            <tr>
                <th><input name="" type="checkbox" value=""/></th>
                <th>用户编号</th>
                <th>用户账号</th>
                <th>姓名</th>
                <th>所在机构</th>
                <th>状态</th>
                <th>注册时间</th>

            </tr>
            </thead>
            <tbody>
            <tr>
                <td><input name="" type="checkbox" value="" /></td>
                <td>1</td>
                <td>Admin</td>
                <td>张三</td>
                <td>公司业务部</td>
                <td>启用</td>
                <td>2015-10-30</td>
            </tr>
            <tr>
                <td><input name="" type="checkbox" value="" /></td>
                <td>2</td>
                <td>Jack</td>
                <td>李四</td>
                <td>资金管理部</td>
                <td>禁用</td>
                <td>2016-1-30</td>

            </tr>
            <tr>
                <td><input name="" type="checkbox" value="" /></td>
                <td>3</td>
                <td>Jack</td>
                <td>王红</td>
                <td>公司业务部</td>
                <td>启用</td>
                <td>2016-10-30</td>

            </tr>
            <tr>
                <td><input name="" type="checkbox" value="" /></td>
                <td>4</td>
                <td>Test</td>
                <td>公司业务部</td>
                <td>李磊</td>
                <td>启用</td>
                <td>2016-11-11</td>

            </tr>
            </tbody>
        </table>
        <div class="pagin">
            <table width="100%" border="0" cellspacing="0" cellpadding="0">
                <tr>
                    <td class="STYLE4"><div class="message">共<i class="blue">260</i>条记录，当前显示第&nbsp;<i class="blue">1&nbsp;</i>页</div>
                    </td>
                    <td><table border="0" align="right" cellpadding="0" cellspacing="0">
                        <tr>
                            <td width="45"><img src="/images/first.gif" width="33" height="20" style="cursor:hand" onclick="firstPage()"/></td>
                            <td width="50"><img src="/images/back.gif" width="43" height="20" style="cursor:hand" onclick="priviousPage()"/></td>
                            <td width="50"><img src="/images/next.gif" width="43" height="20" style="cursor:hand" onclick="nextPage()"/></td>
                            <td width="40"><img src="/images/last.gif" width="33" height="20" style="cursor:hand" onclick="lastPage()"/></td>
                            <td width="100"><div align="center"><span class="STYLE1">转到第
	                    <input name="textfield" type="text" size="4" style="height:16px; width:35px; border:1px solid #999999;" />
	                    页 </span></div></td>
                            <td width="40"><img src="/images/go.gif" width="33" height="17" style="cursor:hand" onclick="goPage()"/></td>
                        </tr>
                    </table>
                    </td>
                </tr>
            </table>
        </div>
    </div>
</form>

<script type="text/javascript">
    $('.tablelist tbody tr:odd').addClass('odd');
</script>

</body>
</html>

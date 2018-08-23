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
    </script>



</head>
<body>

<div class="place">
    <span>位置：</span>
    <ul class="placeul">
        <li><a href="#">机构维护</a></li>
    </ul>
</div>
<form action="" method="post">
    <div class="formbody">
        <ul class="seachform">
            <li><label>机构编号</label><input name="" type="text" class="scinput" /></li>
            <li><label>机构名称</label><input name="" type="text" class="scinput" /></li>
            <li><label>&nbsp;</label><input name="" type="submit" class="scbtn" value="查询"/></li>
        </ul>
    </div>

    <div class="rightinfo">
        <div class="tools">
            <ul class="toolbar1">
                <li><a href="groupInfoAdd.html"><span><img src="../images/t01.png" /></span>添加</a></li>
                <li><a href="groupInfoUpdate.html"><span><img src="../images/t02.png" /></span>修改</a></li>
                <li><a href="javascript:groupOpen()" ><span><img src="../images/t08.png" height="24" width="24"/></span>启用</a></li>
                <li><a href="javascript:groupClose()" ><span><img src="../images/t09.png" height="24" width="24"/></span>禁用</a></li>
            </ul>
        </div>
        <table class="tablelist">
            <thead>
            <tr class="tablehead"><td colspan="11">机构列表</td></tr>
            </thead>
            <thead>
            <tr>
                <th><input name="" type="checkbox" value=""/></th>
                <th>机构编号</th>
                <th>机构名称</th>
                <th>上级机构</th>
                <th>状态</th>
                <th>注册时间</th>
            </tr>
            </thead>
            <tbody>
            <tr>
                <td><input name="" type="checkbox" value="" /></td>
                <td>000000</td>
                <td>山东农村信用社省联社</td>
                <td>山东农村信用社省联社</td>
                <td>启用</td>
                <td>2016-12-30</td>
            </tr>
            <tr>
                <td><input name="" type="checkbox" value="" /></td>
                <td>010000</td>
                <td>济南槐荫区分行</td>
                <td>山东农村信用社省联社</td>
                <td>禁用</td>
                <td>2016-10-21</td>
            </tr>
            <tr>
                <td><input name="" type="checkbox" value="" /></td>
                <td>011000</td>
                <td>济南槐荫区段店支行</td>
                <td>济南槐荫区分行</td>
                <td>启用</td>
                <td>2016-12-21</td>
            </tr>
            <tr>
                <td><input name="" type="checkbox" value="" /></td>
                <td>012000</td>
                <td>济南市中区公司业务部</td>
                <td>济南槐荫区分行</td>
                <td>启用</td>
                <td>2016-12-21</td>
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
                            <td width="45"><img src="../images/first.gif" width="33" height="20" style="cursor:hand" onclick="firstPage()"/></td>
                            <td width="50"><img src="../images/back.gif" width="43" height="20" style="cursor:hand" onclick="priviousPage()"/></td>
                            <td width="50"><img src="../images/next.gif" width="43" height="20" style="cursor:hand" onclick="nextPage()"/></td>
                            <td width="40"><img src="../images/last.gif" width="33" height="20" style="cursor:hand" onclick="lastPage()"/></td>
                            <td width="100"><div align="center"><span class="STYLE1">转到第
	                    <input name="textfield" type="text" size="4" style="height:16px; width:35px; border:1px solid #999999;" />
	                    页 </span></div></td>
                            <td width="40"><img src="../images/go.gif" width="33" height="17" style="cursor:hand" onclick="goPage()"/></td>
                        </tr>
                    </table>
                    </td>
                </tr>
            </table>
        </div>
    </div>
</form>


</body>

<script type="text/javascript">
    $('.tablelist tbody tr:odd').addClass('odd');


</script>

</html>

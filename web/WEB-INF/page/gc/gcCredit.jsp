<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/8/27
  Time: 14:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>凭证列表</title>
    <%@include file="../../common/head.jsp" %>
    <link href="/css/select.css" rel="stylesheet" type="text/css" />
    <script type="text/javascript" src="/js/jquery.idTabs.min.js"></script>
    <script type="text/javascript" src="/js/select-ui.min.js"></script>
    <script type="text/javascript" src="/editor/kindeditor.js"></script>
    <script type="text/javascript">
        function confirmMsgDel()
        {
            if(confirm("删除例会记录,您确定要删除吗?"))
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
        <li><a href="#">贷款发放</a></li>
    </ul>
</div>

<form action="" method="post">
    <div class="formbody">
        <ul class="seachform">
            <li><label>客户编号</label><input name="" type="text" class="scinput" /></li>
            <li><label>客户名称</label><input name="" type="text" class="scinput" /></li>
            <li><label>合同编号</label><input name="" type="text" class="scinput" /></li>
            <li><label>&nbsp;</label><input name="" type="submit" class="scbtn" value="查询"/></li>
        </ul>
    </div>

    <div class="rightinfo">
        <div class="tools">
            <ul class="toolbar1">
                <li><a href="/creditAction_creditAddHtml.action"><span><img src="/images/t01.png" /></span>新建凭证</a></li>
            </ul>
        </div>
        <table class="tablelist">
            <thead>
            <tr class="tablehead"><td colspan="10">合同列表</td></tr>
            </thead>
            <thead>
            <tr>
                <th><input name="" type="radio" value=""/></th>
                <th>合同编号</th>
                <th>客户名称</th>
                <th>合同类型</th>
                <th>合同金额</th>
                <th>合同可用金额</th>
                <th>币种</th>
                <th>使用方式</th>
                <th>起始日</th>
                <th>到期日</th>
            </tr>
            </thead>
            <tbody>
            <tr>
                <td><input name="" type="radio" value="" /></td>
                <td style="text-align:center">2000003703</td>
                <td style="text-align:center">桃城三厂</td>
                <td style="text-align:center">流动资金借款合同</td>
                <td style="text-align:center">2,000,000.00</td>
                <td style="text-align:center">2,000,000.00</td>
                <td style="text-align:center">人民币</td>
                <td style="text-align:center">一次性</td>
                <td style="text-align:center">2011-01-01</td>
                <td style="text-align:center">2012-12-31</td>
            </tr>
            <tr>
                <td><input name="" type="radio" value="" /></td>

                <td style="text-align:center">2000003704</td>


                <td style="text-align:center">桃城二厂</td>
                <td style="text-align:center">银行承兑汇票承兑合同</td>
                <td style="text-align:center">2,000,000.00</td>

                <td style="text-align:center">2,000,000.00</td>

                <td style="text-align:center">人民币</td>
                <td style="text-align:center">一次性</td>
                <td style="text-align:center">2011-01-01</td>
                <td style="text-align:center">2012-12-31</td>
            </tr>
            <tr>
                <td><input name="" type="radio" value="" /></td>
                <td style="text-align:center">2000003705</td>


                <td style="text-align:center">桃城一厂</td>
                <td style="text-align:center">银行承兑汇票贴现合同</td>
                <td style="text-align:center">2,000,000.00</td>

                <td style="text-align:center">2,000,000.00</td>

                <td style="text-align:center">人民币</td>
                <td style="text-align:center">一次性</td>
                <td style="text-align:center">2011-01-01</td>
                <td style="text-align:center">2012-12-31</td>
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

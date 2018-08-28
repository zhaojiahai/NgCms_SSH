<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/8/28
  Time: 11:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>授信申请信息维护</title>
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
        <li><a href="clCreditApply.html">授信申请信息维护</a></li>
        <li><a href="javascript:;">修改</a></li>
    </ul>
</div>

<form action="" method="post">
    <div class="formbody">
        <div class="formtitle"><span>授信申请基本信息</span></div>

        <ul class="forminfo">
            <li><label>客户编号</label><input name="" type="text" class="dfinput" value="2000003715"/>
            </li>
            <li><label>客户名称</label><input name="" type="text" class="dfinput" value="臧彦英"/> </li>
            <li><label>业务类型</label>
                <cite><select class="dfselect1">
                    <option value="00" selected="selected">个人经营类贷款</option>
                    <option value="01">个人消费类贷款</option>
                    <option value="02">个人购房贷款</option>
                    <option value="03">助学贷款</option>
                    <option value="04">个人其他贷款</option>
                </select></cite>
                <cite></li>
            <li><label>金额</label><input name="" type="text" class="dfinput" value="300000.00"/> </li>
            <li><label>币种</label><cite><select class="select1">
                <option value="CNY" selected="selected">人民币</option>
                <option value="USD" selected>美元</option>
                <option value="EUR">欧元</option>
                <option value="HKD">港元</option>
                <option value="DEM">德国马克</option>
                <option value="AUD">澳大利亚元</option>
                <option value="CAD">加拿大元</option>
                <option value="SEK">瑞典克朗</option>
                <option value="SGD">新加坡元</option>
                <option value="NZD">新西兰元</option>
            </select></cite></li>
            <li><label>期限(月)</label><input name="" type="text" class="dfinput" value="36"/></li>
            <li><label>使用方式</label><cite><select class="dfselect1">
                <option value="00" selected="selected">一次性</option>
                <option value="01">循环</option>
            </select></cite></li>
            <li><label>利率类型</label><cite><select class="dfselect1">
                <option value="00" selected="selected">固定</option>
                <option value="01">浮动</option>
            </select></cite></li>
            <li><label>浮动方式</label><cite><select class="dfselect1">
                <option value="00">上浮</option>
                <option value="01">下浮</option>
            </select></cite></li>
            <li><label>利率浮动比例(%)</label><input name="" type="text" class="dfinput" value="10"/></li>
            <li><label>利率调整周期 </label><cite><select class="dfselect1">
                <option value="00">日</option>
                <option value="01" selected="selected">月</option>
                <option value="01">季</option>
                <option value="01">年</option>
            </select></cite></li>
            <li><label>基准利率档次</label><cite><select class="dfselect1">
                <option value="00" selected="selected">六个月以内（含）</option>
                <option value="01">六个月至一年（含）</option>
                <option value="01">一年至三年（含）</option>
                <option value="01">三年至五年（含）</option>
                <option value="01">五年以上</option>
            </select></cite></li>
            <li><label>	基准利率(‰)</label<input name="" type="text" class="dfinput"  value="4.5"/></li>

            <li><label>主担保方式</label><cite><select class="dfselect1">
                <option value="00" selected="selected">抵押</option>
                <option value="01">质押</option>
                <option value="01">担保</option>
                <option value="01">信用</option>
            </select></cite></li>
            <li><label>借款用途</label><input name="" type="text" class="dfinput"  value="神挡杀神多所"/></li>
            <li><label>资金支付方式</label><cite><select class="dfselect1">
                <option value="00">自助支付</option>
                <option value="01" selected="selected">受托支付</option>
            </select></cite></li>

            <li><label>备注</label><input name="" type="text" class="dfinput"  value="贷款买车"/></li>
            <li><label>主办客户经理 </label><input name="" type="text" class="dfinput"  value="旭旭"/></li>
            <li><label>所属机构</label><input name="" type="text" class="dfinput"  value="业务部"/></li>

            <li>&nbsp;&nbsp;<input name="" type="submit" class="btn" value="添加"/>&nbsp;&nbsp;&nbsp;&nbsp;<input name="" type="reset" class="btn" value="重置"/></li>
        </ul>

    </div>
</form>

</body>
</html>

<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/8/27
  Time: 15:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>授信申请添加</title>
    <%@include file="../../common/head.jsp" %>
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

</head>
<body>

<div class="place">
    <span>位置：</span>
    <ul class="placeul">
        <li><a href="/clCreditAction_creditInfo.action">授信申请信息维护</a></li>
        <li><a href="javascript:;">添加</a></li>
    </ul>
</div>

<form id="form" action="" method="post" onsubmit="return checkForm();">
    <div class="formbody">
        <div class="formtitle"><span>授信申请基本信息</span></div>

        <ul class="forminfo">
            <%--<li>--%>
                <%--<label>客户编号</label>--%>
                <%--<input req="req" msg="客户编号" name="entity.custid" type="text" class="dfinput" value=""/>--%>
            <%--</li>--%>
            <li>
                <label>客户列表</label>
                <cite>
                    <c:if test="${infos==null}">
                        没有任何客户信息
                    </c:if>
                    <c:if test="${infos!=null}">
                        <select class="dfselect" id="group" req="req" msg="客户" name="entity.custid">
                            <option value="0" selected>请选择客户</option>
                            <s:iterator value="#request.infos">
                                <option value="${id}">${cname}</option>
                            </s:iterator>
                        </select>
                    </c:if>
                </cite>
            </li>

            <%--<li>--%>
                <%--<label>客户名称</label>--%>
                <%--<input req="req" msg="客户名称" name="entity.custname" type="text" class="dfinput" value=""/>--%>
            <%--</li>--%>

            <li><label>业务类型</label>
                <cite>
                    <select class="dfselect1" req="req" msg="业务类型" name="entity.busitype">
                        <option value="00" selected>个人经营类贷款</option>
                        <option value="01">个人消费类贷款</option>
                        <option value="02">个人购房贷款</option>
                        <option value="03">助学贷款</option>
                        <option value="04">个人其他贷款</option>
                    </select>
                </cite>
            </li>
            <li>
                <label>金额</label>
                <input name="entity.money" req="req" msg="金额" type="text" class="dfinput" value=""/>
            </li>
            <li>
                <label>币种</label>
                <cite>
                    <select class="select1" req="req" msg="币种" name="entity.currency">
                        <option value="CNY" selected>人民币</option>
                        <option value="USD">美元</option>
                        <option value="EUR">欧元</option>
                        <option value="HKD">港元</option>
                        <option value="DEM">德国马克</option>
                        <option value="AUD">澳大利亚元</option>
                        <option value="CAD">加拿大元</option>
                        <option value="SEK">瑞典克朗</option>
                        <option value="SGD">新加坡元</option>
                        <option value="NZD">新西兰元</option>
                    </select>
                </cite>
            </li>
            <li>
                <label>期限(月)</label>
                <input name="entity.climit" type="text" class="dfinput" value=""/>
            </li>
            <li>
                <label>使用方式</label>
                <cite>
                    <select class="dfselect1" name="entity.usetype">
                        <option value="00" selected>一次性</option>
                        <option value="01">循环</option>
                    </select>
                 </cite>
            </li>

            <li><label>利率类型</label><cite><select class="dfselect1">
                <option value="00">固定</option>
                <option value="01">浮动</option>
            </select></cite></li>

            <li><label>浮动方式</label><cite><select class="dfselect1">
                <option value="00">上浮</option>
                <option value="01">下浮</option>
            </select></cite></li>
            <li><label>利率浮动比例(%)</label><input name="" type="text" class="dfinput" value=""/></li>
            <li>
                <label>利率调整周期 </label>
                <cite>
                    <select class="dfselect1">
                        <option value="00">日</option>
                        <option value="01">月</option>
                        <option value="01">季</option>
                        <option value="01">年</option>
                    </select>
                </cite>
            </li>
            <li>
                <label>基准利率档次</label>
                <cite>
                    <select class="dfselect1">
                        <option value="00">六个月以内（含）</option>
                        <option value="01">六个月至一年（含）</option>
                        <option value="01">一年至三年（含）</option>
                        <option value="01">三年至五年（含）</option>
                        <option value="01">五年以上</option>
                    </select>
                </cite>
            </li>
            <li>
                <label> 基准利率(‰)</label>
                <input name="" type="text" class="dfinput" value=""/>
            </li>

            <li><label>主担保方式</label><cite>
                <select class="dfselect1">
                    <option value="00">抵押</option>
                    <option value="01">质押</option>
                    <option value="01">担保</option>
                    <option value="01">信用</option>
                </select>
            </cite>
            </li>
            <li>
                <label>借款用途</label>
                <input name="" type="text" class="dfinput" value=""/>
            </li>
            <li><label>资金支付方式</label>
                <cite>
                    <select class="dfselect1">
                        <option value="00">自助支付</option>
                        <option value="01">受托支付</option>
                    </select>
                </cite>
            </li>

            <li>
                <label>备注</label>
                <input name="" type="text" class="dfinput" value=""/>
            </li>
            <li>
                <label>主办客户经理 </label>
                <input name="entity.busimanager"  req="req" msg="主办客户经理" type="text" class="dfinput" value=""/>
            </li>
            <li>
                <label>所属机构</label>
                <input name="" id="tips" type="text" class="dfinput" value=""/>
            </li>

            <li>&nbsp;&nbsp;
                <input type="submit" class="btn" value="添加"/>
                &nbsp;&nbsp;&nbsp;&nbsp;
                <input type="reset" class="btn" value="重置"/>
            </li>
        </ul>

    </div>
</form>

</body>
</html>
<script>
    function checkForm() {
        //检查表单
        var flag =  formValueCheckTips('form');
        if ($("#group").val()=='0'){
            layer.msg('请选择客户');
            return false;
        }
        if (flag){
            var fromData = $("#form").serialize();
            //请求接口
            postRequest('/clCreditAction_creditAdd.action',fromData,function (json) {
                console.log(json)
                if (json.code==1){
                    layer.alert("添加成功",function () {
                        window.location.href = clCreditInfoUrl;
                    });
                }else {
                    layer.alert("添加失败");
                }
            });
        }
        return false;
    }

</script>
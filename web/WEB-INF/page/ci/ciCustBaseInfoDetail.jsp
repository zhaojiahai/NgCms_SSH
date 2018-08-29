<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/8/29
  Time: 11:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
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
        <li><a href="/ciCustBaseAction_ciCustBaseInfo.action">对公客户基本维护</a></li>
        <li><a href="javascript:;">详情</a></li>
    </ul>
</div>

<form id="form" action="" method="post" onsubmit="return checkForm();">
    <div class="formbody">
        <div class="formtitle"><span>对公客户基本信息</span></div>

        <ul class="forminfo">
            <input type="hidden" name="entity.id" value="${entity.id}">
            <li><label>客户编号</label>
                <input name="entity.custid" type="text" class="dfinput" value="${entity.custid}"/>
            </li>
            <li><label>客户名称</label>
                <input name="entity.cname" type="text" class="dfinput" value="${entity.cname}"/>
            </li>
            <li><label>客户类型</label>
                <cite><select class="dfselect1">
                    <option value="0">请选择</option>
                    <option value="00" <c:if test="${entity.custtype== '00'}">selected="selected"</c:if>>企业类客户</option>
                    <option value="01" <c:if test="${entity.custtype== '01'}">selected="selected"</c:if>>事业类客户</option>
                    <option value="02" <c:if test="${entity.custtype== '02'}">selected="selected"</c:if>>其他经济组织</option>
                </select></cite>
                </li>
            <li><label>组织机构代码证号</label>
                <input name="entity.orgcertcode" type="text" class="dfinput" value="${entity.orgcertcode}"/>
            </li>

            <li><label>是否年审</label><cite>
                <select class="dfselect"><option value="0">请选择</option>
                    <option value="1" selected="selected" >是</option>
                    <option value="2">否</option></select></cite>
            </li>

            <li><label>贷款卡编号</label>
                <input name="" type="text" class="dfinput" />
            </li>
            <li><label>营业执照注册号</label>
                <input name="entity.licencecode" type="text" class="dfinput" value="${entity.licencecode}"/>
            </li>
            <li><label>法定代表人</label>
                <input name="" type="text" class="dfinput" value="王霞"/>
            </li>
            <li><label>主营业务</label>
                <input name="" type="text" class="dfinput" value="旅游业"/>
            </li>
            <li><label>营业执照注册登记日期</label>
                <input name="entity.certifydate" id="inputDate" type="text" class="dfinput"
                       value="<fmt:formatDate value="${entity.certifydate}" pattern="yyyy-MM-dd"/>"/>
            </li>
            <li><label>营业执照到期日 </label>
                <input name="entity.certifydate" id="endDate" type="text" class="dfinput"
                       value="<fmt:formatDate value="${entity.certifydate}" pattern="yyyy-MM-dd"/>"/>
            </li>

            <li><label>注册资本金额</label>
                <input name="entity.realcaptamt" type="text" class="dfinput"  value="${entity.realcaptamt}"/>
            </li>
            <li><label>注册地址</label>
                <input name="entity.regstaddr" type="text" class="dfinput"  value="${entity.regstaddr}"/>
            </li>

            <li><label>税务登记证号码</label>
                <input name="entity.taxlicenseno" type="text" class="dfinput"  value="${entity.taxlicenseno}"/>
            </li>
            <li><label>联系人</label>
                <input name="entity.linkman" type="text" class="dfinput"  value="${entity.linkman}"/>
            </li>
            <li><label>联系电话</label>
                <input name="entity.telephone" type="text" class="dfinput"  value="${entity.telephone}"/>
            </li>
            <li><label>通讯地址</label>
                <input name="entity.messageaddr" type="text" class="dfinput"  value="${entity.messageaddr}"/>
            </li>

            <li><label>备注</label>
                <input name="entity.remark" type="text" class="dfinput"  value="${entity.remark}"/>
            </li>
            <li><label>主办客户经理 </label>
                <input name="entity.busimanager" type="text" class="dfinput"  value="${entity.busimanager}"/>
            </li>
            <li><label>所属机构</label>
                <input name="" readonly type="text" class="dfinput"  value="业务部"/>
            </li>
            <li><label>建户日期 </label>
                <input name="entity.inputdate" id="createDate" type="text" class="dfinput"
                       value="<fmt:formatDate value="${entity.inputdate}" pattern="yyyy-MM-dd"/>"/>
            </li>
            <li><label>最近修改日期</label>
                <input name="entity.operdatetime" id="modifyDate" type="text" class="dfinput"
                       value="<fmt:formatDate value="${entity.operdatetime}" pattern="yyyy-MM-dd"/>"/>
            </li>

        </ul>

    </div>
</form>

</body>
</html>
<script>
    //不允许修改
    $("input").attr('readonly','readonly');

    //日期选择
    layui.use('laydate', function(){
        var laydate = layui.laydate;
        laydate.render({
            elem: '#createDate'
        });
        laydate.render({
            elem: '#modifyDate'
        })
        laydate.render({
            elem: '#inputDate'
        })
        laydate.render({
            elem: '#endDate'
        })
    });

</script>
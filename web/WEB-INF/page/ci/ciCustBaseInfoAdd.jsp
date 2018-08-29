<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/8/29
  Time: 11:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>添加</title>
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
        <li><a href="/ciCustBaseAction_ciCustBaseInfo.action">对公客户基本维护</a></li>
        <li><a href="javascript:;">添加</a></li>
    </ul>
</div>

<form action="" method="post" id="form" onsubmit="return checkForm();">
    <div class="formbody">
        <div class="formtitle">
            <span>对公客户基本信息</span>
        </div>
        <ul class="forminfo">
            <li><label>客户编号</label>
                <input name="entity.custid" req="req" msg="客户编号" type="text" class="dfinput" value=""/>
            </li>
            <li><label>客户名称</label>
                <input name="entity.cname" req="req" msg="客户名称" type="text" class="dfinput" value=""/>
            </li>
            <li><label>客户类型</label>
                <cite>
                    <select id="custType" class="dfselect1" name="entity.custtype">
                        <option value="0" selected>请选择</option>
                        <option value="00">企业类客户</option>
                        <option value="01">事业类客户</option>
                        <option value="02">其他经济组织</option>
                    </select>
                </cite>
            </li>

            <li><label>组织机构代码证号</label>
                <input name="entity.orgcertcode" type="text" class="dfinput" value=""/>
            </li>
            <li>
                <label>是否年审</label><cite>
                <select class="dfselect" name="entity.ifquotedcompany">
                    <option value="0">请选择</option>
                    <option value="1">是</option>
                    <option value="2">否</option>
                </select>
            </cite>
            </li>
            <li><label>贷款卡编号</label>
                <input  type="text" class="dfinput" value=""/>
            </li>
            <li><label>营业执照注册号</label>
                <input name="entity.licencecode" type="text" class="dfinput" value=""/>
            </li>
            <li><label>法定代表人</label>
                <input  type="text" class="dfinput" value=""/>
            </li>
            <li><label>主营业务</label>
                <input  type="text" class="dfinput" value=""/>
            </li>
            <li><label>营业执照注册登记日期</label>
                <input name="entity.certifydate" id="inputDate" type="text" class="dfinput" value=""/>
            </li>
            <li><label>营业执照到期日 </label>
                <input name="entity.finishdate" id="endDate" type="text" class="dfinput" value=""/>
            </li>
            <li><label>注册资本金额</label>
                <input name="entity.realcaptamt" type="text" class="dfinput" value=""/>
            </li>
            <li><label>注册地址</label>
                <input name="entity.regstaddr" type="text" class="dfinput" value=""/>
            </li>
            <li><label>税务登记证号码</label>
                <input name="entity.taxlicenseno" type="text" class="dfinput" value=""/>
            </li>
            <li><label>联系人</label>
                <input name="entity.linkman" type="text" class="dfinput" value=""/>
            </li>
            <li><label>联系电话</label>
                <input name="entity.telephone" type="text" class="dfinput" value=""/>
            </li>
            <li><label>通讯地址</label>
                <input name="entity.messageaddr" type="text" class="dfinput" value=""/>
            </li>
            <li><label>备注</label>
                <input name="entity.remark" type="text" class="dfinput" value=""/>
            </li>
            <li><label>主办客户经理 </label>
                <input name="entity.busimanager" type="text" class="dfinput" value=""/>
            </li>
            <li><label>所属机构</label>
                <c:if test="${groups==null}">
                    没有任何机构信息
                </c:if>
                <c:if test="${groups!=null}">
                    <select class="dfselect" id="group" name="entity.groupid">
                        <option value="0">请选择</option>
                        <s:iterator value="#request.groups">
                            <option value="${id}">${name}</option>
                        </s:iterator>
                    </select>
                </c:if>
            </li>
            <li><label>建户日期 </label>
                <input id="createDate" name="entity.inputdate" type="text" class="dfinput" value=""/>
            </li>
            <li><label>最近修改日期</label>
                <input id="modifyDate" name="entity.operdatetime" type="text" class="dfinput" value=""/>
            </li>
            <li>&nbsp;&nbsp;
                <input name="" type="submit" class="btn" value="添加"/>
                &nbsp;&nbsp;&nbsp;&nbsp;
                <input type="reset" class="btn" value="重置"/>
            </li>
        </ul>

    </div>
</form>
</body>
</html>
<script>
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


    function checkForm() {
        //检查表单
        var flag =  formValueCheckTips('form');
        var custType = $("#custType").val();
        var group = $("#group").val();

        if (custType=='0'){
            layer.msg('请选择客户类型');
            return false;
        }
        if (group=='0'){
            layer.msg('请选择所属机构');
            return false;
        }

        if (flag){
            var fromData = $("#form").serialize();
            //请求接口
            postRequest(ciCustBaseAddUrl,fromData,function (json) {
                console.log(json);
                if (json.code==1){
                    layer.alert("添加成功",function () {
                        window.location.href = ciCustBaseInfoUrl;
                    });
                }else {
                    layer.alert("添加失败");
                }
            });
        }
        return false;
    }

</script>

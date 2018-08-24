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

        function resetPass() {
            layer.confirm('重置密码,您确定要恢复初始密码吗?', function(index){
                if(index==1){
                    layer.close(index);

                    window.location.href = "/loginAction_resetPwd.action";
                }
            });
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
            $("#user_form").submit();
        }


    </script>

</head>

<body>
<div class="place">
    <span>位置：</span>
    <ul class="placeul">
        <li><a href="javascript:;">用户管理</a></li>
    </ul>
</div>
<s:if test="#request.pageBean.list == null || #request.pageBean.list.size() == 0">
    没有任何用户信息
</s:if>
<s:else>
    <form id="user_form" action="/loginAction_userInfo.action" method="post">
        <div class="formbody">
            <ul class="seachform" id="form_ul">
                <%--页数--%>
                <input type="hidden" name="currentPage" id="currentPage">

                <li><label>用户编号</label>
                    <input name="user.id" type="text" class="scinput" value="${userId}" />
                </li>
                <li>
                    <label>姓名</label><input name="user.name" value="${username}" type="text" class="scinput" />
                </li>
                <li>
                    <label>&nbsp;</label><input name="" type="submit" class="scbtn" value="查询"/>
                </li>
            </ul>
        </div>

        <div class="rightinfo">
            <div class="tools">
                <ul class="toolbar1">
                    <li><a href="/loginAction_userAddHtml.action"><span><img src="/images/t01.png" /></span>添加</a></li>
                    <li>
                        <a id="userUpdate" href="javascript:;">
                            <span><img src="/images/t02.png" /></span>修改</a>
                    </li>
                    <li><a id="userDeletes" ><span><img src="/images/t03.png"/></span>删除</a></li>
                    <li><a id="userOpen" ><span><img src="/images/t08.png" height="24" width="24"/></span>启用</a></li>
                    <li><a id="userClose" ><span><img src="/images/t09.png" height="24" width="24"/></span>禁用</a></li>
                    <li><a href="javascript:resetPass()" ><span><img src="/images/t07.png" height="20" width="20"/></span>重置密码</a></li>
                </ul>
            </div>
            <table class="tablelist">
                <thead>
                <tr class="tablehead"><td colspan="11">客户信息列表</td></tr>
                </thead>
                <thead>
                <tr>
                    <th>
                        <input id="toggle" type="checkbox" value=""/>
                    </th>
                    <th>用户编号</th>
                    <th>用户账号</th>
                    <th>姓名</th>
                    <th>所在机构</th>
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
                        <td>${loginName}</td>
                        <td>${name}</td>
                        <td>公司业务部</td>
                        <td>${locked==0?'启用':'禁用'}</td>
                        <td><s:date name="createdTime" format="yyyy-MM-dd"/></td>
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


<script type="text/javascript">
    var checkFlag = true;

    $('.tablelist tbody tr:odd').addClass('odd');

    //全选 点击事件
    $("#toggle").click(function () {
        $("input[name='ids']").attr('checked',checkFlag);
        checkFlag = !checkFlag;
    })
    //修改
    $("#userUpdate").click(function () {
        var len = $("input[name='ids']:checked").length;
        if (len<=0){
            layer.msg('请选择要修改的用户!');
            return;
        }
        if (len!=1){
            layer.msg('一次只能修改一个用户!');
            return;
        }
        var updateId = $("input[name='ids']:checked").val();
        window.location.href = "/loginAction_userUpdateHtml.action?userId="+updateId;
    })

    //删除
    $("#userDeletes").click(function () {
        var len = $("input[name='ids']:checked").length;
        if (len<=0){
            layer.msg('请选择要删除的用户!');
            return;
        }
        //弹框
        layer.confirm('确定要删除吗?', function(index){
            if (index==1){
                //读取id
                var param = buildUserSelect();

                layer.close(index);
                //调用删除
                postRequest('/loginAction_userDelete.action',{'deletes':param},function (json) {
                    if (json.code==1){
                        layer.alert('删除成功', function(){
                            window.location.href = userInfoUrl;
                        });
                    } else {
                        layer.alert("删除失败");
                    }
                });

            }
        });

    })
    //启用
    $("#userOpen").click(function () {
        if(!checkSelectUser()){
            layer.msg('请选择要启用的用户!');
            return;
        }
        //弹框
        layer.confirm('确定要启用这些用户吗?', function(index){
            //读取id
            var param = buildUserSelect();
            layer.close(index);
            postRequest(userEnableUrl,{'deletes':param},function (json) {
                if (json.code==1){
                    layer.alert('启用成功', function(){
                        window.location.href = userInfoUrl;
                    });

                } else {
                    layer.alert("启用失败");
                }
            });
        });
    });

    //关闭
    $("#userClose").click(function () {
        if(!checkSelectUser()){
            layer.msg('请选择要禁用的用户!');
            return;
        }
        //弹框
        layer.confirm('确定要禁用这些用户吗?', function(index){
            //读取id
            var param = buildUserSelect();
            layer.close(index);
            postRequest(userDisableUrl,{'deletes':param},function (json) {
                if (json.code==1){
                    layer.alert('禁用成功', function(){
                        window.location.href = userInfoUrl;
                    });
                } else {
                    layer.alert("禁用失败");
                }
            });
        });
    });

    //是否选中了用户
    function checkSelectUser() {
        var len = $("input[name='ids']:checked").length;
        if (len<=0){
            return false;
        }
        return true;
    }

    function buildUserSelect() {
        //读取id
        var arr = $("input[name='ids']:checked");
        var param = "";
        //拼接id  结果类似  1,2,3,4,5
        for(var i=0;i<arr.length;i++){
            if(i==arr.length-1){
                param+=arr[i].value;
            }else {
                param+=arr[i].value+",";
            }
        }
        return param;
    }


</script>

</body>
</html>

<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<div class="pagin">
	<table width="100%" border="0" cellspacing="0" cellpadding="0">
       <tr>
         <td class="STYLE4"><div class="message">共<i class="blue"><s:property value="#session.pageBean.totalCount" /></i>&nbsp;条记录，当前显示第&nbsp;<i class="blue"><s:property value="#session.pageBean.startPage" />&nbsp;</i>页</div>
         </td>
         <td><table border="0" align="right" cellpadding="0" cellspacing="0">
             <tr>
               <td width="45"><img src="images/first.gif" width="33" height="20" style="cursor:hand" onclick="firstPage()"/></td>
               <td width="50"><img src="images/back.gif" width="43" height="20" style="cursor:hand" onclick="priviousPage()"/></td>
               <td width="50"><img src="images/next.gif" width="43" height="20" style="cursor:hand" onclick="nextPage()"/></td>
               <td width="40"><img src="images/last.gif" width="33" height="20" style="cursor:hand" onclick="lastPage()"/></td>
               <td width="100"><div align="center"><span class="STYLE1">转到第
                 <input name="inputpage" id="inputpage" type="text" size="4" style="height:16px; width:35px; border:1px solid #999999;" /> 
                 页 </span></div></td>
                <td width="40"><img src="images/go.gif" width="33" height="17" style="cursor:hand" onclick="goPage()"/></td>
              </tr>
          </table>
          </td>
        </tr>
	</table>
</div>
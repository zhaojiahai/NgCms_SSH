<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page session="false"%>
<%@ page import="sdcncsi.ict.base.org.Group"%>
<%@ include file="/common/taglibs.jsp"%>
<%@ include file="/common/meta.jsp"%>
<%@ include file="/common/js.jsp"%>
<%@page import="com.oreilly.servlet.MultipartRequest"%>
<%@page import="sdcncsi.ict.util.*,java.text.SimpleDateFormat,sdcncsi.ict.base.attachment.*"%>
<%
request.setCharacterEncoding("UTF-8");
response.setContentType("text/html; charset=UTF-8");
String splj = "";
String date = "";
String filename = "";
String filesize = "";
try{
	splj = SysPara.getValue("kindeditor_media_lj");
	splj = splj.substring(splj.indexOf(":")+1,splj.length());
	SimpleDateFormat gs = new SimpleDateFormat("yyyyMMdd");
	Date now = new Date();
	date = gs.format(now);
	String saveDirectory = SysPara.getValue("kindeditor_media_lj")+"/"+date+"/";
	int file_size = Integer.parseInt(SysPara.getValue("kindeditor_media_size"));
	int maxPostSize =file_size*1024*1024;
	//如果文件夹不存在,则创建文件夹
	Attachment attachment = new Attachment();
	attachment.dirReday(SysPara.getValue("kindeditor_media_lj"),date);
	
	Kindeditor rfrp = new Kindeditor();
	MultipartRequest multi = new MultipartRequest(request, saveDirectory, maxPostSize,"utf-8",rfrp);
	filename = Kindeditor.filename;
	out.println("<script>");
	out.println("alert('成功：文件上传成功！');");  
	out.println("</script>");                     
}catch(Exception eu){
	out.println("<script>");
    out.println("alert('错误：请检查文件类型或大小！');");
    out.println("</script>"); 
}
%>
<script type="text/javascript">
	var upload_url = parent.document.getElementById("url");
	upload_url.value="<%=splj%>/<%=date%>/<%=filename%>";
</script>
<head>
 <title></title>
</head>
<body>
<script type="text/javascript">
	window.location="${ctx}/js/kindeditor/plugins/uploadFile.jsp";
</script>
</body>


<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page session="false"%>
<head>
 <title></title>
 	<script type="text/javascript">
 		function onClickUpload() {
			var filepath = document.getElementById("up_media").value;
			if(filepath==""){
				alert("请选择视频文件！");return false;
			}
			filepath=filepath.substring(filepath.lastIndexOf('.')+1,filepath.length); 
			if((filepath != 'swf' && filepath != 'SWF')&&(filepath != 'flv' && filepath != 'FLV')&&(filepath != 'mp3' && filepath != 'MP3')&&(filepath != 'wav' && filepath != 'WAV')&&(filepath != 'wmz' && filepath != 'WMZ')&&(filepath != 'wmv' && filepath != 'WMV')&&(filepath != 'mid' && filepath != 'MID')&&(filepath != 'avi' && filepath != 'AVI')&&(filepath != 'mpg' && filepath != 'MPG')&&(filepath != 'asf' && filepath != 'ASF')&&(filepath != 'rm' && filepath != 'RM')&&(filepath != 'rmvb' && filepath != 'RMVB')){
				alert("只能上传swf,flv,mp3,wav,wmz,wmv,mid,avi,mpg,asf,rm,rmvb格式的文件！");return false;
			}
			document.forms[0].action="upload_media.jsp";
			document.forms[0].submit();
		}
 	</script>
</head>
<body bgcolor="#F5F5F5">
	<form id="form_upload" name="form_upload" enctype="multipart/form-data" method="post">
		<input type="file" id="up_media" name="up_media" style="width:215pt;"  ContentEditable="true" /><input type="button" id="btn_upload" style="height: 20px;" value="上传" onclick="onClickUpload();">
	</form>
</body>


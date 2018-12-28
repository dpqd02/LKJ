<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script>
var check=function(){
	var title=document.getElementById("title");
	if(title.value.length == 0){
		var tsp=document.getElementById("tsp");
		tsp.style.display="inline";
	}else{
		var tsp=document.getElementById("tsp");
		tsp.style.display="none";
	}
	var writer=document.getElementById("writer");
	if(writer.value.length == 0){
		var wsp=document.getElementById("wsp");
		wsp.style.display="inline";
	}else{
		var wsp=document.getElementById("wsp");
		wsp.style.display="none";
	}
	var email=document.getElementById("email");
	if(email.value.length == 0){
		var esp=document.getElementById("esp");
		esp.style.display="inline";
	}else{
		var esp=document.getElementById("esp");
		esp.style.display="none";
	}
	var content=document.getElementById("content");
	if(content.value.length == 0){
		var csp=document.getElementById("csp");
		csp.style.display="inline";
	}else{
		var csp=document.getElementById("csp");
		csp.style.display="none";
	}
	var pwd=document.getElementById("pwd");
	if(pwd.value.length == 0){
		var psp=document.getElementById("psp");
		psp.style.display="inline";
	}else{
		var psp=document.getElementById("psp");
		psp.style.display="none";
	}
	
}
</script>
</head>
<body>
	<div class="title">
		<h1>욕을 해주세요 하악하악</h1>
	</div>
	<form action="" method="POST" name="sform">
	<table id="forms">
		<tr>
			<th>글제목</th>
			<td><input type="text" name="title" id="title">
				<br><span id="tsp" style="display:none;">제목을 입력하세요.</span>
			</td>
		</tr>
		<tr>
			<th>욕쟁이</th>
			<td><input type="text" name="writer" id="writer">
			<br><span id="wsp" style="display:none;">욕쟁이를 입력하세요.</span>
			</td>
		</tr>
		<tr>
			<th>email</th>
			<td><input type="text" name="email" id="email">
			<br><span id="esp" style="display:none;">이메일을 입력하세요.</span>			
			</td>
		</tr>
		<tr>
			<td colspan="2"><textarea rows="4" cols="20" name="content" id="content" placeholder="Describe yourself here..."></textarea>
			<br><span id="csp" style="display:none;">내용을 입력하세요.</span>
			</td>
		</tr>
		<tr>
			<th>pwd</th>
			<td><input type="password" name="pwd" id="pwd">
			<br><span id="psp" style="display:none;">비밀번호를 입력하세요.</span>
			</td>
		</tr>
		<tr>
			<td colspan="2"><input type="button" id="form-btn" value="작성완료" onclick="check()">&nbsp;&nbsp;&nbsp;<input type="reset" id="form-btn" value="취소"></td>
		</tr>
	</table>
	</form>
</body>
</html>
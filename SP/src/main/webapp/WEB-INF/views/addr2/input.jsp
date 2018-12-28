<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Address2 Input</title>
		<script>
		var validateForm=function(){
			 var name = document.forms["f"]["name"].value;
			 var addr = document.forms["f"]["addr"].value;
			 if (name == "") {
			    alert("Name must be filled out");
			    return false;
			 }
			 if (addr == "") {
			    alert("Address must be filled out");
			    return false;
			 }
		}
		</script>
	</head>

	<body onload="document.f.name.focus()">
			<center>
			   <h1>
					Spring Address Input 
			   </h1>
			   <form name="f" action="input.do" onsubmit="return validateForm()" method="post">
			       <table border="1" width="300" height="200">
				      <tr>
					     <td width="30%" colspan="2" align="center"><h2>입력폼</h2></td> 
					  </tr>
					  <tr>
					     <th width="30%">이름</th> 
						 <td><input name="name" align="center" size="20" align="center"></td>
					  </tr>
					  <tr>
					     <th width="30%">주소</th> 
						 <td><input name="addr" size="20" align="center"></td>
					  </tr>
					  <tr>
					     <td colspan="2" align="center">
						     <input type="submit" value="전송"/>
							 <input type="reset" value="취소"/>
						 </td> 
					  </tr>
				   </table>
			   </form>
			</center>
		</body>
</html>
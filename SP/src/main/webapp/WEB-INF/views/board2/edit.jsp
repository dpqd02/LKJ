<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title> GuestBook Edit with Spring MVC </title>
<meta charset="utf-8">
	<script>
	   function check()
	   {
	       for(var i=0; i<document.input.elements.length; i++)
		   {
		      if(document.input.elements[i].value == "")
			  {
			     alert("모든 값을 입력 하셔야 합니다. ");
				 return false;
			  }
		   }
		   document.input.submit();
       }
	</script>
</head>
<body>
	<center>
		<font color='gray' size='4' face='휴먼편지체'>
		<hr width='600' size='2' color='gray' noshade>
		<h5> GuestBook Edit with Spring</h5>
		</font>
		<font color='gray' size='3' face='휴먼편지체'>
			<a href='list.do'>목록</a>
			&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
			<a href='../'>메인</a>
		</font>
		<hr width='600' size='2' color='gray' noshade>
		
		
			<form name='input' method='post' action='edit.do'>
				<input type="hidden" name="seq" value="${board.seq}">
				<table border="0" width="600" align="center"  cellpadding="3" cellspacing="1" bordercolor="gray">
					<tr>
				     <td width="30%" align="center">NAME</td>
					 <td><input type="text" name="writer" size="60" readonly value='${board.writer}'></td>
				  </tr>
				  <tr>
				     <td align="center">EMAIL</td>
					 <td><input type="text" name="email" size="60" value="${board.email}"></td>
				  </tr>
		          <tr>
				     <td align="center">SUBJECT</td>
					 <td><input type="text" name="subject" size="60" value="${board.subject}"></td>
				  </tr>
				  <tr>
				     <td align="center">CONTENT</td>
					 <td><textarea  name="content" rows="15" cols="70">${board.content}</textarea></td>
				  </tr>
				  <tr>
				     <td colspan="2" align="center">
					    <input type="button" value="전송" onclick="check()">
						<input type="reset" value="다시입력">
					 </td>
				  </tr>	
				  </table>
				 <hr width="600" size="2" color="gray" noshade>
			</form>
	</center>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<center>
		<font color='gray' size='4' face='휴먼편지체'>
		<hr width='600' size='2' color='gray' noshade>
		<h5>GuestBook Content with Spring</h5>
		<font color='gray' size='3' face='휴먼편지체'>
		<a href='list.do'>글쓰기</a>
		</font>
		<hr width='600' size='2' color='gray' noshade>
		</font>
		<TABLE border='2' width='600' align='center' noshade>
		<tr>
		<td width='20%' align='center'>No</td>
		<td>${board.seq}</td>
		</tr>
		<tr>
		<td width='20%' align='center'>Name</td>
		<td>${board.writer}</td>
		</tr>
		<tr>
		<td align='center'>E-mail</td>
		<td>${board.email}</td>
		</tr>
		<tr>
		<td align='center'>Subject</td>
		<td>${board.subject}</td>
		</tr>
		<tr>
		<td align='center'>Contents</td>
		<td>${board.content}</td>
		</tr>
		</table>
		<hr width='600' size='2' color='gray' noshade>
		<font color='gray' size='3' face='휴먼편지체'>
		<a href='edit.do?seq=${board.seq}'>수정</a>
		 &nbsp;&nbsp;| 
		<a href='del.do?seq=${board.seq}'>삭제</a>
		 &nbsp;&nbsp;| 
		<a href='list.do'>목록</a>
		</font>
		<hr width='600' size='2' color='gray' noshade>
	</center>
</body>
</html>
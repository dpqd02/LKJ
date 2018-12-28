<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>List</title>
</head>
<body>
<center>
	<h1>
		Address2 List 
	</h1>
	<p align='center'><a href="input.do">주소등록</a></p>
	<table border='1' cellpadding="7" cellspacing="2" width="50%">
	    <tr>
		    <th>번호</th>
			<th>이름</th>
			<th>주소</th>
			<th>날짜</th>
			<th>삭제</th>
		</tr>
		<c:if test="${empty list}">
			<tr>
				<td align="center" colspan="5">데이터가 없음</td>
			</tr>
		</c:if>
		<c:forEach items="${list}" var="address">
			<tr>
			    <td align='center'>${address.seq}</td>
				<td>${address.name}</td>
				<td>${address.addr}</td>
				<td>${address.rdate}</td>
				<td align='center'><a href='delete.do?seq=${address.seq}'>삭제</a></td>
			</tr>
		</c:forEach>
	</table>
</center>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Board List</title>
<link rel="stylesheet" type="text/css" href="../resources/css/board.css">
</head>
<body>
<center>
	<h1>
		Board List 
	</h1>
	<p align='center'><a href="write.do">글쓰기</a></p>
	<table border='1' cellpadding="7" cellspacing="2" width="50%">
	    <tr>
		    <th>번호</th>
			<th>글쓴이</th>
			<th>제목</th>
			<th>작성일</th>
		</tr>
		<c:if test="${empty list}">
			<tr>
				<td align="center" colspan="5">데이터가 없음</td>
			</tr>
		</c:if>
		<c:forEach items="${list}" var="board">
			<tr>
			    <td align='center' width="10%">${board.seq}</td>
				<td width="20%" align='center'>${board.writer}</td>
				<td>
				<span style="margin-left:10px"><a href='content.do?seq=${board.seq}'>${board.subject}</a></span>
				<span style="display: inline-block; float:right; margin-right:5px;"><small>${board.email}</small></span>
				</td>
				<td width="20%">${board.rdate}</td>
			</tr>
		</c:forEach>
	</table>
</center>
</body>
</html>
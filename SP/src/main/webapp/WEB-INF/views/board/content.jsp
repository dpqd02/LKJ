<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
	<head>
	<meta charset="UTF-8">
	<title>Board Content</title>
	<link rel="stylesheet" type="text/css" href="../resources/css/board.css">
	</head>
	<body>
		<section>
		<table style="margin:auto;">
			<tr>
				<th>글번호</th>
				<td>${board.seq}</td>
			</tr>
			<tr>
				<th>작성자</th>
				<td>${board.writer}</td>
			</tr>
			<tr>
				<th>이메일</th>
				<td>${board.email}</td>
			</tr>
			<tr>
				<th>글제목</th>
				<td>${board.subject}</td>
			</tr>
			<tr>
				<th>글내용</th>
				<td>${board.content}</td>
			</tr>
			<tr>
				<td colspan="2" align="center"><a href="delete.do?seq=${board.seq}">삭제</a>&nbsp;&nbsp;|&nbsp;&nbsp;<a href="update.do?seq=${board.seq}">수정</a></td>
			</tr>
		</table>
		</section>
	</body>
</html>
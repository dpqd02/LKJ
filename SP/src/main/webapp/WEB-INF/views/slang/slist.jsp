<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>세상의 모든 욕들</title>
</head>
<body>
	<div class="title">
		<hr>
		<h1>SLANG TOGETHER</h1>
		<a href="saySlang.do">글작성</a>
		<hr>
	</div>
	<div class="searchBar">
		<span>검색 : </span>
		<input type="text" id="searchtxt" name="searchtxt">
		<input type="button" id="search-btn" value="검색">
	</div>
	<table>
		<tr>
			<th>글번호</th>
			<th>제목</th>
			<th>욕쟁이</th>
			<th>날짜</th>
			<th>조회</th>
		</tr>
		<div id="container">
			<c:if test="${empty list}">
				<tr>
					<td colspan="5">존재하는 글이 없습니다.</td>
				</tr>
			</c:if>
			<c:if test="${not empty list}">
				<c:forEach items="${list}" var="dto">
					<tr>
						<td>${dto.seq}</td>
						<td>${dto.title}</td>
						<td>${dto.writer}</td>
						<td>${dto.rdate}</td>
						<td>${dto.rcount}</td>
					</tr>
				</c:forEach>
			</c:if>
		</div>
	</table>
</body>
</html>
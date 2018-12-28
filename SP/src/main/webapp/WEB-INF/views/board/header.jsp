<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<meta charset="UTF-8">
	<header>
		<div id="title">
			<h1>SPRING Main</h1>
		</div>
		<div id="nav">
			<ul>
				<li><a href="${pageContext.request.contextPath}/addr/list.do">주소록</a></li>
				<li><a href="${pageContext.request.contextPath}/addr2/list.do">주소록2</a></li>
				<li><a href="${pageContext.request.contextPath}/board/list.do">게시판</a></li>
				<li><a href="${pageContext.request.contextPath}/board2/list.do">게시판2</a></li>
				<li><a href="${pageContext.request.contextPath}/file/list.do">파일리스트</a></li>
				<li><a href="${pageContext.request.contextPath}/file/write_dd.do">DragDrop</a></li>
			</ul>
		</div>
	</header>
</html>
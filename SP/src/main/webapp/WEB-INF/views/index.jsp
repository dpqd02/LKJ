<%@ page contentType="text/html;charset=utf-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
	<html>
		<head>
			<meta charset="utf-8">
			<title>Spring Index</title>
			<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/board.css">
		</head>
		
		<body>
			<header>
				<div id="title">
					<h1>SPRING Main</h1>
				</div>
				<div id="nav">
					<ul>
						<li><a href="addr/list.do">주소록</a></li>
						<li><a href="addr2/list.do">주소록2</a></li>
						<li><a href="board/list.do">게시판</a></li>
						<li><a href="board2/list.do">게시판2</a></li>
						<li><a href="file/list.do">파일리스트</a></li>
						<li><a href="file/write_dd.do">DragDrop</a></li>
						<li><a href="paging/list.do">PAGE</a></li>
						
						<li><a href="ajax/test01.do">AJAX01</a></li>
						<li><a href="ajax/test02.do">AJAX02</a></li>
						<li><a href="ajax/test03.do">AJAX03</a></li>
						
						<li><a href="tiles/index.do">타일즈</a></li>
					</ul>
				</div>
			</header>
			<section>
				<article>
					<p>dddd</p>
				</article>
			</section>
			<div id="footer">
				<p>&copy; 2018 LKJ & Bit Academy</p>
			</div>
		</body>
	</html>

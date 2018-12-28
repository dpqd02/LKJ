<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%> <!-- tiles tag를 위한 필수 -->
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title><tiles:getAsString name="title" /></title>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/board.css"></link>


</head>
<body>
	<header id="header">
        <tiles:insertAttribute name="header" />
    </header>
    
    <section id="sidemenu">
        <tiles:insertAttribute name="menu" />
    </section>
    
    <section id="siteContent">
        <tiles:insertAttribute name="body" />
        <!-- <tiles:insertAttribute name="body" /> --> 
        <!-- <section> <article> <h1>제목</h1> <p>본문</p> </article> </section> --> 
    </section>
    
     <footer id="footer">
        <tiles:insertAttribute name="footer" />
    </footer>
</body>
</html>
<%@ page pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<h1>Board List</h1>

<table border="1">
<thead>
	<tr>
		<th>번호</th>
		<th>이름</th>
		<th>제목</th>
		<th>조회</th>
		<th>작성일</th>
	</tr>
</thead>

<tbody>
	<tr>
		<td>10</td>
		<td>홍길동</td>
		<td><a href="<c:url value='content.do?seq=10'/>">제목이야</a></td>
		<td>5</td>
		<td>2018-06-07</td>
    </tr>
</tbody>

</table>
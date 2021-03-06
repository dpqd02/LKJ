<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<title> Spring Board </title>
<meta charset="utf-8">
<style>
	a{
		text-decoration:none;
	}
</style>
</head>
<body>
<center>
<font color='gray' size='4' face='휴먼편지체'>
<hr width='600' size='2' color='gray' noshade>
<h2> Spring Board </h2>
<font color='gray' size='3' face='휴먼편지체'>
<a href='../'>인덱스</a>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<a href='write.do'>글쓰기</a><br/>
</font>
<hr width='600' size='2' color='gray' noshade>

<TABLE border='2' width='600' align='center' noshade>
<TR size='2' align='center' noshade bgcolor='AliceBlue'>
	<th bgcolor='AliceBlue'>no</th>
	<th color='gray'>writer</th>
	<th color='gray'>e-mail</th>
	<th color='gray'>subject</th>
	<th color='gray'>date</th>
</TR>
<c:if test="${listResult.list.size()==0}">
	 <TR size='1' align='center' noshade>
	 	<td colspan="5">데이터가 하나도 없음</td>
	 </TR>
</c:if>     
<c:forEach items="${listResult.list}" var="board">       
       <TR size='1' align='center' noshade>
		<TD>${board.seq}</TD>
		<TD>${board.writer}</TD>
		<TD>${board.email}</TD>
	    <TD>
	      <a href="content.do?seq=${board.seq}">
		  ${board.subject}
		  </a>
		</TD>
		<TD>${board.rdate}</TD>
	   </TR> 
</c:forEach>	  
       
	  
</TABLE>
<hr width='600' size='2' color='gray' noshade>
<font color='gray' size='3' face='휴먼편지체'>
    (총페이지수 : ${listResult.totalPageCount})
    &nbsp;&nbsp;&nbsp;
    <c:forEach begin="1" end="${listResult.totalPageCount}" var="i">
        <a href="list.do?cp=${i}">
       		<c:choose>
       			<c:when test="${i==listResult.page}">
       				<strong>${i}</strong>
       			</c:when>
           		<c:otherwise>
           			${i}
           		</c:otherwise>
           </c:choose>
        </a> &nbsp;
    </c:forEach>
    ( TOTAL :  ${listResult.totalCount} )
    
    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
       페이지 싸이즈 : 
    <select id="psId" name="ps" onchange="f(this)">
    	<c:choose>
    		<c:when test="${listResult.pageSize==3}">
    			<option value="3" selected>3</option>
	       		<option value="5">5</option>
	       		<option value="10">10</option>
    		</c:when>
    		<c:when test="${listResult.pageSize==5}">
    			<option value="3">3</option>
	       		<option value="5" selected>5</option>
	       		<option value="10">10</option>
    		</c:when>
    		<c:when test="${listResult.pageSize==10}">
    			<option value="3">3</option>
	       		<option value="5">5</option>
	       		<option value="10" selected>10</option>
    		</c:when>
    	</c:choose>
    </select>
    
    <script language="javascript">
       function f(){
           var el=document.getElementById("psId");
           var ps = el.value;
           location.href="list.do?ps="+ps;
       }
    </script>
    
</font>
<hr width='600' size='2' color='gray' noshade>
    
</center>
</body>
</html>
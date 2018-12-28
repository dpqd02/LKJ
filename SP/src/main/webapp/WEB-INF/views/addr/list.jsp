<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<script type="text/javascript" language="javascript" src="http://code.jquery.com/jquery-1.3.1.min.js"></script>
		<script type="text/javascript">
		$(document).ready(function(){
			
			//$("#searchOk01").bind("click",function(){
			$("#seq").bind("keyup",function(){
			    $.ajax({
			        url : "../ajax01/search01.do",
			        type: "get",
			        data : { "seq" : $("#seq").val() },
			        success : function(responseData){
			            $("#ajax").remove();
			            var data = JSON.parse(responseData);
			            if(!data){
			                //alert("존재하지 않는 Seq입니다");
			                return false;
			            }
			            var html = '';
			            html += '<form class="form-signin" action="" id="ajax">';
			            html += ' 번호<input type="text" class="form-control"  name="seq" value="'+data.seq+'">';
			            html += ' 이름<input type="text" class="form-control" name="name" value="'+data.name+'">';
			            html += ' 주소<input type="text" class="form-control"  name="addr" value="'+data.addr+'">';
			            html += ' 날짜<input type="text" class="form-control" name="rdate" value="'+data.rdate+'">';
			            html += '</form>';
			            $("#container").after(html);
			        }
			    });
			});
			
			$("#searchOk02").bind("click",function(){
			    $.ajax({
			        url : "../ajax01/search02.do",
			        type: "post",
			        data : { "name" : $("#name").val() },
			        success : function(responseData){
			            $("#ajax").remove();
			            var data = JSON.parse(responseData);
			            if(!data){
			                alert("존재하지 않는 Name입니다");
			                return false;
			            }
			            
			            var html = "";
			            html += "<table border='1' width='50%' cellpadding='3' cellspacing='1' id='ajax'>";
			            html += "<tr>";
			            html += "<th>번호</th>";
			            html += "<th>이름</th>";
			            html += "<th>주소</th>";
			            html += "<th>날짜</th>";
			            html += "</tr>"
			            if(data.length != 0){
				            for (var i=0; i<data.length; i++) {
				            	//alert(data[i].seq+", "+data[i].name+", "+data[i].addr+", "+data[i].rdate);
				            	html += "<tr>";
				            	html += "<td align='center'>"+data[i].seq+"</td>";
				            	html += "<td align='center'>"+data[i].name+"</td>";
				            	html += "<td align='center'>"+data[i].addr+"</td>";
				            	html += "<td align='center'>"+data[i].rdate+"</td>";
				            	html += "</tr>";
				            }
			            }else{
			            	html += "<tr>";
			            	html += "<td colspan='4' align='center'>조회된 결과가 없습니다.</td>";
			                html += "</tr>";
			            }
			            html += "</table>";
			            $("#container").after(html);
			        }
			    });
			});		
		});
		</script>

<center>
	<h1>
		Address List 
	</h1>
	<p align='center'><a href="input.do">주소등록</a></p>
	<table border='1' cellpadding="7" cellspacing="2" width="50%">
		<tr>
			<td colspan="5"><input type="text" size="40" name="name" id="name"/><input type="button" value="검색" id="searchOk02"/></td>
		</tr>
	    <tr>
		    <th>번호</th>
			<th>이름</th>
			<th>주소</th>
			<th>날짜</th>
			<th>삭제</th>
		</tr>
		<div id="container">
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
		</div>
	</table>
</center>

<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
	<head>
	    <meta charset="utf-8"/>
		<title>Ajax Test01</title>
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
	</head>
	<body>
	    <center>
	    <h2>(방법1) response객체에 JSON문자열 담기</h2>
	    
	    번호: <input type="text" name="seq" id="seq"/>
	    <input type="button" value="번호 검색" id="searchOk01"/>
	    <br/>
	    
	    이름: <input type="text" name="name" id="name"/>
	    <input type="button" value="이름 검색" id="searchOk02"/>
	 
        <br/><br/>
		<div id="container"></div>
		<br/><br/>
		
		<a href="../">인덱스</a><br/><br/>
		</center>
	</body>
</html>
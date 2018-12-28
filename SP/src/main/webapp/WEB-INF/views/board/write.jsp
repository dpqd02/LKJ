<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
	<meta charset="UTF-8">
	<title>Board Write</title>
	<style>
		body{
			text-align:center;
		}
		section{
			margin:auto;
		}
		table{
			border-collapse: collapse; 
		}
		table,th,td{
			border: 2px solid;
			border-radius: 5px;
			
		}
	</style>
	<link rel="stylesheet" type="text/css" href="../resources/css/board.css">
	</head>
	
	<body>
		<section>
			<form name="f" action="write.do" method="post">
				<table>
					<tr>
						<th>글쓴이</th>
						<td><input type="text" name="writer" size="40"></td>
					</tr>
					<tr>
						<th>이메일</th>
						<td><input type="text" name="email" size="40"></td>
					</tr>
					<tr>
						<th>제목</th>
						<td><input type="text" name="subject" size="40"></td>
					</tr>
					<tr>
						<th>글내용</th>
						<td><textarea name="content" rows="4" cols="40" style="resize:none;"></textarea></td>
					</tr>
					<tr>
						<td colspan="2"><input type="submit" value="전송">&nbsp;&nbsp;<input type="reset" value="취소"></td>
					</tr>
				</table>
			</form>
		</section>
	</body>
</html>
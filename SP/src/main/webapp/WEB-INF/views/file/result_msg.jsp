<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<script>
    if(${result}){
    	alert("업로드 성공");
    }else{
    	alert("업로드 실패");
    }
    
    location.href="list.do";
</script>


<%@ page contentType="text/html;charset=utf-8" 
         import="java.io.*, lkj.spring3.file.controller.Path"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>



<meta charset="utf-8"/>
<style>
   a{text-decoration: none;}
</style>
<center>
   <br/>
   <h1>FileUpload with Spring3</h1> 
   <a href="write.do">업로드폼</a>
   &nbsp;&nbsp;&nbsp;&nbsp; 
   <a href="../drag_drop/write_dd.do">drag&drop폼</a>
   &nbsp;&nbsp;&nbsp;&nbsp; 
   <a href="../">인덱스</a>
   <br/><br/>
   <table border="1" width="50%" cellpadding="3" cellspacing="1">
      <tr>
		 <th>이름</th>
		 <th>크기</th>
		 <th>삭제</th>
	  </tr>


<%
		File fStore = new File(Path.FILE_STORE);
		if(!fStore.exists()) fStore.mkdirs();

        File files[] = fStore.listFiles();
        if(files.length == 0){
%>
          <tr>
	        <td align="center" colspan="3">
	             	업로드된 파일이 하나도 없음
	        </td>
	      </tr>
<%
        }else{
	        for(File f: files){
%>
	          <tr>
				 <td align="center">
				 	<a href="download.do?fname=<%=f.getName() %>">
				 		<%=f.getName()%>
				 	</a>
				 </td>
				 <td align="center"><%=f.length()%></td>
				 <td align="center">
				 	 <a href="del.do?fname=<%=f.getName() %>">삭제</a>
				 </td>
			  </tr>
<% 	
	        }
        }
%>
   </table>
</center>







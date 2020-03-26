<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="UpdateServlet" method="get">
		<p>ID：<input id='input1' type="text" name="id"  value=<%=request.getParameter("id")%>></p><br>
		<p>content：<input  id='input1' type="text" name="content"   value=<%=request.getParameter("content")%>></p><br>
		<p>postTime：<input  type="text" name="postTime"  value=<%=request.getParameter("postTime") %>></p><br>
		<p>IP：<input  id='input1' type="email" name="ip"   value=<%=request.getParameter("ip") %>></p><br>
		<p><input  id='input3'  type="submit" name="submit" value="提交"/></p>
	</form>
	
</body>
</html>
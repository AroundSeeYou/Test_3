<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<form action="AddServlet" method="post">
		<p>ID：<input id='input1' type="text" name="id"></p><br>
		<p>content：<input  id='input1' type="text" name="content"></p><br>
		<p>postTime：<input readonly="true" type="text" name="postTime" ></p><br>
		<p>IP：<input  readonly="true" id='input1' type="email" name="ip"></p><br>
		<p><input  id='input3'  type="submit" name="submit" value="提交"/></p>
	</form>
	
</body>
</html>

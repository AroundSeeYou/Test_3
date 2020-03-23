<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	欢迎你：<%=request.getAttribute("username") %><br>
	<a href="login.html">登录</a><br>
	<a href="Test_3.html">注册</a><br>
	<a href="login.html">退出</a>
</body>
</html>
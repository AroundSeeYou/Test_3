<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link href="css.css" rel="stylesheet"/>
<title>Insert title here</title>
</head>
<body>
	<p>欢迎你：<%=request.getAttribute("username") %><br></p>
	<a id="login" href="login.html">登录</a><br>
	<a id="register" href="Test_3.html">注册</a><br>
	<a id="return" href="login.html">退出</a>
</body>
</html>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link href="css/style.css" rel="stylesheet"/>
<title>Insert title here</title>
</head>
<body>
<div id="top">
	<%@ include file="momment/left_menu.jsp" %>
	<div id="right">
	<%@ include file="momment/header.jsp" %>
	<div id="z">
	<form action="AddServlet" method="post">
		<p>ID：<input id='input1' type="text" name="id"></p><br>
		<p>content：<input  id='input1' type="text" name="content"></p><br>
		<p>postTime：<input readonly="true" type="text" name="postTime" ></p><br>
		<p>IP：<input  readonly="true" id='input1' type="email" name="ip"></p><br>
		<p><input  id='input3'  type="submit" name="submit" value="提交"/></p>
	</form>
	</div>
	</div>
	</div>
	<%@ include file="momment/footer.jsp" %>
</body>
</html>

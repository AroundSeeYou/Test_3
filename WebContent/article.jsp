<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    import="java.util.*"
    import="servlet.Article"
    %>
<!DOCTYPE html>
<html>
<head>
<style></style>
<meta charset="UTF-8">
<link href="css.css" rel="stylesheet"/>
<title>Insert title here</title>
</head>

<body>
	<a href="AddServlet">添加</a>
	<table border="1" cellspacing="0"  width="700px" bgcolor="#ff8c00">
		<tr height="30" align="center" background="#0f0">
			<td>ID</td>
			<td>content</td>
			<td>postTime</td>
			<td>IP</td>
			<td>操作</td>
		</tr>
		<% 
		
		if(request.getAttribute("article")!=null){
			 ArrayList<Article> list = (ArrayList)request.getAttribute("article"); 
			int len = list.size();
		for(int i=0;i<len;i++){	
		%>	
      <tr  height="30" align="centesr" bgcolor="#ff0">
           <td><%=list.get(i).getId()%></td>
           <td><%=list.get(i).getContent() %></td>
           <td><%=list.get(i).getPostTime()%></td>
            <td><%=list.get(i).getIp()%></td>
           <td><a href="UpdateServlet?id=<%=list.get(i).getId() %>&content=<%=list.get(i).getContent() %>&postTime=<%=list.get(i).getPostTime()%>&ip=<%=list.get(i).getIp()%>">编辑</a>
           <a href="DeleteServlet?id=<%=list.get(i).getId()%>">删除</a></td>
       </tr>
     <%}} %>


	</table>
	
</body>
</html>
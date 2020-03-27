<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    import="java.util.*"
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>

<body>
 	

	<a href="article_add.jsp">添加</a>
	<table border="1" cellspacing="0"  width="700px">
		<tr height="30" align="center" background="#0f0">
			<td>ID</td>
			<td>content</td>
			<td>postTime</td>
			<td>IP</td>
			<td>操作</td>
		</tr>
		<% 
		if(request.getAttribute("len")!=null){
			 ArrayList list = (ArrayList)request.getAttribute("id"); 
			 ArrayList list1 = (ArrayList)request.getAttribute("content"); 
			 ArrayList list2 = (ArrayList)request.getAttribute("postTime"); 
			 ArrayList list3 = (ArrayList)request.getAttribute("ip"); 
			int len = (int)request.getAttribute("len");
		for(int i=0;i<len;i++){	
		%>	
      <tr  height="30" align="center">
           <td><%=list.get(i)%></td>
           <td><%=list1.get(i) %></td>
           <td><%=list2.get(i)%></td>
            <td><%=list3.get(i)%></td>
           <td><a href="article_update.jsp?id=<%=list.get(i) %>&content=<%=list1.get(i) %>&postTime=<%=list2.get(i)%>&ip=<%=list3.get(i)%>">编辑</a>
           <a href="DeleteServlet?id=<%=list.get(i)%>">删除</a></td>
       </tr>
     <%}} %>


	</table>
</body>
</html>
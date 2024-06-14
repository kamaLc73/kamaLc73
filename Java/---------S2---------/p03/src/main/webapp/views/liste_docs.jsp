<%@page import="com.jee.beans.Document"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	
	<h2>Gestion de documents</h2>
	<h3>Liste des documents</h3>
	
	<% 
	List<Document> dl = (List<Document>)request.getAttribute("dl");
	%>
	
	<table border="1">
		<tr>
			<th>Identificateur</th>
			<th>Titre</th>
			<th>Nombre de pages</th>
		</tr>
	<%
	for(int i = 0; i < dl.size(); i++) {
	%>
		<tr>
			<td> <%=dl.get(i).getId() %> </td>
			<td> <%=dl.get(i).getTitle() %> </td>
			<td> <%=dl.get(i).getPageCount() %> </td>
		</tr>
	<%
	}
	%>
	</table>
	
</body>
</html>
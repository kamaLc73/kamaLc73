<%@page import="com.jee.beans.Document"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	Document bien ajouté
	<% Document d = (Document)request.getAttribute("d"); %>
	<%=d %>
</body>
</html>
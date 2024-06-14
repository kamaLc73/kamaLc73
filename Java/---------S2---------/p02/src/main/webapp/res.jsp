<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	votre imc est : <%=request.getAttribute("imc") %> <br>
	votre état est : <%=request.getAttribute("etat") %> <br>
</body>
</html>
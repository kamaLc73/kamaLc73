<%@page import="com.jee.models.Client"%>
<%@page import="java.util.List"%>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Clients</title>
</head>
<body>
	<a href = "index.html" >HOME</a> <br />

	<h2>Gestion des Clients</h2>
	
	<h3>Ajouter un Client</h3>
	<form action="ajouter.Client" method="get">
		<table border="0">
			<tr>
				<td>Nom</td>
				<td><input type = "text" name="nom" size = "10" /></td>
			</tr>
			<tr>
				<td>Prénom</td>
				<td><input type = "text" name="prenom" size = "10" /></td>
			</tr>
			<tr>
				<td>Email</td>
				<td><input type = "text" name="email" size = "10" /></td>
			</tr>
		</table>
		<input type="submit" value = "Ajouter" />
	</form>
	<br /><br />
	<h3>Chercher un Client</h3>
	<form action="chercher.Client" method="get">
		<label>Nom</label>
		<%
		String nomRecherche = (String)request.getAttribute("nomRecherche");
		%>
		<input type = "text" name="nomRecherche" size = "10" value = "${nomRecherche}"/>
		<input type="submit" value = "Chercher" />
	</form>

	<%
	List<Client> lc = (List<Client>)request.getAttribute("lc");
	%>
	<br /><br />
	<h3>Liste des Clients</h3>
	<table border="1">
		<tr>
			<th>Identificateur</th>
			<th>Nom</th>
			<th>Prénom</th>
			<th>Email</th>
		</tr>
		<%
		if(lc != null) {
		for (int i = 0; i < lc.size(); i++) {
		%>
		<tr>
			<td><%= lc.get(i).getId() %></td>
			<td><%= lc.get(i).getNom() %></td>
			<td><%= lc.get(i).getPrenom() %></td>
			<td><%= lc.get(i).getEmail() %></td>
		</tr>
		<%
		}
		}
		%>
	</table>
	
	
	
</body>
</html>
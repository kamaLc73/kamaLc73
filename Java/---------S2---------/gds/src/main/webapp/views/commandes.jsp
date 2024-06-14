<%@page import="com.jee.models.Commande"%>
<%@page import="com.jee.models.Client"%>
<%@page import="java.util.List"%>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Clients</title>
</head>
<body>
	<a href = "index.html" >HOME</a> <br />

	<h2>Gestion des Commandes</h2>
	
	<h3>Ajouter un Commande</h3>
	<form action="ajouter.Commande" method="get">
		<%
		List<Long> lic = (List<Long>)request.getAttribute("lic");
		List<Long> lrp = (List<Long>)request.getAttribute("lrp");
		%>
		<table border="0">
			<tr>
				<td>Sélectionnez un Client</td>
				<td>
					<select name="idClient" >
						<%
						for(int i = 0; i < lic.size(); i++) {
						%>
						<option><%= lic.get(i) %></option>
						<%
						}
						%>
					</select>
				</td>
			</tr>
			<tr>
				<td>Sélectionnez un Produit</td>
				<td>
					<select name="refProduit" >
						<%
						for(int i = 0; i < lrp.size(); i++) {
						%>
						<option><%= lrp.get(i) %></option>
						<%
						}
						%>
					</select>
				</td>
			</tr>
			<tr>
				<td>Date</td>
				<td><input type = "text" name="date" size = "6" /></td>
			</tr>
		</table>
		<input type="submit" value = "Ajouter" />
	</form>
	<%
	List<Commande> lc = (List<Commande>)request.getAttribute("lc");
	%>
	<br /><br />
	<h3>Liste des Commandes</h3>
	<table border="1">
		<tr>
			<th>Identificateur</th>
			<th>Id Client</th>
			<th>Ref Produit</th>
			<th>Date</th>
		</tr>
		<%
		if(lc != null) {
		for (int i = 0; i < lc.size(); i++) {
		%>
		<tr>
			<td><%= lc.get(i).getId() %></td>
			<td><%= lc.get(i).getClient().getId() %></td>
			<td><%= lc.get(i).getProduit().getRef() %></td>
			<td><%= lc.get(i).getDate() %></td>
		</tr>
		<%
		}
		}
		%>
	</table>
	
	
	
</body>
</html>
<%@page import="com.jee.models.Produit"%>
<%@page import="java.util.List"%>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Produits</title>
</head>
<body>
	<a href = "index.html" >HOME</a> <br />
	<h2>Gestion des Produits</h2>
	
	<h3>Ajouter un produit</h3>
	<form action="ajouter.Produit" method="get">
		<table border="0">
			<tr>
				<td>Désignation</td>
				<td><input type = "text" name="desig" size = "10" /></td>
			</tr>
			<tr>
				<td>Prix Unitaire</td>
				<td><input type = "text" name="pu" size = "6" /></td>
			</tr>
			<tr>
				<td>Quantité en Stock</td>
				<td><input type = "text" name="qs" size = "6" /></td>
			</tr>
		</table>
		<input type="submit" value = "Ajouter" />
	</form>
	<br /><br />
	<h3>Chercher un produit</h3>
	<form action="chercher.Produit" method="get">
		<label>Désignation</label>
		<%
		String desigRecherche = (String)request.getAttribute("desigRecherche");
		%>
		<input type = "text" name="desigRecherche" size = "10" value = "${desigRecherche}"/>
		<input type="submit" value = "Chercher" />
	</form>

	<%
	List<Produit> lp = (List<Produit>)request.getAttribute("lp");
	%>
	<br /><br />
	<h3>Liste des produits</h3>
	<table border="1">
		<tr>
			<th>Référence</th>
			<th>Désignation</th>
			<th>Prix Unitaire</th>
			<th>Quantité en Stock</th>
		</tr>
		<%
		if(lp != null) {
		for (int i = 0; i < lp.size(); i++) {
		%>
		<tr>
			<td><%= lp.get(i).getRef() %></td>
			<td><%= lp.get(i).getDesig() %></td>
			<td><%= lp.get(i).getPu() %></td>
			<td><%= lp.get(i).getQs() %></td>
		</tr>
		<%
		}
		}
		%>
	</table>	
</body>
</html>
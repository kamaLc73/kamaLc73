package com.java.xml;

import com.java.beans.Client;
import com.java.beans.Produit;
import com.java.utils.Constants;

public class Mediator {
	
	public Mediator() {
	}

	public Produit getProduit(String ref) {
		ProduitXml xml = new ProduitXml(Constants.PRODUITS_XML_FILEPATH);
		return xml.select(ref);
	}

	public Client getClient(int id) {
		ClientXml xml = new ClientXml(Constants.CLIENTS_XML_FILEPATH);
		return xml.select(id);
	}

}

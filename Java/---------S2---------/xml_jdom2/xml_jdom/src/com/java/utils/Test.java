package com.java.utils;

import com.java.beans.Client;
import com.java.beans.Commande;
import com.java.beans.Produit;
import com.java.xml.ClientXml;
import com.java.xml.CommandeXml;
import com.java.xml.ProduitXml;

public class Test {
	
	public static void main(String[] args) {
//		ProduitXml prdXml = new ProduitXml(Constants.PRODUITS_XML_FILEPATH);
//		ClientXml cltXml = new ClientXml(Constants.CLIENTS_XML_FILEPATH);
//		CommandeXml cmdXml = new CommandeXml(Constants.COMMANDES_XML_FILEPATH);
//		Produit p = prdXml.select("1");
//		Client c = cltXml.select(1);
		
//		Commande cmd = new Commande(1, p, c, 6, "27/02/2024");
//		cmdXml.insert(cmd);
		
		CommandeXml cmdXml = new CommandeXml(Constants.COMMANDES_XML_FILEPATH);
		System.out.println(cmdXml.select(1));
		
//		ProduitXml xml = new ProduitXml(Constants.PRODUITS_XML_FILEPATH);
//		xml.insert(new Produit("2", "Clavir", 50, 30));
//		System.out.println(xml.select("1"));
//		System.out.println(xml.selectAll());
		
//		ClientXml xml = new ClientXml(Constants.CLIENTS_XML_FILEPATH);
//		xml.insert(new Client(1, "Alaoui", "Ali"));
//		xml.insert(new Client(2, "IDrissi", "Idriss"));
//		System.out.println(xml.select(1));
//		System.out.println(xml.select(2));
//		System.out.println(xml.select(5));

	
	
	}

}

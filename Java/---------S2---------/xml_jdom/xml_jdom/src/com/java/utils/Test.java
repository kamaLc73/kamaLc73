package com.java.utils;

import com.java.beans.Produit;
import com.java.xml.ProduitXml;

public class Test {
	
	public static void main(String[] args) {
		ProduitXml xml = new ProduitXml(Constants.PRODUITS_XML_FILEPATH);
//		xml.insert(new Produit("2", "Clavir", 50, 30));
//		System.out.println(xml.select("1"));
		System.out.println(xml.selectAll());
	}

}

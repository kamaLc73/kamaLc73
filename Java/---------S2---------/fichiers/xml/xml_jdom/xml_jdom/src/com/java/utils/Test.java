package com.java.utils;

import java.util.Scanner;

import com.java.beans.*;
import com.java.xml.ProduitXml;

public class Test {
	
	public static void main(String[] args) {
		ProduitXml xml = new ProduitXml(Constants.PRODUITS_XML_FILEPATH);

//		xml.insert(new Produit("1", "souris", 100, 150));
//		Sys2tem.out.println(xml.select("2"));

		
		
//		Produit p = new Produit("2", "Clavier", 150 , 30);
//		xml.insert(p);
		
//		Produit p = new Produit("3", "Ecran", 300.55 , 35);
//		xml.insert(p);
	
//		xml.update(p);	
//		xml.delete("3");	
//		xml.deleteAll();
/*			
		Produit p0 = new Produit("4", "hghg", 119.99, 150);
		xml.insert(p0);
				
		Produit p1 = new Produit("5", "Haut parleur", 259.99, 35);
		xml.insert(p1);
		
		Produit p2 = new Produit("6", "Camera", 239.50, 25);
		xml.insert(p2);
*/	
//		Produit p = new Produit("7", "Clavier", 400.50 , 100);
//		xml.updateAll(p);	
		
		xml.delete("7");
		System.out.println(xml.selectAll());
	}
	
	


}

package com.java.india;

public class Test {

	public static void main(String[] args) {
		Produit p1 = new Logiciel("Matlab", 500, 10, "Matlab Cor", 1990);
		Produit p2 = new Logiciel("Dev C++", 80, 30, "Dev C++ Cor", 1995);
		Produit p3 = new Materiel("Ecran", 1200, 25);
		Produit p4 = new Materiel("Clavier", 60, 40);
		
		GestionDeStock gds = new GestionDeStock();
		gds.ajouter(p1); gds.ajouter(p2); gds.ajouter(p3); gds.ajouter(p4); 
		
		gds.lister();
		System.out.println("Nbre de Logiciels est : " + gds.nbreLogiciels());
		System.out.println("Nbre de Materiels est : " + gds.nbreMateriels());
	}

}

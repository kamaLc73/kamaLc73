package com.java.utils;

import java.util.ArrayList;
import com.java.models.*;
import com.java.xml.*;

public class Test {

	public static void main(String[] args) {
		XmlOuvrage xmlOuvrage = new XmlOuvrage(Constantes.OUVRAGE_XML_FILEPATH);
		XmlAuteur xmlAuteurs = new XmlAuteur(Constantes.AUTEUR_XML_FILEPATH);
		
		Auteur a1 = new Auteur(1, "ahmed", "idrissi");
		Auteur a2 = new Auteur(2,"karim","alaoui");
		
		ArrayList<Auteur> a = new ArrayList<Auteur>();
		a.add(a1);a.add(a2);
		
		Ouvrage o1 = new Ouvrage(1, "math", "ensam", a ,2010);
		Ouvrage o2 = new Ouvrage(2, "sql", "ensam", a ,2022);
		
//		ArrayList<Ouvrage> ouvrages = new ArrayList<Ouvrage>();
//		ouvrages.add(o1);ouvrages.add(o2);
		
//		Biblio b = new Biblio(ouvrages);
		
//		System.out.println(b.afficherOuvragesAuteurs(a1));
		
		
		xmlOuvrage.insert(o1);xmlOuvrage.insert(o2);
		xmlAuteurs.insert(a1);xmlAuteurs.insert(a2);
	}
}

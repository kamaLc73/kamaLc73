package com.java.india;

public class Test {

	void exp03() {
		Auteur a1 = new Auteur("Alaoui", "ali", "alaoui.ali@gmail.com");
		Auteur a2 = new Auteur("IDrissi", "IDriss", "idrissi.idriss@gmail.com");
		Ouvrage o1 = new Ouvrage(1, "Math, Info", 2010, "Ensam Rabat");
		o1.ajouter(a1); o1.ajouter(a2);
		
		Auteur a3 = new Auteur("Alaoui", "ali", "alaoui.ali@gmail.com");
		Auteur a4 = new Auteur("Mousssaoui", "Moussa", "mouassaoui.moussa@gmail.com");
		Ouvrage o2 = new Ouvrage(2, "Math, Chimie", 2015, "Ensam Rabat");
		o2.ajouter(a3); o2.ajouter(a4);
		
		Biblio b = new Biblio();
		b.ajouter(o1); b.ajouter(o2);
		
//		System.out.println(b.extraire(0));
//		System.out.println(b.extraire(1));
//		System.out.println(b.extraire(-4));
//		System.out.println(b.extraire(5));

//		System.out.println(b.chercher(1));
//		System.out.println(b.chercher(2));
//		System.out.println(b.chercher(7));
		
//		b.ouvragesEcritPar(new Auteur("Mousssaoui", "Moussa", "mouassaoui.moussa@gmail.com"));
//		b.ouvragesTraiteTheme("Info");
	}
	
	void exp01() {
		Auteur a1 = new Auteur("Alaoui", "ali", "alaoui.ali@gmail.com");
		Auteur a2 = new Auteur("IDrissi", "IDriss", "idrissi.idriss@gmail.com");
		Ouvrage o = new Ouvrage(1, "Math, Info", 2010, "Ensam Rabat");
		o.ajouter(a1);
		o.ajouter(a2);
		System.out.println(o.ecritPar(new Auteur("Alaoui", "ali", "alaoui.ali@gmail.com")));
		System.out.println(o.ecritPar(new Auteur("IDrissi", "IDriss", "idrissi.idriss@gmail.com")));
		System.out.println(o.ecritPar(new Auteur("Alaoui", "IDriss", "idrissi.idriss@gmail.com")));
	}

	void exp02() {
		// Auteur a1 = new Auteur("Alaoui", "ali", "alaoui.ali@gmail.com");
		// Auteur a2 = new Auteur("IDrissi", "IDriss", "idrissi.idriss@gmail.com");
		Ouvrage o = new Ouvrage(1, "Math, Info", 2010, "Ensam Rabat");
		System.out.println(o.traiteTheme("Math"));
		System.out.println(o.traiteTheme("Info"));
		System.out.println(o.traiteTheme("Chimie"));
	}
	
	public Test() {
		exp02();
	}

	public static void main(String[] args) {
		new Test();
	}

}

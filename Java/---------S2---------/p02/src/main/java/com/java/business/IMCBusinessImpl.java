package com.java.business;

public class IMCBusinessImpl implements IMCBusiness {

	public IMCBusinessImpl() {
		System.out.println("Initialisation Business");
	}
	
	public double getIMC(double poids, double taille) {
		return poids / (taille * taille);
	}

	public String getEtat(double imc, String sexe) {
		String etat = "";
		if(sexe.equals("homme")) {
			if(imc < 20)		etat = "Maigreur";
			else if(imc < 25)	etat = "Poids Normal";
			else if(imc < 30)	etat = "Surcharge Pondérale";
			else if(imc < 40)	etat = "Adiposité";
			else	etat = "Obésité";
		} else {
			if(imc < 19)		etat = "Maigreur";
			else if(imc < 24)	etat = "Poids Normal";
			else if(imc < 30)	etat = "Surcharge Pondérale";
			else if(imc < 40)	etat = "Adiposité";
			else	etat = "Obésité";
		}
		return etat;
	}

}

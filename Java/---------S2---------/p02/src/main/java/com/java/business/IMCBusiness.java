package com.java.business;

public interface IMCBusiness {

	public double getIMC(double poids, double taille);
	public String getEtat(double imc, String sexe);

}

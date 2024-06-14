package com.java.models;

import java.util.ArrayList;

public class Ouvrage {

	private int id ;
	private String titre ;
	private String maisonEdition ;
	private ArrayList<Auteur> auteurs ;
	private int annee ;
	
	public Ouvrage() {
	}
	
	public Ouvrage(int id, String titre, String maisonEdition, ArrayList<Auteur> auteurs, int annee) {
		this.id = id;
		this.titre = titre;
		this.maisonEdition = maisonEdition;
		this.auteurs = auteurs;
		this.annee = annee;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public String getMaisonEdition() {
		return maisonEdition;
	}

	public void setMaisonEdition(String maisonEdition) {
		this.maisonEdition = maisonEdition;
	}

	public ArrayList<Auteur> getAuteurs() {
		return auteurs;
	}

	public void setAuteurs(ArrayList<Auteur> auteurs) {
		this.auteurs = auteurs;
	}

	public int getAnnee() {
		return annee;
	}

	public void setAnnee(int annee) {
		this.annee = annee;
	}

	@Override
	public String toString() {
		return "Ouvrage [id=" + id + ", titre=" + titre + ", maisonEdition=" + maisonEdition + ", auteurs="
				+ auteurs + ", annee=" + annee + "]";
	}

	public boolean ecritPar(Auteur a) {
		for (Auteur auteur : auteurs) {
			if(auteur.getId() == a.getId()) return true ;
		}
		return false ;
	}
	 
	public boolean traiteTheme(String theme) {
		if (titre.indexOf(theme) >= 0)
			return true;
		else
			return false;
	}
	
	
	
	
}
 
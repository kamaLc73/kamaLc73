package com.java.india;

import java.util.ArrayList;
import java.util.List;

public class Ouvrage {
	private int id;
	private String titre;
	private int anneeEdition;
	private String maisonEdition;
	private List<Auteur> auteurs;

	public Ouvrage() {
		auteurs = new ArrayList<>();
	}

	public void ajouter(Auteur a) {
		auteurs.add(a);
	}

	public Ouvrage(int id, String titre, int anneeEdition, String maisonEdition) {
		this();
		this.id = id;
		this.titre = titre;
		this.anneeEdition = anneeEdition;
		this.maisonEdition = maisonEdition;
	}

	public boolean ecritPar(Auteur a) {
		for (int i = 0; i < auteurs.size(); i++) {
			if (auteurs.get(i).getNom() == a.getNom() && auteurs.get(i).getPrenom() == a.getPrenom())
				return true;
		}
		return false;
	}
	
	public boolean traiteTheme(String theme) {
		if (titre.indexOf(theme) >= 0)
			return true;
		else
			return false;
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

	public int getAnneeEdition() {
		return anneeEdition;
	}

	public void setAnneeEdition(int anneeEdition) {
		this.anneeEdition = anneeEdition;
	}

	public String getMaisonEdition() {
		return maisonEdition;
	}

	public void setMaisonEdition(String maisonEdition) {
		this.maisonEdition = maisonEdition;
	}

	public List<Auteur> getAuteurs() {
		return auteurs;
	}

	public void setAuteurs(List<Auteur> auteurs) {
		this.auteurs = auteurs;
	}

	@Override
	public String toString() {
		return "Ouvrage [id=" + id + ", titre=" + titre + ", anneeEdition=" + anneeEdition + ", maisonEdition="
				+ maisonEdition + ", auteurs=" + auteurs + "]";
	}
	
}

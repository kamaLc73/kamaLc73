package com.java.models;

import java.util.ArrayList;

public class Biblio {
	
	private ArrayList<Ouvrage> ouvrages ; 
	
	public Biblio() {
		ouvrages = new ArrayList<Ouvrage>();
	}

	public Biblio(ArrayList<Ouvrage> ouvrages) {
		super();
		this.ouvrages = ouvrages;
	}
	
	public void ajouterOuvrage(Ouvrage o) {
		if(o == null)return ;
		ouvrages.add(o);
	}
	
	public void supprimerOuvrage(Ouvrage o ) {
		if(o == null)return ;
		for (Ouvrage ouvrage : ouvrages) {
			if(o.getId() == ouvrage.getId()){
				ouvrages.remove(o);
				return;
			}
		}
	}
	
	public void ajouterAuteur(Auteur a) {
		if(a == null)return ;
		for (Ouvrage ouvrage : ouvrages) {	
			ouvrage.getAuteurs().add(a);			
		}
	}
	
	public void supprimerAuteur(Auteur a) {
		if(a == null)return ;
		for (Ouvrage ouvrage : ouvrages) {	
			for (Auteur auteur : ouvrage.getAuteurs() ) {
				if(a.getId()==auteur.getId()) {
					ouvrage.getAuteurs().remove(auteur);
					return;
				}
			}
		}
	}
	
	public Ouvrage extraireOuvrage(int id) {
		for (Ouvrage ouvrage : ouvrages) { 
			if(ouvrage.getId() == id)return ouvrage;		
		}
		return null ;
	}
	
	
	public Auteur extraireAuteur(int id) {
		for (Ouvrage ouvrage : ouvrages) {
			for (Auteur auteur : ouvrage.getAuteurs()) {
				if(auteur.getId() == id) return auteur ;
			}
		}
		return null ;
	}
	
	public ArrayList<Ouvrage> afficherOuvragesAuteurs(Auteur a) {
		ArrayList<Ouvrage> ouvrageErcitPar = new ArrayList<Ouvrage>();
		for (Ouvrage o : ouvrages) {
			if(o.ecritPar(a))
				ouvrageErcitPar.add(o);			
		}		
		return ouvrageErcitPar;
	}
	
	public ArrayList<Ouvrage> afficherOuvragesTheme(String theme) {
		ArrayList<Ouvrage> ouvragesTheme = new ArrayList<Ouvrage>();
		for (Ouvrage ouvrage : ouvrages) {
			if(ouvrage.traiteTheme(theme))
				ouvragesTheme.add(ouvrage);
		}
		return ouvragesTheme;
	}
	
	
	
}

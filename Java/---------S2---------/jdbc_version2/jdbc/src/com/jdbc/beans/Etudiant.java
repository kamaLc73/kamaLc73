package com.jdbc.beans;

public class Etudiant {
	private long cne;
	private String nom;
	private String prenom;
	
	public Etudiant() {
	}

	public Etudiant(long cne, String nom, String prenom) {
		this.cne = cne;
		this.nom = nom;
		this.prenom = prenom;
	}
	
	public long getCne() {
		return cne;
	}

	public void setCne(long cne) {
		this.cne = cne;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String toString() {
		return "Etudiant [cne=" + cne + ", nom=" + nom + ", prenom=" + prenom + "]";
	}
}

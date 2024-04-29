package com.java.india;

public class Auteur {
	private String nom;
	private String prenom;
	private String email;
	
	public Auteur() {
	}

	public Auteur(String nom, String prenom, String email) {
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String toString() {
		return "Auteur [nom=" + nom + ", prenom=" + prenom + ", email=" + email + "]";
	}

	
}

package com.java.beans;

import java.sql.Date;

public class Personne {
	private String id;
	private String nom;
	private String prenom;
	private Date dateNais;
	
	public Personne() {
	}

	public Personne(String id, String nom, String prenom, Date dateNais) {
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.dateNais = dateNais;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
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

	public Date getDateNais() {
		return dateNais;
	}

	public void setDateNais(Date dateNais) {
		this.dateNais = dateNais;
	}

	public String toString() {
		return "Personne [id=" + id + ", nom=" + nom + ", prenom=" + prenom + ", dateNais=" + dateNais + "]";
	}
	
}

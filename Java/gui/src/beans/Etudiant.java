package com.java.beans;

import com.java.swing.Item;

public class Etudiant implements Item {
	private String nom;
	private String prenom;
	private double note;

	public Etudiant() {
	}

	public Etudiant(String nom, String prenom, double note) {
		this.nom = nom;
		this.prenom = prenom;
		this.note = note;
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

	public double getNote() {
		return note;
	}

	public void setNote(double note) {
		this.note = note;
	}

	public String toString() {
		return "Etudiant [nom=" + nom + ", prenom=" + prenom + ", note=" + note + "]";
	}

	public int getFieldsCount() {
		return 3;
	}

	public String getFieldsLabel(int index) {
		switch (index) {
		case 1:
			return "Nom";
		case 2:
			return "Prénom";
		case 3:
			return "Note";
		default:
			return null;
		}
	}

	public int getFieldsCol(int index) {
		switch (index) {
		case 1:
			return 10;
		case 2:
			return 10;
		case 3:
			return 6;
		default:
			return 0;
		}
	}

}

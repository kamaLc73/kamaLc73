package com.java.beans;

import java.util.Date;

public class Commande {
	
	private int code;
	private String date;
	private int qte;
	private Client cl;
	private Produit pr;
	
	public Commande() {
		
	}
	
	public Commande(int code, String date, int qte, Client cl, Produit pr) {
		this.code = code;
		this.date = date;
		this.qte = qte;
		this.cl = cl;
		this.pr = pr;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public Client getClient() {
		return cl;
	}

	public void setClient(Client cl) {
		this.cl = cl;
	}

	public Produit getProduit() {
		return pr;
	}

	public void setProduit(Produit pr) {
		this.pr = pr;
	}

	public int getQte() {
		return qte;
	}

	public void setQte(int qte) {
		this.qte = qte;
	}

	public String toString() {
		return "Commande [code=" + code + ", date=" + date + ", qte=" + qte + ", cl=" + cl + ", pr=" + pr + "]";
	}
	
	
	
	

}

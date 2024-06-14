package com.java.beans;

public class Commande {
	private int id;
	private Produit produit;
	private Client client;
	private int qt;
	private String date;
	
	public Commande() {
	}

	public Commande(int id, Produit produit, Client client, int qt, String date) {
		this.id = id;
		this.produit = produit;
		this.client = client;
		this.qt = qt;
		this.date = date;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Produit getProduit() {
		return produit;
	}

	public void setProduit(Produit produit) {
		this.produit = produit;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public int getQt() {
		return qt;
	}

	public void setQt(int qt) {
		this.qt = qt;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String toString() {
		return "Commande [id=" + id + ", produit=" + produit + ", client=" + client + ", qt=" + qt + ", date=" + date
				+ "]";
	}

}

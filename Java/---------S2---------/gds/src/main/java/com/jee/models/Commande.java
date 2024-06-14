package com.jee.models;

public class Commande {
	private Long id;
	private Produit produit;
	private Client client;
	private String date;

	public Commande() {
	}

	public Commande(Produit produit, Client client, String date) {
		super();
		this.produit = produit;
		this.client = client;
		this.date = date;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
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

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String toString() {
		return "Commande [id=" + id + ", produit=" + produit + ", client=" + client + ", date=" + date + "]";
	}

}

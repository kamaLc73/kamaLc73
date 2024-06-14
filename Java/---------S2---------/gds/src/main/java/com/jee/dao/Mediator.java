package com.jee.dao;

import com.jee.models.Client;
import com.jee.models.Produit;

public class Mediator {

	public Mediator() {
	}

	public Client getClient(Long id) {
		ClientDaoImpl cd = new ClientDaoImpl();
		return cd.selectClient(id);
	}

	public Produit getProduit(Long ref) {
		ProduitDaoImpl pd = new ProduitDaoImpl();
		return pd.selectProduit(ref);
	}

}

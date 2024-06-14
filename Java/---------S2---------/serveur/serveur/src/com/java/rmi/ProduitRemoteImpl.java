package com.java.rmi;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import java.util.List;

import com.java.beans.Produit;

public class ProduitRemoteImpl extends UnicastRemoteObject implements ProduitRemote {
	private List<Produit> produits = new ArrayList<>();

	public ProduitRemoteImpl() throws RemoteException {
		produits.add(new Produit("P01", "Ecran", 1200, 12));
		produits.add(new Produit("P02", "Souris", 50, 5));
		produits.add(new Produit("P03", "Clavier", 100, 10));
	}

	public double prixTTC(double HT, double TVA) throws RemoteException {
		return HT + HT * TVA;
	}

	public Produit chercherProduit(String ref) throws RemoteException {
		for (Produit produit : produits) {
			if(produit.getRef().equals(ref))
				return produit;
		}
		return null;
	}

	public List<Produit> listerProduits() throws RemoteException {
		return produits;
	}

	
}

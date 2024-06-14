package com.java.rmi;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

import com.java.beans.Produit;

public interface ProduitRemote extends Remote {

	public double prixTTC(double HT, double TVA) throws RemoteException;
	public Produit chercherProduit(String ref) throws RemoteException;
	public List<Produit> listerProduits() throws RemoteException;

}

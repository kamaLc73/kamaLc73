package com.java.rmi;

import java.rmi.Naming;

public class Client {

	public static void main(String[] args) {
		try {
			ProduitRemote od = (ProduitRemote) Naming.lookup("rmi://localhost:1099/PR");
			System.out.println(od.prixTTC(1000, 0.05));
			System.out.println(od.chercherProduit("P01"));
			System.out.println(od.chercherProduit("P02"));
			System.out.println(od.chercherProduit("P03"));
			System.out.println(od.chercherProduit("P04"));
			System.out.println(od.listerProduits());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

package com.java.utils;


import java.sql.Connection;
import com.java.beans.*;
import com.java.jdbc.*;


public class Test {
	
	public static void main(String[] args) {
		
//		Connection cnx = new MySQLDataSource("india").getConnection();
		DataBase_v2 db = new DataBase_v2(new MySQLDataSource("india"));
		
//		Client c = new Client(3, "idrissi", "idriss");
//		System.out.println(db.insertClient(c));	
//		
//		Produit p = new Produit(3, "souris", 50.5, 40);
//		System.out.println(db.insertProduit(p));
//	
//		Commande co = new Commande(3, "2024-12-15", 3, c, p);
//		System.out.println(db.insertCommande(co));
		
//		System.out.println(db.selectAllClients());
//		System.out.println(db.selectAllProduits());
//		System.out.println(db.selectClient(3));
//		System.out.println(db.selectProduit(2));
//		System.out.println(db.selectCommande(1));
//		System.out.println(db.selectAllCommandes());
		
//		String[] tab = {"220.55","45"};
//		System.out.println(db.updateProduit(tab, "1"));

//		String[] tab = {"bekkali","mohammed"};
//		System.out.println(db.updateClient(tab, "1"));
		
		
//		String[] tab = {"2027-08-19","10","1","2"};
//		System.out.println(db.updateCommande(tab, "1"));
					
		
//		Client c = new  Client(4, "alaoui", "ahmed");
//		Produit p = new Produit(4, "tv", 500.5, 10);
//		System.out.println(db.insertClient(c)+" and "+ db.insertProduit(p));
//		
//		Commande co2 = new Commande(4, "2027-09-18", 3, c, p);
//		System.out.println(db.insertCommande(co2)); 
		
//		System.out.println(db.deleteCommande(3));
		
//		System.out.println(db.deleteClient(3));
	
//		System.out.println(db.deleteProduit(3));
	
		
		Client c = new Client(3, "Hassan", "El Bahraoui");
//		db.insert(c);
		Client c1 = new Client(4,null,null);
		
//		db.select(c);
		System.out.println(db.select(c1));
//		db.update(c);
//		System.out.println(db.selectAll(Client.class));
	}

}

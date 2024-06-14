package com.jee.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.jee.models.Client;
import com.jee.models.Commande;
import com.jee.models.Produit;

public class CommandeDaoImpl implements CommandeDao {

	public Commande insertCommande(Commande c) {
		try {
			Connection cnx = SingletonConnection.getConnection();
			PreparedStatement ps = cnx.prepareStatement("INSERT INTO COMMANDE "
					+ "(REF_CLIENT, REF_PRODUIT, DATE_CMD) VALUES (?, ?, ?)");
			ps.setLong(1, c.getClient().getId());
			ps.setLong(2, c.getProduit().getRef());
			ps.setString(3, c.getDate());
			ps.executeUpdate();
			ps.close();
			ps = cnx.prepareStatement("SELECT MAX(ID) as MAXID FROM COMMANDE"); 
			ResultSet rs = ps.executeQuery();
			if(rs.next()) {
				c.setId(rs.getLong(1));
			}
			return c;
		} catch (Exception e) {
			System.out.println("Erreur : " + e.getMessage());
		}
		return null;
	}

	public Commande selectCommande(Long id) {
		try {
			Commande c = new Commande();
			Connection cnx = SingletonConnection.getConnection();
			PreparedStatement ps = cnx.prepareStatement("SELECT * FROM COMMANDE "
					+ " WHERE ID = ?");
			ps.setLong(1, id);
			ResultSet rs = ps.executeQuery();
			if(rs.next()) {
				c.setId(rs.getLong(1));
				Mediator m = new Mediator();
				Long refClient = rs.getLong(2);
				Client client = m.getClient(refClient);
				Long refProduit = rs.getLong(3);
				Produit produit = m.getProduit(refProduit);
				c.setClient(client);
				c.setProduit(produit);
				c.setDate(rs.getString(4));
				return c;
			}
			else
				return null;
		} catch (Exception e) {
			System.out.println("Erreur : " + e.getMessage());
		}
		return null;
	}

	public List<Commande> selectByKeyWord(String keyWord) {
		try {
			List<Commande> lc = new ArrayList<Commande>();
			Connection cnx = SingletonConnection.getConnection();
			PreparedStatement ps = cnx.prepareStatement("SELECT * FROM COMMANDE "
					+ "WHERE DATE_CMD like ?");
			ps.setString(1, keyWord);
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				Commande c = new Commande();
				c.setId(rs.getLong(1));
				Mediator m = new Mediator();
				Long refClient = rs.getLong(2);
				Client client = m.getClient(refClient);
				Long refProduit = rs.getLong(3);
				Produit produit = m.getProduit(refProduit);
				c.setClient(client);
				c.setProduit(produit);
				c.setDate(rs.getString(4));
				lc.add(c);
			}
			return lc;
		} catch (Exception e) {
			System.out.println("Erreur : " + e.getMessage());
		}
		return null;
	}

	public Commande updateCommande(Commande c) {
		return null;
	}

	public void deleteCommande(Long id) {
		
	}

}

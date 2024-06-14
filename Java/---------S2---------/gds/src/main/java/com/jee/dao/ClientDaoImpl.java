package com.jee.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.jee.models.Client;

public class ClientDaoImpl implements ClientDao {

	public Client insertClient(Client c) {
		try {
			Connection cnx = SingletonConnection.getConnection();
			PreparedStatement ps = cnx.prepareStatement("INSERT INTO CLIENT "
					+ "(NOM, PRENOM, EMAIL) VALUES (?, ?, ?)");
			ps.setString(1, c.getNom());
			ps.setString(2, c.getPrenom());
			ps.setString(3, c.getEmail());
			ps.executeUpdate();
			ps.close();
			ps = cnx.prepareStatement("SELECT MAX(ID) as MAXID FROM CLIENT"); 
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

	public Client selectClient(Long id) {
		try {
			Client c = new Client();
			Connection cnx = SingletonConnection.getConnection();
			PreparedStatement ps = cnx.prepareStatement("SELECT * FROM CLIENT "
					+ " WHERE ID = ?");
			ps.setLong(1, id);
			ResultSet rs = ps.executeQuery();
			if(rs.next()) {
				c.setId(rs.getLong(1));
				c.setNom(rs.getString(2));
				c.setPrenom(rs.getString(3));
				c.setEmail(rs.getString(4));
				return c;
			}
			else
				return null;
		} catch (Exception e) {
			System.out.println("Erreur : " + e.getMessage());
		}
		return null;
	}

	public List<Client> selectByKeyWord(String keyWord) {
		try {
			List<Client> lc = new ArrayList<Client>();
			Connection cnx = SingletonConnection.getConnection();
			PreparedStatement ps = cnx.prepareStatement("SELECT * FROM CLIENT "
					+ " WHERE NOM LIKE ?");
			ps.setString(1, keyWord);
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				Client c = new Client();
				c.setId(rs.getLong(1));
				c.setNom(rs.getString(2));
				c.setPrenom(rs.getString(3));
				c.setEmail(rs.getString(4));
				lc.add(c);
			}
			return lc;
		} catch (Exception e) {
			System.out.println("Erreur : " + e.getMessage());
		}
		return null;
	}

	public Client updateClient(Client c) {
		return null;
	}

	public void deleteClient(Long id) {
		
	}

}

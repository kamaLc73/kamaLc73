package com.jee.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.jee.models.Produit;

public class ProduitDaoImpl implements ProduitDao {

	public Produit insertProduit(Produit p) {
		try {
			Connection cnx = SingletonConnection.getConnection();
			PreparedStatement ps = cnx.prepareStatement("INSERT INTO PRODUIT "
					+ "(DESIG, PU, QS) VALUES (?, ?, ?)");
			ps.setString(1, p.getDesig());
			ps.setDouble(2, p.getPu());
			ps.setInt(3, p.getQs());
			ps.executeUpdate();
			ps.close();
			ps = cnx.prepareStatement("SELECT MAX(REF) as MAXREF FROM PRODUIT"); 
			ResultSet rs = ps.executeQuery();
			if(rs.next()) {
				p.setRef(rs.getLong(1));
			}
			return p;
		} catch (Exception e) {
			System.out.println("Erreur : " + e.getMessage());
		}
		return null;
	}

	public Produit selectProduit(Long ref) {
		try {
			Produit p = new Produit();
			Connection cnx = SingletonConnection.getConnection();
			PreparedStatement ps = cnx.prepareStatement("SELECT * FROM PRODUIT "
					+ " WHERE REF = ?");
			ps.setLong(1, ref);
			ResultSet rs = ps.executeQuery();
			if(rs.next()) {
				p.setRef(rs.getLong(1));
				p.setDesig(rs.getString(2));
				p.setPu(rs.getDouble(3));
				p.setQs(rs.getInt(4));
				return p;
			}
			else
				return null;
		} catch (Exception e) {
			System.out.println("Erreur : " + e.getMessage());
		}
		return null;
	}

	public List<Produit> selectByKeyWord(String keyWord) {
		try {
			List<Produit> lp = new ArrayList<Produit>();
			Connection cnx = SingletonConnection.getConnection();
			PreparedStatement ps = cnx.prepareStatement("SELECT * FROM PRODUIT "
					+ " WHERE DESIG LIKE ?");
			ps.setString(1, keyWord);
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				Produit p = new Produit();
				p.setRef(rs.getLong(1));
				p.setDesig(rs.getString(2));
				p.setPu(rs.getDouble(3));
				p.setQs(rs.getInt(4));
				lp.add(p);
			}
			return lp;
		} catch (Exception e) {
			System.out.println("Erreur : " + e.getMessage());
		}
		return null;
	}

	public Produit updateProduit(Produit p) {
		return null;
	}

	public void deleteProduit(Long ref) {
		
	}

}

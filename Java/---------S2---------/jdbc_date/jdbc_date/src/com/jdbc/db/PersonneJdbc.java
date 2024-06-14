package com.jdbc.db;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import com.java.beans.Personne;

public class PersonneJdbc {
	private DataSource ds;
	private Connection cnx;
	
	public PersonneJdbc() {
	}

	public PersonneJdbc(DataSource ds) {
		setDs(ds);
	}

	public DataSource getDs() {
		return ds;
	}

	public void setDs(DataSource ds) {
		this.ds = ds;
		this.cnx = this.ds.getConnection();
	}

	public int insertPersonne(Personne p) {
		try {
			PreparedStatement s = cnx.prepareStatement("insert into personne values(?, ?, ?, ?)");
			s.setString(1, p.getId());
			s.setString(2, p.getNom());
			s.setString(3, p.getPrenom());
			s.setDate(4, p.getDateNais());
			return s.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
			return -1;
		}
	}

	public Personne selectPersonne(String id) {
		try {
			String req = "select * from personne where id = '" + id + "' ;";
			Statement s = this.cnx.createStatement();
			ResultSet r = s.executeQuery(req);
			if(r.next()) {
				String nom = r.getString(2);
				String prenom = r.getString(3);
				Date date = r.getDate(4);
				return new Personne(id, nom, prenom, date);
			}
			return null;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

/*	public List<Document> selectAllDocuments() {
		try {
			String req = "select * from document";
			Statement s = this.cnx.createStatement();
			ResultSet r = s.executeQuery(req);
			List<Document> l = new ArrayList<>();
			while(r.next()) {
				int id = r.getInt(1);
				String name = r.getString(2);
				int pageCount = r.getInt(3);
				l.add(new Document(id, name, pageCount));
			}
			return l;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
		
	}
*/
}

package com.jdbc.utils;

import com.jdbc.beans.Document;
import com.jdbc.beans.Etudiant;
import com.jdbc.db.DataSource;
import com.jdbc.db.Database;
import com.jdbc.db.MySQLDataSource;

public class Test {

	public static void main(String[] args) {
		DataSource ds = new MySQLDataSource("php");
		Database db = new Database(ds);

//		Document d = new Document(3, "Doc 03", 300);
//		System.out.println(db.insertDocument(d));
//		System.out.println(db.selectDocument(6));
//		System.out.println(db.selectAllDocuments());

//		db.insert("document", new String [] {"4", "Doc 04", "400"});
//		db.insert("etudiant", new String [] {"654123", "Kasmi", "EL mehdi"});
		
//		db.insert(new Document(5, "Doc 05", 500));
//		db.insert(new Etudiant(987654, "Ben Fatah", "Yassine"));

//		Document d = new Document();
//		d.setId(3);
//		System.out.println(d);
//		db.select(d);
//		System.out.println(d);

//		Etudiant d = new Etudiant();
//		d.setCne(123456);
//		System.out.println(d);
//		db.select(d);
//		System.out.println(d);

		System.out.println(db.selectAll(Etudiant.class));
	}

}

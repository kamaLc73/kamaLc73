package com.java.utils;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.java.beans.Personne;
import com.jdbc.db.MySQLDataSource;
import com.jdbc.db.PersonneJdbc;

public class Test {
	
	public static void main(String[] args) {
		
		try {
			PersonneJdbc db = new PersonneJdbc(new MySQLDataSource("india"));
			
//			DateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
//			Date myDate= formatter.parse("2023-01-25");
//			java.sql.Date sqlDate = new java.sql.Date(myDate.getTime());
//			Personne p = new Personne("P03", "Alaoui", "Ali", sqlDate);
//			db.insertPersonne(p);

			Personne p = db.selectPersonne("P02");
			System.out.println(p);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}

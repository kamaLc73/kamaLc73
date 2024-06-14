package com.jee.dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class SingletonConnection  {
	private static Connection connection;

	static  {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/gds", "root", "");
		} catch(Exception e) {
			System.out.println("Erreur de connection : " + e.getMessage());
		}
	}

	public static Connection getConnection() {
		return connection;
	}

}

package com.jdbc.db;

public class MySQLDataSource extends DataSource {

	public MySQLDataSource(String host, String dbname, String user, String password) {
		super("com.mysql.jdbc.Driver", "jdbc:mysql://" + host + "/" + dbname, user, password);
	}

	public MySQLDataSource(String dbname) {
		this("localhost", dbname, "root", "");
	}

}

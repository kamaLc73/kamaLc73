package com.java.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class DataSource {
	private String driver;
	private String url;
	private String user;
	private String passwd;

	public DataSource() {
	}

	public DataSource(String driver, String url, String user, String passwd) {
		this.driver = driver;
		this.url = url;
		this.user = user;
		this.passwd = passwd;
	}

	public String getDriver() {
		return driver;
	}

	public void setDriver(String driver) {
		this.driver = driver;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getPasswd() {
		return passwd;
	}

	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}

		public Connection getConnection () {
			try {
				Class.forName(driver);
				System.out.println("Connexion bien établie.");
				return DriverManager.getConnection(url, user, passwd);
			} catch (Exception e) {
				e.printStackTrace();
				return null;
			}
		}
}

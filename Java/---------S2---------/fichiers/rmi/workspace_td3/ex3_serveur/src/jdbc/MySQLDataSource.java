package jdbc;

public class MySQLDataSource extends DataSource {

	public MySQLDataSource(String host, String dbname, String user, String passwd) {
		super("com.mysql.jdbc.Driver", "jdbc:mysql://" + host + "/" + dbname, user, passwd);
	}

	public MySQLDataSource(String dbname, String user, String passwd) {
		super("com.mysql.jdbc.Driver", "jdbc:mysql://localhost/" + dbname, user, passwd);
	}

	public MySQLDataSource(String dbname) {
		super("com.mysql.jdbc.Driver", "jdbc:mysql://localhost/" + dbname, "root", "");
	}

}

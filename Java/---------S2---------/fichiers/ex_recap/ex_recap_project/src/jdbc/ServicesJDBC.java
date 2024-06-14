package jdbc;

import java.rmi.RemoteException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import beans.Packagee;

public class ServicesJDBC {
	private Connection cnx;
	private Connection connect() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			return DriverManager.getConnection("jdbc:mysql://localhost:3306/tp4_s2", "root", "root");
		}catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	

	public ArrayList<Packagee> selectAll() throws RemoteException {
		ArrayList<Packagee> ps = new ArrayList<Packagee>() ;
		cnx = connect();
		try {
			String req = "select * from packagee ;";
			Statement st = cnx.createStatement();
			ResultSet rs = st.executeQuery(req);
			while(rs.next()) {
				
				
				
				
				
				
			}
			return ps;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}

	}

}

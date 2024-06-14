package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import beans.*;

public class Mediator {
		private Connection cnx = connect();
		public Mediator() {
		}

		public ArrayList<Hotel>selectAllHotel(int idhotel) {
			ArrayList<Hotel> hotels = new ArrayList<>();
			try {
			String req = "select * from hotel where idhotel.hotel = idhotel.packagehotel;";
			Statement st = cnx.createStatement();
			ResultSet rs = st.executeQuery(req);

			while(rs.next()) {
				int id = rs.getInt(1);
				String name = rs.getString(2);
				int room = rs.getInt(3);
				hotels.add(new Hotel(id,name,room));
			}
			return hotels;
			} catch (Exception e) {
			e.printStackTrace();
			return null;
			}
		}

			
			

		public ArrayList<Transport> selectAllTransport(int idTrans) {
			String req = "select * from transport where idTrans.transport = idTrans.packagetransport;";

			
			
			
			
			
			
			return null;
		}
		private Connection connect() {
			try {
				Class.forName("com.mysql.jdbc.Driver");
				return DriverManager.getConnection("jdbc:mysql://localhost:3306/tp4_s2", "root", "root");
			}catch (Exception e) {
				e.printStackTrace();
				return null;
			}
		}

}


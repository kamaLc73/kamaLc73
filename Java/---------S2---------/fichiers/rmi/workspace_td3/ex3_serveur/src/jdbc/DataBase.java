package jdbc;

import java.sql.*;
import java.util.*;
import beans.*;

public class DataBase {
	private DataSource ds;
	private Connection cnx;
	
	public DataBase() {
	}

	public DataBase(DataSource ds) {
		setDs(ds);
	}

	public DataSource getDs() {
		return ds;
	}

	public void setDs(DataSource ds) {
		this.ds = ds;
		this.cnx = ds.getConnection();
	}
	
	public int insertPersonne(Personne p) {
		try {
			String req = "insert into personne values(" + p.getId() + ", '" 
					+ p.getName() + "', " + p.getAge() +", '"+p.getAdresse()+"');" ;
			Statement st = cnx.createStatement();
			return st.executeUpdate(req);
		} catch (Exception e) {
			e.printStackTrace();
			return -1;
		}
	}

	public Personne selectPersonne(int id ) {
		try {
			String req = "select * from personne where id = " + id + ";";
			Statement st = cnx.createStatement();
			ResultSet rs = st.executeQuery(req);
			if(rs.first()) {
				String name = rs.getString(2);
				int age = rs.getInt(3);
				String adresse = rs.getString(4);
				return new Personne(id, name, age, adresse);
			}
			return null;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	
	
	public List<Personne> selectAllPeronnes() {
		try {
			String req = "select * from personne ;";
			Statement st = cnx.createStatement();
			ResultSet rs = st.executeQuery(req);
			List<Personne> personneList = new ArrayList<Personne>();
			while(rs.next()) {
				int id = rs.getInt(1);
				String name = rs.getString(2);
				int age = rs.getInt(3);
				String adresse = rs.getString(4);
				personneList.add(new Personne(id, name, age, adresse));
			}
			return personneList;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public int updatePersonne(String[] values, String condition) {
	    try {
	        String req = "update personne SET name = ?, age = ?, adresse = ? WHERE id = ?";
	        PreparedStatement st = this.cnx.prepareStatement(req);
	        st.setString(1, values[0]); 
	        st.setString(2, values[1]);
	        st.setString(3, values[2]);
	        st.setString(4, condition); 
	        return st.executeUpdate();
	    } catch (Exception e) {
	        e.printStackTrace();
	        return -1;
	    }
	}
	 
    public int deletePersonne(int id) {
        try {
            String req = "delete from personne where id = ? ;";  
            PreparedStatement s = cnx.prepareStatement(req);
            s.setInt(1, id); 
            return s.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
            return -1;
        }
    }    
	
}
	
	
	
	
	
	
	
	
	
	






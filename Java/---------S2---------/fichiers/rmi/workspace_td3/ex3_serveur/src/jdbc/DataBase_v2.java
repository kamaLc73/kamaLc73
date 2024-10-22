package jdbc ;

import java.lang.reflect.Field;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class DataBase_v2 {
	
	private DataSource ds;
	private Connection cnx;
	
	public DataBase_v2() {
	}

	public DataBase_v2(DataSource ds) {
		setDs(ds);
	}

	public DataSource getDs() {
		return ds;
	}

	public void setDs(DataSource ds) {
		this.ds = ds;
		this.cnx = ds.getConnection();
	}
	
	public int insert(String tableName, String [] values) {
		try {
			StringBuffer req = new StringBuffer("insert into " + tableName + " values('");
			req.append(values[0] + "'");
			for (int i = 1; i < values.length; i++) {
				req.append(", '" + values[i] + "'");
			}
			req.append(");");
			
			Statement st = cnx.createStatement();
			return st.executeUpdate(req.toString()); 
		} catch (Exception e) {
			e.printStackTrace();
			return -1;
		}
	}

	public int insert(Object o) {
		try {
			String tableName = o.getClass().getSimpleName();
			Field f [] = o.getClass().getDeclaredFields();
			String values [] = new String[f.length];
			for (int i = 0; i < f.length; i++) {
				f[i].setAccessible(true);
				values[i] = f[i].get(o).toString();
				f[i].setAccessible(false);
			}
			return insert(tableName, values);
		} catch (Exception e) {
			e.printStackTrace();
			return -1;
		}
	}

	public Object select(String tableName, String key, String value) {
		return null;
	}
	
	public Object select(Object o) {
		try {
			String tableName = o.getClass().getSimpleName();
			Field f [] = o.getClass().getDeclaredFields();
			String key = f[0].getName();
			f[0].setAccessible(true);
			String value = f[0].get(o).toString();
			f[0].setAccessible(false);
			
			String req = "select * from " + tableName + " where " + key + " = '" + value + "';";
			Statement st = cnx.createStatement();
			ResultSet rs = st.executeQuery(req);
			ResultSetMetaData rsm = rs.getMetaData();
			if(rs.first()) {
				for (int i = 2; i <= rsm.getColumnCount(); i++) {
					f[i-1].setAccessible(true);
					f[i-1].set(o, rs.getObject(i)); 
					f[i-1].setAccessible(false);
				}
			}
			return o;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
		
	}

	public List<Object> selectAll(Class c) {
		try {
			String req = "select * from " + c.getSimpleName();
			Statement stm = cnx.createStatement();
			ResultSet rs = stm.executeQuery(req);
			ResultSetMetaData rsm = rs.getMetaData();
			List<Object> l = new ArrayList<>();
			while(rs.next()) {
				Object o = c.newInstance();
				Field[] f = o.getClass().getDeclaredFields();
				for (int i = 1; i <= rsm.getColumnCount(); i++) {
					f[i-1].setAccessible(true);
					f[i-1].set(o, rs.getObject(i));
					f[i-1].setAccessible(false);
				}
				l.add(o);
			}
			return l;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public int delete(Object o) {
	    try {
	        String tableName = o.getClass().getSimpleName();
	        Field[] f = o.getClass().getDeclaredFields();
	        String key = f[0].getName();
	        f[0].setAccessible(true);
	        String value = f[0].get(o).toString();
	        f[0].setAccessible(false);

	        String req = "delete from " + tableName + " where " + key + " = '" + value + "'";
	        Statement st = cnx.createStatement();
	        return st.executeUpdate(req);
	    } catch (Exception e) {
	        e.printStackTrace();
	        return -1; 
	    }
	}
	
	public int update(Object o) {
	    try {
	        String tableName = o.getClass().getSimpleName();
	        Field[] fields = o.getClass().getDeclaredFields();
	        String key = fields[0].getName();
	        fields[0].setAccessible(true);
	        String value = fields[0].get(o).toString();
	        fields[0].setAccessible(false);

	        StringBuilder req = new StringBuilder("update " + tableName + " set ");
	        for (int i = 1; i < fields.length; i++) {
	            fields[i].setAccessible(true);
	            String fieldName = fields[i].getName();
	            String fieldValue = fields[i].get(o).toString(); 
	            fields[i].setAccessible(false);

	            req.append(fieldName);
	            req.append(" = '");
	            req.append(fieldValue);
	            req.append("'");
	            if (i < fields.length - 1) {
	                req.append(", ");
	            }
	        }
	        req.append(" where ");
	        req.append(key);
	        req.append(" = '");
	        req.append(value);
	        req.append("'");

	        Statement st = cnx.createStatement();
	        return st.executeUpdate(req.toString());
	    } catch (Exception e) {
	        e.printStackTrace();
	        return -1;
	    }
	}




	
	
	
	
	
	
	
	





}

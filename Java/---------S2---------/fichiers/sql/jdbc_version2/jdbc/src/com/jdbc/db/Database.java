package com.jdbc.db;

import java.lang.reflect.Field;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

import com.jdbc.beans.Document;

public class Database {
	private DataSource ds;
	private Connection cnx;
	
	public Database() {
	}

	public Database(DataSource ds) {
		setDs(ds);
	}

	public DataSource getDs() {
		return ds;
	}

	public void setDs(DataSource ds) {
		this.ds = ds;
		this.cnx = this.ds.getConnection();
	}

	public int insertDocument(Document d) {
		try {
			String req = "insert into document values(" + d.getId() + 
					", '" + d.getName() + "', " + d.getPageCount() + ")";
			Statement s = this.cnx.createStatement();
			return s.executeUpdate(req);
		} catch (Exception e) {
			e.printStackTrace();
			return -1;
		}
	}

	public Document selectDocument(int id) {
		try {
			String req = "select * from document where id = " + id;
			Statement s = this.cnx.createStatement();
			ResultSet r = s.executeQuery(req);
			if(r.next()) {
				String name = r.getString(2);
				int pageCount = r.getInt(3);
				return new Document(id, name, pageCount);
			}
			return null;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	public List<Document> selectAllDocuments() {
		try {
			String req = "select * from document";
			Statement s = this.cnx.createStatement();
			ResultSet r = s.executeQuery(req);
			List<Document> l = new ArrayList<>();
			while(r.next()) {
				int id = r.getInt(1);
				String name = r.getString(2);
				int pageCount = r.getInt(3);
				l.add(new Document(id, name, pageCount));
			}
			return l;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
		
	}

	public int insert(String tableName, String [] values) {
		try {
			StringBuffer req = new StringBuffer("insert into " + tableName + " values('");
			req.append(values[0] + "'");
			for (int i = 1; i < values.length; i++) {
				req.append(", '" + values[i] + "'");
			}
			req.append(");");
			
			Statement s = this.cnx.createStatement();
			return s.executeUpdate(req.toString()); 
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
	
	public void select(Object o) {
		try {
			String tableName = o.getClass().getSimpleName();
			Field f [] = o.getClass().getDeclaredFields();
			String key = f[0].getName();
			f[0].setAccessible(true);
			String value = f[0].get(o).toString();
			f[0].setAccessible(false);
			
			String req = "select * from " + tableName + " where " + key + " = '" + value + "';";
			Statement stm = cnx.createStatement();
			ResultSet rs = stm.executeQuery(req);
			ResultSetMetaData rsm = rs.getMetaData();
			if(rs.first()) {
				for (int i = 2; i <= rsm.getColumnCount(); i++) {
					f[i-1].setAccessible(true);
					f[i-1].set(o, rs.getObject(i));
					f[i-1].setAccessible(false);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
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




	
	
	
	
	
	
	
	





}

package com.jee.dao;

import java.util.List;

import com.jee.beans.Document;

public interface DocumentDao {

	public void insert(Document d);
	public Document select(int id);
	public List<Document> selectAll();
	public boolean delete(int id);
	public boolean update(Document d);

}

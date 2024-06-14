package com.jee.business;

import java.util.List;

import com.jee.beans.Document;

public interface DocumentBusiness {
	
	public void add(Document d);
	public Document get(int id);
	public List<Document> getAll();
	public boolean remove(int id);
	public boolean modify(Document d);

}

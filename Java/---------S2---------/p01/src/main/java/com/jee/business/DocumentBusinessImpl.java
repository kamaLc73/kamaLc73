package com.jee.business;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import com.jee.beans.Document;
import com.jee.dao.DocumentDao;

public class DocumentBusinessImpl implements DocumentBusiness {
	private DocumentDao dao;

	public DocumentBusinessImpl() {
	}

	public DocumentBusinessImpl(DocumentDao dao) {
		this.dao = dao;
	}

	public DocumentDao getDao() {
		return dao;
	}

	public void setDao(DocumentDao dao) {
		this.dao = dao;
	}

	public void add(Document d) {
		System.out.println(">>>> Ajout Business");
		dao.insert(d);
	}

	public Document get(int id) {
		return dao.select(id);
	}

	public List<Document> getAll() {
		return dao.selectAll();
	}

	public boolean remove(int id) {
		return dao.delete(id);
	}

	public boolean modify(Document d) {
		return dao.update(d);
	}

}

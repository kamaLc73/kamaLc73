package com.jee.business;

import java.util.List;

import com.jee.beans.Document;
import com.jee.dao.DocumentDao;

public class DocumentManager implements DocumentBusiness {
	private DocumentDao dao;

	public DocumentManager() {
	}

	public DocumentManager(DocumentDao dao) {
		this.dao = dao;
	}

	public DocumentDao getDao() {
		return dao;
	}

	public void setDao(DocumentDao dao) {
		this.dao = dao;
	}

	public void add(Document d) {
		System.out.println(">>>>>>>> Ajouter Business");
		dao.insert(d);
	}

	public Document get(int id) {
		System.out.println(">>>>>>>> Get Business");
		return dao.select(id);
	}

	public List<Document> getAll() {
		System.out.println(">>>>>>>> Get All Business");
		return dao.selectAll();
	}

	public boolean remove(int id) {
		return dao.delete(id);
	}

	public boolean modify(Document d) {
		return dao.update(d);
	}

}

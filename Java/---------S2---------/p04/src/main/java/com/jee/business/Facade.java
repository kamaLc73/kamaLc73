package com.jee.business;

import java.util.List;

import com.jee.beans.Document;
import com.jee.dao.DocumentDao;
import com.jee.dao.DocumentDaoMemoryImpl;

public class Facade {
	private DocumentBusiness businessDoc;

	public Facade() {
		DocumentDao daoDoc = new DocumentDaoMemoryImpl();
		businessDoc = new DocumentManager(daoDoc);
	}

	public void ajouterDoc(Document d) {
		businessDoc.add(d);
	}

	public List<Document> listerDocs() {
		return businessDoc.getAll();
	}
}

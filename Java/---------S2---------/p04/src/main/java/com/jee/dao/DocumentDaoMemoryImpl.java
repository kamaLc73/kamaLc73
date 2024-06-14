package com.jee.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.jee.beans.Document;

public class DocumentDaoMemoryImpl implements DocumentDao {
	private Map<Integer, Document> docs;

	public DocumentDaoMemoryImpl() {
		docs = new HashMap<>();
	}

	public void insert(Document d) {
		System.out.println(">>>>>>>> Ajouter DAO");
		docs.put(d.getId(), d);
	}

	public Document select(int id) {
		System.out.println(">>>>>>>> Get DAO");
		return docs.get(id);
	}

	public List<Document> selectAll() {
		System.out.println(">>>>>>>> Get All DAO");
		List<Document> dl = null;
		if(!docs.isEmpty()) {
			dl = new ArrayList<>();
			for (Document document : docs.values()) {
				dl.add(document);
			}
		}
		return dl;
	}

	public boolean delete(int id) {
		return false;
	}

	public boolean update(Document d) {
		return false;
	}
}

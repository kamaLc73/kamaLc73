package com.jee.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import com.jee.beans.Document;

public class DocumentDaoMemoryImpl implements DocumentDao {
	private Map<Integer, Document> documents = new HashMap<>();

	public DocumentDaoMemoryImpl() {
	}

	public void insert(Document d) {
		System.out.println(">>>> Ajout Dao");
		documents.put(d.getId(), d);
	}

	public Document select(int id) {
		return documents.get(id);
	}

	public List<Document> selectAll() {
		List<Document> docs = null;
		if(!documents.isEmpty()) {
			docs = new ArrayList<>();
			for (Document document : documents.values()) {
				docs.add(document);
			}
		}
		return docs;
	}

	public boolean delete(int id) {
		return false;
	}

	public boolean update(Document d) {
		return false;
	}

}

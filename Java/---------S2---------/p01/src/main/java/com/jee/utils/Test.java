package com.jee.utils;

import com.jee.beans.Document;
import com.jee.dao.DocumentDao;
import com.jee.dao.DocumentDaoMemoryImpl;

public class Test {

	public static void main(String[] args) {
		DocumentDao dao = new DocumentDaoMemoryImpl();
		dao.insert(new Document(1, "Doc 01", 100));
		dao.insert(new Document(2, "Doc 02", 200));
		dao.insert(new Document(3, "Doc 03", 300));
		System.out.println(dao.select(1));
		System.out.println(dao.select(2));
		System.out.println(dao.select(3));
		System.out.println(dao.select(4));
		System.out.println(dao.selectAll());
	}

}

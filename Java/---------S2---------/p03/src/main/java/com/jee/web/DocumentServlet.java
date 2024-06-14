package com.jee.web;

import java.io.IOException;
import java.util.List;

import com.jee.beans.Document;
import com.jee.business.DocumentBusiness;
import com.jee.business.DocumentManager;
import com.jee.dao.DocumentDao;
import com.jee.dao.DocumentDaoMemoryImpl;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class DocumentServlet extends HttpServlet {
	private DocumentBusiness business;
	private DocumentDao dao;

	public void init() throws ServletException {
		dao = new DocumentDaoMemoryImpl();
		business = new DocumentManager(dao);
	}

	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String uri = req.getRequestURI();
		if(uri.contains("ajouter")) {

			System.out.println(">>>>>>>> Ajouter WEB");
			int id = Integer.parseInt(req.getParameter("id"));
			String title = req.getParameter("title");
			int pageCount = Integer.parseInt(req.getParameter("pageCount"));
			Document d = new Document(id, title, pageCount);
			business.add(d);
			req.getRequestDispatcher("/views/success.jsp").forward(req, resp);

		} else if(uri.contains("lister")) {
			System.out.println(">>>>>>>> Get All WEB");
			List<Document> dl = business.getAll();
			req.setAttribute("dl", dl);
			req.getRequestDispatcher("/views/liste_docs.jsp").forward(req, resp);
		}
	}

	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req, resp);
	}

}

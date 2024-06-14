package com.jee.web;

import java.io.IOException;
import java.util.List;

import com.jee.business.ClientBusiness;
import com.jee.business.ClientBusinessImpl;
import com.jee.dao.ClientDao;
import com.jee.dao.ClientDaoImpl;
import com.jee.models.Client;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class ClientServlet extends HttpServlet {
	private ClientDao dao;
	private ClientBusiness business;
	
	public void init() throws ServletException {
		dao = new ClientDaoImpl();
		business = new ClientBusinessImpl(dao);
	}

	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String uri = req.getRequestURI();
		if(uri.contains("lister.Client")) {
			List<Client> lc = business.getByKeyWord("%");
			req.setAttribute("lc", lc);
			req.getRequestDispatcher("/views/clients.jsp").forward(req, resp);
		} else if (uri.contains("ajouter.Client")) {
			String nom = req.getParameter("nom");
			String prenom = req.getParameter("prenom");
			String email = req.getParameter("email");
			Client c = new Client(nom, prenom, email);
			c = business.addClient(c);
//			req.setAttribute("p", p);
			List<Client> lc = business.getByKeyWord("%");
			req.setAttribute("lc", lc);
			req.getRequestDispatcher("/views/clients.jsp").forward(req, resp);
		} else if(uri.contains("chercher.Client")) {
			String nomRecherche = req.getParameter("nomRecherche");
			List<Client> lc = business.getByKeyWord("%"+ nomRecherche +"%");
			req.setAttribute("nomRecherche", nomRecherche);
			req.setAttribute("lc", lc);
			req.getRequestDispatcher("/views/clients.jsp").forward(req, resp);
		}
	}

	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req, resp);
	}

}

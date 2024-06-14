package com.jee.web;

import java.io.IOException;
import java.util.List;

import com.jee.business.ClientBusiness;
import com.jee.business.ClientBusinessImpl;
import com.jee.business.CommandeBusiness;
import com.jee.business.CommandeBusinessImpl;
import com.jee.business.ProduitBusiness;
import com.jee.business.ProduitBusinessImpl;
import com.jee.dao.ClientDao;
import com.jee.dao.ClientDaoImpl;
import com.jee.dao.CommandeDao;
import com.jee.dao.CommandeDaoImpl;
import com.jee.dao.ProduitDao;
import com.jee.dao.ProduitDaoImpl;
import com.jee.models.Client;
import com.jee.models.Commande;
import com.jee.models.Produit;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class CommandeServlet extends HttpServlet {
	private List<Long> lic;
	private List<Long> lrp;
	private CommandeDao dao;
	private CommandeBusiness business;
	
	public void init() throws ServletException {
		dao = new CommandeDaoImpl();
		business = new CommandeBusinessImpl(dao);
	}

	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String uri = req.getRequestURI();
		if(uri.contains("lister.Commande")) {
			List<Commande> lc = business.getByKeyWord("%");

			ClientDao clientDao = new ClientDaoImpl();
			ClientBusiness clientBusiness = new ClientBusinessImpl(clientDao);
			lic = clientBusiness.getClientsIds();
			ProduitDao produitDao = new ProduitDaoImpl();
			ProduitBusiness produitBusiness = new ProduitBusinessImpl(produitDao);
			lrp = produitBusiness.getProduitsRefs();

			req.setAttribute("lc", lc);
			req.setAttribute("lic", lic);
			req.setAttribute("lrp", lrp);
			req.getRequestDispatcher("/views/commandes.jsp").forward(req, resp);
		} else if (uri.contains("ajouter.Commande")) {
			Long idClient = Long.parseLong(req.getParameter("idClient"));
			Long refProduit =Long.parseLong(req.getParameter("refProduit"));

			ClientDao clientDao = new ClientDaoImpl();
			ClientBusiness clientBusiness = new ClientBusinessImpl(clientDao);
			Client client = clientBusiness.getClient(idClient);
			ProduitDao produitDao = new ProduitDaoImpl();
			ProduitBusiness produitBusiness = new ProduitBusinessImpl(produitDao);
			Produit produit = produitBusiness.getProduit(refProduit);

			String date = req.getParameter("date");
			Commande c = new Commande(produit, client, date);
			c = business.addCommande(c);
//			req.setAttribute("p", p);
			lic = clientBusiness.getClientsIds();
			lrp = produitBusiness.getProduitsRefs();
			List<Commande> lc = business.getByKeyWord("%");
			req.setAttribute("lc", lc);
			req.setAttribute("lic", lic);
			req.setAttribute("lrp", lrp);
			req.getRequestDispatcher("/views/commandes.jsp").forward(req, resp);
		}
	}

	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req, resp);
	}

}

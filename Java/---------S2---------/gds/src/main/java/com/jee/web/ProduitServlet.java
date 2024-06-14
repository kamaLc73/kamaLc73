package com.jee.web;

import java.io.IOException;
import java.util.List;

import com.jee.business.ProduitBusiness;
import com.jee.business.ProduitBusinessImpl;
import com.jee.dao.ProduitDao;
import com.jee.dao.ProduitDaoImpl;
import com.jee.models.Produit;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class ProduitServlet extends HttpServlet {
	private ProduitDao dao;
	private ProduitBusiness business;
	
	public void init() throws ServletException {
		dao = new ProduitDaoImpl();
		business = new ProduitBusinessImpl(dao);
	}

	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String uri = req.getRequestURI();
		if(uri.contains("lister.Produit")) {
			List<Produit> lp = business.getByKeyWord("%");
			req.setAttribute("lp", lp);
			req.getRequestDispatcher("/views/produits.jsp").forward(req, resp);
		} else if (uri.contains("ajouter.Produit")) {
			String desig = req.getParameter("desig");
			double pu = Double.parseDouble(req.getParameter("pu"));
			int qs = Integer.parseInt(req.getParameter("qs"));
			Produit p = new Produit(desig, pu, qs);
			p = business.addProduit(p);
//			req.setAttribute("p", p);
			List<Produit> lp = business.getByKeyWord("%");
			req.setAttribute("lp", lp);
			req.getRequestDispatcher("/views/produits.jsp").forward(req, resp);
		} else if(uri.contains("chercher.Produit")) {
			String desigRecherche = req.getParameter("desigRecherche");
			List<Produit> lp = business.getByKeyWord("%"+ desigRecherche +"%");
			req.setAttribute("desigRecherche", desigRecherche);
			req.setAttribute("lp", lp);
			req.getRequestDispatcher("/views/produits.jsp").forward(req, resp);
		}
	}

	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req, resp);
	}

}

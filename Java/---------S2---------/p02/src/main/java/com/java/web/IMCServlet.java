package com.java.web;

import java.io.IOException;

import com.java.business.IMCBusiness;
import com.java.business.IMCBusinessImpl;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class IMCServlet extends HttpServlet {
	private IMCBusiness business;

	public void init() throws ServletException {
		System.out.println("Initialisation de la Servlet");
		business = new IMCBusinessImpl();
	}

	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		double poids = Double.parseDouble(req.getParameter("poids"));
		double taille = Double.parseDouble(req.getParameter("taille"));
		String sexe = req.getParameter("sexe");

		double imc = business.getIMC(poids, taille);
		String etat = business.getEtat(imc, sexe);
		
		req.setAttribute("imc", "" + imc);
		req.setAttribute("etat", etat);
		req.getRequestDispatcher("res.jsp").forward(req, resp);
	}

	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req, resp);
	}

}

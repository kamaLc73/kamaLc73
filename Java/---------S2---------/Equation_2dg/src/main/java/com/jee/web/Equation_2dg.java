package com.jee.web;
import com.jee.business.*;
import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class Equation_2dg extends HttpServlet	{
	private Calcul x = new Calcul();
	
	public void init() throws ServletException {
		System.out.println("Intialisation reussie");		
	}
	
	
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Execution d'un service");
		req.getRequestDispatcher("form.html").forward(req, resp);
	    double a = Double.parseDouble(req.getParameter("coef1"));
        double b = Double.parseDouble(req.getParameter("coef2"));
        double c = Double.parseDouble(req.getParameter("coef3"));
        String res = x.resoudre(a, b, c);
        

	}
	
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req, resp);
	}
		
}

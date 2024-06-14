package web;

import java.io.IOException;

import bus.Calculer;
import bus.CreditInterface;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class S extends HttpServlet{
	
	private CreditInterface c ;
	
	@Override
	public void init() throws ServletException {
		c = new Calculer();
		System.out.println("Init");
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		if(req.getRequestURI().contains("calculer")) {
			double r = c.calculerMensualite(Integer.parseInt(req.getParameter("duree")), Double.parseDouble(req.getParameter("montant")), Double.parseDouble(req.getParameter("taux")));
			req.setAttribute("r", r);
			req.getRequestDispatcher("/views/result.jsp").forward(req, resp);
		}
	
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req, resp);
	}

}

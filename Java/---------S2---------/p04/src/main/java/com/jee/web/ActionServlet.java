package com.jee.web;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import com.jee.business.Facade;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class ActionServlet extends HttpServlet {
	private Facade facade;
	private Map<String, Action> actions;

	public void init() throws ServletException {
		facade = new Facade();
		actions = new HashMap<>();
		actions.put("ajouterDoc", new AjouterDocAction(facade));
		actions.put("listerDocs", new ListerDocsAction(facade));
	}

	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String uri = req.getRequestURI();
		int x = uri.lastIndexOf('/');
		int y = uri.lastIndexOf(".do");
		String key = uri.substring(x+1, y);
		
//		System.out.println("Key : " + key);
		Action action = actions.get(key);
//		System.out.println("Action : " + action.getClass().getSimpleName());
		String view = action.execute(req, resp);
		req.getRequestDispatcher(view).forward(req, resp);
	}

	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req, resp);
	}
}

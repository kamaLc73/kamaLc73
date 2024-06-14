package com.jee.web;

import com.jee.beans.Document;
import com.jee.business.Facade;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class AjouterDocAction extends Action {

	public AjouterDocAction(Facade facade) {
		super(facade);
	}

	String execute(HttpServletRequest req, HttpServletResponse resp) {
		int id = Integer.parseInt(req.getParameter("id")); 
		String title = req.getParameter("title");
		int pageCount = Integer.parseInt(req.getParameter("pageCount")); 
		Document d = new Document(id, title, pageCount);
		facade.ajouterDoc(d);
		req.setAttribute("d", d);
		return "/views/success.jsp";
	}

}

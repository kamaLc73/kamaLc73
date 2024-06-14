package com.jee.web;

import java.util.List;

import com.jee.beans.Document;
import com.jee.business.Facade;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class ListerDocsAction extends Action {

	public ListerDocsAction(Facade facade) {
		super(facade);
	}

	String execute(HttpServletRequest req, HttpServletResponse resp) {
		List<Document> l = facade.listerDocs();
		req.setAttribute("l", l);
		return "/views/listerDocs.jsp";
	}

}

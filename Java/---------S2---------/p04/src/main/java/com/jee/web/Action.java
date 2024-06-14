package com.jee.web;

import com.jee.business.Facade;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

abstract public class Action {
	protected Facade facade;
	
	public Action(Facade facade) {
		this.facade = facade;
	}

	abstract String execute(HttpServletRequest req, HttpServletResponse resp);

}

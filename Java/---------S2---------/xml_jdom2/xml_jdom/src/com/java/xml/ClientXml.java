package com.java.xml;

import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;

import org.jdom.Attribute;
import org.jdom.Document;
import org.jdom.Element;
import org.jdom.input.SAXBuilder;
import org.jdom.output.Format;
import org.jdom.output.XMLOutputter;

import com.java.beans.Client;
import com.java.beans.Produit;

public class ClientXml {
	private String filePath;
	private Document doc;
	private Element root;
	
	public ClientXml(String filePath) {
		this.filePath = filePath;
		load();
	}

	public void insert(Client c) {
		Element e = new Element("client");
		Attribute a = new Attribute("id", "" + c.getId());
		e.setAttribute(a);
		
		Element e1 = new Element("nom");
		e1.addContent(c.getNom());
		e.addContent(e1);
		
		Element e2 = new Element("prenom");
		e2.addContent("" + c.getPrenom());
		e.addContent(e2);
				
		root.addContent(e);
		save();
	}

	public Client select(int id) {
		List<Element> l = root.getChildren();
		if(l.size() > 0) {
			for (Element element : l) {
				if(Integer.parseInt(element.getAttributeValue("id")) == id) {
					Client c = new Client();
					c.setId(id);
					c.setNom(element.getChildText("nom"));
					c.setPrenom(element.getChildText("prenom"));
					return c;
				}
			}
		}
		return null;
	}
	
	public List<Client> selectAll() {
		return null;
	}
	
	private void load() {
		try {
			SAXBuilder sax = new SAXBuilder();
			doc = sax.build(new File(filePath));
			root = doc.getRootElement();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private void save() {
		try {
			XMLOutputter out = new XMLOutputter(Format.getPrettyFormat());
			out.output(doc, new FileOutputStream(filePath));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

package com.java.xml;

import java.io.File;
import java.io.FileOutputStream;
import java.util.List;

import org.jdom.Attribute;
import org.jdom.Document;
import org.jdom.Element;
import org.jdom.input.SAXBuilder;
import org.jdom.output.Format;
import org.jdom.output.XMLOutputter;
import org.w3c.dom.Attr;

import com.java.beans.Client;
import com.java.beans.Commande;
import com.java.beans.Produit;
import com.java.utils.Constants;

public class CommandeXml {
	private String filePath;
	private Document doc;
	private Element root;
	
	public CommandeXml(String filePath) {
		this.filePath = filePath;
		load();
	}

	public void insert(Commande cmd) {
		Element e = new Element("commande");
		Attribute a = new Attribute("id", "" + cmd.getId());
		e.setAttribute(a);
		
		Element e1 = new Element("client");
		Attribute a1 = new Attribute("ref", "" + cmd.getClient().getId());
		e1.setAttribute(a1);
		Element e2 = new Element("produit");
		Attribute a2 = new Attribute("ref", cmd.getProduit().getRef());
		e2.setAttribute(a2);

		Element e3 = new Element("qt");
		e3.addContent("" + cmd.getQt());
		Element e4 = new Element("date");
		e4.addContent(cmd.getDate());
		
		e.addContent(e1); e.addContent(e2); e.addContent(e3); e.addContent(e4); 
		root.addContent(e);
		save();
	}
	
	public Commande select(int id) {
		List<Element> l = root.getChildren();
		if(l.size() > 0) {
			for (Element element : l) {
				if(Integer.parseInt(element.getAttributeValue("id")) == id) {
					Commande cmd = new Commande();
					cmd.setId(id);
					cmd.setQt(Integer.parseInt(element.getChildText("qt")));
					cmd.setDate(element.getChildText("date"));
					Mediator mediator = new Mediator();
					Produit p = mediator.getProduit(element.getChild("produit").getAttributeValue("ref")) ;
					Client c = mediator.getClient(Integer.parseInt(element.getChild("client").getAttributeValue("ref"))) ;
					cmd.setProduit(p);
					cmd.setClient(c);
					return cmd;
				}
			}
		}
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

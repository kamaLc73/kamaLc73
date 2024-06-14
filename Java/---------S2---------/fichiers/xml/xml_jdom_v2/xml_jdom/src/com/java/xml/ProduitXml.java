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

import com.java.beans.Produit;

public class ProduitXml {
	private String filePath;
	private Document doc;
	private Element root;
	
	public ProduitXml(String filePath) {
		this.filePath = filePath;
		load();
	}

	public void insert(Produit p) {
		Element e = new Element("produit");
		Attribute a = new Attribute("ref", p.getRef());
		e.setAttribute(a);
		
		Element e1 = new Element("desig");
		e1.addContent(p.getDesig());
		e.addContent(e1);
		
		Element e2 = new Element("pu");
		e2.addContent("" + p.getPu());
		e.addContent(e2);
		
		Element e3 = new Element("qs");
		e3.addContent("" + p.getQs());
		e.addContent(e3);
		
		root.addContent(e);
		save();
	}

	public Produit select(String ref) {
		List<Element> l = root.getChildren();
		if(l.size() > 0) {
			for (Element element : l) {
				if(element.getAttributeValue("ref").equals(ref)) {
					Produit p = new Produit();
					p.setRef(ref);
					p.setDesig(element.getChildText("desig"));
					p.setPu(Double.parseDouble(element.getChildText("pu")));
					p.setQs(Double.parseDouble(element.getChildText("qs")));
					return p;
				}
			}
		}
		return null;
	}
	
	public List<Produit> selectAll() {
		List<Produit> lp = null;
		List<Element> l = root.getChildren();
		if(l.size() > 0) {
			lp = new ArrayList<>();
			for (Element element : l) {
					Produit p = new Produit();
					p.setRef(element.getAttributeValue("ref"));
					p.setDesig(element.getChildText("desig"));
					p.setPu(Double.parseDouble(element.getChildText("pu")));
					p.setQs(Double.parseDouble(element.getChildText("qs")));
					lp.add(p);
			}
		}
		return lp;
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

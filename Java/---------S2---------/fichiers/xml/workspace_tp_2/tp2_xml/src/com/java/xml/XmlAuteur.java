package com.java.xml;

import org.jdom2.*;
import org.jdom2.input.*;
import org.jdom2.output.*;

import com.java.models.*;
import java.io.*;
import java.util.List;


public class XmlAuteur {
	    private String filePath;
	    private Document doc;
	    private Element root;

	    public XmlAuteur(String filePath) {
	        this.filePath = filePath;
	        load();
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
	           
	    public void insert(Auteur a) {
	        Element e = new Element("auteur");
	        Attribute att = new Attribute("id", "" +a.getId());
	        e.setAttribute(att);

	        Element e1 = new Element("nom");
	        e1.addContent(a.getNom());
	        e.addContent(e1);

	        Element e2 = new Element("prenom");
	        e2.addContent(a.getPrenom());
	        e.addContent(e2);

	        root.addContent(e);
	        save();
	    }

		public Auteur select(String id) {
			List<Element> l = root.getChildren();
			Auteur a = new Auteur();
			if(l.size()>0) {
				for (Element e : l) {
					if(e.getAttributeValue(id) == id) {
						a.setId(Integer.parseInt(id));
						a.setNom(e.getChildText("nom"));
						a.setPrenom(e.getChildText("prenom"));
					}
				}
			}
			return a ;
		}
	    
	    
}

package com.java.xml;

import org.jdom2.*;
import org.jdom2.input.*;
import org.jdom2.output.*;

import com.java.models.*;
import java.io.*;
import java.util.Date;
import java.util.List;


public class XmlOuvrage {
	    private String filePath;
	    private Document doc;
	    private Element root;

	    public XmlOuvrage(String filePath) {
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
	       
	    public void insert(Ouvrage o) {
	        Element e = new Element("ouvrage");
	        Attribute a = new Attribute("id", "" + o.getId());
	        e.setAttribute(a);

	        Element e1 = new Element("titre");
	        e1.addContent(o.getTitre());
	        e.addContent(e1);

	        Element e2 = new Element("auteurs");
	        e2.addContent(String.valueOf(o.getAuteurs()));
	        e.addContent(e2);

	        Element e3 = new Element("annee");
	        e3.addContent(String.valueOf(o.getAnnee()));
	        e.addContent(e3);

	        Element e4 = new Element("maison_edition");
	        e4.addContent(o.getMaisonEdition());
	        e.addContent(e4);

	        root.addContent(e);
	        save();
	    }

		public Ouvrage select(int id) {
			List<Element> l = root.getChildren();
			Ouvrage o = new Ouvrage();
			if(l.size()>0) {
				for (Element e : l) {
					if(Integer.parseInt(e.getAttributeValue("id")) == id) {
						o.setId(id);
						o.setMaisonEdition(e.getChildText("maison_edition"));
						o.setAnnee(Integer.parseInt(e.getChildText("annee")));
						o.setTitre(e.getChildText("titre"));
//						o.setAuteurs(e.getChildText(""));						
					}
				}
			}
			
			
			
			return null;
		}	    
	    
	    
}

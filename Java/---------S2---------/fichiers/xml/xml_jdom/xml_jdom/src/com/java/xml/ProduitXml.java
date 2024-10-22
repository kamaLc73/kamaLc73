package com.java.xml;

import java.io.*;
import java.util.*;
import org.jdom2.*;
import org.jdom2.input.SAXBuilder;
import org.jdom2.output.Format;
import org.jdom2.output.XMLOutputter;

import com.java.beans.Produit;

public class ProduitXml {
    private String filePath;
    private Document doc;
    private Element root;

    public ProduitXml(String filePath) {
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

    public void insert(Produit p) {
        Element e = new Element("produit");
        Attribute a = new Attribute("ref", p.getRef());
        e.setAttribute(a);

        Element e1 = new Element("desig");
        e1.addContent(p.getDesig());
        e.addContent(e1);

        Element e2 = new Element("pu");
        e2.addContent(String.valueOf(p.getPu()));
        e.addContent(e2);

        Element e3 = new Element("qs");
        e3.addContent(String.valueOf(p.getQs()));
        e.addContent(e3);

        root.addContent(e);
        save();
    }

    public Produit select(String ref) {
        List<Element> l = root.getChildren();
        if (l.size() > 0) {
            for (Element element : l) {
                if (element.getAttributeValue("ref").equals(ref)) {
                    Produit p = new Produit();
                    p.setRef(ref);
                    p.setDesig(element.getChildText("desig"));
                    p.setPu(Double.parseDouble(element.getChildText("pu")));
                    p.setQs(Integer.parseInt(element.getChildText("qs")));
                    return p;
                }
            }
        }
        return null;
    }

    public List<Produit> selectAll() {
        List<Produit> lp = null;
        List<Element> l = root.getChildren();
        if (l.size() > 0) {
            lp = new ArrayList<>();
            for (Element element : l) {
                Produit p = new Produit();
                p.setRef(element.getAttributeValue("ref"));
                p.setDesig(element.getChildText("desig"));
                p.setPu(Double.parseDouble(element.getChildText("pu")));
                p.setQs(Integer.parseInt(element.getChildText("qs")));
                lp.add(p);
            }
        }
        return lp;
    }

    public void update(Produit upProd) {
        List<Element> produitList = root.getChildren("produit");
        try {
            for (Element p : produitList) {
                if (p.getAttributeValue("ref").equals(upProd.getRef())) {                  
                    p.getChild("pu").setText(String.valueOf(upProd.getPu()));
                    p.getChild("qs").setText(String.valueOf(upProd.getQs()));
                    save();
                    System.out.println("Produit modifié avec succès !");
                    return;
                }
            }
        } catch (Exception e) {
            System.out.println("Erreur lors de la sauvegarde des modifications : " + e.getMessage());
        }
        System.out.println("Produit avec la référence '" + upProd.getRef() + "' non trouvable !");
    }
    public void updateAll(Produit upProd) {
        List<Element> produitList = root.getChildren("produit");
        try {
            for (Element p : produitList) {
                if (p.getAttributeValue("ref").equals(upProd.getRef())) { 
                	p.getChild("desig").setText(String.valueOf(upProd.getDesig()));
                    p.getChild("pu").setText(String.valueOf(upProd.getPu()));
                    p.getChild("qs").setText(String.valueOf(upProd.getQs()));
                    save();
                    System.out.println("Produit modifié avec succès !");
                    return;
                }
            }
        } catch (Exception e) {
            System.out.println("Erreur lors de la sauvegarde des modifications : " + e.getMessage());
        }
        System.out.println("Produit avec la référence '" + upProd.getRef() + "' non trouvable !");
    }

    public void delete(String ref) {
        List<Element> produitList = new ArrayList<>(root.getChildren("produit")); 
        try {
            for (Element p : produitList) {
                if (p.getAttributeValue("ref").equals(ref)) {
                    p.detach();
                    save();
                    System.out.println("Produit supprimé avec succès !");
                    return;
                }
            }
        } catch (Exception e) {
            System.out.println("Erreur lors de la sauvegarde des modifications : " + e.getMessage());
        }
        System.out.println("Produit avec la référence '" + ref + "' non trouvable !");
    }

    public void deleteAll() {
        List<Element> produitList = new ArrayList<>(root.getChildren("produit")); // Crée une copie de la liste
        try {
            for (Element p : produitList) {
                p.detach();
            }
            save();
            System.out.println("Tous les produits ont été supprimés avec succès !");
        } catch (Exception e) {
            System.out.println("Erreur lors de la sauvegarde des modifications : " + e.getMessage());
        }
    }

}
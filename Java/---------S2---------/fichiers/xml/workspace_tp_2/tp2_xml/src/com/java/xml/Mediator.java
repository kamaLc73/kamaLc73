package com.java.xml;

import com.java.models.*;
import com.java.utils.Constantes;

public class Mediator {
	
	public Mediator() {
	}

	public Auteur getAuteur(String ref) {
		XmlAuteur xml = new XmlAuteur(Constantes.AUTEUR_XML_FILEPATH);
		return xml.select(ref);
	}

	public Ouvrage getOuvrage(int id) {
		XmlOuvrage xml = new XmlOuvrage(Constantes.OUVRAGE_XML_FILEPATH);
		return xml.select(id);
	}

}

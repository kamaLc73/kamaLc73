package com.java.india;

import java.util.List;
import java.util.Vector;

public class Dessin {
	private List<Forme> l;

	public Dessin() {
		l = new Vector<>();
	}

	public Dessin(List<Forme> l) {
		this.l = l;
	}

	public void ajouter(Forme f) {
		l.add(f);
	}

	public double surfaceTotal() {
		double s = 0;
		for(int i = 0; i < l.size(); i++) {
			s = s + l.get(i).surface();
		}
		return s;
	}
	
}

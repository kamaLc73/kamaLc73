package com.java.india;

public class Carre extends Forme {
	private int a;

	public Carre() {
	}

	public Carre(int a) {
		this.a = a;
	}

	public double surface() {
		return a * a;
	}

}

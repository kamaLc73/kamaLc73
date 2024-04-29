package com.java.india;

public class Cercle extends Forme {
	private double r;
	
	public Cercle() {
	}

	public Cercle(double r) {
		this.r = r;
	}

	public double surface() {
		return 3.14 * r * r;
	}

}

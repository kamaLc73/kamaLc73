package com.java.india;

public class Rectangle extends Forme {
	private int a;
	private int b;

	public Rectangle() {
	}
	
	public Rectangle(int a, int b) {
		this.a = a;
		this.b = b;
	}

	public double surface() {
		return a * b;
	}

}

package com.java.india;

public class Point {
	//Attributs
	protected int x;
	protected int y;
	public static int cp = 0;

	//Méthodes
	public Point() {
		cp++;
		System.out.println("----------------");
	}

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
		cp++;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}	

	public void afficher() {
		System.out.println("Point [x=" + x + ", y=" + y + "]");
	}
	
	public boolean equals(Point p) {
		return this.x == p.x && this.y == p.y;
	}
	
	
	
}

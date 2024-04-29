package com.java.india;

import java.awt.Color;

public class Test {
	// private static int n;
	
	void f1() {
	}

	public static void main(String[] args) {
//		System.out.print("Hello world !!");

		//Appel au Constructeur
/*		Point p = new Point();
		p.afficher();
//		p.x = 1;     //private
//		p.y = 2;     //private
//		System.out.println(p.x);      //private
//		System.out.println(p.y);      //private
		p.setX(2);		//Appel au Setter
		p.setY(4);		//Appel au Setter
		System.out.println("x = " + p.getX());		//Appel au Getter
		System.out.println("y = " + p.getY());		//Appel au Getter
		p.afficher();
*/
/*		Point p = new Point();
		p.afficher();
		Point q = new Point(1, 2);
		q.afficher();
*/
/*		Point p = new Point(1, 2);
		System.out.println(p.toString());
		System.out.println(p);
*/
/*		Point p1 = new Point(1, 2);
		Point p2 = new Point(1, 2);
		System.out.println(p1 == p2);
		System.out.println(p1.equals(p2));
*/
/*		System.out.println(Point.cp);
		Point p1 = new Point();
		System.out.println(p1.cp);
		Point p2 = new Point(1, 2);
		System.out.println(p2.cp);
*/
/*		Point p1 = new Point(1, 2);		
		Point p2 = new Point(1, 2);		
		System.out.println(p1.getClass().getName());
		System.out.println(p1.getClass().getSimpleName());	
		System.out.println(p1.hashCode());
		System.out.println(p2.hashCode());
		System.out.println(p1.getClass().hashCode());
		System.out.println(p2.getClass().hashCode());
*/	
//		ExtendedPoint ep = new ExtendedPoint(1, 2, Color.BLUE);
//		System.out.println(ep.toString());
/*	
		Point p = new Point(1, 2);
		p.afficher();
		ExtendedPoint ep = new ExtendedPoint(1, 2, Color.BLUE);
		ep.afficher();
*/	
//		Point m = new Point(1, 2);
//		ExtendedPoint f = new ExtendedPoint(10, 20, Color.BLUE);
		
//		m = f;
//		m.afficher();

//		f = (ExtendedPoint) m;
//		f.afficher();

		ExtendedPoint f = new ExtendedPoint(10, 20, Color.BLUE);
		Point m = f;
		ExtendedPoint f2 = (ExtendedPoint) m;
		f2.afficher();

	}

}

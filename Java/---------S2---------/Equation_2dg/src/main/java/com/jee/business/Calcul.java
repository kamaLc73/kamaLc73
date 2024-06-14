package com.jee.business;

public class Calcul implements EqtService {

	public Calcul() {
	}
	public String resoudre(double a, double b, double c) {
		String sb = new String();
		double d = b * b - 4 * a * c;
        double r1, r2;
        if (d > 0) {
            r1 = (-b + Math.sqrt(d)) / (2 * a);
            r2 = (-b - Math.sqrt(d)) / (2 * a);
            sb = ("Les racines sont : " + r1 + " et " + r2);
        } else if (d == 0) {
            r1 = -b / (2 * a);
            sb = ("La racine double est : " + r1);
        } else {
        	sb = ("L'équation n'a pas de racines réelles");
        }		
        return sb;
	}
}

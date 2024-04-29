package com.java.beans;

import com.java.swing.Item;

public class Produit implements Item {
	private String ref;
	private String desig;
	private double pu;
	private double qs;

	public Produit() {
	}

	public Produit(String ref, String desig, double pu, double qs) {
		this.ref = ref;
		this.desig = desig;
		this.pu = pu;
		this.qs = qs;
	}

	public String getRef() {
		return ref;
	}

	public void setRef(String ref) {
		this.ref = ref;
	}

	public String getDesig() {
		return desig;
	}

	public void setDesig(String desig) {
		this.desig = desig;
	}

	public double getPu() {
		return pu;
	}

	public void setPu(double pu) {
		this.pu = pu;
	}

	public double getQs() {
		return qs;
	}

	public void setQs(double qs) {
		this.qs = qs;
	}

	public String toString() {
		return "Produit [ref=" + ref + ", desig=" + desig + ", pu=" + pu + ", qs=" + qs + "]";
	}

	public int getFieldsCount() {
		return 4;
	}

	public String getFieldsLabel(int index) {
		switch (index) {
		case 1:
			return "Référence";
		case 2:
			return "Désignation";
		case 3:
			return "Prix Unitaire";
		case 4:
			return "Quantité en Stock";
		default:
			return null;
		}
	}

	public int getFieldsCol(int index) {
		switch (index) {
		case 1:
			return 8;
		case 2:
			return 10;
		case 3:
			return 6;
		case 4:
			return 6;
		default:
			return 0;
		}
	}

}

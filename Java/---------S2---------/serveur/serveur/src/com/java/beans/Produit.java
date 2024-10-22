package com.java.beans;

import java.io.Serializable;

public class Produit implements Serializable {
	private String ref;
	private String desig;
	private double pu;
	private double qs;

	public Produit() {	}

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

}

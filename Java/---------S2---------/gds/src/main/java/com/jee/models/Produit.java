package com.jee.models;

public class Produit {
	private Long ref;
	private String desig;
	private double pu;
	private int qs;

	public Produit() {
	}

	public Produit(String desig, double pu, int qs) {
		this.desig = desig;
		this.pu = pu;
		this.qs = qs;
	}

	public Long getRef() {
		return ref;
	}

	public void setRef(Long ref) {
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

	public int getQs() {
		return qs;
	}

	public void setQs(int qs) {
		this.qs = qs;
	}

	public String toString() {
		return "Produit [ref=" + ref + ", desig=" + desig + ", pu=" + pu + ", qs=" + qs + "]";
	}

}

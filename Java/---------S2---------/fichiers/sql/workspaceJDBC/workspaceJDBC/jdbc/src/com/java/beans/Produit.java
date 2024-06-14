package com.java.beans;

public class Produit {
	
	private int ref;
	private String des;
	private double pu;
	private int qs;
	
	public Produit() {
		
	}
	
	public Produit(int ref, String des, double pu, int qs) {
		this.ref = ref;
		this.des = des;
		this.pu = pu;
		this.qs = qs;
	}

	public int getRef() {
		return ref;
	}

	public void setRef(int ref) {
		this.ref = ref;
	}

	public String getDes() {
		return des;
	}

	public void setDes(String des) {
		this.des = des;
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
		return "Produit [Ref=" + ref + ", des=" + des + ", pu=" + pu + ", qs=" + qs + "]";
	}
	
	

}

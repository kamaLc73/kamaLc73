public class Materiel implements Produit {
	private String designation;
	private double pu;
	private double qs;
	
	public Materiel(String designation, double pu, double qs) {
		this.designation = designation;
		this.pu = pu;
		this.qs = qs;
	}

	public String getDesignation() {
		return designation;
	}

	public double getPU() {
		return pu;
	}

	public double getQS() {
		return qs;
	}

	public char getNature() {
		return 'M';
	}

}

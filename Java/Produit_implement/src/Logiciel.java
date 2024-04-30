public class Logiciel implements Produit {
	private String designation;
	private double pu;
	private double qs;
	private String editeur;
	private int anneeEdition;

	public Logiciel(String designation, double pu, double qs, String editeur, int anneeEdition) {
		this.designation = designation;
		this.pu = pu;
		this.qs = qs;
		this.editeur = editeur;
		this.anneeEdition = anneeEdition;
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
		return 'L';
	}
	
	public String getEditeur() {
		return editeur;
	}

	public int getAE() {
		return anneeEdition;
	}
	
}

package india;

public class Livre {
	private int code;
	private String titre;
	private int nbPg;
	private Auteur auteur;

	public Livre() {
	}

	public Livre(int code, String titre, int nbPg, Auteur auteur) {
		this.code = code;
		this.titre = titre;
		this.nbPg = nbPg;
		this.auteur = auteur;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public int getNbPg() {
		return nbPg;
	}

	public void setNbPg(int nbPg) {
		this.nbPg = nbPg;
	}

	public Auteur getAuteur() {
		return auteur;
	}

	public void setAuteur(Auteur auteur) {
		this.auteur = auteur;
	}

	public String toString() {
		return "Livre [code = " + code + ", titre = " + titre + ", nbPg = " + nbPg + ", auteur = " + auteur + "]";
	}

}

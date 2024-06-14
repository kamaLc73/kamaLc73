package p3;

abstract class Vehicule {
	private String nom;
	
	public Vehicule(String nom) {
	    this.nom = nom;
	}
	
	public abstract float getVitesseMaximum();
	
	public abstract String getCatégorie();
	
	public String getNom() {
	    return nom;
	}
}

class BateauARames extends Vehicule {
	private int nombreRameurs;
		
	public BateauARames(String nom, int nombreRameurs) {
	   super(nom);
	   this.nombreRameurs = nombreRameurs;
	}
		
	@Override
	public float getVitesseMaximum() {
	    return 0.5f * nombreRameurs;
	}
		
	@Override
	public String getCatégorie() {
	    return "Bateau à rames";
	}
}

class Voiture extends Vehicule {
	private int puissance;
	
	public Voiture(String nom, int puissance) {
		super(nom);
	    this.puissance = puissance;
	}
	
	@Override
	public float getVitesseMaximum() {
	    return 1.5f * puissance;
	}
	
	@Override
	public String getCatégorie() {
	    return "Voiture";
	}
}

public class MainTest_ex4_tp2 {
	public static void main(String[] args) {
		
		Vehicule[] vehicules = new Vehicule[3];
		
		vehicules[0] = new BateauARames("v1", 4);
		vehicules[1] = new Voiture("v2", 200);
		vehicules[2] = new BateauARames("v3", 2);
		
		for (Vehicule vehicule : vehicules) {
			System.out.println("Nom: " + vehicule.getNom());
			System.out.println("Catégorie: " + vehicule.getCatégorie());
			System.out.println("Vitesse maximale: " + vehicule.getVitesseMaximum());
			System.out.println("------------------------");
		}
	}
}

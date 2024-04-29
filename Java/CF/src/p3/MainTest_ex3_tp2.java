package p3;

import java.util.ArrayList;

class Employe {

    private String nom;
    private String matricule;
    private double indiceSalarial;
    private static double valeurIndiceSalarial = 1000;

    public Employe(String nom, String matricule, double indiceSalarial) {
        this.nom = nom;
        this.matricule = matricule;
        this.indiceSalarial = indiceSalarial;
    }

    public double calculerSalaire() {
        return indiceSalarial * valeurIndiceSalarial;
    }

    public String getNom() {
        return this.nom;
    }

    public String getMatricule() {
        return this.matricule;
    }

    public double getIndiceSalarial() {
        return this.indiceSalarial;
    }

    @Override
    public String toString() {
        return "Employe [nom=" + nom + ", matricule=" + matricule + ", indiceSalarial=" + indiceSalarial + "]";
    }
}

class Commercial extends Employe {
    private double ventesDuMois;

    public Commercial(String nom, String matricule, double indiceSalarial) {
        super(nom, matricule, indiceSalarial);
        this.ventesDuMois = 0.0;
    }

    public void mettreAJourVentes(double nouvellesVentes) {
        this.ventesDuMois = nouvellesVentes;
    }

    @Override
    public double calculerSalaire() {
        double salaireFixe = super.calculerSalaire();
        double interet = 0.1 * ventesDuMois;
        return salaireFixe + interet;
    }

    @Override
    public String toString() {
        return "Commercial [nom=" + getNom() + ", matricule=" + getMatricule() + ", indiceSalarial="
                + getIndiceSalarial() + ", ventesDuMois=" + ventesDuMois + "]";
    }
}

class Personnel {
    private ArrayList<Employe> listeEmployes;

    public Personnel() {
        this.listeEmployes = new ArrayList<>();
    }

    public void ajouterEmploye(Employe employe) {
        listeEmployes.add(employe);
    }

    public void retirerEmploye(Employe employe) {
        listeEmployes.remove(employe);
    }

    public double calculerMontantTotalSalaires() {
        double montantTotal = 0;
        for (Employe employe : listeEmployes) {
            montantTotal += employe.calculerSalaire();
        }
        return montantTotal;
    }

    @Override
    public String toString() {
        return "Personnel [listeEmployes=" + listeEmployes + "]";
    }
}

public class MainTest_ex3_tp2 {
    public static void main(String[] args) {
        Employe employe1 = new Employe("Jean", "123", 2.5);
        Commercial commercial1 = new Commercial("Alice", "456", 3.0);

        commercial1.mettreAJourVentes(10000);

        Personnel personnel = new Personnel();

        personnel.ajouterEmploye(employe1);
        personnel.ajouterEmploye(commercial1);

        System.out.println(personnel);

        System.out.println("Montant total des salaires : " + personnel.calculerMontantTotalSalaires() + " DH");
    }
}

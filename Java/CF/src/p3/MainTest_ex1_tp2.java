package p3;

class CompteBancaire {
	 private static int dernierCode = 0; 
	 private int code;
	 private double solde;
	
	 public CompteBancaire() {
	     this.code = ++dernierCode;
	     this.solde = 0.0;
	 }
	
	 public int getCode() {
		return code;
	 }

	 public double getSolde() {
		return solde;
	 }

	 public CompteBancaire(double soldeInitial) {
	     this.code = ++dernierCode;
	     this.solde = soldeInitial;
	 }
	
	 public void deposer(double montant) {
	     solde += montant;
	     System.out.println("Dépôt de " + montant + " DH effectué. Nouveau solde : " + solde + " DH");
	 }
	
	 public void retirer(double montant) {
	     if (montant > solde) {
	         System.out.println("Fond insuffisant. Retrait impossible.");
	     } else {
	         solde -= montant;
	         System.out.println("Retrait de " + montant + " DH effectué. Nouveau solde : " + solde + " DH");
	     }
	 }
	
	 @Override
	 public String toString() {
	     return "CompteBancaire [code=" + code + ", solde=" + solde + "]";
	 }
}

class CompteEpargne extends CompteBancaire {
	 private double tauxInteret = 6;
	
	 public CompteEpargne() {
	     super();
	 }
	
	 public CompteEpargne(double soldeInitial) {
	     super(soldeInitial);
	 }
	
	 public void calculInteret() {
	     double interet = getSolde() * (tauxInteret / 100);
	     deposer(interet);
	     System.out.println("Intérêt calculé : " + interet + " DH");
	 }
	
	 @Override
	 public String toString() {
	     return "CompteEpargne [code=" + getCode() + ", solde=" + getSolde() + ", tauxInteret=" + tauxInteret + "]";
	 }
}

class ComptePayant extends CompteBancaire {
	 private static final double FRAIS_OPERATION = 5;
	
	 public ComptePayant() {
	     super();
	 }
	
	 public ComptePayant(double soldeInitial) {
	     super(soldeInitial);
	 }
	
	 @Override
	 public void deposer(double montant) {
	     super.deposer(montant - FRAIS_OPERATION);
	 }
	
	 @Override
	 public void retirer(double montant) {
	     super.retirer(montant + FRAIS_OPERATION);
	 }
	
	 @Override
	 public String toString() {
	     return "ComptePayant [code=" + getCode() + ", solde=" + getSolde() + "]";
	 }
}

public class MainTest_ex1_tp2 {
	 public static void main(String[] args) {
	     CompteBancaire compte1 = new CompteBancaire();
	     CompteBancaire compte2 = new CompteBancaire(1000);
	
	     System.out.println(compte1);
	     System.out.println(compte2);
	
	     compte1.deposer(500);
	     compte2.retirer(200);
	
	     System.out.println(compte1);
	     System.out.println(compte2);
	
	     CompteEpargne compteEpargne1 = new CompteEpargne();
	     CompteEpargne compteEpargne2 = new CompteEpargne(2000);
	
	     System.out.println(compteEpargne1);
	     System.out.println(compteEpargne2);
	
	     compteEpargne1.calculInteret();
	     compteEpargne2.deposer(1000);
	
	     System.out.println(compteEpargne1);
	     System.out.println(compteEpargne2);
	
	     ComptePayant comptePayant1 = new ComptePayant();
	     ComptePayant comptePayant2 = new ComptePayant(3000);
	
	     System.out.println(comptePayant1);
	     System.out.println(comptePayant2);
	
	     comptePayant1.deposer(800);
	     comptePayant2.retirer(500);
	
	     System.out.println(comptePayant1);
	     System.out.println(comptePayant2);
	 }
}

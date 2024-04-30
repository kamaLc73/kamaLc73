public class CompteBancaire {
    private static int id=0;
    private double solde;
	
	
	public CompteBancaire() {
		solde=0;
		id++;
	}
	
	public CompteBancaire(double x) {
		solde=x;
		id++;
	}
	
	public void depot(double x) {
		solde+=x;
    }
	

	public void retrait(double x) {
		solde-=x;
    }


	public static int getId() {
		return id;
	}

	public double getSolde() {
		return solde;
	}

	public void setSolde(double solde) {
		this.solde = solde;
	}
	
	public String toString() {
		return "CompteBancaire [solde=" + solde + "]";
	}
}
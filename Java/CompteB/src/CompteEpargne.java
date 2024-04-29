package INDIA;

public class CompteEpargne extends CompteBancaire {
	private final double Tauxinteret=0.06;
	
	public CompteEpargne() {
		super();
		
	}
	public CompteEpargne(double a) {
		super(a);
	}
	public void calculeInteret() {
		double a=getSolde();
		a=Tauxinteret*a+a;
		setSolde(a);
	}
}
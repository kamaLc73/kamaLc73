package INDIA;

public class ComptePayant extends CompteBancaire {
	
	public ComptePayant(){
		super();
	}
	
	public ComptePayant(double a) {
		super(a);
	}
	
	public void retrait(double a) {
			super.retrait(a+5);
    }

}

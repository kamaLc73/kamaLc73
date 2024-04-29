package INDIA;

public class Test {

	public static void main(String[] args) {
		CompteBancaire c1 = new CompteBancaire();
		System.out.println(c1);
		CompteBancaire c2 = new CompteBancaire(1500);
		System.out.println(c2);
		c2.depot(200);
		System.out.println(c2);
		c2.retrait(1500);
		System.out.println(c2);
		CompteEpargne c3 = new CompteEpargne(1000);
		System.out.println(c3);
		c3.calculeInteret();
		System.out.println(c3);
	}

}

package india;

public class Test {

	
	void exp01() {
		Auteur a = new Auteur(1, "nom 01", " prenom 01");
		System.out.println(a);
		Livre l = new Livre(123, "Prog Java", 2000, a);
		System.out.println(l);
	}

	void exp02() {
		Livre l = new Livre(321, "Structures de données", 1000, new Auteur(2, "nom 02", "prenom 02"));
		System.out.println(l);
		System.out.println("code auteur : " + l.getAuteur().getId());
		System.out.println("nom auteur : " + l.getAuteur().getNom());
		System.out.println("prénom auteur : " + l.getAuteur().getPrenom());
	}
	
	public Test() {
		exp01();
	}	
	
	public static void main(String[] args) {
		new Test();
	}

}

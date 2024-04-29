package p3;

interface Criable {
	void crier();
}

class Chat implements Criable {
	@Override
	public void crier() {
		System.out.println("Le chat miaule !");
	}
}

class Chien implements Criable {
	@Override
	public void crier() {
	    System.out.println("Le chien aboie !");
	}
}
class Lapin implements Criable {
    @Override
    public void crier() {
    }
}
public class TestAnimaux_ex2_tp2 {
	public static void main(String[] args) {
		     
		Criable[] animaux = new Criable[5];
		
		animaux[0] = new Chien();
		animaux[1] = new Chat();
		animaux[2] = new Lapin();
		animaux[3] = new Chien();
		animaux[4] = new Chat();
		
		for (Criable animal : animaux) {
			animal.crier();
		}
	}
}

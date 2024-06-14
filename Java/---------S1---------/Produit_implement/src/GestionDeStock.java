import java.util.LinkedList;
import java.util.List;

public class GestionDeStock {
	private List<Produit> produits;
	
	public GestionDeStock() {
		produits = new LinkedList<>();
	}

	public void ajouter(Produit p) {
		produits.add(p);
	}

	public void lister() {
		for (Produit p : produits) {
			StringBuffer sb = new StringBuffer();
			if(p.getNature() == 'M')
				sb.append("Materiel [");
			else
				sb.append("Logiciel [");
			sb.append("desig = " + p.getDesignation()+ ", pu = " + p.getPU() + ", qs = " + p.getQS());
			sb.append("]");
			System.out.println(sb.toString());
		}
	}

	public int nbreMateriels() {
		int cp = 0;
		for (Produit p : produits) {
			if(p.getNature() == 'M')
				cp++;
		}
		return cp;
	}

	public int nbreLogiciels() {
		int cp = 0;
		for (Produit p : produits) {
			if(p.getNature() == 'L')
				cp++;
		}
		return cp;
	}
	
	
	
}

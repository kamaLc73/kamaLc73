package india;

import java.util.ArrayList;
import java.util.List;

public class Biblio {
	private List<Ouvrage> ouvrages = new ArrayList<>();
	
	public Biblio() {
	}

	public void ajouter(Ouvrage o) {
		ouvrages.add(o);
	}

	public void supprimer(Ouvrage o) {
		ouvrages.remove(o);
	}

	public Ouvrage extraire(int index) {
		if(index >= 0 && index < ouvrages.size())
			return ouvrages.get(index);
		return null;
	}

	public Ouvrage chercher(int id) {
		for (Ouvrage ouvrage : ouvrages) {
			if(ouvrage.getId() == id)
				return ouvrage;
		}
		return null;
	}

	public void ouvragesEcritPar(Auteur a) {
		for (int i = 0; i < ouvrages.size(); i++) {
			if(ouvrages.get(i).ecritPar(a) == true)
				System.out.println(ouvrages.get(i));
		}
	}
	
	public void ouvragesTraiteTheme(String theme) {
		for (int i = 0; i < ouvrages.size(); i++) {
			if(ouvrages.get(i).traiteTheme(theme) == true)
				System.out.println(ouvrages.get(i));
		}
	}
	
}

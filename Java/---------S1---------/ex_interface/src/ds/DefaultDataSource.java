package ds;

import java.util.ArrayList;
import java.util.List;

public class DefaultDataSource implements DataSource {

	public List<String> getData() {
		List<String> l = new ArrayList<>();
		l.add("Clavier");
		l.add("Souris");
		l.add("Ecran");
		return l;
	}

}

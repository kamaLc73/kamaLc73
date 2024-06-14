package dp;

import java.util.List;

public class ConsoleDataPrinter implements DataPrinter {

	public void printData(List<String> l) {
		for (int i = 0; i < l.size(); i++) {
			System.out.println(l.get(i));
		}
	}

}

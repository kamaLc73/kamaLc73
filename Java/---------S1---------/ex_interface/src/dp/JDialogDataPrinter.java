package dp;

import java.util.List;

import javax.swing.JOptionPane;

public class JDialogDataPrinter implements DataPrinter {

	public void printData(List<String> l) {
		JOptionPane.showMessageDialog(null, l);
	}

}

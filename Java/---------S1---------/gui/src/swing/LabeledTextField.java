package swing;

import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class LabeledTextField extends JPanel {

	public LabeledTextField(String label, int col) {
		setLayout(new FlowLayout(FlowLayout.LEFT));
		add(new JLabel(label));
		add(new JTextField(col));
	}

	public LabeledTextField(String label, int col, int labelWidth) {
		this(label, col);
		((JLabel)this.getComponent(0)).setPreferredSize(new Dimension(labelWidth, 60));
	}
	
	public String getText() {
		return ((JTextField)this.getComponent(1)).getText();
	}

	public void setText(String text) {
		((JTextField)this.getComponent(1)).setText(text);
	}

}

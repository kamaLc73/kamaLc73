package swing;

import javax.swing.BoxLayout;
import javax.swing.JPanel;

public class Form extends JPanel {
	@SuppressWarnings("unused")
	private int labelWidth;

	public Form() {
		setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
	}

	public Form(int labelWidth) {
		this();
		this.labelWidth = labelWidth;
	}

	public Form(Item item, int labelWidth) {
		this(labelWidth);
		for (int i = 1; i <= item.getFieldsCount(); i++) {
			addField(item.getFieldsLabel(i), item.getFieldsCol(i), labelWidth);
		}
	}
	
	private void addField(String label, int col, int labelWidth) {
		add(new LabeledTextField(label, col, labelWidth));
	}
	
	public String getText(int index) {
		return ((LabeledTextField)getComponent(index)).getText();
	}
	
	public String [] getAllTexts() {
		String [] texts = new String [getComponents().length];
		for (int i = 0; i < texts.length; i++) {
			texts[i] = getText(i) ;
		}
		return texts;
	}
	
	
}

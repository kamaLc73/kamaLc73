import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class labelTextField {

    public static JPanel creeLabelTextField (String txt, int col) {
    	JPanel p = new JPanel();
    	JLabel l = new JLabel(txt);
    	p.add(l);
        JTextField t = new JTextField(col);
        p.add(t);
        return p ;
    }
    public static JPanel creeButton(String txt) {
    	JPanel p = new JPanel();
    	JButton b = new JButton(txt);
    	p.add(b);
    	return p;
    	
	}    
}

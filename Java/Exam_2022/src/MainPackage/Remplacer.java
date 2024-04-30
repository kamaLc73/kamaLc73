package MainPackage ;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Remplacer extends JFrame implements ActionListener {
    
	private JLabel r1;
    private JLabel r2;
    private JTextField t1;
    private JTextField t2;
    private JCheckBox c;
    private JButton b;
    private JButton d;
    private StringBuffer stringBuffer;

    public Remplacer(StringBuffer stringBuffer) {
        this.stringBuffer = stringBuffer;

        r1 = new JLabel("Rechercher :");
        r2 = new JLabel("Remplacer par :");
        t1 = new JTextField(10);
        t2 = new JTextField(10);
        c = new JCheckBox("Respecter la casse");
        b = new JButton("Annuler");
        b.addActionListener(this);
        d = new JButton("Remplacer");
        d.addActionListener(this);

        JPanel p = new JPanel(new GridLayout(2, 2));
        p.add(r1);
        p.add(t1);
        p.add(r2);
        p.add(t2);

        JPanel p2 = new JPanel(new BorderLayout());
        p2.add(b, BorderLayout.WEST);
        p2.add(d, BorderLayout.CENTER);
        p2.add(c, BorderLayout.EAST);

        setLayout(new BorderLayout());
        add(p, BorderLayout.NORTH);
        add(p2, BorderLayout.SOUTH);

        setVisible(true);
        setTitle("Remplacer");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 200);
        setLocationRelativeTo(null);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b) {
            // Action pour le bouton "Annuler"
            dispose(); // Fermer la fenêtre
        } else if (e.getSource() == d) {
            // Action pour le bouton "Remplacer"
            replaceText();
        }
    }

    private void replaceText() {
        String searchString = t1.getText();
        String replacementString = t2.getText();
        boolean caseSensitive = c.isSelected();

        String originalContent = stringBuffer.toString();
        String modifiedContent;

        if (caseSensitive) {
            modifiedContent = originalContent.replaceFirst(searchString, replacementString);
        } else {
            modifiedContent = originalContent.replaceAll("(?i)" + searchString, replacementString);
        }

        stringBuffer.setLength(0);
        stringBuffer.append(modifiedContent);

      
        System.out.println("StringBuffer mis à jour : " + stringBuffer.toString());
    }

    public static void main(String[] args) {
            StringBuffer stringBuffer = new StringBuffer("kamal");
            new Remplacer(stringBuffer);
        
    }
}
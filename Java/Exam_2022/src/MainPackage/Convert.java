package MainPackage;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Convert extends JFrame implements ActionListener{
    private JLabel euro;
    private JLabel mad;
    private JTextField t1;
    private JTextField t2;



    public Convert() {
         euro = new JLabel("Euro :"); 
         mad = new JLabel("MAD :");
         t1 = new JTextField(10);
         t2 = new JTextField(10);
         t1.addActionListener(this);
         t2.addActionListener(this);
         //t2.setEditable(false);
        setLayout(new BorderLayout());
        JPanel p = new JPanel(new FlowLayout(FlowLayout.LEFT));
        JPanel p2 = new JPanel(new FlowLayout(FlowLayout.LEFT));
        p.add(euro);
        p.add(t1);
        p2.add(mad); 
        p2.add(t2);
        setVisible(true);
        setResizable(false);
        setTitle("Conversion EUR to MAD");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        setSize(300, 150);
        setLocationRelativeTo(null);
        add(p,BorderLayout.NORTH);
        add(p2,BorderLayout.SOUTH);

    }

    public double convertir1(double x) {
        x*=10.65;
        ///String res =""+ x;
        DecimalFormat decimalFormat = new DecimalFormat("#.###");
        String res = decimalFormat.format(x);
        t2.setText(res);
        //t2.setEditable(false);

        return x;
    }
    public double convertir2(double x) {
        x/=10.65;
        //String res =""+ x;
        DecimalFormat decimalFormat = new DecimalFormat("#.###");
        String res = decimalFormat.format(x);
        t1.setText(res);
        //t1.setEditable(false);

        return x;
    }


    public static void main (String [] args) {
        new Convert();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
        	if(e.getSource() == t1 ) {
                convertir1(Double.parseDouble(t1.getText()));
        	}
        	else 
        		convertir2(Double.parseDouble(t2.getText()));
        }
        catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "saisissez un nombre valide", "erreur", JOptionPane.ERROR_MESSAGE);
            t1.setText("");
            t2.setText("");
        }
    }
}
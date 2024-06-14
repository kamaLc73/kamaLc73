package MainPackage;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class click extends JFrame implements ActionListener {
    
	private int cp=0;
    private JLabel l1=new JLabel("Nombre de clics : " +cp);
    private JButton click= new JButton("Cliquez ici") ;
    private JButton restart = new JButton("Réinitialiser") ;  
    private JButton exit = new JButton("Fermer") ;

    public click() {
        JPanel p1 = new JPanel();
        p1.setLayout(new FlowLayout(FlowLayout.CENTER));
        p1.add(restart);
        p1.add(click);
        p1.add(exit);

        JPanel p = new JPanel();
        p.add(l1);

        click.addActionListener(this);
        restart.addActionListener(this);
        exit.addActionListener(this);

        JPanel p3 = new JPanel(new BorderLayout());
        p3.add(p);
        p3.add(p1,BorderLayout.SOUTH);


        add(p3);
        setSize(350,150);
        setVisible(true);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("nombre de clicks");
        setLocationRelativeTo(null);


    }
    public void actionPerformed(ActionEvent e) {
    	if(e.getSource() == click  )
    		l1.setText("Nombre de clics : " + ++cp);
    	else if(e.getSource() == restart  ) {
    		cp = 0;
    		l1.setText("Nombre de clics : " + cp); 
    	}else 
    		System.exit(0);	
    }

    public static void main(String[]args ) {
        new click();
    }
}
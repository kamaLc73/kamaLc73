//import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class swingTest {

	public static void main(String[] args) {
		

		JFrame frame = new JFrame("Panel Example");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(400, 300);
		frame.setLocationRelativeTo(null);
				
		JPanel p = new JPanel();
	    //p.setBackground(new Color(100,100,100));
		p.setLayout(new FlowLayout(FlowLayout.LEFT));
	    p.setLayout(new BoxLayout(p, BoxLayout.Y_AXIS));

	    
	    JPanel p1 = new JPanel();
	    p1.setLayout(new FlowLayout(FlowLayout.CENTER));
	    
	    
	    p.add(labelTextField.creeLabelTextField("Nom :",15));
        p.add(labelTextField.creeLabelTextField("Prenom :",15));
        
        p1.add(labelTextField.creeButton("Sauvegarder"));
        p1.add(labelTextField.creeButton("Reintialiser"));
        p.add(p1);
        frame.getContentPane().add(p);
 
        frame.setVisible(true);
		        
		}


		
}

			    
			


	
		
		
		
		
		
		
		
		
		
		
		
		
		
	

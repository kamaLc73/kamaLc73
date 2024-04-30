package swing;

import java.awt.BorderLayout;
// import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
// import java.util.Iterator;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import beans.Etudiant;
// import com.java.beans.Produit;
import swing.actions.ExitAction;
import swing.actions.SaveAction;

public class MainTest extends JFrame implements ActionListener {

	public static void main(String[] args) {
		new MainTest();
	}

	public MainTest() {
		exp12();
		setSize(900, 250);
		setTitle("Ma première fenêtre");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}

	void exp01() {
		JFrame f = new JFrame();
		f.setSize(500, 300);
		f.setTitle("Ma première fenêtre");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setResizable(false);
		f.setVisible(true);
	}
	
	void exp02() {
		setSize(500, 300);
		setTitle("Ma première fenêtre");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		setVisible(true);
	}
	
	void exp03() {
		JPanel p = new JPanel();
		JLabel l1 = new JLabel("Entrez votre login");
		JTextField t1 = new JTextField(10);
		JLabel l2 = new JLabel("Entrez votre password");
		JPasswordField t2 = new JPasswordField(10);
		JButton b = new JButton("Se connecter");
		p.add(l1); p.add(t1); p.add(l2); p.add(t2); p.add(b);
		setContentPane(p);
	}
	
	void exp04() {
		JPanel p = new JPanel();
//		LayoutManager flow = new FlowLayout(FlowLayout.RIGHT);
//		p.setLayout(flow);
		
//		LayoutManager box = new BoxLayout(p, BoxLayout.Y_AXIS);
//		p.setLayout(box);

		LayoutManager border = new BorderLayout();
		p.setLayout(border);
		
		JLabel l1 = new JLabel("Entrez votre login");
		JTextField t1 = new JTextField(10);
		JButton b = new JButton("Se connecter");
		p.add("North", l1); p.add(BorderLayout.CENTER, t1); p.add("South", b);
		setContentPane(p);
	}

	void exp05() {
		JPanel p = new JPanel();
		LayoutManager grid = new GridLayout(2, 3);
		p.setLayout(grid);
		for (int i = 1; i <= 6; i++) {
			p.add(new JButton("" + i));
		}
		setContentPane(p);
	}
	
	void exp06() {
		JPanel p =new JPanel();
		LayoutManager box = new BoxLayout(p, BoxLayout.Y_AXIS);
		
		p.setLayout(box);
		p.add(new LabeledTextField("Référence", 8, 150));
		LabeledTextField ltf = new LabeledTextField("Désignation", 12, 150);
		p.add(ltf);
		p.add(new LabeledTextField("Prix Unitaire", 6, 150));
		p.add(new LabeledTextField("Quantité en Stock", 6, 150));

		ltf.setText("Clavier");
		System.out.println(ltf.getText());
		
		ButtonPanel bp = new ButtonPanel(new String [] {"Sauvegarder", "Réinitialiser", "Quitter"});
		p.add(bp);
		setContentPane(p);
	}

	void exp07() {
		JPanel p = new JPanel();
		JButton b = new JButton("Quitter");
		b.addActionListener(new ExitAction());

//		b.addActionListener(this);
		
//		b.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//				System.exit(0);
//			}
//		});
		
		p.add(b);
		setContentPane(p);
	}

	void exp08() {
		JPanel p = new JPanel();
		JButton b = new JButton("Quitter");
		
		b.addActionListener(new ExitAction());
		b.addActionListener(new SaveAction());

		p.add(b);
		setContentPane(p);
	}

	void exp09() {
		ProduitForm pf = new ProduitForm();
		setContentPane(pf);
	}
	
	void exp10() {
		EtudiantForm ef = new EtudiantForm();
		setContentPane(ef);
	}

	void exp11() {
//		Form f = new Form(100);
//		f.addField("Nom", 10);
//		f.addField("Prénom", 10);
//		f.addField("Note", 6);
		
		Form f = new Form(new Etudiant(), 150);
		setContentPane(f);
	}

	void exp12() {
		JPanel p = new JPanel();
		p.setLayout(new BorderLayout());
		Form form = new Form(new Etudiant(), 80);
		JPanel q = new JPanel();
		q.add(new LabeledTextField("Entrez l'indice", 6, 100));
		JButton b1 = new JButton("Récuperer un Texte par indice");
		JButton b2 = new JButton("Récuperer tous le Texte");
		b1.addActionListener(this); b2.addActionListener(this); 
		q.add(b1); q.add(b2); 
		p.add("Center", form);
		p.add("South", q);
		setContentPane(p);
	}

	public void actionPerformed(ActionEvent e) {
//		System.exit(0);
		if(((JButton)e.getSource()).getText() == "Récuperer tous le Texte") {
			String [] texts = ((Form)getContentPane().getComponent(0)).getAllTexts();
			System.out.println(texts.length);
			for (int i = 0; i < texts.length; i++) {
				System.out.println(texts[i]);
			}
		}
		else if(((JButton)e.getSource()).getText() == "Récuperer un Texte par indice") {
			JPanel p = (JPanel)getContentPane().getComponent(1);
			LabeledTextField ltf = (LabeledTextField)p.getComponent(0);
			int index = Integer.parseInt(ltf.getText());
			String text = ((Form)getContentPane().getComponent(0)).getText(index);
			System.out.println(text);
		}
	}

}

package com.java.swing;

import java.awt.BorderLayout;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import com.java.beans.Etudiant;

public class EtudiantForm extends JPanel implements ActionListener {
	private LabeledTextField ltf1;
	private LabeledTextField ltf2;
	private LabeledTextField ltf3;
	private JButton exitB, saveB, moyB, resetB, maxB, minB, majB;
	private List<Etudiant> l = new ArrayList<>();

	public EtudiantForm () {
		this.setLayout(new BorderLayout());
		JPanel p1 = new JPanel();
		LayoutManager box = new BoxLayout(p1, BoxLayout.Y_AXIS);
		p1.setLayout(box);
		JPanel p2 = new JPanel();

		ltf1 = new LabeledTextField("Nom", 10, 150);
		ltf2 = new LabeledTextField("Prénom", 10, 150);
		ltf3 = new LabeledTextField("Note", 6, 150);
		p1.add(ltf1);
		p1.add(ltf2);
		p1.add(ltf3);

		exitB = new JButton("Quitter");
		exitB.addActionListener(this);
		saveB = new JButton("Sauvegarder");
		saveB.addActionListener(this);
		moyB = new JButton("Moyenne de la classe");
		moyB.addActionListener(this);
		resetB = new JButton("Réinitialiser");
		resetB.addActionListener(this);
		maxB = new JButton("Note maximale");
		maxB.addActionListener(this);
		minB = new JButton("Note minimale");
		minB.addActionListener(this);
		majB = new JButton("Marojant");
		majB.addActionListener(this);
		p2.add(saveB);
		p2.add(moyB);
		p2.add(majB);
		p2.add(maxB);
		p2.add(minB);
		p2.add(resetB);
		p2.add(exitB);
		this.add("Center", p1);
		this.add("South", p2);
	}

	public void actionPerformed(ActionEvent e) {
		if (((JButton) e.getSource()).getText() == "Quitter") {
			System.exit(0);
		} else if(((JButton) e.getSource()).getText() == "Réinitialiser") {
			int res = JOptionPane.showConfirmDialog(this, "Etes-vous sur de bien vouloir réinitialiser le formulaire ?",
					"Confirmation", JOptionPane.YES_NO_OPTION);
			if (res == JOptionPane.YES_OPTION)
				reset();
		}		
		else if (((JButton) e.getSource()).getText() == "Moyenne de la classe") {
			double moy = 0;
			for (int i = 0; i < l.size(); i++) {
				moy += l.get(i).getNote();
			}
			moy = moy / l.size();
			JOptionPane.showMessageDialog(null, "La moyenne de classe est : " + moy);
		} else if (((JButton) e.getSource()).getText() == "Sauvegarder") {
			String nom = ltf1.getText();
			String prenom = ltf2.getText();
			double note = Double.parseDouble(ltf3.getText());
			Etudiant etu = new Etudiant(nom, prenom, note);
			System.out.println(etu);
			l.add(etu);
			JOptionPane.showMessageDialog(null, "Etudiant bien inséré");
			reset();
		} else if(((JButton) e.getSource()).getText() == "Note maximale") {
			double max = l.get(0).getNote();
			for (int i = 1; i < l.size(); i++) {
				if(max < l.get(i).getNote())
					max = l.get(i).getNote();
			}
			JOptionPane.showMessageDialog(null, "La note maximale est : " + max);
		} else if(((JButton) e.getSource()).getText() == "Note minimale") {
			double min = l.get(0).getNote();
			for (int i = 1; i < l.size(); i++) {
				if(min > l.get(i).getNote())
					min = l.get(i).getNote();
			}
			JOptionPane.showMessageDialog(null, "La note maximale est : " + min);
		} else if(((JButton) e.getSource()).getText() == "Marojant") {
			String majorant = l.get(0).getNom() + " " + l.get(0).getPrenom();
			double max = l.get(0).getNote();
			for (int i = 1; i < l.size(); i++) {
				if(max < l.get(i).getNote()) {
					max = l.get(i).getNote();
					majorant = l.get(i).getNom() + " " + l.get(i).getPrenom();
				}
			}
			JOptionPane.showMessageDialog(null, "La majorant de la classe est : " + majorant);			
		}
	}

	private void reset() {
		ltf1.setText("");
		ltf2.setText("");
		ltf3.setText(""); 
	}
}

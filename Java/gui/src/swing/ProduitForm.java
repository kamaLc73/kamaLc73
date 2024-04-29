package com.java.swing;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import com.java.beans.Produit;

public class ProduitForm extends JPanel implements ActionListener {
	private LabeledTextField ltf1;
	private LabeledTextField ltf2;
	private LabeledTextField ltf3;
	private LabeledTextField ltf4;
	private JButton saveButton;
	private JButton resetButton;
	private JButton exitButton;

	public ProduitForm() {
		this.setLayout(new BorderLayout());
		JPanel p1 = new JPanel();
		p1.setLayout(new BoxLayout(p1, BoxLayout.Y_AXIS));
		JPanel p2 = new JPanel();
	
		ltf1 = new LabeledTextField("Référence", 8, 150);
		ltf2 = new LabeledTextField("Désignation", 10, 150);
		ltf3 = new LabeledTextField("Prix Unitaire", 6, 150);
		ltf4 = new LabeledTextField("Quantité en Stock", 6, 150);
		p1.add(ltf1); p1.add(ltf2); p1.add(ltf3); p1.add(ltf4); 
		
		saveButton = new JButton("Sauvegarder");
		resetButton = new JButton("Réinitialiser");
		exitButton = new JButton("Quitter");
		saveButton.addActionListener(this);
		resetButton.addActionListener(this);
		exitButton.addActionListener(this);
		p2.add(saveButton) ; p2.add(resetButton) ; p2.add(exitButton);
		
		add("Center", p1); add("South", p2);
	}

	public void actionPerformed(ActionEvent e) {
		if (((JButton)e.getSource()).getText() == "Sauvegarder") {
			String ref = ltf1.getText();
			String desig = ltf2.getText();
			double pu = Double.parseDouble(ltf3.getText());
			double qs = Double.parseDouble(ltf4.getText());
			Produit p = new Produit(ref, desig, pu, qs);
			System.out.println(p);
			JOptionPane.showMessageDialog(null, "Produit bien inséré");
			resert();
		} else if(((JButton)e.getSource()).getText() == "Réinitialiser") {
			resert();
		} else {
			System.exit(0);
		}

	}

	private void resert() {
		ltf1.setText("");
		ltf2.setText("");
		ltf3.setText("");
		ltf4.setText("");
	}
	
}

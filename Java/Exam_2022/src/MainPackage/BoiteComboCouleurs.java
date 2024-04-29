package MainPackage;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BoiteComboCouleurs extends JFrame {
    private JComboBox<String> boiteCombo;

    public BoiteComboCouleurs() {
    	
        setTitle("Boîte Combo de Couleurs");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 200);

        String[] couleurs = {"Rouge", "Vert", "Bleu", "Jaune", "Rose"}; 
        boiteCombo = new JComboBox<>(couleurs);

        boiteCombo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String couleurSelectionnee = (String) boiteCombo.getSelectedItem();
                mettreAJourCouleur(couleurSelectionnee);
            }
        });
        setLayout(new BorderLayout());
        JPanel p = new JPanel();
        add(p, BorderLayout.SOUTH);
        p.add(boiteCombo);
        setVisible(true);
        setLocationRelativeTo(null);
    }

    private void mettreAJourCouleur(String couleur) {
        // Mettre à jour la couleur de fond de la fenêtre en fonction du nom de couleur
        switch (couleur) {
            case "Rouge":
                getContentPane().setBackground(Color.RED);
                break;
            case "Vert":
                getContentPane().setBackground(Color.GREEN);
                break;
            case "Bleu":
                getContentPane().setBackground(Color.BLUE);
                break;
            case "Jaune":
                getContentPane().setBackground(Color.YELLOW);
                break;
            case "Rose":
                getContentPane().setBackground(Color.PINK);
                break;
            default:
                getContentPane().setBackground(Color.WHITE);
        }
    }

    public static void main(String[] args) {
    	new BoiteComboCouleurs();
    }
}
package src.Vue;

import src.Controller.EntreesUtilisateur;
import src.Controller.motAleatoire;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AffichagePendu extends JFrame {
    private int height = 800;
    private int width = 800;
    motAleatoire motAleatoire;
    private String mot;
    private String affichage;
    private String definition;
    private JLabel monMot;
    private JLabel maDefinition;
    private JButton ValidateButton;
    private JTextField Lettre;
    private JPanel panel;
    private EntreesUtilisateur entree;
    private JLabel affichageSuivi;

    public AffichagePendu() {
        setTitle("Jeu du pendu");
        setSize(width, height);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        motAleatoire = new motAleatoire();
        mot = motAleatoire.getMot();
        definition = motAleatoire.getDefinition();
        entree = new EntreesUtilisateur(mot);
        affichage="Mot à deviner : "+motAleatoire.longueur();

        monMot = new JLabel(mot);
        maDefinition = new JLabel(definition);
        affichageSuivi= new JLabel(affichage);
        Lettre = new JTextField(1);
        ValidateButton = new JButton("Valider");

        panel = new JPanel();
        panel.add(monMot);
        panel.add(maDefinition);
        panel.add(affichageSuivi);
        panel.add(Lettre);
        panel.add(ValidateButton);
        add(panel);

        setVisible(true);
        ValidateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String lettre = Lettre.getText(); // Récupérer la lettre saisie
                boolean resultat = entree.TestLettre(lettre); // Appeler la méthode TestLettre avec la lettre saisie
                if (resultat){
                    JOptionPane.showMessageDialog(null, "La lettre proposée est présente dans le mot !");
                }
                else {
                    JOptionPane.showMessageDialog(null, "La lettre proposée n'est pas présente dans le mot !");
                }
            }
        });
    }
}
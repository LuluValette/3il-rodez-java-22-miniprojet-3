package src.Vue;

import src.Controller.CView;
import src.Controller.ControllerView;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VPendu extends JFrame{
    private int height = 800;
    private int width = 500;
    private CView vue;
    private JLabel definition;
    private JButton boutonValider;
    private JTextField motUtilisateur;
    private JPanel jPanel;
    public VPendu(){
        //Création de la fenêtre
        setTitle("Jeu du pendu");
        setSize(height,width);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        //Création des paramètres
        vue = new CView();
        definition = new JLabel(vue.getDefinition());
        boutonValider = new JButton("Valider");
        motUtilisateur = new JTextField(1);

        //Ajout des mots au jPanel
        jPanel = new JPanel();
        jPanel.add(definition);
        jPanel.add(motUtilisateur);
        jPanel.add(boutonValider);
        add(jPanel);

        //Passage da la fenêtre en visible
        setVisible(true);

        boutonValider.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String lettre = motUtilisateur.getText();
                String nouveauMot =vue.nouvelleLettre(lettre);
                JOptionPane.showMessageDialog(VPendu.this, nouveauMot, "Résultat", JOptionPane.INFORMATION_MESSAGE);
            }
        });
    }
}

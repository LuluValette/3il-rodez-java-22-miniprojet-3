package src.Vue;

import src.Controller.ControllerView;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ViewPendu extends JFrame {
    private int height = 800;
    private int width = 500;
    public JLabel lettresDejaProposees;
    private JTextField LettreJoueur;
    private JButton BoutonValidation;
    private JPanel jPanel;
    private ControllerView controllerView;
    private JLabel Definition;
    public ViewPendu(){
        //Création de la fenêtre
        setTitle("Jeu du pendu");
        setSize(height,width);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        //Création des paramètres
        controllerView = new ControllerView();
        Definition = new JLabel(controllerView.getDefinition());
        BoutonValidation = new JButton("Valider");
        LettreJoueur = new JTextField(1);
        gestionBouton();

        //Ajouts des éléments à la page
        jPanel = new JPanel();
        jPanel.add(Definition);
        jPanel.add(LettreJoueur);
        jPanel.add(BoutonValidation);
        add(jPanel);

        //Passage da la fenêtre en visible
        setVisible(true);
    }
    public void gestionBouton(){
        BoutonValidation.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (controllerView.Message(BoutonValidation.getText())){
                    System.out.println("Gagné");
                }
            }
        });
    }
}

package src.Vue;

import src.Controller.ControllerView;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VPendu extends JFrame{
    private int height = 800;
    private int width = 500;
    private JPanel jPanel;
    private JLabel Definition;
    public VPendu(){
        //Création de la fenêtre
        setTitle("Jeu du pendu");
        setSize(height,width);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        //Création des paramètres
        

        //Passage da la fenêtre en visible
        setVisible(true);
    }

}

package src.Controller;

import java.util.ArrayList;

/**
 * Cette classe représente le contrôleur de la vue du jeu.
 */
public class ControllerView {
    private ControllerJeu MotDefinition; // Contrôleur pour la gestion du jeu

    /**
     * Constructeur de la classe ControllerView.
     * Initialise un nouveau contrôleur pour la gestion du jeu.
     */
    public ControllerView(){
        MotDefinition = new ControllerJeu();
    }

    /**
     * Méthode pour obtenir le mot actuel.
     * @return Le mot actuel.
     */
    public String getMot(){
        return MotDefinition.getMot();
    }

    /**
     * Méthode pour obtenir la définition du mot actuel.
     * @return La définition du mot actuel.
     */
    public String getDefinition(){
        return MotDefinition.getDefinition();
    }

    /**
     * Méthode pour vérifier si le joueur a gagné après avoir ajouté une lettre.
     * @param lettre La lettre proposée par le joueur.
     * @return true si le joueur a gagné, sinon false.
     */
    public boolean Message(String lettre){
        if (MotDefinition.ajoutLettre(lettre).equals("Gagné")){
            return true;
        }
        return false;
    }
}

package src.Controller;

import java.util.ArrayList;

/**
 * Cette classe représente le contrôleur de la vue du jeu.
 */
public class CView {
    private CJeu jeu; // Contrôleur pour la gestion du jeu

    /**
     * Constructeur de la classe CView.
     * Initialise un nouveau contrôleur pour la gestion du jeu.
     */
    public CView(){
        jeu = new CJeu();
    }

    /**
     * Méthode pour obtenir la définition du mot à deviner.
     * @return La définition du mot à deviner.
     */
    public String getDefinition(){
        return jeu.getDefinition();
    }

    /**
     * Méthode pour entrer une nouvelle lettre dans le jeu.
     * @param lettre La lettre proposée par le joueur.
     * @return Un message indiquant si la lettre est dans le mot, si elle n'est pas dans le mot, ou si le mot a été trouvé.
     */
    public String nouvelleLettre(String lettre){
        return jeu.nouvelleLettre(lettre);
    }

    /**
     * Méthode pour obtenir la liste des lettres déjà proposées.
     * @return La liste des lettres déjà proposées.
     */
    public ArrayList<String> listeLettres(){
        return jeu.ListeLettres();
    }
}

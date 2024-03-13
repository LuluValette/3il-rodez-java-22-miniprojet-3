package src.Controller;

import java.util.ArrayList;

/**
 * Cette classe représente le contrôleur du jeu.
 */
public class CJeu {
    CMot motDefinition;
    CGestionLettre gestionLettre;

    /**
     * Constructeur de la classe CJeu.
     * Initialise les objets nécessaires au jeu.
     */
    public CJeu(){
        motDefinition = new CMot();
        gestionLettre = new CGestionLettre(motDefinition.getMot());
    }

    /**
     * Méthode pour obtenir la définition du mot à deviner.
     * @return La définition du mot.
     */
    public String getDefinition(){
        return motDefinition.getDefinition();
    }

    /**
     * Méthode pour entrer une nouvelle lettre dans le jeu.
     * @param lettre La lettre proposée par le joueur.
     * @return Un message indiquant si la lettre est dans le mot, si elle n'est pas dans le mot, ou si le mot a été trouvé.
     */
    public String nouvelleLettre(String lettre){
        String resultat = gestionLettre.testLettre(lettre);
        if (resultat.equals("-1")){
            return "La lettre n'est pas dans le mot";
        }
        else if (resultat.equals("1")){
            return "La lettre est dans le mot";
        }
        return "Bravo, vous avez trouvé le mot !";
    }

    /**
     * Méthode pour obtenir la liste des lettres déjà proposées.
     * @return La liste des lettres déjà proposées.
     */
    public ArrayList<String> ListeLettres(){
        return gestionLettre.listeLettres();
    }
}

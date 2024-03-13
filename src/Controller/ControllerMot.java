package src.Controller;

import src.Model.ModelLettreProposee;
import src.Model.ModelMot;

import java.util.ArrayList;

/**
 * Cette classe représente le contrôleur pour la gestion du mot à deviner.
 */
public class ControllerMot {
    private ModelMot MotDefinition; // Modèle pour la gestion du mot
    private ControllerGestionLettre gestionLettre; // Contrôleur pour la gestion des lettres
    private ModelLettreProposee tableauLettres; // Modèle pour la gestion des lettres proposées
    private String Mot; // Le mot à deviner
    private String Definition; // La définition du mot à deviner
    private ArrayList<String> lettresJoueur; // Les lettres proposées par le joueur

    /**
     * Constructeur de la classe ControllerMot.
     * Initialise un nouveau mot aléatoire, sa définition, ainsi que les objets nécessaires à la gestion des lettres.
     */
    public ControllerMot(){
        MotDefinition = new ModelMot();
        Mot = MotDefinition.MotAleatoire();
        Definition = MotDefinition.definitionDuMot(Mot);
        gestionLettre = new ControllerGestionLettre(Mot);
        tableauLettres = new ModelLettreProposee();
        lettresJoueur = new ArrayList<>();
    }

    /**
     * Méthode pour obtenir le mot à deviner.
     * @return Le mot à deviner.
     */
    public String getMot() {
        return Mot;
    }

    /**
     * Méthode pour obtenir la définition du mot à deviner.
     * @return La définition du mot à deviner.
     */
    public String getDefinition() {
        return Definition;
    }

    /**
     * Méthode pour tester une lettre proposée par le joueur.
     * @param lettre La lettre proposée.
     * @return Un message indiquant si le joueur a gagné, s'il doit continuer ou si la lettre est correcte ou non.
     */
    public String TestLettre(String lettre){
        tableauLettres.setLettres(lettre);
        if (tableauLettres.FinJeu(Mot)){
            return "Gagné";
        }
        return gestionLettre.VerificationLettre(lettre);
    }
}

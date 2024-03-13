package src.Controller;

import src.Model.MMot;

/**
 * Cette classe représente un mot dans le jeu.
 */
public class CMot {
    private MMot MotDefinition; // Objet modèle pour la gestion des mots
    private String Mot; // Le mot à deviner
    private String Definition; // La définition du mot à deviner

    /**
     * Constructeur de la classe CMot.
     * Initialise un nouveau mot aléatoire et sa définition.
     */
    public CMot(){
        MotDefinition = new MMot();
        Mot = MotDefinition.MotAleatoire(); // Obtient un mot aléatoire
        Definition = MotDefinition.definitionDuMot(Mot); // Obtient la définition du mot
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
}

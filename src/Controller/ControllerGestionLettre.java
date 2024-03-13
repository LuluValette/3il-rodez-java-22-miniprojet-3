package src.Controller;

import src.Model.ModelGestionLettre;

/**
 * Cette classe représente le contrôleur de gestion des lettres.
 */
public class ControllerGestionLettre {
    private ModelGestionLettre modelGestionLettre; // Modèle pour la gestion des lettres
    private String LettreUtilisateur; // Lettre proposée par l'utilisateur

    /**
     * Constructeur de la classe ControllerGestionLettre.
     * Initialise un nouveau modèle pour la gestion des lettres.
     * @param Mot Le mot à traiter.
     */
    public ControllerGestionLettre(String Mot){
        modelGestionLettre = new ModelGestionLettre(Mot);
    }

    /**
     * Méthode pour vérifier une lettre proposée par l'utilisateur.
     * @param Lettre La lettre proposée par l'utilisateur.
     * @return Un message indiquant si la lettre est présente dans le mot ou non.
     */
    public String VerificationLettre(String Lettre){
        LettreUtilisateur = modelGestionLettre.LettreVerifiee(Lettre);
        if (LettreUtilisateur.equals("-1")){
            return "Lettre non présente";
        }
        return LettreUtilisateur;
    }
}

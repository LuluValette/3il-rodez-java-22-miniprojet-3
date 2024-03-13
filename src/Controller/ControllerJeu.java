package src.Controller;

/**
 * Cette classe représente le contrôleur du jeu.
 */
public class ControllerJeu {
    private ControllerMot mots; // Contrôleur pour la gestion des mots

    /**
     * Constructeur de la classe ControllerJeu.
     * Initialise un nouveau contrôleur pour la gestion des mots.
     */
    public ControllerJeu(){
        mots = new ControllerMot();
    }

    /**
     * Méthode pour obtenir le mot actuel.
     * @return Le mot actuel.
     */
    public String getMot(){
        return mots.getMot();
    }

    /**
     * Méthode pour obtenir la définition du mot actuel.
     * @return La définition du mot actuel.
     */
    public String getDefinition(){
        return mots.getDefinition();
    }

    /**
     * Méthode pour ajouter une lettre proposée dans le mot.
     * @param Lettre La lettre proposée.
     * @return Un message indiquant si le joueur a gagné ou s'il doit continuer.
     */
    public String ajoutLettre(String Lettre){
        String resultat = mots.TestLettre(Lettre);
        if (resultat.equals("Gagné")){
            return "Gagné";
        }
        return "continuer";
    }
}

package src.Model;

import java.util.ArrayList;

/**
 * La classe MGestionLettre gère les lettres proposées par le joueur pour un mot donné.
 */
public class MGestionLettre {
    private String MotJeu; // Le mot à deviner
    private boolean LettrePresente; // Indique si la dernière lettre proposée par le joueur est présente dans le mot à deviner
    private ArrayList<String> lettresProposees; // Liste des lettres déjà proposées par le joueur

    /**
     * Constructeur de la classe MGestionLettre.
     *
     * @param Mot Le mot à deviner
     */
    public MGestionLettre(String Mot) {
        MotJeu = Mot;
        lettresProposees = new ArrayList<>();
    }

    /**
     * Vérifie si une lettre proposée par le joueur est présente dans le mot à deviner.
     *
     * @param Lettre La lettre proposée par le joueur
     * @return true si la lettre est présente dans le mot à deviner, sinon false
     */
    private boolean VerificationLettreJoueur(String Lettre) {
        return MotJeu.contains(Lettre);
    }

    /**
     * Méthode appelée pour vérifier une lettre proposée par le joueur.
     *
     * @param Lettre La lettre proposée par le joueur
     * @return true si la lettre est présente dans le mot à deviner, sinon false
     */
    public boolean LettreVerifiee(String Lettre) {
        LettrePresente = VerificationLettreJoueur(Lettre);
        if (LettrePresente) {
            return true;
        }
        return false;
    }

    /**
     * Ajoute une lettre proposée par le joueur à la liste des lettres proposées.
     *
     * @param lettre La lettre proposée par le joueur
     */
    public void ajoutLettreListe(String lettre) {
        int index = -1;
        for (int i = 0; i < lettresProposees.size(); i++) {
            if (lettresProposees.get(i) == null) {
                index = i;
                break;
            }
        }
        if (index != -1) {
            lettresProposees.set(index, lettre);
        }
    }

    /**
     * Renvoie la liste des lettres proposées par le joueur.
     *
     * @return La liste des lettres proposées par le joueur
     */
    public ArrayList<String> getLettresProposees() {
        return lettresProposees;
    }

    /**
     * Vérifie si toutes les lettres du mot à deviner ont été proposées par le joueur.
     *
     * @return true si toutes les lettres du mot sont présentes dans la liste des lettres proposées, sinon false
     */
    public boolean testMots() {
        // Parcourt chaque lettre du mot
        for (int i = 0; i < MotJeu.length(); i++) {
            char lettre = MotJeu.charAt(i);
            // Vérifie si la lettre du mot est présente dans l'ArrayList
            if (!lettresProposees.contains(lettre)) {
                // Si la lettre n'est pas présente, retourne false
                return false;
            }
        }
        // Si toutes les lettres du mot sont présentes, retourne true
        return true;
    }
}

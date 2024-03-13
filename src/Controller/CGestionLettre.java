package src.Controller;

import src.Model.MGestionLettre;

import java.util.ArrayList;

/**
 * Cette classe représente le contrôleur de gestion des lettres.
 */
public class CGestionLettre {
    private MGestionLettre mGestionLettre;

    /**
     * Constructeur de la classe CGestionLettre.
     * @param Mot Le mot à traiter.
     */
    public CGestionLettre(String Mot){
        mGestionLettre = new MGestionLettre(Mot);
    }

    /**
     * Méthode pour tester une lettre.
     * @param lettre La lettre à tester.
     * @return Une chaîne de caractères représentant le résultat du test :
     *         - "-1" si la lettre n'est pas correcte,
     *         - "1" si la lettre est correcte mais le mot n'est pas encore trouvé,
     *         - "2" si le mot a été trouvé.
     */
    public String testLettre(String lettre){
        mGestionLettre.ajoutLettreListe(lettre);
        if (!(mGestionLettre.testMots())){
            if (!(mGestionLettre.LettreVerifiee(lettre))){
                return "-1";
            }
            return "1";
        }
        return "2";
    }

    /**
     * Méthode pour obtenir la liste des lettres proposées.
     * @return La liste des lettres proposées.
     */
    public ArrayList<String> listeLettres(){
        return mGestionLettre.getLettresProposees();
    }
}

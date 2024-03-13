package src.Model;

import java.util.ArrayList;

public class MGestionLettre {
    private String MotJeu;
    private boolean LettrePresente;
    private ArrayList<String> lettresProposees;
    public MGestionLettre(String Mot){
        MotJeu = Mot;
        lettresProposees = new ArrayList<>();
    }
    private boolean VerificationLettreJoueur(String Lettre){
        return MotJeu.contains(Lettre);
    }
    public boolean LettreVerifiee(String Lettre){
        LettrePresente = VerificationLettreJoueur(Lettre);
        if (LettrePresente){
            return true;
        }
        return false;
    }
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
    public ArrayList<String> getLettresProposees(){
        return lettresProposees;
    }
    public boolean testMots(){
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

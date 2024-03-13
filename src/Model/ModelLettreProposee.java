package src.Model;

import java.util.ArrayList;

public class ModelLettreProposee {
    private ArrayList<String> lettres;
    public ModelLettreProposee(){
        lettres = new ArrayList<>();
    }

    public void setLettres(String lettre) {
        int index = -1;
        for (int i = 0; i < lettres.size(); i++) {
            if (lettres.get(i) == null) {
                index = i;
                break;
            }
        }
        if (index != -1) {
            lettres.set(index, lettre);
        }
    }

    public ArrayList<String> getLettres() {
        return lettres;
    }
    public int getNombreLettres(){
        return lettres.size();
    }
    public boolean FinJeu(String Mot){
        // Parcourt chaque lettre du mot
        for (int i = 0; i < Mot.length(); i++) {
            char lettre = Mot.charAt(i);
            // Vérifie si la lettre du mot est présente dans l'ArrayList
            if (!lettres.contains(lettre)) {
                // Si la lettre n'est pas présente, retourne false
                return false;
            }
        }
        // Si toutes les lettres du mot sont présentes, retourne true
        return true;
    }
}

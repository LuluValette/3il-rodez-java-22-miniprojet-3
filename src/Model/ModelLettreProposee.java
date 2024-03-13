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
}

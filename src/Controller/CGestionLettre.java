package src.Controller;

import src.Model.MGestionLettre;

public class CGestionLettre {
    private MGestionLettre mGestionLettre;
    public CGestionLettre(String Mot){
        mGestionLettre = new MGestionLettre(Mot);
    }
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
}

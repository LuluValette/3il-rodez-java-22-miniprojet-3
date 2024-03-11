package src.Controller;

import src.Model.VerificationEntree;

public class EntreesUtilisateur {
    VerificationEntree entree;

    public EntreesUtilisateur(String mot){
        entree = new VerificationEntree(mot);
    }
    public boolean TestLettre(String Lettre){
        return entree.TestLettre(Lettre);
    }
}

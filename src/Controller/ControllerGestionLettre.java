package src.Controller;

import src.Model.ModelGestionLettre;

public class ControllerGestionLettre {
    private ModelGestionLettre modelGestionLettre;
    private String LettreUtilisateur;
    public ControllerGestionLettre(String Mot){
        modelGestionLettre = new ModelGestionLettre(Mot);
    }
    public String VerificationLettre(String Lettre){
        LettreUtilisateur = modelGestionLettre.LettreVerifiee(Lettre);
        if (LettreUtilisateur.equals("-1")){
            return "Lettre non présente";
        }
        return LettreUtilisateur;
    }
}

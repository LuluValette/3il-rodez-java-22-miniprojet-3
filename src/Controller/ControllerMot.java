package src.Controller;

import src.Model.ModelLettreProposee;
import src.Model.ModelMot;

import java.util.ArrayList;

public class ControllerMot {
    private ModelMot MotDefinition;
    private ControllerGestionLettre gestionLettre;
    private ModelLettreProposee tableauLettres;
    private String Mot;
    private String Definition;
    private ArrayList<String> lettresJoueur;
    public ControllerMot(){
        MotDefinition = new ModelMot();
        Mot = MotDefinition.MotAleatoire();
        Definition = MotDefinition.definitionDuMot(Mot);
        gestionLettre = new ControllerGestionLettre(Mot);
        tableauLettres = new ModelLettreProposee();
        lettresJoueur = new ArrayList<>();
    }

    public String getMot() {
        return Mot;
    }

    public String getDefinition() {
        return Definition;
    }
    public String TestLettre(String lettre){
        tableauLettres.setLettres(lettre);
        if (tableauLettres.FinJeu(Mot)){
            return "Gagné";
        }
        return gestionLettre.VerificationLettre(lettre);
    }

}

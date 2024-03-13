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
    public ControllerMot(){
        MotDefinition = new ModelMot();
        Mot = MotDefinition.MotAleatoire();
        Definition = MotDefinition.definitionDuMot(Mot);
        gestionLettre = new ControllerGestionLettre(Mot);
        tableauLettres = new ModelLettreProposee();
    }

    public String getMot() {
        return Mot;
    }

    public String getDefinition() {
        return Definition;
    }
    public String TestLettre(String lettre){
        tableauLettres.setLettres(lettre);
        return gestionLettre.VerificationLettre(lettre);
    }
    public String[] getLettres(){
        int nombreLettres=tableauLettres.getNombreLettres();
        ArrayList<String> lettresPresentes = tableauLettres.getLettres();
        String[] tableau = new String[nombreLettres];
        for (int i=0;i<nombreLettres;i++){
            tableau[i]= lettresPresentes.get(i);
        }
        return tableau;
    }
}

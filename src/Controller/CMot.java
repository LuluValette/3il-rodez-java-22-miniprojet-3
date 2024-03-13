package src.Controller;

import src.Model.MMot;

import java.util.ArrayList;

public class CMot {
    private MMot MotDefinition;
    private String Mot;
    private String Definition;

    public CMot(){
        MotDefinition = new MMot();
        Mot = MotDefinition.MotAleatoire();
        Definition = MotDefinition.definitionDuMot(Mot);
    }

    public String getMot() {
        return Mot;
    }

    public String getDefinition() {
        return Definition;
    }
}

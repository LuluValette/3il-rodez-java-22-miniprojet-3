package src.Controller;

import java.util.ArrayList;

public class ControllerView {
    private ControllerJeu MotDefinition;
    public ControllerView(){
        MotDefinition = new ControllerJeu();
    }
    public String getMot(){
        return MotDefinition.getMot();
    }
    public String getDefinition(){
        return MotDefinition.getDefinition();
    }
    public boolean Message(String lettre){
        if (MotDefinition.ajoutLettre(lettre)=="Gagné"){
            return true;
        }
        return false;
    }
}

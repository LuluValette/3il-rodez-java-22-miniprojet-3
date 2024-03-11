package src.Controller;

import src.Model.LectureAleatoire;
import src.Model.motAlea;

public class motAleatoire {
    motAlea mot;
    public motAleatoire(){
        mot = new motAlea();
    }
    public String getMot(){
        return mot.getMot();
    }
    public String getDefinition(){
        return mot.getDefinition();
    }
}

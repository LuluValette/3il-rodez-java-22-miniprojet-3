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
    public String longueur(){
        StringBuilder pass= new StringBuilder();
        int longueur = mot.longueur();
        for (int i=0;i<longueur;i++){
            pass.append("_ ");
        }
        return pass.toString();
    }
    public void ajoutLettre(){

    }
    public String[] getLettres(){
        return null;
    }
}

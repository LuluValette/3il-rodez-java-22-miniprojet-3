package src.tests;

import src.Controller.CMot;
import src.Vue.VPendu;

public class TMotAleatoire {
    CMot mots;
    public TMotAleatoire(){
        mots = new CMot();
    }
    public void affichageMotDefinition(){
        System.out.println(mots.getMot());
        System.out.println(mots.getDefinition());
    }
    public static void main(String[] args) {
        TMotAleatoire mot = new TMotAleatoire();
        mot.affichageMotDefinition();
    }
}

package src.tests;

import src.Controller.CJeu;
import src.Vue.VPendu;

public class TCJeu {
    private CJeu jeu;
    public TCJeu(){
        jeu = new CJeu();
    }
    public void testCJeu(){
        String lettre="r";
        System.out.println(jeu.ListeLettres());
        System.out.println(jeu.getDefinition());
        System.out.println(lettre);
        System.out.println(jeu.nouvelleLettre(lettre));
    }
    public static void main(String[] args) {
        TCJeu testJeu = new TCJeu();
        testJeu.testCJeu();
    }
}

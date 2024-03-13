package src.Controller;

import java.util.ArrayList;

public class CView {
    private CJeu jeu;
    public CView(){
        jeu = new CJeu();
    }
    public String getDefinition(){
        return jeu.getDefinition();
    }
    public String nouvelleLettre(String lettre){
        return jeu.nouvelleLettre(lettre);
    }
    public ArrayList<String> listeLettres(){
        return jeu.ListeLettres();
    }
}

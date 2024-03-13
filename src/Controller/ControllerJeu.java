package src.Controller;

public class ControllerJeu {
    private ControllerMot mots;
    public ControllerJeu(){
        mots = new ControllerMot();
    }
    public String getMot(){
        return mots.getMot();
    }
    public String getDefinition(){
        return mots.getDefinition();
    }
    public String ajoutLettre(String Lettre){
        String dab=mots.TestLettre(Lettre);
        if (dab=="Gagné"){
            return "Gagné";
        }
        return "continuer";
    }
}

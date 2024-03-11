package src.Controller;

public class EntreesUtilisateur {
    String mot;
    public EntreesUtilisateur(String mot){
        this.mot=mot;
    }
    public boolean TestLettre(String lettre){
        return mot.contains(lettre);
    }
}

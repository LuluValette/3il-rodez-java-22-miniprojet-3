package src.Model;

public class VerificationEntree {
    String mot;
    public VerificationEntree(String mot){
        this.mot=mot;
    }
    public boolean TestLettre(String lettre){
        return mot.contains(lettre);
    }
}

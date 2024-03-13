package src.Model;
public class ModelGestionLettre {
    private String MotJeu;
    private boolean LettrePresente;
    public ModelGestionLettre(String Mot){
        MotJeu = Mot;
    }
    private boolean VerificationLettreJoueur(String Lettre){
        return MotJeu.contains(Lettre);
    }
    public String LettreVerifiee(String Lettre){
        LettrePresente = VerificationLettreJoueur(Lettre);
        if (LettrePresente){
            return Lettre;
        }
        return "-1";
    }
}

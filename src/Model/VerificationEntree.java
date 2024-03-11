package src.Model;

public class VerificationEntree {
    String mot;
    String[] lettres;
    public VerificationEntree(String mot){
        this.mot=mot;
        lettres = new String[]{};
    }
    public int TestLettre(String lettre){
        boolean a=ajoutLettre(lettre);
        if (a){
            return -1;
        }
        else if (mot.contains(lettre)){
            return 1;
        }
        else {
            return 0;
        }
    }
    private boolean ajoutLettre(String Lettre){
        for (int i = 0; i < lettres.length; i++) {
            if (lettres[i] == null) { // Trouver la première case vide
                lettres[i] = Lettre; // Ajouter la lettre à la première case vide
                break; // Sortir de la boucle une fois que la lettre a été ajoutée
            }
        }
    }
    public String[] getLettres(){
        return lettres;
    }
}

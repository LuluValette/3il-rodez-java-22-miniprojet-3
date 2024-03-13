package src.Controller;

public class CJeu {
    CMot motDefinition;
    CGestionLettre gestionLettre;
    public CJeu(){
        motDefinition = new CMot();
        gestionLettre = new CGestionLettre(motDefinition.getMot());
    }
    public String getDefinition(){
        return motDefinition.getDefinition();
    }
    public String nouvelleLettre(String lettre){
        String resultat = gestionLettre.testLettre(lettre);
        if (resultat.equals("-1")){
            return "La lettre n'est pas dans le mot";
        }
        else if (resultat.equals("1")){
            return "La lettre est dans le mot";
        }
        return "Bravo, vous avez trouvé le mot !";
    }
}

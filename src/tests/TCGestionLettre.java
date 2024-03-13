package src.tests;

import src.Controller.CGestionLettre;

public class TCGestionLettre {
    CGestionLettre gestionLettre;
    public TCGestionLettre(){
        gestionLettre = new CGestionLettre("reussir");
    }
    public void testClasse(){
        System.out.println(gestionLettre.testLettre("r"));
        System.out.println(gestionLettre.testLettre("e"));
        System.out.println(gestionLettre.testLettre("u"));
        System.out.println(gestionLettre.testLettre("s"));
        System.out.println(gestionLettre.testLettre("i"));
        System.out.println(gestionLettre.listeLettres());
    }
    public static void main(String[] args) {
        TCGestionLettre tcGestionLettre = new TCGestionLettre();
        tcGestionLettre.testClasse();
    }
}

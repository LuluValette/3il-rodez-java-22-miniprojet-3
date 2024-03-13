package src.Controller;

public class ControllerView {
    private ControllerMot MotDefinition;
    public ControllerView(){
        MotDefinition = new ControllerMot();
    }
    public String getMot(){
        return MotDefinition.getMot();
    }
    public String getDefinition(){
        return MotDefinition.getDefinition();
    }
    public String Message(String lettre){
        return MotDefinition.TestLettre(lettre);
    }
}

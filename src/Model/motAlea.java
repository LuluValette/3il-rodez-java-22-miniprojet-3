package src.Model;

public class motAlea {
    private String mot;
    private String definition;
    public motAlea(){
        LectureAleatoire lectureAleatoire = new LectureAleatoire();
        mot = lectureAleatoire.motAleatoire();
        definition = lectureAleatoire.definitionDuMot(mot);
    }
    public String getMot(){
        return mot;
    }
    public String getDefinition(){
        return definition;
    }
}

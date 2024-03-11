package src.Controller;

import src.Model.LectureAleatoire;

public class motAleatoire {
    private String mot;
    private String definition;
    public motAleatoire(){
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

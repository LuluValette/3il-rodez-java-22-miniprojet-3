package src.Model;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class LectureAleatoire {
    private List<String> mots;
    private List<String> definitions;

    public LectureAleatoire(String filePath) {
        mots = new ArrayList<>();
        definitions = new ArrayList<>();
        lireMots(filePath);
    }

    private void lireMots(String filePath) {
        try {
            File fichier = new File(filePath);
            Scanner scanner = new Scanner(fichier);

            while (scanner.hasNextLine()) {
                String ligne = scanner.nextLine();
                // Séparation du mot et de sa définition
                String[] parts = ligne.split(" ", 2);
                // Ajout du mot et de sa définition aux listes
                mots.add(parts[0]);
                definitions.add(parts[1]);
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public String motAleatoire() {
        Random random = new Random();
        int index = random.nextInt(mots.size());
        return mots.get(index);
    }

    public String definitionDuMot(String mot) {
        int index = mots.indexOf(mot);
        if (index != -1) {
            return definitions.get(index);
        }
        return "Définition non disponible";
    }

    //Utilisation de la classe
    public static void main(String[] args) {
        String filePath = "mots.txt";
        LectureAleatoire lectureAleatoire = new LectureAleatoire(filePath);
        String mot = lectureAleatoire.motAleatoire();
        String definition = lectureAleatoire.definitionDuMot(mot);
        System.out.println("Mot aléatoire sélectionné : " + mot);
        System.out.println("Définition : " + definition);
    }
}

package src.Model;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

/**
 * Cette classe permet de lire aléatoirement un mot à deviner à partir d'un fichier texte.
 */
public class LectureAleatoire {
    private final List<String> mots;
    private final List<String> definitions;
    private final String filePath = "mots.txt";
    /**
     * Constructeur de la classe LectureAleatoire.
    */

    public LectureAleatoire() {
        mots = new ArrayList<>();
        definitions = new ArrayList<>();
        lireMots(filePath);
    }

    // Méthode privée pour lire les mots à partir du fichier texte
    private void lireMots(String filePath) {
        try {
            File fichier = new File(filePath);
            Scanner scanner = new Scanner(fichier);

            while (scanner.hasNextLine()) {
                String ligne = scanner.nextLine();
                String[] parts = ligne.split(" ", 2);
                mots.add(parts[0]);
                definitions.add(parts[1]);
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    /**
     * Cette méthode renvoie un mot aléatoire parmi ceux lus à partir du fichier texte.
     * @return Un mot aléatoire.
     */
    public String motAleatoire() {
        Random random = new Random();
        int index = random.nextInt(mots.size());
        return mots.get(index);
    }

    /**
     * Cette méthode renvoie la définition associée à un mot donné.
     * @param mot Le mot dont on veut obtenir la définition.
     * @return La définition du mot.
     */
    public String definitionDuMot(String mot) {
        int index = mots.indexOf(mot);
        if (index != -1) {
            return definitions.get(index);
        }
        return "Définition non disponible";
    }

    public static void main(String[] args) {
        // Exemple d'utilisation de la classe LectureAleatoire dans le main
        LectureAleatoire lectureAleatoire = new LectureAleatoire();
        String mot = lectureAleatoire.motAleatoire();
        String definition = lectureAleatoire.definitionDuMot(mot);
        System.out.println("Mot aléatoire sélectionné : " + mot);
        System.out.println("Définition : " + definition);
    }
}

package src.Model;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class ModelMot {
    private List<String> Mot;
    private List<String> Definition;
    private String CheminAcces;

    public ModelMot(){
        CheminAcces = "mots.txt";
        Mot = new ArrayList<>();
        Definition = new ArrayList<>();
        ChoixDuMot();
    }

    private void ChoixDuMot() {
        try {
            File fichier = new File(CheminAcces);
            Scanner scanner = new Scanner(fichier);

            while (scanner.hasNextLine()) {
                String ligne = scanner.nextLine();
                String[] parts = ligne.split(" ", 2);
                Mot.add(parts[0]);
                Definition.add(parts[1]);
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public String MotAleatoire() {
        Random random = new Random();
        int index = random.nextInt(Mot.size());
        return Mot.get(index);
    }

    public String definitionDuMot(String mot) {
        int index = Mot.indexOf(mot);
        if (index != -1) {
            return Definition.get(index);
        }
        return "Définition non disponible";
    }

}

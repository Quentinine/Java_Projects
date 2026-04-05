package Projects.Proje4.ProjeSoru4;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ParolaGen {
    String word = "";
    int letter;
    ArrayList<Integer> len = new ArrayList<>(List.of(8, 9, 10));

    public String passGen() {
        Random random = new Random();
        // Formül: nextInt(üstSınır - altSınır + 1) + altSınır
        int tur = len.get(random.nextInt(len.size()));

        for (int i = 0; i < tur; i++) {
            letter = random.nextInt(94) + 33;
            char karakter = (char) letter;
            word += karakter;
        }
        String sifre = word;
        return sifre;
    }
}

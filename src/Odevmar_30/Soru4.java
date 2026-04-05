package Odevmar_30;

import java.util.*;

/**
 * "Ankara" adlı bir şehir listede var mı kontrol ediniz
 */

public class Soru4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> sehirler = new ArrayList<>();

        for (int i = 0; i < 6; i++) {
            System.out.println("Lütfen sehir girin: ");
            String sehir = scanner.nextLine().trim().toLowerCase();
            sehirler.add(sehir);
        }
        Set<String> qsehirler = new HashSet<>(sehirler);
        System.out.println(qsehirler);

        boolean varmi = qsehirler.contains("ankara");

        if (varmi) {
            System.out.println("setin içinde ankara var");
        } else {
            System.out.println("setin içinde ankara yok");
        }


    }
}

package Odevmar_30;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * Ortalaması 70 ve üzeri olan öğrencileri ekrana yazdırınız.
 * En yüksek ortalamaya sahip öğrenciyi bulunuz.
 */

public class Soru6 {
    public static void main(String[] args) {

        //1. ogrencilerin not listesi
        Scanner scanner = new Scanner(System.in);
        Map<String, ArrayList<Integer>> liste = new HashMap<>();
        String ogrenci;
        int not = 0;
        do {
            System.out.println("Lütfen öğrenci isimlerini sırasıyla girin, cıkıs yapmak için cikis yazın: ");
            ogrenci = scanner.nextLine().trim().toLowerCase();
            if (!ogrenci.equalsIgnoreCase("cikis")) {
                liste.put(ogrenci, new ArrayList<>());
            }
            not = 0;
            if (ogrenci.equalsIgnoreCase("cikis")) {
                System.out.println("Ogrenci girişi tamamlandı.");
            } else {
                do {
                    System.out.println("Ogrenci notlarını girin, cıkıs yapmak için -1 yazın.");
                    not = scanner.nextInt();
                    scanner.nextLine();
                    if (not == -1) {
                        System.out.println("ogrencinin notları tamamlandı");
                    } else {
                        liste.get(ogrenci).add(not);
                    }
                } while (not != -1);

            }
        }
        while (!ogrenci.equalsIgnoreCase("cikis"));
        System.out.println(liste);

        //2. ortalamalar
        Map<String, Double> ort = new HashMap<>();
        int ortsayi = 0;
        for (Map.Entry<String, ArrayList<Integer>> gezme : liste.entrySet()) {
            ArrayList<Integer> dot = gezme.getValue();
            for (int i = 0; i < dot.size(); i++) {
                ortsayi += dot.get(i);
                if ((i + 1) == dot.size()) {
                    double ortalama = (double) ortsayi / dot.size();
                    if (ortalama > 70) {
                        System.out.println(gezme.getKey() + " tebrikler gecer not aldın!!!");
                    }
                    ort.put(gezme.getKey(), ortalama);
                    ortsayi = 0;
                }
            }
        }
        System.out.println(ort);

        // en yüksek not
        int max = 0;
        String imax = "";
        for (Map.Entry<String, ArrayList<Integer>> gezmece : liste.entrySet()) {
            ArrayList<Integer> gez = gezmece.getValue();
            for (int i = 0; i < gez.size(); i++) {
                if (gez.get(i) > max) {
                    max = gez.get(i);
                    imax = gezmece.getKey();

                }
            }

        }
        System.out.println("En yüksek not: " + max);
        System.out.println("En yüksek notu alan ogrenci: " + imax);



    }
}

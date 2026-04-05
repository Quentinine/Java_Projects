package odev26_2;

import java.util.Scanner;

public class Soru8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] kodlar = new String[5];

        for (int i = 0; i < 5; i++) {
            do {
                System.out.println((i + 1) + ". kodu girin: ");
                kodlar[i] = scanner.nextLine();
                if (kodlar[i].length() != 10) {
                    System.out.println("Kod uzunluğu 10 olmak zorunda!");
                }
            } while (kodlar[i].length() != 10);
        }

        System.out.println("Lütfen adres tipini seçin: ev, ofis, şube");
        String teslim = scanner.nextLine();

        int teslimpr = 0;
        switch (teslim) {
            case "ev":
                teslimpr = 50;
                break;
            case "ofis":
                teslimpr = 65;
                break;
            case "şube":
                teslimpr = 20;
                break;
        }

        System.out.println("Lütfen teslimat mesafesi giriniz: ");
        int mesafe = scanner.nextInt();
        scanner.nextLine();

        if (mesafe > 30) {
            teslimpr += 45;
            System.out.println("Mesafe 30km üstü olduğu için 45 TL ek ücret eklendi.");
        }

        System.out.println("\n--- Kodların İlk 2 Karakteri ---");
        for (int i = 0; i < kodlar.length; i++) {
            String sub = kodlar[i].substring(0, 2);
            System.out.println((i + 1) + ". kodun başı: " + sub);
        }

        int sayilar = 0;
        int harfler = 0;

        for (String s : kodlar) {
            for (int j = 0; j < s.length(); j++) {
                char c = s.charAt(j);
                if (c >= '0' && c <= '9') {
                    sayilar++;
                } else if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')) {
                    harfler++;
                }
            }
        }

        System.out.println("\n--- Toplam Analiz ---");
        System.out.println("Toplam Rakam Sayısı: " + sayilar);
        System.out.println("Toplam Harf Sayısı: " + harfler);
        System.out.println("Son Ödenecek Tutar: " + teslimpr + " TL");

    }
}
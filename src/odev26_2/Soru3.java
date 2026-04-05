package odev26_2;

import java.util.Scanner;
import java.util.Arrays;

public class Soru3 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Lütfen ogrenci sayısını girin: ");
        int kac = scanner.nextInt();
        scanner.nextLine();

        String[] liste = new String[kac];
        // HATA BURADAYDI: yoklamalar dizisini burada tanımlıyoruz
        String[] yoklamalar = new String[kac];

        for (int i = 0; i < liste.length; i++) {
            String isim;
            do {
                System.out.print((i + 1) + ". ogrenci ismini girin: ");
                isim = scanner.nextLine().trim().toLowerCase();

                if (isim.contains(" ")) {
                    System.out.println("HATA: Lütfen boşluk bırakmadan tek kelime girin.");
                }
            } while (isim.contains(" ") || isim.isEmpty());

            liste[i] = isim;
        }

        System.out.println("Sınıf Listesi: " + Arrays.toString(liste));

        for (int i = 0; i < liste.length; i++) {
            System.out.print(liste[i] + " için yoklama kodu (G: Geldi, Y: Yok, R: Raporlu): ");
            String kod = scanner.next().toUpperCase();

            switch (kod) {
                case "G":
                    yoklamalar[i] = "Geldi";
                    break;
                case "Y":
                    yoklamalar[i] = "Yok";
                    break;
                case "R":
                    yoklamalar[i] = "Raporlu";
                    break;
                default:
                    yoklamalar[i] = "Bilinmiyor";
                    break;
            }
        }

        int aSayaci = 0;


        for (int i = 0; i < liste.length; i++) {
            System.out.println((i + 1) + ". " + liste[i] + " -> Durum: " + yoklamalar[i]);

            if (liste[i].contains("a")) {
                aSayaci++;
            }
        }

        System.out.println("\nToplam öğrenci: " + kac);
        System.out.println("İçinde 'a' harfi geçen öğrenci sayısı: " + aSayaci);

        scanner.close();
    }
}

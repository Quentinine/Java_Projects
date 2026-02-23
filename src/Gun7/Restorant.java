package Gun7;

import java.util.Scanner;

public class Restorant {
    public static void main(String[] args) {
        /**
         * Kullanıcı kişi sayısı girsin (1–10).
         * Aralık dışıysa tekrar iste.
         * 7+ ise “Büyük masa”, değilse “Normal masa”.
         * */

        Scanner scanner = new Scanner(System.in);

        int kisi;

        do {
            System.out.print("Kisi sayisi girin: ");
            kisi = scanner.nextInt();

            if (kisi < 1 || kisi > 10) {
                System.out.println("Hatali kisi sayisi girdiniz. Aralik 1-10 arasi olmali");
            }
        } while (kisi < 1 || kisi > 10);

        if (kisi >= 7) {
            System.out.println("Büyük masa");
        } else {
            System.out.println("Normal masa");
        }
    }
}

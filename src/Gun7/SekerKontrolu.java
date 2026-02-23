package Gun7;

import java.util.Scanner;

public class SekerKontrolu {
    public static void main(String[] args) {
        /**
         * Kullanıcıdan şeker miktarı al (0–5 arası).
         * Aralık dışıysa tekrar iste.
         * */

        Scanner scanner = new Scanner(System.in);

        int seker;

        do {
            System.out.println("Seker miktari girin(0-5 arasi)");
            seker = scanner.nextInt();

            if (seker < 0 || seker > 5) {
                System.out.println("Hatali secim. 0-5 arasi secim yapmalisin");
            }
        } while (seker < 0 || seker > 5);

        System.out.println("Secilen seker miktari: " + seker);
    }
}

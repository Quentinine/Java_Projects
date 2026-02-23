package Gun7;

import java.util.Scanner;

public class SuIcmeTakibi {
    public static void main(String[] args) {
        /**
         * Günlük hedef 2000 ml.
         * Kullanıcı her seferinde içtiği ml’yi girsin.
         * Toplam hedefe ulaşınca bitir.
         * */

        Scanner scanner = new Scanner(System.in);

        int hedef = 2000;
        int toplam = 0;

        do {
            System.out.print("Kac ml su ictin: ");
            int ml = scanner.nextInt();

            if (ml > 0) {
                toplam += ml;
            } else {
                System.out.println("0 dan büyük bir gir");
            }

            System.out.println("Toplam: " + toplam + " ml");
        } while (toplam < hedef);

        System.out.println("Tebrikler hedefe ulastiniz");
    }
}

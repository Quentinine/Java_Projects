package Gun7;

import java.util.Scanner;

public class MarketSepeti {
    public static void main(String[] args) {
        /**
         * Kullanıcı fiyat girsin.
         * 0 girerse bitir. Toplamı yazdır.
         * (En az 1 kez fiyat sorulsun.)
         * */

        Scanner scanner = new Scanner(System.in);

        double toplam = 0;
        double fiyat;

        do {
            System.out.println("Ürün fiyati girin(Cikis yapmak icin 0 girin)");
            fiyat = scanner.nextDouble();

            if (fiyat > 0) {
                toplam += fiyat;
            } else if (fiyat < 0) {
                System.out.println("Fiyat negatif olamaz");
            }
        } while (fiyat != 0);

        System.out.println("Toplam: " + toplam);
    }
}

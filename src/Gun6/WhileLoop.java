package Gun6;

import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {
        /**
         * koşul true olduğu sürece çalışmaya devam eder
         * while (koşul) {
         *        // tekrar edecek kod blogu
         *
         *
         *
         */
        int i = 1;
        while (i < 5) {
            System.out.println(i);
            i++;
        }
        System.out.println(i);

        Scanner scanner = new Scanner(System.in);

        String password = "1234";
        System.out.print("Şifre girin: ");
        String input = scanner.nextLine().trim();

        while (!input.equals(password)) {
            System.out.println("Girilen şifre hatalı tekrar dene");
            System.out.print("Şifre girin: ");
            input = scanner.nextLine().trim();
        }

        System.out.print("Giriş başarılı.");

        /**
         * Bakiye 30 TL. Her biniş 12 TL.
         * Bakiye yettiği sürece "Biniş yapıldı" yaz.
         * Kaç biniş oldu?
         */

        int bakiye = 30;
        int binisUcreti = 12;
        int binisSayisi = 0;

        // Bakiye, biniş ücretinden büyük veya eşit olduğu sürece döngü çalışır
        while (bakiye >= binisUcreti) {
            bakiye -= binisUcreti; // Bakiyeden ücreti düş
            binisSayisi++;        // Biniş sayısını 1 artır

            System.out.println("Binis yapildi. Kalan bakiye: " + bakiye);
        }

        // Döngü bittiğinde toplam sonucu yazdır
        System.out.println("Toplam binis sayisi: " + binisSayisi);
    }


}


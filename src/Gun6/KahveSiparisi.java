package Gun6;

import java.util.Scanner;

public class KahveSiparisi {
    public static void main(String[] args) {
        /**
         * Kullanıcıdan:
         * İçecek türü: "kahve" / "çay" / "limonata" (String)
         * Boy: "S/M/L" (String)
         * Şeker: 0-5 (int)
         * İstenen:
         * switch-case ile içeceğe göre taban fiyat
         * if-else ile boyut farkını ekle
         * String’i toLowerCase() ile normalize et, boy için equalsIgnoreCase() kullan
         * Son fiyatı yazdır
         * */
        Scanner scanner = new Scanner(System.in);

        System.out.println("Icecek türü ne olsun? (Kahve, Cay, Limonata)");
        String drink = scanner.nextLine().trim();

        System.out.println("Icecek boyutu ne olsun? (S, M, L)");
        String size = scanner.nextLine().trim();

        System.out.println("Kac seker olsun? (0-5)");
        int sugar = scanner.nextInt();

        double price = 0;

        switch (drink) {
            case "kahve":
                price = 40;
            break;
            case "cay":
                price = 30;
                break;
            case "limonata":
                price = 20;
                break;
            default:
                System.out.println("Gecersiz icecek");
        }

        if (size.equalsIgnoreCase("M")) {
            price += 5;
        } else if (size.equalsIgnoreCase("L")) {
            price += 10;
        } else if (!size.equalsIgnoreCase("S")) {
            System.out.println("Gecersiz boy girisi yapildi");
        }

        if (sugar < 0 || sugar > 5) {
            System.out.println("Seker sayisi 0-5 arasi olabilir");
        }

        System.out.println("Icecek: " + drink + " boyutu: " + size.toUpperCase());
        System.out.println("Toplam tutar: " + price);
    }
}

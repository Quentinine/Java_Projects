package Gun6;

import java.util.Scanner;

public class MarketIndirimi {
    public static void main(String[] args) {

        /**
         * Kullanıcıdan:
         * Ürün adı (String)
         * Adet (int)
         * Kupon kodu (String)
         * İstenen:
         * Kupon kodunu trim() + toUpperCase() yap
         * switch-case ile kupon tipine göre indirim uygula: SAVE10, SAVE20, NONE
         * if-else ile adet 5’ten büyükse ekstra indirim ver
         * Ürün adında “sut” geçiyorsa (contains) bir uyarı yazdır
         * */

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ürün adi: ");
        String product = scanner.nextLine().trim();

        System.out.print("Ürün adedi:");
        int miktar = scanner.nextInt();
        scanner.nextLine(); // buffer temizleme

        System.out.print("Kupon kodu(SAVE10, SAVE20, NONE): ");
        String kupon = scanner.nextLine().trim().toUpperCase();

        double urunFiyati = 20.0;
        double indirimliTotal = urunFiyati * miktar;
        double total = urunFiyati * miktar;

        switch (kupon) {
            case "SAVE10":
                indirimliTotal *= 0.9;
                break;
            case "SAVE20":
                indirimliTotal *= 0.7;
                break;
            case "NONE":
                break;
            default:
                System.out.println("Gecersiz kupon girildi");
        }

        if (miktar > 5) {
            indirimliTotal *= 0.95;
        }

        if (product.toLowerCase().contains("sut")){
            System.out.println("Ürün icerisinde laktoz vardir");
        }

        System.out.println("Urun: " + product + " miktar: " + miktar);
        System.out.println("Kupon: " + kupon + " total: " + indirimliTotal);
        System.out.println("Indirim miktari: " + (total- indirimliTotal));

    }
}

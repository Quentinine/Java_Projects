package Gun6;

import java.util.Scanner;

public class deneme {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Lütfen isim soyisim girin: ");
        String name = scanner.nextLine().trim();

        System.out.println("Kişi sayısı: ");
        int count = scanner.nextInt();







    }



}
    /**
     * public static void main(String[] args) {
     * Scanner scanner = new Scanner(System.in);
     * int bakiye = 30;
     * int binis = 12;
     * int sayi = 0;
     * <p>
     * while (bakiye > binis) {
     * bakiye -= binis;
     * sayi++;
     * System.out.println("Kalan bakiye " + bakiye);
     * System.out.println("Binme sayısı: " + sayi);
     * <p>
     * }
     * <p>
     * System.out.println("Bakiye yetersiz.");
     * <p>
     * System.out.println("-----------------2.soru----------------");
     * <p>
     * <p>
     * <p>
     * System.out.println("Lütfen içecek giriniz: ");
     * String drink = scanner.next();
     * <p>
     * System.out.println("Lütfen boy giriniz: ");
     * String size = scanner.next();
     * <p>
     * System.out.println("Kaç şeker: ");
     * int sugar = scanner.nextInt();
     * scanner.nextLine();
     * scanner.close();
     * int price = 0;
     * <p>
     * switch (drink) {
     * case "Kahve":
     * price = 30;
     * break;
     * case "Cay":
     * price = 15;
     * break;
     * case "Su":
     * price = 5;
     * break;
     * }
     * <p>
     * if (size.equalsIgnoreCase("S")) {
     * price += 0;
     * } else if (size.equalsIgnoreCase("M")) {
     * price += 10;
     * } else if (size.equalsIgnoreCase("L")) {
     * price += 20;
     * }
     * <p>
     * System.out.println("Ödemeniz gereken ücret: " + price );
     * }
     * }


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String takip = "";

        while (true) {
            System.out.println("Lütfen takip kodunuzu girin: ");
            takip = scanner.next().trim();
            if (takip.length() == 10) {
                break;
            } else {
                System.out.println("Hatalı giriş yaptınız tekrar deneyin.");
                continue;
            }
        }
        System.out.println("Lütfen teslimat adresi seçiniz:");
        String adres = scanner.next().trim();

        int price = 0;

        switch (adres) {
            case ("Ev"):
                price = 50;
                System.out.println("Taban ücret 50.");
                break;
            case ("Ofis"):
                price = 60;
                System.out.println("Taban ücret 60.");
                break;
            case ("Şube"):
                price = 10;
                System.out.println("Taban ücret 10.");
                break;
            default:
                System.out.println("Hatalı teslimat bölgesi seçtiniz.");
        }

        System.out.println("Mesafe");
        double mesafe = scanner.nextDouble();

        if (mesafe >= 30) {
            price += 30;
            System.out.println("Teslimat mesafesi uzun oldugu için 30 tl ek ücret eklendi.");
        }

        System.out.println(adres + " adresine " + takip + " takip nolu siparişinizin ücreti: " + price);

    }

}
**/


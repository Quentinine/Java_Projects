package Projects.Proje2;

import java.util.ArrayList;
import java.util.Scanner;

public class Soru3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String kahve = "";
        ArrayList<String> cesit = new ArrayList<>();
        cesit.add("turk kahvesi");
        cesit.add("filtre kahve");
        cesit.add("espresso");

        do {
            System.out.println("\"Hangi kahveyi istersiniz?\"\n" +
                    "   - Türk Kahvesi\n" +
                    "   - Filtre Kahve\n" +
                    "   - Espresso");
            kahve = scanner.nextLine().trim().toLowerCase();
            if (!cesit.contains(kahve)) {
                System.out.println("Hatalı giriş yaptınız tekrar deneyin.");
            }
            ;
        }
        while (!cesit.contains(kahve));

        System.out.println(kahve + " hazırlanıyor.");

        String sut = "";

        do {System.out.println("Süt eklememizi ister misiniz? (Evet veya Hayır olarak cevaplayınız):");
            sut = scanner.nextLine().trim().toLowerCase();

            if (sut.equalsIgnoreCase("evet")) {
                System.out.println("Süt ekleniyor...");
            } else if (sut.equalsIgnoreCase("hayır")) {
                System.out.println("Süt eklenmiyor.");
            } else {
                System.out.println("Hatalı giriş yaptınız. Lütfen sadece 'Evet' veya 'Hayır' yazınız.");
            }
        } while (!(sut.equalsIgnoreCase("evet")) && !(sut.equalsIgnoreCase("hayır")));

        String seker = "";
        int kacSeker = 0;

        do {
            System.out.println("Şeker ister misiniz? (Evet veya Hayır olarak cevaplayınız):");
            seker = scanner.nextLine().trim().toLowerCase();

            if (seker.equalsIgnoreCase("evet")) {
                System.out.print("Kaç şeker istersiniz?: ");
                kacSeker = scanner.nextInt();
                scanner.nextLine();
                System.out.println(kacSeker + " şeker ekleniyor.");

            } else if (seker.equalsIgnoreCase("hayır")){
                System.out.println("Şeker eklenmiyor.");
            } else {
                System.out.println("Hatalı giriş yaptınız. Lütfen sadece 'Evet' veya 'Hayır' yazınız.");
            }
        } while (!(seker.equalsIgnoreCase("evet")) && !(seker.equalsIgnoreCase("hayır")));


        String boyut = "";
        do {
            System.out.println("Hangi boyutta istersiniz? (Buyuk - Orta - Kucuk olarak giriniz.) : ");
            boyut = scanner.nextLine().trim().toLowerCase();

            if (boyut.equals("buyuk")) {
                System.out.println("Kahveniz " + boyut + " boyutta hazırlanıyor.");
            } else if (boyut.equals("orta")) {
                System.out.println("Kahveniz " + boyut + " boyutta hazırlanıyor.");
            } else if (boyut.equals("kucuk")) {
                System.out.println("Kahveniz " + boyut + " boyutta hazırlanıyor.");
            } else {
                System.out.println("Hatalı giriş yaptınız. Lütfen Büyük, Orta veya Küçük giriniz.");
            }
        } while (!boyut.equals("buyuk") && !boyut.equals("orta") && !boyut.equals("kucuk"));

        System.out.println("\n--- SİPARİŞİNİZ HAZIR ---");
        System.out.println(kahve + ", " + boyut + " boy, " + "süt: " + sut + ", " + kacSeker + "sekerli" + " hazır. Afiyet olsun!");
    }
}

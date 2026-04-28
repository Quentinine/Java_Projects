package Projects.proje7.soru1;

import java.util.Scanner;

public class Helper {
    static Scanner scan = new Scanner(System.in);

    public static void anaMenu() throws InterruptedException {
        String cvp = "";
        do {
            System.out.println(
                    "\n============= TECHNO STUDY BOOTCAMP =============\n" +
                            "=================== ANA MENU ====================\n" +
                            "\n" +
                            "\t   1- Okul Bilgileri Goruntule\n" +
                            "\t   2- Ogretmen Menu\n" +
                            "\t   3- Ogrenci Menu\t\t \n" +
                            "\t   Q- CIKIS\n");
            System.out.print("Lutfen Menuden tercihinizi yapiniz:");
            cvp = scan.nextLine().toLowerCase();

            switch (cvp) {
                case "1":
                    Helper.okulBilgileriniYazdir();
                    break;
                case "2":
                    OgretmenManager.ogretmenMenu();
                    break;
                case "3":
                    OgrenciManager.ogrenciMenu();
                    break;
                case "q":
                    projeDurdur();
                    break;
                default:
                    System.out.print("Lutfen gecerli bir tercih giriniz:");
            }
        } while (!cvp.equalsIgnoreCase("q"));
    }


    public static void okulBilgileriniYazdir() throws InterruptedException {

        for (int i = 0; i < 20; i++) {
            Thread.sleep(100);
            System.out.print(">");
        }
        System.out.println("Okul:" + Okul.okulIsmi + "\nAdres: " + Okul.adres + "\nTelefon: " + Okul.telefon);
    }

    public static void projeDurdur() {
        System.out.println("Okul projesinden ciktiniz");
        System.exit(0);
    }
}

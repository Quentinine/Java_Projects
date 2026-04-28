package Projects.proje7.soru1;

import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class OgretmenManager extends Veritabani {

    static Scanner scan = new Scanner(System.in);

    public static void ogretmenMenu() throws InterruptedException {
        String cvp = " ";
        do {
            System.out.println("\n============= TECHNO STUDY BOOTCAMP =============\n" +
                    "================= OGRETMEN MENU =================\n" +
                    "\n" +
                    "\t   1- Ogretmenler Listesi Yazdir\t\n" +
                    "\t   2- Soyisimden Ogretmen Bulma\n" +
                    "\t   3- Branstan Ogretmen Bulma\n" +
                    "\t   4- Bilgilerini Girerek Ogretmen Ekleme\n" +
                    "\t   5- Kimlik No Ile Kayit Silme \t\n" +
                    "\t   A- ANAMENU\n" +
                    "\t   Q- CIKIS\n");
            cvp = scan.nextLine().toUpperCase();

            switch (cvp) {
                case "1":
                    ogretmenListesiYazdir();
                    break;
                case "2":
                    soyisimdenOgretmenBulma();
                    break;
                case "3":
                    branstanOgretmenBulma();
                    break;
                case "4":
                    ogretmenEkleme();
                    break;
                case "5":
                    tcNoIleOgretmenSil();
                    break;
                case "A":
                    Helper.anaMenu();
                    break;
                case "Q":
                    Helper.projeDurdur();
                    break;
            }
        } while (!cvp.equalsIgnoreCase("Q"));
    }

    public static void tcNoIleOgretmenSil() throws InterruptedException {
        System.out.println("Silinecek ogretmen kimlik no giriniz");
        String silinecekOgretmen = scan.nextLine();

        String silinecekValue = ogretmenlerMap.get(silinecekOgretmen);
        String sonucValue = ogretmenlerMap.remove(silinecekOgretmen);

        System.out.print(silinecekOgretmen + " Siliniyor...");
        for (int i = 0; i < 20; i++) {
            Thread.sleep(100);
            System.out.print(">");
        }

        try {
            boolean sonuc = sonucValue.equals(silinecekValue);
        } catch (Exception e) {
            System.out.println("Istediginiz Tc numarasi ile ogretmen bulunamadi");
        }
    }

    public static void ogretmenEkleme() {
        System.out.println("Lütfen tc no giriniz");
        String orttc = scan.nextLine();
        System.out.println("Lütfen aralara virgül koyarak isim, soyisim, dogumyılı, ve uzmanlık alanı giriniz: ");
        String info = scan.nextLine();
        ogretmenlerMap.put(orttc, info);
        System.out.println("Ogretmen sisteme eklendi.");
    }

    public static void branstanOgretmenBulma() throws InterruptedException {
        System.out.println("Aradiginiz Ogretmenin Bransini Giriniz:");
        String istenenBrans = scan.nextLine();

        System.out.print(istenenBrans + " Ogretmenleri Listeleniyor...");
        for (int i = 0; i < 20; i++) {
            Thread.sleep(100);
            System.out.print(">");
        }

        Set<Map.Entry<String, String>> ogretmenEntrySet = ogretmenlerMap.entrySet();
        System.out.println(
                "\n============= TECHNO STUDY BOOTCAMP =============\n" +
                        "============BRANS ILE OGRETMEN ARAMA ============\n" +
                        "TcNo : Isim , Soyisim , D.Yili , Brans");

        for (Map.Entry<String, String> each : ogretmenEntrySet) {
            String eachKey = each.getKey();
            String eachValue = each.getValue();

            String[] eachValuarr = eachValue.split(", ");
            if (istenenBrans.equalsIgnoreCase(eachValuarr[3])) {
                System.out.println(eachKey + " : " + eachValue + " | ");
            }
        }
    }

    public static void soyisimdenOgretmenBulma() throws InterruptedException {
        System.out.println("Lütfen aradığınız ögretmenin soyadını girin");
        String soyad = scan.nextLine().trim().toLowerCase();
        int count = 0;
        for (Map.Entry<String, String> entry : ogretmenlerMap.entrySet()) {
            String thevalue = entry.getValue().toLowerCase();
            String[] newlist = thevalue.split(",");
            if (soyad.equalsIgnoreCase(newlist[1].trim())) {
                count++;
                String ogr = newlist[0] + " " + newlist[1];
                System.out.println("Aradığınız öğretmen: " + ogr);
            }
        }
        if (count == 0) {
            System.out.println("Aradığınız soyisimle bir öğretmen sistemde bulunamadı");
        }
    }

    public static void ogretmenListesiYazdir() throws InterruptedException {
        for (Map.Entry<String, String> entry : ogretmenlerMap.entrySet()) {
            int i = 1;
            String thevalue = entry.getValue();
            String[] newlist = thevalue.split(",");
            String ogr = newlist[0] + " " + newlist[1];
            System.out.println(i + ". ogretmen: " + ogr);
            i++;
        }
    }
}
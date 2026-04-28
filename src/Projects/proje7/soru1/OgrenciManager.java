package Projects.proje7.soru1;

import java.util.Map;
import java.util.Scanner;

public class OgrenciManager extends Veritabani {

    static Scanner scan = new Scanner(System.in);

    public static void ogrenciMenu() throws InterruptedException {
        String cvp = " ";
        do {
            System.out.println("\n============= TECHNO STUDY BOOTCAMP =============\n" +
                    "================= OGRETMEN MENU =================\n" +
                    "\n" +
                    "\t   1- Ogrenci Listesi Yazdir\t\n" +
                    "\t   2- Soyisimden Ogrenci Bulma\n" +
                    "\t   3- Sınıf ve sube ile ogrenci bulma\n" +
                    "\t   4- Bilgilerini Girerek Ogrenci Ekleme\n" +
                    "\t   5- Kimlik No Ile Kayit Silme \t\n" +
                    "\t   A- ANAMENU\n" +
                    "\t   Q- CIKIS\n");
            cvp = scan.nextLine().toUpperCase();

            switch (cvp) {
                case "1":
                    ogrenciListesiYazdir();
                    break;
                case "2":
                    soyisimdenOgrenciBulma();
                    break;
                case "3":
                    sinifVeSubeIleOgrenciBulma();
                    break;
                case "4":
                    ogrenciEkleme();
                    break;
                case "5":
                    tcNoIleOgrenciSilme();
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

    private static void tcNoIleOgrenciSilme() throws InterruptedException {
        System.out.println("Silinecek ogrenci kimlik no giriniz");
        String silinecekOgrenci = scan.nextLine();

        String silinecekValue = ogrenciMap.get(silinecekOgrenci);
        String sonucValue = ogrenciMap.remove(silinecekOgrenci);

        System.out.print(silinecekOgrenci + "Siliniyor...");
        for (int i = 0; i < 20; i++) {
            Thread.sleep(100);
            System.out.print(">");
        }
        try {
            boolean sonuc = sonucValue.equals(silinecekValue);
        } catch (Exception e) {
            System.out.println("Istediginiz TC numarasi ile ogrenci bulunamadi");
        }
    }

    public static void ogrenciEkleme() {
        System.out.println("Lütfen tc no giriniz");
        String orttc = scan.nextLine();
        System.out.println("Lütfen aralara virgül koyarak isim, soyisim, dogumyılı, ve uzmanlık alanı giriniz: ");
        String info = scan.nextLine();
        ogrenciMap.put(orttc, info);
        System.out.println("Ogrenci sisteme eklendi.");
    }

    private static void sinifVeSubeIleOgrenciBulma() throws InterruptedException {
        System.out.println("Lütfen sınıf girin: ");
        String csinif = scan.nextLine().trim().toLowerCase();
        System.out.println("Lütfen sube girin: ");
        String csube = scan.nextLine().trim().toLowerCase();
        int count = 0;
        for (Map.Entry<String, String> entry : ogrenciMap.entrySet()) {
            String thevalue = entry.getValue().toLowerCase();
            String[] thelist = thevalue.split(",");
            String sinif = thelist[4].trim();
            String sube = thelist[5].trim();
            if (csinif.equalsIgnoreCase(sinif) && csube.equalsIgnoreCase(sube)) {
                count++;
                System.out.println("Aradığınız ögrenci: " + thelist[0] + thelist[1]);
            }
            ;
        }
        if (count == 0) {
            System.out.println("Kriterleri saglayan ogrencş bulunamadı.");
        }
    }

    public static void soyisimdenOgrenciBulma() throws InterruptedException {
        System.out.println("Lütfen aradığınız ögrencinin soyadını girin");
        String soyad = scan.nextLine().trim().toLowerCase();
        int count = 0;
        for (Map.Entry<String, String> entry : ogrenciMap.entrySet()) {
            String thevalue = entry.getValue().toLowerCase();
            String[] newlist = thevalue.split(",");
            if (soyad.equalsIgnoreCase(newlist[1].trim())) {
                count++;
                String ogr = newlist[0] + " " + newlist[1];
                System.out.println("Aradığınız öğrenci: " + ogr);
            }
        }
        if (count == 0) {
            System.out.println("Aradığınız soyisimle bir öğrenci sistemde bulunamadı");
        }
    }

    public static void ogrenciListesiYazdir() throws InterruptedException {
        int i = 0;
        for (Map.Entry<String, String> entry : ogrenciMap.entrySet()) {
            i++;
            String thevalue = entry.getValue();
            String[] newlist = thevalue.split(",");
            String ogr = newlist[0] + " " + newlist[1];
            System.out.println(i + ". ogrenci: " + ogr);
        }
    }
}

package odev26_2;

import java.util.Scanner;

public class Soru10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] bakimKalemleri = new String[8];
        String[] bakimTarihleri = new String[8];
        int rakamliBakimSayisi = 0;

        for (int i = 0; i < 8; i++) {
            System.out.print((i + 1) + ". Bakım kaleminin adını girin: ");
            bakimKalemleri[i] = scanner.nextLine();

            boolean formatDogru = false;
            while (!formatDogru) {
                System.out.print(bakimKalemleri[i] + " için son bakım tarihi (GG/AA/YYYY): ");
                String tarih = scanner.nextLine();

                if (tarih.length() == 10 && tarih.contains("/")) {
                    bakimTarihleri[i] = tarih;
                    formatDogru = true;
                } else {
                    System.out.println("Geçersiz! Lütfen 10 karakterli ve '/' içeren bir tarih girin.");
                }
            }
        }

        System.out.println("Bakım türünü seçin: acil, normal, kontrol");
        String tur = scanner.nextLine().trim().toLowerCase();

        switch (tur) {
            case "acil":
                System.out.println("UYARI: Güvenlik riski bulunabilir.");
                break;
            case "normal":
                System.out.println("BİLGİ: Rutin bakım planlamanızı 1 hafta içinde yapın.");
                break;
            case "kontrol":
                System.out.println("BİLGİ: kontrollerinizi periyodik olarak devam ettirin.");
                break;
            default:
                System.out.println("Geçersiz tür.");
        }

        for (String kalem : bakimKalemleri) {
            boolean rakamVarMi = false;
            for (int j = 0; j < kalem.length(); j++) {
                if (Character.isDigit(kalem.charAt(j))) {
                    rakamVarMi = true;
                    break;
                }
            }
            if (rakamVarMi) {
                rakamliBakimSayisi++;
            }
        }

        System.out.println("İçinde rakam geçen bakım kalemi sayısı: " + rakamliBakimSayisi);
        if (rakamliBakimSayisi > 0) {
            System.out.println("Durum: Özel numaralı/kodlu bakım kayıtları mevcut.");
        }
    }
}
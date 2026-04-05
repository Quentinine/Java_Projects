package odev26_2;

import java.util.Scanner;

public class Soru4 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        int siparisSayisi = 5;
        String[] icecekler = new String[siparisSayisi];
        String[] boylar = new String[siparisSayisi];
        double[] fiyatlar = new double[siparisSayisi];

        int sekerliSayaci = 0;
        double toplamCiro = 0;

        for (int i = 0; i < siparisSayisi; i++) {
            System.out.println("\n--- " + (i + 1) + ". Sipariş ---");

            System.out.print("İçecek adını giriniz (ör: Şekerli Kahve, Çay): ");
            icecekler[i] = scanner.nextLine().trim().toLowerCase();

            if (icecekler[i].contains("şekerli")) {
                sekerliSayaci++;
            }

            System.out.print("Boy seçiniz (S / M / L): ");
            boylar[i] = scanner.nextLine().trim().toUpperCase();

            double tabanFiyat = 0;
            if (icecekler[i].contains("kahve")) {
                tabanFiyat = 50.0;
            } else if (icecekler[i].contains("çay")) {
                tabanFiyat = 25.0;
            } else if (icecekler[i].contains("limonata")) {
                tabanFiyat = 40.0;
            } else {
                tabanFiyat = 30.0;
            }

            double carpan = 1.0;
            switch (boylar[i]) {
                case "S":
                    carpan = 1.0;
                    break;
                case "M":
                    carpan = 1.2;
                    break;
                case "L":
                    carpan = 1.5;
                    break;
                default:
                    System.out.println("Geçersiz boy! Standart (S) fiyatı uygulandı.");
                    boylar[i] = "S";
                    break;
            }

            fiyatlar[i] = tabanFiyat * carpan;
            toplamCiro += fiyatlar[i];

            System.out.println("Bu siparişin tutarı: " + fiyatlar[i] + " TL");
        }

        System.out.println("\n========= GÜN SONU RAPORU =========");
        for (int i = 0; i < siparisSayisi; i++) {
            System.out.println((i + 1) + ". " + icecekler[i] + " (" + boylar[i] + ") -> " + fiyatlar[i] + " TL");
        }

        System.out.println("Toplam Şekerli İçecek Sayısı: " + sekerliSayaci);
        System.out.println("Toplam Günlük Ciro: " + toplamCiro + " TL");

        scanner.close();
    }
}


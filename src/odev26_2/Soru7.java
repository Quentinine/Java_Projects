package odev26_2;

import java.util.Scanner;

public class Soru7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Kaç adet bilet almak istiyorsunuz? ");
        int biletSayisi = scanner.nextInt();
        scanner.nextLine();

        String[] filmler = new String[biletSayisi];
        double toplamCiro = 0;

        System.out.print("Salon türünü seçin (2D, 3D, IMAX): ");
        String salon = scanner.nextLine().toLowerCase().trim();

        double tabanFiyat = 0;
        switch (salon) {
            case "2d":
                tabanFiyat = 100.0;
                break;
            case "3d":
                tabanFiyat = 150.0;
                break;
            case "imax":
                tabanFiyat = 250.0;
                break;
            default:
                System.out.println("Geçersiz tür! Standart 2D fiyatı uygulandı.");
                tabanFiyat = 100.0;
        }

        for (int i = 0; i < biletSayisi; i++) {
            System.out.println("\n--- " + (i + 1) + ". Bilet ---");
            System.out.print("Film adı: ");
            filmler[i] = scanner.nextLine().trim().toLowerCase();

            System.out.print("Yaş grubu (çocuk, öğrenci, yetişkin, 65+): ");
            String yasGrubu = scanner.nextLine().toLowerCase().trim();

            double indirimOrani = 1.0;
            switch (yasGrubu) {
                case "çocuk":
                    indirimOrani = 0.5;
                    break;
                case "öğrenci":
                    indirimOrani = 0.8;
                    break;
                case "65+":
                    indirimOrani = 0.7;
                    break;
                case "yetişkin":
                    indirimOrani = 1.0;
                    break;
                default:
                    System.out.println("Tanımsız grup, tam ücret uygulandı.");
            }

            double biletFiyati = tabanFiyat * indirimOrani;
            toplamCiro += biletFiyati;
            System.out.println("Bu biletin fiyatı: " + biletFiyati + " TL");
        }
        System.out.println("GÜNLÜK SATIŞ RAPORU");

        boolean[] sayildiMi = new boolean[biletSayisi];


        for (int i = 0; i < biletSayisi; i++) {
            if (!sayildiMi[i]) {
                int sayac = 1;
                for (int j = i + 1; j < biletSayisi; j++) {
                    if (filmler[i].equals(filmler[j])) {
                        sayac++;
                        sayildiMi[j] = true;
                    }
                }
                System.out.println("- " + filmler[i].toUpperCase() + ": " + sayac + " bilet");
            }
        }

        System.out.println("Toplam Toplanan Ciro: " + toplamCiro + " TL");

        scanner.close();
    }
}
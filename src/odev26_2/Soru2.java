package odev26_2;

import java.util.Scanner;
import java.util.Arrays;

public class Soru2 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        int[] liste = new int[7];

        for (int i = 0; i < liste.length; i++) {
            System.out.print("lütfen biniş sayısını giriniz: ");
            liste[i] = scanner.nextInt();
            scanner.nextLine();
            System.out.println();
        }

        System.out.print("Lütfen kart türünü girin: ");
        String tur = scanner.nextLine().trim().toLowerCase();
        System.out.println();

        int binis = 0;

        switch (tur) {
            case "ogrenci":
                binis = 10;
                break;
            case "tam":
                binis = 25;
                break;
            case "indirimli":
                binis = 17;
                break;
        }

        System.out.print("Bakiyenizi giriniz: ");
        int bakiye = scanner.nextInt();
        scanner.nextLine();

        int toplam = 0;

        for (int i = 0; i < liste.length; i++) {
            toplam = toplam + liste[i];

        }

        int harcama = toplam * binis;
        System.out.println("Toplam harcama: " + harcama);
        int fark = harcama - bakiye;

        if (harcama > bakiye) {
            System.out.print("Yetersiz bakiye, " + fark + " tl eksik.");

        } else if (bakiye > harcama) {
            System.out.print("Kalan bakiye, " + fark);

        }

        String[] gunler = {"pazartesi", "salı", "carsamba", "persembe", "cuma", "cumartesi", "pazar"};

        int max = 0;
        int index = 0;
        for (int i = 0; i < liste.length; i++) {
            if (liste[i] > max) {
                max = liste[i];
                index = i;
            }
        }
        System.out.println("En cok biniş yapılan gün: " + gunler[index]);
        System.out.println("Binis sayısı: " + max);


    }
}
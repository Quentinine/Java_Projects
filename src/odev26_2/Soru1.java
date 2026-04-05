package odev26_2;

import java.util.Scanner;
import java.util.Arrays;

public class Soru1 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        /**listedeki ürünlerin kaç tanesinde rakam geçtiğini sayıp ekrana yazdır.**/
        System.out.println("Lütfen urun sayisini giriniz.");
        int num = scanner.nextInt();
        scanner.nextLine();
        String[] liste = new String[num];

        for (int i = 0; i < num; i++) {
            String urun = "";
            System.out.println("lütfen ürün giriniz: ");
            urun = scanner.nextLine().trim().toLowerCase();
            ;
            liste[i] = urun;
        }
        System.out.print("Alışveriş listeniz: ");
        System.out.println(Arrays.toString(liste));

        String[] cat = new String[num];

        for (int i = 0; i < num; i++) {
            switch (liste[i]) {
                case "5cilek":
                    cat[i] = "meyve";
                    break;
                case "ispanak":
                    cat[i] = "sebze";
                    break;
                case "2cips":
                    cat[i] = "snack";
                    break;
                case "ayran":
                    cat[i] = "drink";
                    break;
            }
        }

        System.out.print("Kategoriler: ");
        System.out.println(Arrays.toString(cat));

        int rak = 0;

        for (int i = 0; i < liste.length; i++) {
            for (int j = 0; j < liste[i].length(); j++) {
                char karakter = liste[i].charAt(j);
                if (karakter >= '0' && karakter <= '9') {
                    rak++;
                }
            }
        }
        System.out.print("Sayı içeren ürün sayısı: ");
        System.out.println(rak);
    }
}

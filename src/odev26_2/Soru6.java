package odev26_2;

import java.util.Scanner;
import java.util.Arrays;

public class Soru6 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double[] kullanim = new double[12];
        String tarife = "";
        double tuketim = 0.0;
        double ucret = 0.0;
        double toplam = 0.0;
        double[] total = new double[12];

        String[] aylar = {"Ocak", "Subat", "Mart", "Nisan", "Mayis", "Haziran", "Temmuz", "Agustos", "Eylul", "Ekim", "Kasim", "Aralik"};


        for (int i = 0; i < kullanim.length; i++) {
            System.out.println("Lutfen " + (i + 1) + ". ayin tuketimini girin: ");
            kullanim[i] = scanner.nextDouble();
            scanner.nextLine();
            System.out.println();
            System.out.println("Lutfen tuketim tarifesini secin: 1. gunduz 2. gece 3.karma");
            tarife = scanner.nextLine().trim().toLowerCase();

            switch (tarife) {
                case "gunduz":
                    tuketim = 10.0;
                    break;
                case "gece":
                    tuketim = 5.0;
                    break;
                case "karma":
                    tuketim = 7.5;
                    break;
            }

            total[i] = tuketim * kullanim[i];


        }
        System.out.println(Arrays.toString(total));

        double top = 0.0;
        for (int i = 0; i < 12; i++) {
            top += total[i];
        }
        double ort = top / 12;

        int ortustu = 0;

        for (int i = 0; i < 12; i++) {
            if (total[i] > ort) {
                ortustu++;
                System.out.println(aylar[i] + "ayında ortalam üstü harcama yapılmış.");
            }
        }
        System.out.print("ortalama ustu harcama yapilan aylarin sayisi: ");
        System.out.println(ortustu);


        scanner.close();
    }
}

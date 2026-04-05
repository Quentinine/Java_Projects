package odev26_2;

import java.util.Scanner;
import java.util.Arrays;

public class Soru5 {
    public static void main(String args[]) {

        Scanner scanner = new Scanner(System.in);
        int[] inte = new int[6];

        System.out.println("Lütfen internet kullanımlarınızı girin: ");
        for (int i = 0; i < inte.length; i++) {
            System.out.print(i + 1 + ". ");
            inte[i] = scanner.nextInt();
            scanner.nextLine();
            System.out.println();

        }
        System.out.println(Arrays.toString(inte));
        System.out.print("Lütfen paket tipinizi girin: ");
        String paket = scanner.nextLine();
        System.out.println();

        int kota = 0;
        switch (paket) {
            case "mini":
                kota = 30;
                break;
            case "standart":
                kota = 50;
                break;
            case "premium":
                kota = 70;
                break;
        }

        int fark = 0;
        for (int i = 0; i < 6; i++) {
            fark = kota - inte[i];
            if (fark >= 0) {
                System.out.println(i + 1 + ".Ay için kalan kullanımınız: " + fark);
            } else {
                System.out.println(i + 1 + ".Ay için Kotayı aştınız.");
            }
        }

        int max = 0;
        int en = 0;
        for (int i = 0; i < 6; i++) {
            if (max < inte[i]) {
                max = inte[i];
                en = i + 1;
            }
        }

        System.out.println("En cok aşım yaptığınız ay: " + en);
        System.out.println("aşım: " + max);

        String muno = "";
        do {
            System.out.println("Lütfen müşteri numaranızı girin: ");
            muno = scanner.nextLine();
            if (muno.length() != 11) {
                System.out.println("Yanlış giriş yaptınız tekrar deneyin.");
            }
        }
        while (muno.length() != 11);

        int rakam = 0;
        for (int i = 0; i < muno.length(); i++) {
            if (muno.charAt(i) >= '0' && muno.charAt(i) <= '9') {
                rakam++;

            }
        }
        System.out.println("müşteri no içindeki rakam sayısı: " + rakam);
        scanner.close();
    }
}
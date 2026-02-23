package Gun7;

import java.util.Scanner;

public class Asansor {
    public static void main(String[] args) {
        /**
         * Bulunduğun kat 1, hedef kat kullanıcıdan alicaz.
         * 1’er 1’er artsın ve her adımda “X. kattasın” yazsın.
         * */

        Scanner scanner = new Scanner(System.in);

        int kat = 1;
        System.out.print("Hedef kat: ");
        int hedef = scanner.nextInt();

        while (kat < hedef) {
            kat++;
            System.out.println(kat + " .kattasin");
        }

        System.out.println("Hedef kata ulastin");
    }
}

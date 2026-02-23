package Gun7;

import java.util.Scanner;

public class DoWhileLoop {
    public static void main(String[] args) {
        /**
         * do {
         *     // tekrar eden kod
         * } while(kosul);
         *
         * Bu kullanimin while den farki kosul saglanmasa dahi kod bir defa calisir.
         * Menu sistemleri buna örnek
         * Önce dene sonra karar ver devam edip etmeyecegine
         * */

        int i = 1;

        do {
            System.out.println(i);
            i++;
        } while (i < 5);

        System.out.println("--------------");
        Scanner scanner = new Scanner(System.in);
        int secim;

        do {
            System.out.println("1 - Bakiye gör");
            System.out.println("2 - Para yatir");
            System.out.println("3 - Cikis");
            System.out.print("Secim: ");
            secim = scanner.nextInt();
        } while (secim != 3);

        System.out.println("Program sonlandi");

        System.out.println("----------");

        int x = 10;
        // while hic calismaz, do-while 1 kere calisir
        while (x<5) {
            System.out.println("While calisti");
        }

        do {
            System.out.println("do while calisti");
        } while (x<5);
    }
}

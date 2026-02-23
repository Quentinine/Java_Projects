package Gun7;

import java.util.Scanner;

public class Tekrar {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        /**int kat = 0;
         System.out.println("Lütfen kat girin: ");
         int hedef = scanner.nextInt();

         do {System.out.println("Şu anda " + kat + " nolu kattasınız.");
         kat++;
         }
         while (kat <= hedef);
         System.out.println("Hedefinize ulaştınız.");
         **/

        String eposta;

        do {
            System.out.println("Lütfen eposta girin: ");
            eposta = scanner.next().trim().toLowerCase();

            // Koşul sağlanmıyorsa hata mesajını burada veriyoruz
            if (!(eposta.contains("@") && eposta.endsWith(".com"))) {
                System.out.println("Hatalı giriş yaptınız tekrar deneyin.");
            }

        } while (!(eposta.contains("@") && eposta.endsWith(".com")));


    }
}

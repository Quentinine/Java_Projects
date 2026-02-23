package Gun7;

import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {
        /**
         * kosul true oldugu sürece döngü calismaya devam
         * while (kosul) {
         *     // tekrar edecek kod blogu
         * }
         * */

        int i = 1;

        while (i < 5) {
            System.out.println(i);
            i++;
        }

        Scanner scanner = new Scanner(System.in);

        String password = "1234";
        System.out.print("Sifre girin: ");
        String input = scanner.nextLine().trim();

        while (!input.equals(password)) {
            // kullanicinin girdigi sifre hatali oldugu sürece
            // bu kod blogunu calistir
            System.out.println("Girilen sifre hatali, tekrar dene");
            System.out.print("Sifre girin: ");
            input = scanner.nextLine().trim();
        }

        System.out.println("Giris basarili");
    }
}

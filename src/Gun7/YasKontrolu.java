package Gun7;

import java.util.Scanner;

public class YasKontrolu {
    public static void main(String[] args) {
        /**
         * Kullanıcı adı alın. Boşlukları temizleyin.
         * En az 3 karakter değilse tekrar isteyin.
         * Yaş alın. Yaş 18’den küçükse izleyemez,
         * değilse izleyebilir yazdırın.
         * */

        Scanner scanner = new Scanner(System.in);

        String username;

        while (true) {

            System.out.print("Kullanici ismi girin: ");
            username = scanner.nextLine().trim();

            if (username.length() < 3) {
                System.out.println("Hatali giris yapildi");
            } else {
                break; // cünkü kullanici dogru giris yapmis demektir
            }
        }

        System.out.print("Yasinizi girin: ");
        int yas = scanner.nextInt();

        if (yas < 18) {
            System.out.println(username + " -> izleyemez");
        } else {
            System.out.println(username + " -> izleyebilir");
        }
    }
}

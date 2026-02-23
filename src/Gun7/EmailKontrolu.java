package Gun7;

import java.util.Scanner;

public class EmailKontrolu {
    public static void main(String[] args) {
        /**
         * E-posta alın. Boşlukları temizleyip küçük harfe çevirin.
         * “@” içermeli, “.com” ile bitmeli ve
         * “@” işareti ilk karakter olamaz.
         * Doğru girilene kadar devam edin.
         * */

        Scanner scanner = new Scanner(System.in);

        String mail;

        while (true) {

            System.out.print("Email girin: ");
            mail = scanner.nextLine().trim().toLowerCase();

            int atIndex = mail.indexOf("@");

            if (atIndex <= 0) {
                System.out.println("@ isareti ile mail baslayamaz ve mail @ isareti icermeli");
                continue;
            }

            if (!mail.contains("@") && !mail.endsWith(".com")) {
                System.out.println("Email adresi @ isareti icermeli ve .com ile bitmeli");
                continue; // kodu buradan tekrar yukari gönderir.
            }

            System.out.println("Mail adresi dogru girildi: " + mail);
            break; // mail adresi dogru yazildigi icin döngüyü bu komut ile durdurduk.
        }
    }
}

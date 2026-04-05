package Projects.Proje2;

import java.util.Scanner;

public class Soru1 {
    public static void main(String[] args) {
        System.out.println("Üye ol");
        Scanner scanner = new Scanner(System.in);

        String login = "";
        String password = "";
        String dogrulama = "";


        while (true) {
            System.out.print("Lütfen bir kullanıcı adı belirleyin: ");
            login = scanner.nextLine();
            if (login.isEmpty() || login.isBlank()) {
                System.out.println("Kullanıcı adı boş olamaz.");
                continue;
            }
            break;
        }

        while (true) {
            System.out.println("Lütfen bir şifre belirleyin:");
            password = scanner.nextLine();
            if (password.isEmpty() || password.isBlank()) {
                System.out.println("Şifre boş olamaz.");
                continue;
            }
            break;
        }
        while (true) {
            System.out.println("Lütfen şifrenizi tekrar girin: ");
            dogrulama = scanner.nextLine();
            if (!password.equals(dogrulama)) {
                System.out.println("Şifreleriniz birbiri ile uyuşmuyor tekrar deneyin.");
                continue;
            }
            break;
        }
        System.out.println("Giriş yap");

        while (true) {
            System.out.print("Lütfen kullanıcı adınızı girin: ");
            String i = scanner.nextLine();
            if (!login.equals(i)) {
                System.out.println("Kullanıcı adı yanlış.");
                continue;
            }
            break;
        }

        int hak = 3;
        while (hak > 0) {
            System.out.print("Şifrenizi girin: ");
            String inputPass = scanner.nextLine();

            if (password.equals(inputPass)) {
                System.out.println("Giriş başarılı.");
                break;
            } else {
                hak--;
                if (hak == 0) {
                    System.out.println("Giriş engellendi.");
                } else {
                    System.out.println("Şifre yanlış. Kalan hakkınız: " + hak);
                }
            }
        }
    }

}

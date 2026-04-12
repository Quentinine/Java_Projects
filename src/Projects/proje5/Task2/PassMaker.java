package Projects.proje5.Task2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PassMaker {
    Scanner sc = new Scanner(System.in);
    String secim;
    private String password;
    private String hesap;
    private String login;
    Boolean exit = false;
    private Map<String, Map<String, String>> hesapMap = new HashMap<>();

    public void check() {
        while (!exit) {
            System.out.println("--- PROGRAMA HOŞ GELDINIZ ---");
            System.out.println("Yapmak istediğiniz işlemi seçin.");
            System.out.println("1 - Şifre ekle.");
            System.out.println("2 - Şifre göster.");
            System.out.println("3 - Cikis");
            secim = sc.nextLine();

            switch (secim) {
                case "1":
                    System.out.println("Hesap adı: ");
                    hesap = sc.nextLine().trim();
                    System.out.println("Kullanıcı adı: ");
                    login = sc.nextLine().trim();
                    System.out.println("Şife: ");
                    password = sc.nextLine().trim();
                    hesapMap.put(hesap, new HashMap<>());
                    hesapMap.get(hesap).put(login, password);
                    System.out.println("Bilgiler sisteme kayıt edildi.");
                    break;
                case "2":
                    System.out.println("Hesap adını girin.");
                    String hControl = sc.nextLine();

                    if (hesapMap.containsKey(hControl)) {
                        System.out.println("Şifreniz: ");
                        System.out.println(hesapMap.get(hControl));
                    } else
                        System.out.println("Sistemde bu hesap için kayıt bulunamadı.");
                    break;
                case "3":
                    exit = true;
                    System.out.println("Sistemden cıkıs yapıldı.");
                    break;
            }
        }
    }
}


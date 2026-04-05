package Projects.Proje3;

import java.util.Scanner;

public class soru2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String kelime = scanner.nextLine();
        kelime = Polindrom(kelime);
    }

    public static String Polindrom(String kelime) {
        int len = kelime.length() / 2;
        for (int i = 0; i <= len; i++) {
            if (kelime.charAt(i) == kelime.charAt(kelime.length() - 1 - i)) {
                if (i == len) {
                    System.out.println("Kelimeniz vir Polindrom kelimedir!!");
                }
                continue;
            } else {
                System.out.println("Kelimeniz bir Palindrom kelime değil.");
                break;}
        }
        return kelime;
    }
}

package Gun15;

import java.util.Scanner;
import java.util.ArrayList;

import static java.lang.IO.println;

public class AlisverisSepeti {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /*** Sepetteki ürünleri sira numarisi ile yazdirin.
         * Kullanicinin girdigi bir ürün ün adini aratin:
         * varsa kacinci sirada oldugunu yazdirin, yoksa bulunamadi yazdirin.*/

        ArrayList<String> alisveris = new ArrayList<>();

        while (true) {
            System.out.println("Lütfen alisveris listenizi girin, cıkmak icin \"Bitti\" yazın.");
            String urun = scanner.nextLine();

            if (urun.equalsIgnoreCase("Bitti")) {
                break;
            }
            if (urun.isEmpty()) {
                System.out.println("boş ürün girilemez.");
                continue;
            }
            alisveris.add(urun);
        }

        for (int i = 0; i < alisveris.size(); i++) {
            System.out.println((i + 1) + ". ürün: " + alisveris.get(i));
        }

        System.out.print("Aramak istediginiz ürün adini girin: ");
        String aranan = scanner.nextLine().trim();

        int index = -1;

        for (int i = 0; i < alisveris.size(); i++) {

            if (index == -1) {
                System.out.println("Ürün bulunamadi");
            } else {
                System.out.println("ürün bulundu. Sirasi -> " + (index + 1));


            }

        }}}


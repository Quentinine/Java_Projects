package Odevmar_30;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * Tekrar eden ürünleri ayıklayınız.
 * Son durumda listedeki ürünleri ekrana yazdırınız
 */
public class Soru2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> basket = new ArrayList<>();
        String item = "";

        do {
            System.out.println("Lütfen ürün girin, cıkıs yapmak için cikis yazın.");
            item = scanner.nextLine();
            if (item.equalsIgnoreCase("cikis")) {
                System.out.println("Alışveriş tamamlandı.");
            } else if (!item.isEmpty()) {
                basket.add(item);
            }
        } while (!item.equalsIgnoreCase("cikis"));

        Set<String> qbasket = new HashSet<>(basket);
        System.out.println(qbasket);
        System.out.println(qbasket.size());


    }
}

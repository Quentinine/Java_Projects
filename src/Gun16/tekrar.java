package Gun16;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class tekrar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /*** Kullanicidan bir cümle alin.
         * Bu cümleyi kelimelerine ayirin.
         * Kelimeleri kaydedin ama tekrar eden kelimeleri kaydetmeyin.
         * Tüm benzersiz kelimeleri yazdirin.
         * Kac tane farkli kelime oldugunu bulun.* */

        Set<String> sepet = new HashSet<>();
        System.out.println("Lütfen bir cümle girin: ");
        String cumle = scanner.nextLine();
        String[] kelimeler= cumle.split(" ");
        System.out.println(Arrays.toString(kelimeler));

        for (String kelime: kelimeler){
            sepet.add(kelime);
        }
        System.out.println(sepet);
        System.out.println(sepet.size());


    }
}

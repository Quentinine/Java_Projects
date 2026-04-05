package Odevmar_30;

import java.util.*;

/**
 * Cümledeki kelimeleri ayırınız ve her kelimenin kaç kez geçtiğini bulunuz.
 * Sonucu örnek olarak şu şekilde yazdırınız: elma = 2, armut = 1
 */
public class Soru3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Integer> sep = new HashMap<>();
        String cumle = "";

        System.out.print("Cümle girin: ");
        cumle = scanner.nextLine();
        System.out.println();

        String[] words = cumle.split(" ");

        Set<String> qwords = new HashSet<>(Arrays.asList(words));
        System.out.println("benzersiz kelimeler: " + qwords);

        for (String word : words) {
            if (!sep.containsKey(word)) {
                sep.put(word, 1);
            } else {
                sep.put(word, sep.get(word) + 1);
            }
        }
        for (Map.Entry<String, Integer> yazdir : sep.entrySet()) {
            System.out.println(yazdir.getKey() + " kelimesinden " + yazdir.getValue() + " tane var.");
        }


    }
}

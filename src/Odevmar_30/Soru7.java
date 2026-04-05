package Odevmar_30;

import java.util.*;

public class Soru7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen bir paragraf giriniz:");
        String cumle = scanner.nextLine();

        // 1. Temizlik: Noktalama işaretlerini kaldır ve küçük harfe çevir
        // [^a-zA-ZçğıöşüÇĞİÖŞÜ ] ifadesi harf ve boşluk dışındaki her şeyi siler
        String temizCumle = cumle.replaceAll("[\\p{Punct}]", "").toLowerCase();

        // 2. Kelimelere ayır
        String[] kelimeDizisi = temizCumle.split("\\s+");

        // 3. Kelime sayımı için Map kullanıyoruz (Kelime -> Sayı)
        HashMap<String, Integer> kelimeSayilari = new HashMap<>();

        for (String kelime : kelimeDizisi) {
            if (kelime.length() > 3) {
                kelimeSayilari.put(kelime, kelimeSayilari.getOrDefault(kelime, 0) + 1);
            }
        }

        // 4. 3 harften uzun olanları listele
        System.out.println("\n--- 3 Harften Uzun Kelimeler ve Frekansları ---");
        kelimeSayilari.forEach((k, v) -> System.out.println(k + ": " + v));

        // 5. En çok tekrar eden 3 kelimeyi bulma
        List<Map.Entry<String, Integer>> liste = new ArrayList<>(kelimeSayilari.entrySet());
        liste.sort((a, b) -> b.getValue().compareTo(a.getValue())); // Büyükten küçüğe sırala

        System.out.println("\n--- En Çok Tekrar Eden 3 Kelime ---");
        for (int i = 0; i < Math.min(3, liste.size()); i++) {
            System.out.println((i + 1) + ". " + liste.get(i).getKey() + " (" + liste.get(i).getValue() + " kez)");
        }
    }
}
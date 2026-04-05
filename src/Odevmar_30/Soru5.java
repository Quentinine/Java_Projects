import java.util.Scanner;
import java.util.ArrayList;
import java.util.Set;
import java.util.HashSet;
import java.util.HashMap;
import java.util.Map;

public class Soru5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> notlar = new ArrayList<>();
        int not = 0;

        do {
            System.out.println("Lütfen notları girin, cikis yapmak için \"-1\" yazın.");
            not = scanner.nextInt();
            scanner.nextLine();
            if (not == -1) {
                System.out.println("Not girişi tamamlandı.");
            } else {
                notlar.add(not);
            }
        }
        while (not != -1);
        System.out.println(notlar);
        Set<Integer> qnotlar = new HashSet<>(notlar);
        System.out.println(qnotlar);
        Map<Integer, Integer> sayi = new HashMap<>();

        for (Integer i : qnotlar) {
            sayi.put(i, 0);
        }

        System.out.println(sayi);

        for (Integer i : notlar) {
            if (sayi.containsKey(i)) {
                sayi.put(i, sayi.get(i) + 1);
            }
        }
        System.out.println(sayi);

    }
}
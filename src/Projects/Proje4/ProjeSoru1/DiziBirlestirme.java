package Projects.Proje4.ProjeSoru1;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class DiziBirlestirme {
    static Set<Integer> set1 = new HashSet<>();
    static Set<Integer> set2 = new HashSet<>();
    Scanner sc = new Scanner(System.in);
    int eleman;

    public void DiziGiris() {
        for (int i = 0; i < 2; i++) {
            System.out.println((i + 1) + ". setin elemanlarını girin (Bitirmek için -1):");

            while (true) {
                int eleman = sc.nextInt();

                if (eleman == -1) {
                    break;
                }

                if (i == 0) {
                    set1.add(eleman);
                } else {
                    set2.add(eleman);
                }
            }
        }

        System.out.println("1. Set: " + set1);
        System.out.println("2. Set: " + set2);
    }


    public Set<Integer> Dizi() {
        Set<Integer> birlesikSet = new HashSet<>(set1);
        birlesikSet.addAll(set2);
        System.out.println(birlesikSet);
        return birlesikSet;
    }


}
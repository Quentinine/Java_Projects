package Gun14;

import java.util.Scanner;
import java.util.ArrayList;

public class ArrayListt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> notlar = new ArrayList<>();
        notlar.add(3);
        notlar.add(10);
        notlar.add(100);
        notlar.add(24);

        System.out.println("eleman sayısı: " + notlar.size());
        notlar.add(67);
        System.out.println("eleman sayısı: " + notlar.size());

        System.out.println(notlar.get(1));
        notlar.add(3,5);
        notlar.set(1,89);
        System.out.println(notlar);
        notlar.remove(0);
        System.out.println(notlar);







    }
}

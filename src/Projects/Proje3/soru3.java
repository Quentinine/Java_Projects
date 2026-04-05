package Projects.Proje3;

import java.util.ArrayList;
import java.util.Scanner;

public class soru3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> thelist = new ArrayList<>();
        thelist.add(1);
        thelist.add(1);
        System.out.println("Lütfen Pascal üçgeni için satır sayısını girin: ");
        int satir = scanner.nextInt();
        scanner.nextLine();

        int[][] pascal = new int[satir][satir];
        pascal[0][0] = 1;
        System.out.println();

        for (int i = 0; i < satir; i++) { // 0'dan başlattık ki ilk satırı da görelim
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    pascal[i][j] = 1;
                } else {
                    pascal[i][j] = pascal[i - 1][j] + pascal[i - 1][j - 1];
                }
                System.out.print(pascal[i][j] + " ");
            }
            System.out.println();
        }
    }


}

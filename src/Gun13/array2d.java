package Gun13;

import java.util.Scanner;
import java.util.Arrays;


public class array2d {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String[][] array2d = new String[5][5];

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.println("Not gir: ");
                array2d[i][j] = scanner.nextLine();
            }
        }
        System.out.println(Arrays.deepToString(array2d));

    }
}

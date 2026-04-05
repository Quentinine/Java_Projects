package Projects.Proje1;

import java.util.Scanner;

public class ProjeSuyunHalleri {

    static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


int suyunHali = scanner.nextInt();

if (suyunHali <= 0) {
System.out.println("Suyun katı hali");
} else if (suyunHali >= 100) {
    System.out.println("Suyun gaz hali");
} else {
System.out.println("Suyun sıvı hali");
}

scanner.close();






    }
}

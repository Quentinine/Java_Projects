package Projects.Proje1;

import java.util.Scanner;

public class proje1deprem {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        System.out.println("Lütfen depremin büyüklüğünü girin: ");
        double magnitude = scanner.nextDouble();
        scanner.nextLine();


        double siddet = 0;

        if (magnitude < 2.0) {
            System.out.println("Micro");
        } else if (magnitude >= 2 && magnitude < 3) {
            System.out.println("Very minor");
        } else if (magnitude >= 3 && magnitude < 4) {
            System.out.println("Minor");
        } else if (magnitude >= 4 && magnitude < 5) {
            System.out.println("Light");
        } else if (magnitude >= 5 && magnitude < 6) {
            System.out.println("Moderate");
        } else if (magnitude >= 6 && magnitude < 7) {
            System.out.println("Strong");
        } else if (magnitude >= 7 && magnitude < 8) {
            System.out.println("Major");
        } else if (magnitude >= 8 && magnitude < 9) {
            System.out.println("Great");
        } else if (magnitude >= 9 && magnitude < 10) {
            System.out.println("Meteoric");
        } else {
            System.out.println("Error !!");
        }


    }}// son

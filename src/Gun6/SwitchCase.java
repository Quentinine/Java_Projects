package Gun6;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {

        /**
         * switch(degisken) {
         *     case deger1:
         *          // kod
         *          break; // kodu durdurmak icin var.
         *          // Yoksa deger2 yi de kontrol eder
         *     case deger2:
         *           // kod
         *           break;
         *     case deger3:
         *           // kod
         *           break;
         *     default:
         *          // hicbir case uygun degilse burasi calisir.
         * }
         * */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Kacinci gün?");
        int day = scanner.nextInt();

        switch (day) {
            case 1:
                System.out.println("Pazartesi");
                break;
            case 2:
                System.out.println("Sali");
                break;
            case 3:
                System.out.println("Carsamba");
                break;
            case 4:
                System.out.println("Persembe");
                break;
            case 5:
                System.out.println("Cuma");
                break;
            case 6:
                System.out.println("Cumartesi");
                break;
            case 7:
                System.out.println("Pazar");
                break;
            default:
                System.out.println("Gecersiz tarih araligi");
        }

        System.out.println("-------------------");
        int seviye = 1;

        switch (seviye) {
            case 1:
                System.out.println("Seviye 1");
            case 2:
                System.out.println("Seviye 2");
                break;
            case 3:
                System.out.println("Seviye 3");
        }

        System.out.println("-------------");
        char harf = 'B';

        switch (harf) {
            case 'A':
            case 'B':
            case 'C':
                System.out.println("Gecer not");
                break;
            case 'D':
            case 'E':
                System.out.println("Kaldi");
                break;
            default:
                System.out.println("Sinava girmedi");
        }

        System.out.println("------------");

        String brans = "QA";

        switch (brans) {
            case "DEV":
                System.out.println("Developer");
                break;
            case "QA":
                System.out.println("SDET");
                break;
            case "PM":
                System.out.println("Project Manager");
            default:
                System.out.println("Yapay zeka yeni brans buldu");
        }
    }
}

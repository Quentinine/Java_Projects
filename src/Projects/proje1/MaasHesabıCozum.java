package Projects.Proje1;

import java.util.Scanner;

public class MaasHesabıCozum {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Sabit maaşınızı girin: ");
        float sabitMaas = scanner.nextFloat();

        System.out.print("Satişlardan kazanılan değeri girin: ");
        float satisKazanci = scanner.nextFloat();

        System.out.print("Performans seviyesini girin(Hedef satış kazancı): ");
        float performansSeviyesi = scanner.nextFloat();

        float prim = 0;
        float primOrani = (sabitMaas * prim);


        if (satisKazanci > performansSeviyesi) {
            primOrani = (float) 0.10 ;
        } else {
            primOrani = (float) 0.05;
        }

        float primUcreti = satisKazanci * primOrani;
        float toplamMaas = sabitMaas + primUcreti;

        System.out.println("Bu ay maaşınız: " + toplamMaas);


    }
}
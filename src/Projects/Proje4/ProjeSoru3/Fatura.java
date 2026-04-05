package Projects.Proje4.ProjeSoru3;

import java.util.Scanner;

public class Fatura{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        do {
            MusteriFatura musteri = MusteriFatura.yeniMusteriAl();

            System.out.print("Fatura Tutarı: " + musteri.hesapla());
            System.out.println();

            System.out.print("Yeni işlem yapılsın mı? (E/H): ");
        } while (scanner.next().equalsIgnoreCase("E"));

        System.out.println("Sistemden çıkıldı.");
    }
}
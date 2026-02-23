package Gun4;

import java.util.Scanner;

public class Scannerdenemeler {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
         System.out.println("Ad ve soyad gir:");
         String adsoyad = scanner.nextLine();

         System.out.println("Yas girin:");
         Integer yas = scanner.nextInt();
         scanner.nextLine();

         System.out.println("Sehir girin:");
         String sehir = scanner.nextLine();
         scanner.close();

         if (yas > 18) {
         System.out.println("Sayın " + adsoyad + " " + sehir + " sehrinden basvurunuz onaylandı.");
         } else {
         System.out.println("Üzgünüz a" + adsoyad + " yasınız basvuru için içok küçük.");
         }
         }
         }

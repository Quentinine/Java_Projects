package gun4;

import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {

        String isim = "Mehmet";
        int yas = 32;
        double motor = 2.4;

        // Static(sabit) veri kullanmak yerine,
        // dynamic(degisken) verilerle calismamizi saglar.
        // uygulamayi her calistirdigimda degiskenlere yeni veri atayabilrim.
        Scanner scanner = new Scanner(System.in);
        //System.in -> Klavyeden veri girisine izin verir.

        System.out.println("Ögrencinin ismini girin");
        String name = scanner.nextLine();

        System.out.println("Ögrencinin yasini girin");
        int age = scanner.nextInt();

        System.out.println("Ögrencinin ismi " + name + " ögrencinin yasi " + age);

        System.out.print("1. sayi: ");
        int sayi1 = scanner.nextInt();

        System.out.print("2. sayi: ");
        int sayi2 = scanner.nextInt();

        System.out.println("Toplam: " + (sayi1 + sayi2));

        // String icin 2 scanner methodu var. next() ile tek kelime yaziyorum
        // nextLine() ile cümleler yaziyoruz.

        String kelime = scanner.next();
        String cumle = scanner.nextLine();

        // Sayilar icin scanner kullanimi
        int a = scanner.nextInt();
        double b = scanner.nextDouble();
        long l = scanner.nextLong();

        // true false icin
        boolean isActive = scanner.nextBoolean();

        /**
         * Scanner kullaniminda dikkat edilmesi gereken bir nokta:
         * sayisal bir deger girdikten sonra imlec enter ile asagi inmez
         * bu nedenle nextLine i direkt kullanirsak enter görevi görür,
         * yeni cümle yazmamiza izin vermez. Bu sebeple de sayisal girislerden sonra
         * degiskene atama yapmadan nextLine() kullanmamiz gerekir.
         *
         * int number = scanner.nextInt();
         * scanner.nextLine(); -> buffer temizleme. Enter tusuna basmak
         * String name = scanner.nextLine();
         *
         * nextInt() ya da nextDouble() kullanirken ya klavyeden abc diye bir sey
         * yazarsam?
         * Hata verir -> InputMismatchException (yanlis veri tipi girisi oldu)
         * */

        scanner.close();
        // Klavyeden giris icin acmistik,
        // bu satir ile klavyeden girisi kapattik
    }
}

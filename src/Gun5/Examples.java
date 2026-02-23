package gun5;

import java.util.Scanner;

public class Examples {
    public static void main(String[] args) {

        System.out.println("----Soru 1------");
        // Kullanıcıdan isim al. İlk harf büyük, diğerleri küçük yazdır.
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine().trim();

        // trim() -> sadece bastaki ve sondaki bosluklari siler
        // kelimeler arasi boslugu silmek icin bu yöntemi kullaniriz
        // String bosluk = name.replaceAll(" ", "");
        String formatName =
                name.substring(0, 1).toUpperCase() +
                        name.substring(1).toLowerCase();

        System.out.println(formatName);

        System.out.println("------Soru 2------");
        // Kullanicidan sifre al. Uzunluk < 8 ise “Zayıf”, değilse “Güçlü”.
        String password = scanner.nextLine();

        if (password.length() < 8) {
            System.out.println("Zayif");
        } else {
            System.out.println("Güclü");
        }

        System.out.println("------Soru 3-------");
        // Kullanicidan mail al. @ yoksa “Geçersiz mail”, varsa “OK”.
        String mail = scanner.nextLine();

        if (mail.contains("@")) {
            System.out.println("OK");
        } else {
            System.out.println("Geçersiz mail");
        }

        System.out.println("------Soru 4------");
        // Kullanicidan isim ve yaş al. Yaş >= 18 ve isim boş değilse “Kayıt OK”.
        String isim = scanner.nextLine().trim();
        int age = scanner.nextInt();
        scanner.nextLine(); // buffer temizleme icin

        if (age >= 18 && !isim.isEmpty()) {
            System.out.println("Kayıt OK");
        } else {
            System.out.println("Kayıt Not OK");
        }

        System.out.println("-------Soru 5-------");
        //Kullanicidan kelime al. İlk ve son karakter aynıysa “Aynı”.
        String kelime = scanner.nextLine().trim();

        if (kelime.length() >= 1 &&
                kelime.charAt(0) == kelime.charAt(kelime.length() - 1)) {
            System.out.println("Ayni");
        } else {
            System.out.println("Ayni degil");
        }

        System.out.println("------Soru 6-------");
        // Kelime al. “a” yoksa “Yok”, varsa indeksini yazdır.
        String s = scanner.nextLine();

        int index = s.indexOf("a"); // string ifade icerisinde buldugu ilk a harfinin indexini alir
        if (index == -1) {
            System.out.println("Yok");
        } else {
            System.out.println(index);
        }

        System.out.println("------Soru 7-------");
        // Cümle al. Sonunda nokta yoksa nokta ekle.

        String cumle = scanner.nextLine().trim();

        // cumle.endsWith(".") -> cümlenin sonunda . varsa true oluyor
        // !cumle.endsWith(".") -> cümlenin sonunda . yoksa true oluyor
        if (!cumle.endsWith(".")) {
            cumle = cumle + ".";
            System.out.println(cumle);
        }

        System.out.println("-------Soru 8--------");
        // Kelime al. Uzunluğu < 3 ise “Kısa”, değilse ilk 3 harfi yazdır.

        String k = scanner.nextLine().trim();

        if (k.length() < 3) {
            System.out.println("Kısa");
        } else {
            System.out.println(k.substring(0,3));
        }

        System.out.println("-------Soru 9-------");
        // Kullanicidan iki tane sayi al. (+,-,*) islem bilgisini al
        // ve islem sonucunu yazdir.
        System.out.print("Sayi 1: ");
        int a = scanner.nextInt();
        System.out.print("Sayi 2: ");
        int b = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Yapmak istediginiz islemi girin(+,-,*)");
        String operation = scanner.nextLine().trim();

        if(operation.equals("+")) {
            System.out.println("Toplam: " + (a+b));
        } else if (operation.equals("-")) {
            System.out.println("Cikarma: " +(a-b));
        } else if (operation.equals("*")) {
            System.out.println("Carpim: " + (a*b));
        } else {
            System.out.println("Yanlis islem girildi");
        }

        System.out.println("------Soru 10-------");
        // İki kelime al. Hangisi daha uzunsa onu yazdır, eşitse “Eşit”.
        System.out.print("ilk kelime: ");
        String x = scanner.nextLine();
        System.out.print("ikinci kelime: ");
        String y = scanner.nextLine();

        if (x.length() > y.length()) {
            System.out.println(x);
        } else if (y.length() > x.length()) {
            System.out.println(y);
        } else {
            System.out.println("Esit");
        }

        System.out.println("------Soru 11-------");
        // “Ad Soyad” al. Boşluk yoksa “Soyad yok”, varsa soyadı yazdır.
        String fullName = scanner.nextLine().trim();

        int idx = fullName.indexOf(' ');
        if (idx == -1){
            System.out.println("Soyad yok");
        } else {
            System.out.println(fullName.substring(idx + 1));
        }
    }
}

package gun4;

import java.util.Scanner;

public class Examples {
    public static void main(String[] args) {

        System.out.println("------Soru 1--------");
        int a = 10, b = 4; // Eger birden fazla degisken ayni veri tipinde ise
        // tek bir veri tipi kullanilarak birden fazla degisken tanimlanabilir. Bunun icin
        // degiskenlere atama yaptiktan sonra aralarina virgül ekleriz
        System.out.println(a / b); // int / int = int -> 2
        System.out.println((double) a / b); // double / int = double -> 2.5
        System.out.println(a / (double) b); // int / double = double -> 2.5

        System.out.println("------Soru 2---------");
        System.out.println(29 % 5); // 4
        System.out.println(30 % 5); // 0

        System.out.println("-------Soru 3--------");
        System.out.println(-7 % 3); // -1 kalan isaretini soldaki sayi belirler
        System.out.println(7 % -3); // 1
        System.out.println(-7 % -3); // -1

        System.out.println("--------Soru 4---------");
        int x = 5;
        System.out.println(x++); // 5 -> ilk önce 5 yazdi sonra bir artirip 6 yapti
        System.out.println(++x); // 7 -> ilk önce 1 artirdi 7 oldu, sonra ekrana yazdi
        System.out.println(x); // 7 -> x in güncel degerini yazdi 7 olarak

        System.out.println("-------Soru 5-------");
        int r = 8 + 2 * 5 - 6 / 3;
        // 8 + 10 - 6 / 3 -> 1. adim
        // 8 + 10 - 2 -> 2. adim
        // 18 - 2 -> 3. adim
        // 16 -> sonuc
        System.out.println(r);

        System.out.println("--------Soru 6-------");
        char c = 'A'; // 'A' ascii code karsiligi -> 65
        System.out.println(c + 1); // 66
        System.out.println((char)(c + 1)); // char a casting yaptigimiz icin B cikar cevap

        System.out.println("--------Soru 7-------");
        Scanner sc = new Scanner(System.in);

        int age = sc.nextInt();
        sc.nextLine(); // buffer temizleme
        String name = sc.nextLine();

        System.out.println(age);
        System.out.println(name);

        sc.close();
        // Scanner ile isimiz bitene kadar class icerisinde close() metodunu kullanmiyoruz
    }
}

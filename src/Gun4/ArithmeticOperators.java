package gun4;

public class ArithmeticOperators {
    public static void main(String[] args) {

        /**
         * Java'da temel aritmetik operatörler:
         *
         * sayisal degerler icin gecerli
         * + -> toplama
         * - -> cikarma
         * * -> carpma
         * / -> bölme
         * % -> mod alma
         * */

        int a = 10;
        int b = 3;

        System.out.println("Toplama: " + (a + b));
        System.out.println("Cikarma: " + (a - b));
        System.out.println("Carpma: " + (a * b));
        System.out.println("Bölme: " + (a / b));
        System.out.println("Mod: " + (a % b));

        int x = 5;
        double y = 2;
        System.out.println("Bölme sonucu: " + (x / y));

        System.out.println("------------------");

        int n = 5;
        System.out.println("Artirmadan önce: " +(n++)); // 5 yazacak cevap olarak. Önce degeri yazar, sonra degeri 1 artirir
        System.out.println("Artirdiktan sonra: " + n); // 6

        int m = 5;
        System.out.println(++m); // 6 Önce degeri 1 artirir sonra yazar
        System.out.println(m); // 6 zaten degeri 1 artirdigi icin artan degeri yazar

        int v = 10; // '=' atama operatörü olarak adlandirilir. v degeri artik 10 demektir.

        v += 5; // v = v + 5; // 15
        v -= 5; // v = v - 5; // 10
        v *= 5; // v = v * 5; // 50
        v /= 5; // v = v / 5; // 10
        v %= 5; // v = v % 5; // 0

        System.out.println("v: " + v);

        /**
         *  islem önceligi
         *  1. ()
         *  2. * ve /
         *  3. + ve -
         *  4. =, +=, -=
         * */

        int result = 10 * 3 + 2;
        System.out.println("Sonuc: " + result);

        int result2 = (10 + 2) * 3;
        System.out.println("Result 2: " + result2);

    }
}

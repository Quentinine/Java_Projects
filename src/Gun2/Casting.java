package Gun2;

public class Casting {
    public static void main(String[] args) {

        /**
         * Kücükten büyüge
         * byte -> short -> int -> long -> float -> double
         * Widening(otomatik)
         * */
        int number = 12;
        double number2 = number;
        // Otomatik olarak kücük olan veriyi büyük olan veri tipine atadim

        /**
         * Narrowing (Manuel)
         * */

        double x = 10.9;
        int y = (int)x; // double olan degiskeni aldim int e cevirip degerini
        // y degiskenine atama yaptim
        // Bu her zaman icin güvenli degildir, cünkü veri kaybi olur

        // Overflow/Underflow (Tasma)
        int bigNumber = 130;
        byte b = (byte) bigNumber;
        // byte -> -128 127 arasindaki sayilari tutabilir.
        // 130 sigmaz. Casting hata cözmez, hatayi saklar.

        // String veriyi sayiya cevirmek
        String sNumber = "123"; // sNumber degiskeni 123 yazisini tutar
        int iNumber = Integer.parseInt(sNumber);
        // iNumber degiskenim artik 123 sayisi oldu.

        String sdNumber = "124.45"; // sdNumber degiskeni 124.45 yazisini tutar
        double dNumber = Double.parseDouble(sdNumber);
        // dNumber degiskeni artik 124.45 ondalikli sayisi oldu

        String sIsTrue = "true";
        boolean isTrue = Boolean.parseBoolean(sIsTrue);

        int a = 23;
        String sa = String.valueOf(a);
        // sa degiskeni artik "23" yazmis gibi oldu.

        double d = 23.34;
        String sd = String.valueOf(d);

        // Hatali kullanimlar
        String s = "12a";
        int n = Integer.parseInt(s);
        /**
         * "123" hata almaz
         * " 123" hata alirim. Cünkü bastaki boslukta bir deger
         * "123.0" integer parse olmaz, double kullanmak lazim
         * */
    }
}

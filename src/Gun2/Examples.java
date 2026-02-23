package Gun2;

public class Examples {
    public static void main(String[] args) {

        int a = 5;
        int b = 2;

        System.out.println("------1. Soru-----");
         System.out.println(a / b);
         // int / int = int -> 2 virgülden sonrasini atiyor

         System.out.println((double) a / b);
         // (double) casting isleminden dolayi
        // sonuc ondalikli olarak kalir -> 2.5

        System.out.println("------2. Soru--------");
        /**
         * println icerisindeki String ifadelerde + kullandigim zaman
         * ve ayriyeten parantez yoksa yazilan herseyi birlestirir.
         * Eger parantez var
         * önce parantez icindeki islemi yapar sonradan birlestirme yapar
         * */
        System.out.println("A" + 1 + 2);
        System.out.println("A" + (1 + 2));

        System.out.println("------3. Soru---------");
        int x = 10;
        double y = 2;
        System.out.println(x / y);
        // int / double -> bölme islemindeki degerlerden biri büyük ise
        // sonuc icin casting yapmaya gerek yok.

        System.out.println("------4. Soru--------");
        double d = 12.99;
        int i = (int) d;
        System.out.println(i);

        System.out.println("------5. Soru------");
        char c = 'A';
        System.out.println(c + 2);  // 67
        // parantez önceligi olmadigi icin c nin sayisal degerini alir.

        System.out.println((char)(c + 2));
        // parantez önceligi var toplama islemini yapar sonuc 67 olur,
        // daha sonra char a casting yapar ve ekrana C yazar


        System.out.println("-------6. Soru--------");
        int n = 65;
        char cn = (char) n; // cn -> A ya karsilik gelir.
        //(char) n bu ifade ile 'A' aynidir.
        System.out.println(cn);

        System.out.println("-------7. Soru-------");
        int ai = 10;
        int bi = 4;
        System.out.println(ai % bi); // % isareti kullanarak mod alinir.
        // 2 sayiyi birbirine bölüp kalani yazar.

        System.out.println("-------8. Soru--------");
        double ad = 10;
        double bd = 4;
        System.out.println(ad % bd);

        System.out.println("-------9. Soru------");
        int aa = 5;
        double bb = 2;
        int cc = (int)(aa / bb);
        System.out.println(cc);
        // int / double -> sonuc double oluyordu. Yani cikti 2.5
        // casting islemi var double olan degeri int e cevirmis.
        // O yüzden 2.5 olan double degeri 2 olarak int e cevrilir

        System.out.println("-------10. Soru--------");
        String s = "40";
        int xx = Integer.parseInt(s);
        System.out.println(xx + 2);
        System.out.println(s + 2);
        // xx burada int yani bir sayi. sayi+sayi=sayi
        // s burada bir String. sayi+String = String birlestirme






    }
}

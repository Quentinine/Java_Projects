package Gun2;

public class Examples2 {
    public static void main(String[] args) {

        System.out.println("------Soru 1-------");
        String s = "3.5";
        double d = Double.parseDouble(s);
        System.out.println((int)(d * 2));

        System.out.println("-------Soru 2--------");
        int a = 2;
        System.out.println(a + "3" + 4); // int + String + int = String birlestirme
        System.out.println(a + 3 + "4"); // int + int + String = int toplama sonra String birlestirme

        System.out.println("--------Soru 3---------");
        System.out.println("A" + 'B' + 1);
        System.out.println('A' + 'B' + "1");
        // AB1 -> String + char + int = String birlestirme
        // char + char -> sayisal degerlerinden dolayi int + int gibi davranirlar
        // 65 + 66 + String = String birlestirme yapicak -> 1311

        System.out.println("--------Soru 4--------");
        System.out.println(-10 % 3);
        System.out.println(10 % -3);
        // Java'da kural: kalanin isaretini bölünen sayinin isareti belirler

        System.out.println("------Soru 5-------");
        String ss = "010";
        int n = Integer.parseInt(ss);
        System.out.println(n + 5);
        System.out.println(ss + 5);
        // 00000001 = 1 / 10000 bu ise on bin demek

        System.out.println("-------Soru 6-------");
        double dd = 0.1 + 0.2; // cevapin 0.3 olmamasi double hassasiyetinden kaynakli
        System.out.println(dd);
        System.out.println(dd == 0.3);
        // == ifadesi java sorgudur, cevaben dogru ya da yanlis olur
    }
}

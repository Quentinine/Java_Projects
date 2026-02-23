package Gun2;

public class DataTypes {
    public static void main(String[] args) {
        /**
         * Bilgisayar her veriyi 0 ya da 1 olarak saklar.
         * Data types (Veri tipleri) bu 0/1 leri yorumlamak icin varlar.
         * 'A', "Mehmet", 2, 2.23, dogru
         *
         * Java'da 2 grupta toplanir veri tipleri.
         * 1) Primitive(ilkel) veri tipleri
         * 2) Nonprimitive(Referans) veri tipleri
         * */

        //1) Primitive(ilkel) veri tipleri

        //Sayilar icin olan veri tipleri
        byte b = 1; // 1 byte
        short s = 2;
        int i = 10;
        float f = 12.23f;
        double d = 13.89877;
        long l = 9000000L;

        // Harf icin olan veri tipi
        char c = 'A'; // 01000001 eger bu char ise 'A' int ise 65 oluyor.

        // Dogru ve yanlis ifadeler icin veri tipi
        boolean dogru = true;
        boolean yanlis = false;
        // boolean veri tipi sadece iki deger alir. Bunlar true ve false 'dur.

        //2) Nonprimitive(Referans) veri tipleri
        // Bunlar siniflardir(class).
        // String, Array, Scanner, List, kendi olusturdugumuz class lar...

        String name = "Mehmet";
        int[] numbers = {1, 2, 3}; // Bu bir array yapisidir.
        // Icerisinde birden fazla int sayi tutabilir.
    }
}

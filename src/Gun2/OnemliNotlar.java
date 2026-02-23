package Gun2;

public class OnemliNotlar {
    public static void main(String[] args) {
        double x = 10.3;
        System.out.println(x);
        int xn = (int)x;
        /**
         *Java Kritik Notlar ve Hatalar
         * 1. Bölme ve Kalan İşlemleri
         *
         * • Tam Sayı Bölmesi: `5 / 2` sonucu `2` olur. Eğer sonuçta ondalık isteniyorsa sayılardan biri `double` olmalıdır (`5 / 2.0 = 2.5`).
         *
         * • Mod Operatörü (`%`): `5 % 2` işleminin sonucu kalan olan `1`'dir.
         *
         * • Negatif Mod: Kalanın işaretini her zaman bölünen (ilk sayı) belirler.
         *
         *   • `-10 % 3 = -1`
         *
         *   • `10 % -3 = 1`
         *
         * 2. Metin (String) Birleştirme ve Matematik
         *
         * • Soldan Sağa Kuralı: Java işlemleri soldan sağa yapar.
         *
         *   • `2 + 3 + "4"` önce matematik yapar: `"54"`.
         *
         *   • `2 + "3" + 4` String ile karşılaştığı an yapıştırmaya geçer: `"234"`.
         *
         * 3. Karakterler (char) ve ASCII
         *
         * • `char + char` işlemi karakterlerin sayısal (ASCII) değerlerini toplar (`'A' + 'B' = 131`).
         *
         * • Ancak işin içine bir `String` girerse (`"A" + 'B'`), karakter metin olarak yapıştırılır.
         *
         * 4. Mantıksal Operatörler ve Kısa Devre (Short-Circuit)
         *
         * • `&&` vs `&`: `&&` operatörü sol taraf `false` ise sağ tarafa hiç bakmaz (hata almayı önler). Tek `&` her iki tarafa da bakar ve risklidir.
         *
         * • İşlem Önceliği: `&&` (VE), `||` (VEYA) operatöründen daha önceliklidir.
         *
         * • XOR (`^`): Sadece değerler farklı olduğunda `true` döner.
         *
         * 5. Hassasiyet ve Parsing
         *
         * • Double Hatası: `0.1 + 0.2` tam olarak `0.3` etmez (`0.30000000000000004`), bu yüzden `== 0.3` ifadesi `false` döner.
         *
         * • Parsing: `Integer.parseInt("010")` baştaki sıfırı atar ve sayıyı `10` olarak alır.
         */
    }
}


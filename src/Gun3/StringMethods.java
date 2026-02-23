package Gun3;

public class StringMethods {
    public static void main(String[] args) {

        String name = "Mehmet";

        System.out.println("---------length()-------");
        // 1) Bu string in uzunlugu
        int nameLength = name.length();
        // System.out.println(name.length());
        System.out.println("Ismin uzunlugu: " + nameLength);

        System.out.println("--------charAt()------");
        // 2) charAt(int index) index gördügümüzde saymaya 0 dan baslariz
        System.out.println(name.charAt(2));

        System.out.println("-----StringIndexOutOfBoundsException---");
        //System.out.println(name.charAt(6));
        // Eger belirtilen String in toplam index sayisi disinda bir arama
        // yaparsak bize bu hatayi verir. "StringIndexOutOfBoundsException"

        System.out.println("------equals()---equalsIgnoreCase()-----");
        // 3) iki String ifadenin karsilastirilmasi
        String a = "Java";
        String b = "java";

        // büyük kücük harf duyarli ona göre esitligi kontrol ediyor
        System.out.println(a.equals(b));
        // burada ise büyük kücük harf kontrolü yapmadan esitligi kontrol ediyor
        System.out.println(a.equalsIgnoreCase(b));

        System.out.println("------substring()------");
        // bu method ile string ifade icerisinden istedigimiz
        // baslangic ve bitis noktalarini belirtip cikti alabiliriz
        // substring(int start) ya da substring(int begin, int end)
        // index olarak baslangic ve bitisi end i yaziya dahil etmez
        String x = "Selenium";
        System.out.println(x.substring(3)); // enium
        System.out.println(x.substring(0,3)); // Sel

        System.out.println("---------concat()-------");
        String d = "Bugün hava";
        String e = "cok güzel";

        System.out.println(d + e);
        System.out.println(d + " " + e);
        System.out.println(d.concat(" ").concat(e));

        System.out.println("------contains()------");
        String s = "Selenium bir test aracidir";
        // contains arattigimiz string belirtilen
        // string ifade icerisinde var mi yok mu diye kontrol eder
        // büyük kücük duyarlidir
        boolean isContains = s.contains("Test");
        System.out.println(isContains);

        System.out.println("-----startsWith()--endsWith()------");
        String f = "report.pdf";
        // verilen string ile olan string kontrol edilir.
        // baslangic ve bitis degerleri olarak
        // büyük kücük
        System.out.println(f.startsWith("Rep"));
        System.out.println(f.endsWith(".pdf"));

        System.out.println("-----indexOf()--lastInexOf()-----");
        String g = "Javalandiniza";
        // Vericegim string ifadeyi string icerisinde bulursa index i yazar
        // bulamazsa -1 yazar
        System.out.println(g.indexOf("a")); // ilk karakterin indexini yazar
        // lastIndexOf ta ise String ifade icerisinde verilen string i arar
        // ilk buldugunu degil son buldugunun index ini yazar
        System.out.println(g.lastIndexOf("a"));
        // String ifade icerisinde verdiigm karakter yoksa
        System.out.println(g.indexOf("x"));

        System.out.println("------replace()-----");
        String k = "java-dersleri-gün-üç";
        // ilk yazdigim degismesini istedigim karakter ya da string
        // virgülden sonra yazdigim ise onun yerine gececek olan karakter ya da string
        System.out.println(k.replace("-", " "));
        String birthDay = "12/2/1990";
        System.out.println(birthDay.replace("/","."));

        System.out.println("--------replaceAll()------");
        String telNo = "Tel: 555-555-555";
        // sol tarafa kurali yaziyorum,
        // sag tarafa da bu kuralin sonucunda ne yazilacagini yazdim
        // regex konusu ileride islenicek. String ifadelerde belirli bir yapi olusturmak icin kullanilir
        // örn: password icin 8 harfli olsun 1 tane rakam ve noktalama isareti olsun gibi
        // D -> digit demek, sayilar haricindeki her seyi sil demis oldum
        System.out.println(telNo.replaceAll("\\D", ""));

        System.out.println("-----toLowerCase()---toUpperCase()-----");
        String l = "MeRHabA düNYa";
        // String ifadenin tamamini kücültmek icin
        System.out.println(l.toLowerCase());
        // String ifadenin tamamini büyütmek icin
        System.out.println(l.toUpperCase());

        // String icerisinde sadece bir kelimeyi de büyültüp kücültebiliyoruz
        System.out.println(l.substring(8).toUpperCase());

        System.out.println("-------trim()-------");
        // String ifade icerisindeki bosluklari silmez.
        // Sadece bastaki ve sondaki bosluklari siler.
        String m = "     test@example.com     ";
        String n = "Bugün String methodlari isliyoruz.";
        System.out.println(m.trim());
        System.out.println(n.trim());

        System.out.println("-----isBlank()---isEmpty()-----");
        String c = ""; //  isEmpty() String ifadenin length() nin 0 olup olmadigini kontrol eder
        // isBlank() ise String in sadece bosluklardan olusup olusmadigini kontrol eder
        // ya da isEmpty nin true olmasini kontrol eder.
        System.out.println(c.isEmpty()); // true
        System.out.println(c.isBlank()); // true
        System.out.println(" a".isBlank()); // false
    }
}

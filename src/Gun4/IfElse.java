package gun4;

public class IfElse {
    public static void main(String[] args) {

        /**
         * if(kosul) { // kosul saglaniyorsa parantezler icerisine girer
         *     // yapilacak islemler ve sout
         * } else { // eger kosul saglanmiyorsa else parantezleri icerisine girer
         *     // yapilacak islemler ve sout
         * }
         * */

        int age = 18;

        if (age > 18) {
            System.out.println("Ehliyet alabilir");
        } else {
            System.out.println("Yasi ehliyet almaya uygun degil");
        }

        /**
         * Ögrenci notlarinda 50 ve üzeri alanlar sinavi gecer
         * 70 ve üzeri alanlar "iyi" not alir
         * 85 ve üzeri alanlar ise "pekiyi" notunu alir.
         * */

        // if else bloklarinda kosulun true olmasina bakilir.
        // Zincirleme if else lerde ise ilk true olan kosulda parantez ici yapilir
        // ve program sonlanir
        int not = 72;

        if (not >= 85) {
            System.out.println("Pekiyi");
        } else if (not >= 70) {
            System.out.println("iyi");
        } else if (not >= 50) {
            System.out.println("Sinavi gecti");
        } else {
            System.out.println("Sinavdan kaldi");
        }

        /**
         * int a = 10;
         *
         * if(a>10){} -> kosul diye adlandirdigimiz kisimda bakicagimiz sey
         * kosulun boolean olup olmadigi
         *
         * if(a){} -> bu yazim sekli hatali. cünkü soru sordugumda cevap boolean cikmiyor
         * ama kosulun bana true ya da false diye cevap verebiliyor olmasi lazim
         *
         * Karsilastirma operatörleri
         *
         *  1) == -> esit mi (11 == 10) -> false
         *  2) != -> esit degil demi (9 != 10) -> true
         *  3) <, >, >=, <=
         * */

        String lesson = "Java";
        // == ifadesini sayisal degerler icin kullaniyoruz.
        // String ifadelerin karsilastirilmasinda equals(), equalsIgnoreCase() kullanilir
        if (lesson.equals("Java")) {
            System.out.println("Ders ismi dogru");
        } else {
            System.out.println("Ders ismi yanlis");
        }
    }
}

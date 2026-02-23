package Gun1;

public class Printf
    {
        public static void main(String[] args)
             {
                /**
                 * print() -> yazıyı olduğu gibi yansıtır.
                 * println() -> üsttekiinn aynısı ama imleci alt satıra indirir.
               * printf() -> ekrana formatlı bir şekilde yazılar yazdırmanızı sağlar
               * */
                String ad = "Mehmet";
                int yas = 32;
        System.out.printf ("Ad: %s, Yas:%d%n", ad, yas);
        // %s string için kullanılır
        // %d integer için kullanılır
        System.out.printf ("Alt satırda mı?");

        //Genişlik verme
        System.out.printf ("[%5d]%n", 7);
        System.out.printf ("[%5d]%n", 123);

        //sola yaslama
        System.out.printf ("[%-5d]%n", 8);

        //Ondalıklı sayı kontrolü
        System.out.printf ("ortalama: %f%n", 10.34567);
        System.out.printf ("ortalama: %.2f%n", 10.34567); //son 2 digte yuvarlama

        //yazı hizalama
        System.out.printf ("%-10s %-10s %-10s%n", "Ad", "Soyad", "Isim");
        System.out.printf ("%-10s %-10s %-10s%n", "Mehmet", "Simsek", "Dortmund");;
    }
}

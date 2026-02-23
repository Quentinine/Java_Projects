package gun5;

public class MathFunctions {
    public static void main(String[] args) {

        int a = -12;
        System.out.println(a + " Mutlak deger: "+ Math.abs(a));

        int b = 81;
        System.out.println(b + " karakökü: " + Math.sqrt(b)); // sonucu double verir

        // Math.round() -> en yakina sayiyi yuvarlar. (0.5 ve üzeri oldugunda yukari yuvarlar)
        System.out.println(Math.round(3.4)); // 3
        System.out.println(Math.round(3.5)); // 4

        // Math.floor() -> asagi yuvarlar
        System.out.println(Math.floor(3.9)); // 3.0
        System.out.println(Math.floor(-3.1)); // -4.0

        // Math.ceil() -> yukari yuvarlar
        System.out.println(Math.ceil(3.1)); // 4
        System.out.println(Math.ceil(-3.9)); // -3

        // iki sayi arasindaki büyüklük kücüklük
        System.out.println(Math.min(5 ,9)); // 5
        System.out.println(Math.max(3,1)); // 3

        // 0.0 ile 1.0 arasinda random bir sayi üretir. (1.0 i dahil etmez)
        // Her calistirdigimizda farkli bir deger üretir bu aralikta
        double random = Math.random();
        System.out.println("random: " + random);
    }
}

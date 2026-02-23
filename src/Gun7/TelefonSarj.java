package Gun7;

public class TelefonSarj {
    public static void main(String[] args) {
        /**
         * Şarj %20’den başlıyor.
         * Her dakikada %5 artsın.
         * %100 olunca dursun.
         * Kaç dakika sürdüğünü yaz.
         * */

        int sarj = 20;
        int dakika = 0;

        while (sarj < 100) {
            sarj += 5;
            dakika++;
        }

        System.out.println("Sarj %100 doldu. Süre: " + dakika + " dk");
    }
}

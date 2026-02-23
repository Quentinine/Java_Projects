package Gun7;

public class BakiyeHesaplama {
    public static void main(String[] args) {
        /**
         * Bakiye 30 TL. Her biniş 12 TL.
         * Bakiye yettiği sürece “Biniş yapıldı” yaz.
         * Kaç biniş oldu?
         * */

        int bakiye = 30;
        int binisUcreti  = 12;
        int binisSayisi = 0;

        while (bakiye >= binisUcreti) {
            bakiye -= binisUcreti;
            binisSayisi++;
            System.out.println("Binis yapildi. Kalan bakiye: " + bakiye);
        }

        System.out.println("Toplam binis sayisi: " + binisSayisi);
    }
}

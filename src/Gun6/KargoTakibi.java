package Gun6;

import java.util.Scanner;

public class KargoTakibi {
    public static void main(String[] args) {
        /**
         * Bir kargo firması için basit bir takip ve ücret hesaplama programı yazman isteniyor.
         * Kullanıcıdan şu bilgileri al:
         * Takip kodu
         * Teslim tipi (ev / ofis / sube)
         * Mesafe (km)
         * Programın yapması gerekenler:
         * Kullanıcının girdiği takip kodunda başta veya sonda gereksiz boşluklar varsa,
         * kodu temizleyip işleme öyle devam et.
         * Takip kodunun uzunluğu tam olarak 10 karakter olmalıdır.
         * Eğer 10 değilse kullanıcıya hata mesajı ver ve işlemi sonlandır.
         * Teslim tipine göre başlangıç ücreti belirle:
         * ev → uygun bir ücret
         * ofis → uygun bir ücret
         * sube → uygun bir ücret
         * Bunların dışında bir değer girilirse “geçersiz teslim tipi” mesajı ver.
         * Mesafe 30 km’den büyükse toplam ücrete ek bir ücret ekle.
         * Son olarak takip kodunun ilk 2 karakterini ekrana yazdır.
         * Çıktıda kullanıcıya:
         * Temizlenmiş takip kodu,
         * Kodun ilk 2 karakteri,
         * Hesaplanan toplam ücret
         * bilgilerini anlaşılır şekilde göster.
         * */

        Scanner scanner = new Scanner(System.in);

        System.out.println("Takip kodu");
        String takipKodu = scanner.nextLine().trim();

        System.out.println("Teslim nereye olacak?(ev, ofis, sube)");
        String teslimYeri = scanner.nextLine().trim().toLowerCase();

        System.out.println("Mesafe");
        double mesafe = scanner.nextDouble();
        // scanner.nextLine() -> buffer temizleme burada ihtiyac yok.
        // Cünkü String den sonra int(sayisal girdi) kullaniminda sikinti olusmuyor

        if (takipKodu.length() != 10) {
            System.out.println("Takip kodu yanlis veya eksik");
            // simdilik uygulamayi durduramadik :)
            // ileriki konularda durdurabiliciez
            // break kullanimi switch ya da döngülerde oluyor
        }

        double fiyat = 0;
        switch (teslimYeri) {
            case "ev":
                fiyat = 40;
                break;
            case "ofis":
                fiyat = 30;
                break;
            case "sube":
                fiyat = 20;
                break;
            default:
                System.out.println("geçersiz teslim tipi");
        }

        if (mesafe > 30) {
            fiyat += 20;
        }

        String kodParcasi = takipKodu.substring(0,2);
        System.out.println("Takip kodunun ilk iki harfi: " + kodParcasi);
        System.out.println("Toplam fiyat: " + fiyat);
    }
}

package Gun6;

import java.util.Scanner;

public class RestorantRezarvasyonu {
    public static void main(String[] args) {
        /**
         * Bir restoran için rezervasyon kontrol programı hazırlanacak.
         * Kullanıcıdan şu bilgileri al:
         * İsim Soyisim
         * Kişi sayısı
         * Bölüm tercihi (sigara / sigarasiz / vip)
         * Program aşağıdaki işlemleri yapmalıdır:
         * Kullanıcının girdiği isim-soyisim bilgisinde başta veya sonda gereksiz boşluklar varsa temizleyip işleme öyle devam et.
         * Girilen bilgide ad ve soyad olup olmadığını kontrol et:
         * Eğer isim-soyisim içinde boşluk karakteri yoksa kullanıcıya “Lütfen ad ve soyad giriniz” şeklinde bir uyarı ver.
         * Bölüm tercihine göre kullanıcıya masa durumuyla ilgili bir mesaj göster:
         * sigara seçilirse ilgili mesaj
         * sigarasiz seçilirse ilgili mesaj
         * vip seçilirse ilgili mesaj
         * geçersiz bir değer girilirse uygun bir hata mesajı
         * Kişi sayısına göre ek bilgilendirme yap:
         * Eğer kişi sayısı 6’dan fazlaysa, “Büyük masa gerekli” şeklinde uyarı yazdır.
         * Çıktıda kullanıcıya en azından:
         * Rezervasyonun hangi isim adına alındığı,
         * Bölüm mesajı,
         * (gerekliyse) büyük masa uyarısı
         * bilgilerini anlaşılır biçimde göster.
         * */

        Scanner scanner = new Scanner(System.in);

        System.out.println("isim soyisim bilgisini girin");
        String fullName = scanner.nextLine().trim();

        System.out.println("Kisi sayisi?");
        int kisiSayisi = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Bölüm tercihi (sigara / sigarasiz / vip)");
        String bolum = scanner.nextLine().trim().toLowerCase();

        if (!fullName.contains(" ")) {
            System.out.println("isim soyisim bilgisi eksik");
        }

        switch (bolum) {
            case "sigara":
                System.out.println("Sigara bolümü secildi");
                break;
            case "sigarasiz":
                System.out.println("Sigarasiz bölüm secildi");
                break;
            case "vip":
                System.out.println("Vip bölüm secildi");
                break;
            default:
                System.out.println("Gecersiz bölüm secildi");
        }

        if (kisiSayisi > 6) {
            System.out.println("Büyük masa gerekli");
        } else if (kisiSayisi <= 0) {
            System.out.println("Rezarvasyon icin kisi sayisi en az 1 olmalidir");
        }

        System.out.println("Rezarvasyonu yapan kisi: " + fullName +
                " toplam kisi sayisi: " +kisiSayisi);
    }
}

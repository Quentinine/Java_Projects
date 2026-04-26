package Projects.proje6.soru2;

import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        int cikis = -1;
        Scanner sc = new Scanner(System.in);
        OnlineKitapMagazasi lib = new OnlineKitapMagazasi();
        while (cikis != 0) {
            System.out.println("---KÜTÜPHANE----");
            System.out.println("Yapmak istediğiniz işlemin numarasını girin: ");
            System.out.println("1 - Kitap ekle");
            System.out.println("2 - Kitap sil");
            System.out.println("3 - Kitap listele");
            System.out.println("0 - Cikis");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    lib.kitapEkle();
                    break;
                case 2:
                    lib.kitapSil();
                    break;
                case 3:
                    lib.kitapListele();
                    break;
                case 0:
                    System.out.println("Sistem cıkıs yapıldı.");
                    cikis = 0;
                    break;
                default:
                    System.out.println("Hatalı giriş yaptınız.");
            }

        }
    }
}
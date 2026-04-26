package Projects.proje6.soru2;

import java.util.ArrayList;
import java.util.Scanner;

class OnlineKitapMagazasi {
    private ArrayList<Kitap> kitapListesi = new ArrayList<>();
    private Scanner sc = new Scanner(System.in);

    public void kitapEkle() {
        System.out.println("Kitap adı: ");
        String kitapAdi = sc.nextLine();

        System.out.println("Yazar adı: ");
        String yazarAdi = sc.nextLine();

        System.out.println("yayın yılı adı: ");
        int yayinYili = sc.nextInt();
        sc.nextLine();

        System.out.println("Fiyat: ");
        int fiyat = sc.nextInt();
        sc.nextLine();
        Kitap newkitap = new Kitap(kitapAdi, yazarAdi, yayinYili, 500);
        kitapListesi.add(newkitap);
    }

    public void kitapSil() {
        int id = -1;
        while (id != 0) {
            System.out.print("Silmek istediğiniz kitap ID (Çıkış: 0): ");
            id = sc.nextInt();
            sc.nextLine();
            int finalid = id;

            if (id != 0) {
                kitapListesi.removeIf(kitap -> kitap.getId() == finalid);
                System.out.println(id + " nolu kitap sistemden silindi.");
            }
        }
    }

    public void kitapListele() {
        if (kitapListesi.isEmpty()) {
            System.out.println("Listede kitap bulunmuyor.");
        } else {
            for (Kitap kitap : kitapListesi) {
                System.out.println(kitap);
            }
        }
    }
}
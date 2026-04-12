package Projects.proje5.Task1;


import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class LibClass {
    Scanner sc = new Scanner(System.in);
    String kitapAdi;
    String yazar;
    int soru;
    Boolean exit = false;
    Map<String, String> books = new HashMap<>();

    public void sorular() {
        books.put("Sefiller", "Dostoyevski");
        books.put("Nutuk", "Atatürk");
        books.put("Game of Thrones", " George RR Martin");
        books.put("Satranç", "Stefan Zweig");
        books.put("Bilgiyle Sohbet", "Celal Şengör");
        while (!exit) {
            System.out.println("\n--- MENÜ ---");
            System.out.println("1. Kitap listele");
            System.out.println("2. Kitap ekle");
            System.out.println("3. Kitap sil");
            System.out.println("4. Çıkış yap");
            System.out.print("Lütfen seçiminizi yapın: ");

            soru = sc.nextInt();
            sc.nextLine();

            switch (soru) {
                case 1:
                    System.out.println(books);
                    break;
                case 2:
                    System.out.println("Kitabı girin");
                    kitapAdi = sc.nextLine().toLowerCase().trim();
                    System.out.println("Yazarı girin");
                    yazar = sc.nextLine().toLowerCase().trim();
                    books.put(kitapAdi, yazar);
                    System.out.println("Kitap eklendi");
                    break;
                case 3:
                    System.out.println("Silmek için kitap adı girin");
                    kitapAdi = sc.nextLine().trim().toLowerCase();
                    if (books.containsKey(kitapAdi)) {
                        books.remove(kitapAdi);
                        System.out.println("Kitap silindi.");
                    } else
                        System.out.println("aranan kitap bulunamadı.");
                    break;
                case 4:
                    System.out.println("Programdan çıkış yapıldı.");
                    exit = true;
                    break;
            }
        }
    }
}


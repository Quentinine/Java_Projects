package Projects.proje5.Task3;

import java.sql.SQLOutput;
import java.util.*;

public class ListCom {
    String word;
    private static List<String> dizi = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    public void ListCommands() {
        boolean exit = false;

        while (!exit) {
            System.out.println("\n--- MENÜ ---");
            System.out.println("1. Eleman Ekle");
            System.out.println("2. En Üst Indexli Elemanı Kaldır");
            System.out.println("3. En Üst Indexli Elemanı Görüntüle");
            System.out.println("4. Elemanları Sırala");
            System.out.println("5. Elemanları Ters Çevir");
            System.out.println("6. Dizidaki Eleman Sayısı");
            System.out.println("7. Belirli Bir Elemanın Sayısı");
            System.out.println("8. Belirli Bir Elemanın İndeksleri");
            System.out.println("9. Dizinin Kopyasını Al");
            System.out.println("10. Belirli Bir Elemanı Kaldır");
            System.out.println("11. Belirli Bir Aralıktaki Elemanları Filtrele");
            System.out.println("12. Güncel Elemanları Listele");
            System.out.println("0. Çıkış");
            System.out.print("Seçiminizi yapın: ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Eklemek istediğiniz elemanı girin: ");
                    dizi.add(sc.next());
                    break;
                case 2:
                    if (!dizi.isEmpty()) {
                        dizi.remove(dizi.size() - 1);
                        System.out.println("En üst eleman kaldırıldı.");
                    } else {
                        System.out.println("Yığın boş.");
                    }
                    break;
                case 3:
                    System.out.println(dizi.get(dizi.size() - 1));
                    break;
                case 4:
                    Set<String> sirali = new TreeSet<>(dizi);
                    System.out.println(sirali);
                    break;
                case 5:
                    ArrayList<String> ters = new ArrayList<>();
                    for (int i = 1; i <= dizi.size(); i++) {
                        ters.add(dizi.get(dizi.size() - i));
                    }
                    System.out.println(ters);
                    break;
                case 6:
                    System.out.println(dizi.size());
                    break;
                case 7:
                    System.out.println("Eleman girin:");
                    String aranan = sc.nextLine().toLowerCase().trim();
                    int count = 0;
                    for (int i = 0; i < dizi.size(); i++) {
                        if (aranan.equalsIgnoreCase(dizi.get(i))) {
                            count++;
                        }
                    }
                    System.out.println("Eleman dizide " + count + " kere geçiyor.");
                    break;
                case 8:
                    ArrayList<Integer> indexes = new ArrayList<>();
                    String ara = sc.nextLine();
                    for (int i = 0; i < dizi.size(); i++) {
                        if (ara.equalsIgnoreCase(dizi.get(i))) {
                            indexes.add(i);
                        }
                    }
                    System.out.println(indexes);
                    break;
                case 9:
                    ArrayList<String> kopya = new ArrayList<>(dizi);
                    System.out.println(kopya);
                    break;
                case 10:
                    System.out.println(dizi);
                    System.out.println("Hangi elemnı kaldırmak istiyorsunuz?");
                    String rem = sc.nextLine();
                    if (dizi.contains(rem)) {
                        dizi.remove(rem);
                        System.out.println("Eleman kaldırıldı.");
                    } else
                        System.out.println("Dizide böyle br eleman mevcut değil.");
                    break;
                case 11:
                    System.out.println("İlk indexi girin:");
                    int index1 = sc.nextInt();
                    sc.nextLine();
                    int index2 = sc.nextInt();
                    System.out.println("İkinci indexi girin:");
                    sc.nextLine();
                    System.out.println(dizi.subList(index1, index2));
                    break;
                case 12:
                    System.out.println(dizi);
                    break;
                case 0:
                    exit = true;
                    System.out.println("Programdan çıkılıyor.");
                    break;
                default:
                    System.out.println("Geçersiz seçim. Lütfen tekrar deneyin.");
                    break;
            }
            listCurrentElements();
        }
    }

    private static void listCurrentElements() {
        System.out.println("Güncel Elemanlar: " + dizi);
    }
}


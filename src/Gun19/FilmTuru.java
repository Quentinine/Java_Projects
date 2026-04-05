package Gun19;

import java.util.*;

public class FilmTuru {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /**En popüler türü bul ve o türü seçen tüm kişileri yazdır.**/

        HashMap<String, ArrayList<String>> filmturu = new HashMap<>();
        HashMap<String, Integer> count = new HashMap<>();

        for (int i = 0; i < 5; i++){
            System.out.println("Film girin: ");
            String film = scanner.nextLine().trim().toLowerCase();
            System.out.println("İsim girin: ");
            String isim = scanner.nextLine().trim().toLowerCase();

            if (!filmturu.containsKey(film)) {
                filmturu.put(film, new ArrayList<>());
                count.put(film, 0); // Başlangıç 0, aşağıda 1 olacak
            }

            filmturu.get(film).add(isim);
            count.put(film, count.get(film) + 1);
        }

        for (String film : filmturu.keySet()) {
            System.out.println(film + " seven ogrenciler: " + filmturu.get(film));
        }
        for (String film: count.keySet()){
            System.out.println(film + " kez seçildi.");
        }

        List<String> tek = new ArrayList<>();
        for (Map.Entry<String, ArrayList<String>> entry : filmturu.entrySet()) {
            String turAdi = entry.getKey();
            ArrayList<String> isimler = entry.getValue();

            if (isimler.size() == 1) {
                tek.add(turAdi);
            }}

        ArrayList<String> eli = new ArrayList<>();
        for (ArrayList<String> isimlistesi: filmturu.values()){
            for (String isim: isimlistesi){
                if (isim.contains("e")){
                    eli.add(isim);

                }}}

        int max = 0;
        String maxi = "";
        for (Map.Entry<String, ArrayList<String>> entry: filmturu.entrySet()){
            ArrayList<String> deger = entry.getValue();
            if(deger.size()>max){
                max = deger.size();
                maxi = entry.getKey();
            }
        }
        System.out.println("En cok sevilen tür:" + maxi);

        System.out.println("içinde e geçen isimler" + eli);
        System.out.println(tek);

    }
}

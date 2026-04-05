package Gun21;

import java.util.*;

public class FilmArsivi {
    public static List<String> filmlistesi(String veri) {
        List<String> filmler = new ArrayList<>();
        String[] filmisimleri = veri.split(",");

        for (String film : filmisimleri) {
            film = film.trim();

            if (!film.isEmpty()) {
                filmler.add(film);
            }
        }
        return filmler;
    }


    public static Set<String> benzersizfilmler(List<String> filmler) {
        return new HashSet<>(filmler);
    }

    public static String kategoriBilgisi(String kod) {
        switch (kod.toUpperCase()) {
            case "A":
                return "Bilim kurgu;";
            case "B":
                return "Dram";
            case "C":
                return "Aksiyon";
            default:
                return "Tanimsiz";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Film isimlerini virgüllü girin: ");
        String veri = scanner.nextLine();
        System.out.println("Kategori girin");
        String kod = scanner.nextLine();


        List<String> filmler = filmlistesi(veri);

        Set<String> benzersizfilmler = benzersizfilmler(filmler);

        String kategoribilgisi = kategoriBilgisi(kod);

        System.out.println("");


    }
}





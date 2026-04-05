package Projects.Proje2;

import java.util.Arrays;
import java.util.Scanner;

public class Soru4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] aylar = {
                "ocak", "subat", "mart", "nisan", "mayıs", "haziran",
                "temmuz", "agustos", "eylul", "ekim", "kasım", "aralık"};

        Integer[] gunler = new Integer[30];

        //her ayın 30 gün olduğunu varsaydım.
        for (int i = 0; i < 30; i++) {
            gunler[i] = (i + 1);
        }

        Integer gun = 0;
        String ay = "";

        do {
            System.out.println("Lütfen bulunduğunuz ayı girin: ");
            ay = scanner.nextLine().trim().toLowerCase();
            if (!Arrays.asList(aylar).contains(ay)) {
                System.out.println("Hatalı ay girdiniz.");
            }
        }
        while (!Arrays.asList(aylar).contains(ay));

        do {
            System.out.println("Lütfen ayın hangi gününde olduğunuzu girin: ");
            gun = scanner.nextInt();
            scanner.nextLine();
            if (!Arrays.asList(gunler).contains(gun)) {
                System.out.println("Hatalı gun girdiniz.");
            }
        }
        while (!Arrays.asList(gunler).contains(gun));

        if (ay.equals("nisan")||(ay.equals("mayis"))|| (gun >= 20 && ay.equals("mart"))||(gun <= 20 && ay.equals("haziran"))){
            System.out.println("Seçtiğiniz ay ilkbahar.");
        } else if (ay.equals("temmuz")||(ay.equals("agustos"))|| (gun >= 21 && ay.equals("haziran"))||(gun <= 21 && ay.equals("eylül"))){
            System.out.println("Seçtiğiniz ay yaz.");
        } else if (ay.equals("ekim")||(ay.equals("kasım"))|| (gun >= 22 && ay.equals("eylül"))||(gun <= 20 && ay.equals("aralık"))) {
            System.out.println("Seçtiğiniz ay sonbahar.");
        } else if (ay.equals("ocak")||(ay.equals("subat"))|| (gun >= 21 && ay.equals("aralık"))||(gun >= 19 && ay.equals("mart"))){
            System.out.println("Seçtiğiniz ay kış.");}





    }} //son

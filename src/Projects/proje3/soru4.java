package Projects.Proje3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class soru4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String[] urunler = {"domates", "süt", "un", "makarna", "salca", "cips"};
        double[] price = {50.5, 25.0, 34.0, 5.0, 56.0, 45, 0};
        int[] stock = {10, 25, 1, 500, 15, 60};

        ArrayList<Integer> miktar = new ArrayList<>();
        String input = "";
        ArrayList<String> basket = new ArrayList<>();
        int index = 0;
        int sayi = 0;
        ArrayList<Double> tutar = new ArrayList<>();
        double toplam = 0;


        do {
            System.out.println("Lütfen satın alacağınız ürünleri listeden secerek alışverişinizi yapın: ");
            System.out.println("Satın alma işlemini tamamlamak için \"cikis\" yazın.");
            System.out.println(Arrays.toString(urunler).trim().toLowerCase());
            input = scanner.nextLine();
            if (input.equalsIgnoreCase("cikis")) {
                System.out.println("Alısveris tamamlandı:");
            }
            for (int i = 0; i < urunler.length; i++) {
                if (urunler[i].equals(input)) {
                    basket.add(input);
                    System.out.println("Ürün sepete eklendi.");
                    do {
                        System.out.println("Kaç tane? ");
                        sayi = scanner.nextInt();
                        scanner.nextLine();
                        if (sayi > stock[i]) {
                            System.out.println("Stok yetersiz, " + (sayi - stock[i]) + " ürün eksik tekrar giriş yapın.");
                        }
                    }
                    while (sayi > stock[i]);
                    miktar.add(sayi);
                    tutar.add(stock[i] * price[i]);
                    toplam += stock[i] * price[i];
                    index++;
                }
            }
        }
        while (!input.equals("cikis"));
        {
            System.out.println("Alısveris done:");
        }


        System.out.println("Programdan cıkıldı.");

        for (int i = 0; i < basket.size(); i++) {
            System.out.println(basket.get(i) + " ürününden " + miktar.get(i) + " tane aldınız.");
            System.out.println(basket.get(i) + " için ödeyeceginiz ücret " + tutar.get(i) + "tl.");
        }

        System.out.println("Toplam ödeyeceğiniz ücret: " + toplam + "tl.");


    }
}

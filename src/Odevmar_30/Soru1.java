package Odevmar_30;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Soru1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> sinif = new ArrayList<>();
        String stu = "";


        do {
            System.out.println("Lütfen öğrenci isimlerini girin, cıkıs yapmak için cikis yazın.");
            stu = scanner.nextLine().trim().toLowerCase();
            if (stu.equalsIgnoreCase("cikis")) {
                System.out.println("Liste tamamlandı");
            } else if (!stu.isEmpty()) {
                sinif.add(stu);
                System.out.println("Ogrenci sisteme eklendi");
            } else {
                System.out.println("Hata");
            }

        } while (!stu.equalsIgnoreCase("cikis"));

        Set<String> qsinif = new HashSet<>(sinif);
        System.out.println(qsinif);
        System.out.println(qsinif.size());
    }
} //son

package Gun19;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Ogrenclupkayit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        HashMap<String, ArrayList<String>> clupMap = new HashMap<>();

        System.out.println("--- Kulüp Kayıt Sistemi ---");
        System.out.println("Çıkmak için kulüp adına 'cikis' yazınız.\n");

        while (true) {
            System.out.print("Lütfen kulüp adını girin: ");
            String clu = scanner.nextLine();

            if (clu.equalsIgnoreCase("cikis")) break;

            System.out.print("Lütfen öğrenci adını girin: ");
            String stu = scanner.nextLine();

            if (!clupMap.containsKey(clu)) {
                clupMap.put(clu, new ArrayList<>());
            }

            clupMap.get(clu).add(stu);

            System.out.println(stu + " öğrencisi " + clu + " kulübüne eklendi.\n");
        }
        
        System.out.println("Güncel Kulüp Listesi");
        for (String kulup : clupMap.keySet()) {
            System.out.println(kulup + " Kulübü Öğrencileri: " + clupMap.get(kulup));
        }

        scanner.close();
    }
}
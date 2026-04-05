package Gun13;

import java.util.Scanner;

/*** Bir sinema salonu 4 sıra ve her sırada 5 koltuk içeriyor.
 * Kullanıcı 0/1 girerek koltuk durumlarını doldursun:
 * 0 = boş
 * 1 = dolu
 * İstenenler:
 * Toplam dolu koltuk sayısını yazdır.
 * En çok dolu olan sırayı yazdır.
 * Eğer toplam doluluk %70 ve üstüyse “Salon dolu sayılır” mesajı ver.* */

public class SinemaKoltuk {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int dolu = 0;
        int bos = 0;

        int[][] koltuk = new int[4][5];
        for (int i = 0; i < koltuk.length; i++) {
            for (int j = 0; j < koltuk[i].length; j++) {
                System.out.println("Lütfen koltuk dolulugunu girin: ");
                koltuk[i][j] = scanner.nextInt();
                scanner.nextLine();
                if (koltuk[i][j] == 1){
                    dolu++;}
                else if (koltuk[i][j] == 0) {
                    bos++;}
                else {System.out.println("Hatalı giriş yaptınız.");}
            }
        }
        System.out.println("Dolu koltuk: " + dolu +"\nBos koltuk: "+ bos);
    }}

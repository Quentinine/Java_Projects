package Gun13;

import java.util.Scanner;

/*** Bir sınıfta 3 öğrenci ve her öğrencinin 4 sınav notu var.
 * Kullanıcıdan notları tablo şeklinde al.
 * İstenenler:
 * Her öğrencinin ortalamasını yazdır.
 * Ortalaması 50 ve üstü olanlara “Geçti”, aksi halde “Kaldı” yazdır.
 * Sınıftaki en yüksek notu ve hangi öğrenci/sınavda olduğunu yazdır.* */

public class Sinif {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[][] notlar = new double[3][4];
        double[] ort = new double[4];
        double top = 0;
        double max = 0;

        for (int i = 0; i < notlar.length; i++) {
            for (int j = 0; j < notlar[i].length; j++) {
                System.out.println("Lütfen Notu girin: ");
                notlar[i][j] = scanner.nextDouble();
                scanner.nextLine();
                top += notlar[i][j];
                if(notlar[i][j]> max){
                    max = notlar[i][j];
                }
            }
            ort[i] = top/4;
            System.out.println((i+1) + ". ogrencinin ortalaması: " + ort[i]);
            if (ort[i] >= 50){
                System.out.println((i+1) + "numaralı ogreci dersi gecti!!");}
            else {System.out.println((i+1) + ". ogrencinin ortalaması: " + ort[i]);}
        }
        System.out.println("Sınavdaki en yüksek not: " + max);

    }


}

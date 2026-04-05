import java.util.Scanner;

public class Soru9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] ant = new String[7];
        double[] time = new double[7];
        double[] gunlukKaloriler = new double[7];

        double toplamKalori = 0;
        int dinlenmeSayisi = 0;
        double enYuksekKalori = 0;
        int enYuksekGunIndex = 0;

        for (int i = 0; i < 7; i++) {
            System.out.println("\n--- " + (i + 1) + ". Gün");
            System.out.print("Antrenman Türü (Kosu, Yuzme, Bisiklet, Dinlenme): ");
            ant[i] = scanner.nextLine().toLowerCase();

            if (ant[i].equals("dinlenme")) {
                time[i] = 0;
                gunlukKaloriler[i] = 0;
                dinlenmeSayisi++;
            } else {
                System.out.print("Süre (dakika): ");
                time[i] = scanner.nextDouble();
                scanner.nextLine();

                double katsayi = 0;
                switch (ant[i]) {
                    case "koşu":
                        katsayi = 10.0;
                        break;
                    case "yüzme":
                        katsayi = 8.0;
                        break;
                    case "bisiklet":
                        katsayi = 6.0;
                        break;
                    default:
                        katsayi = 4.0;

                        gunlukKaloriler[i] = time[i] * katsayi;
                        toplamKalori += gunlukKaloriler[i];

                        if (gunlukKaloriler[i] > enYuksekKalori) {
                            enYuksekKalori = gunlukKaloriler[i];
                            enYuksekGunIndex = i;
                        }
                }
            }
        }
    }


}
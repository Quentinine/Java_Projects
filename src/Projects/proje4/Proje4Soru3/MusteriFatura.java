package Projects.Proje4.ProjeSoru3;

import java.util.Scanner;

public class MusteriFatura {
    private float aylikSabitUcret;
    private int fazlaKullanimGB;
    private EkUcret kategori;

    MusteriFatura(float sabit, int gb, int katNo) {
        this.aylikSabitUcret = sabit;
        this.fazlaKullanimGB = gb;
        this.kategori = (katNo == 2) ? EkUcret.KATEGORI_2 :
                        (katNo == 3) ? EkUcret.KATEGORI_3 :
                        EkUcret.KATEGORI_1;
    }

    public static MusteriFatura yeniMusteriAl() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Sabit Ücret: ");
        float s = sc.nextFloat();
        System.out.print("Kategori (1/2/3): ");
        int k = sc.nextInt();
        System.out.print("Fazla GB: ");
        int g = sc.nextInt();

        return new MusteriFatura(s, g, k);
    }

    public double hesapla() {
        return aylikSabitUcret + (fazlaKullanimGB * kategori.getBirimFiyat());
    }
}
package Projects.proje7.soru2;

import java.util.Scanner;

public class Kahvemakinesi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String anaSecim = "";

        do {
            System.out.println("----------KAHVE MAKİNESİ UYGULAMASINA HOSGELDİNİZ--------");
            Runner kahve1 = new Runner();
            kahve1.kahveSecimi();
            kahve1.sutEkle();
            kahve1.sekerEkle();
            kahve1.kahveBoyutu();

            System.out.println("Siparişiniz başarıyla alındı!");
            System.out.println("Yeni sipariş için 'devam', çıkmak için 'cikis' yazın:");
            anaSecim = sc.nextLine().trim();

        } while (!anaSecim.equalsIgnoreCase("cikis"));

        System.out.println("Bizi tercih ettiğiniz için teşekkürler!");
    }
}
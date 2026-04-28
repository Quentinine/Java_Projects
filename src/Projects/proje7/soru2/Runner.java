package Projects.proje7.soru2;

import java.util.Scanner;

public class Runner extends KahveDatabase implements metods {
    Scanner sc = new Scanner(System.in);
    String secim;
    String sut;
    int seker;
    Size boyut;

    @Override
    public void kahveSecimi() {
        System.out.println("Lütfen aşağıdaki listeden bir kahve seçin: ");
        System.out.println(kahveler);

        secim = sc.nextLine().trim();

        boolean varMi = false;
        for (String k : kahveler) {
            if (k.equalsIgnoreCase(secim)) {
                varMi = true;
                secim = k;
                break;
            }
        }
        if (secim.equalsIgnoreCase("Buzlu Kahve") || secim.equalsIgnoreCase("Frappuccino"))
            System.out.println("Sıcak bir yaz gününde serinlemenin en iyi yolu… Mükemmel karar!");

        if (!varMi) {
            System.out.println("Geçersiz seçim. Lütfen geçerli bir düğmeye basın!");
            kahveSecimi();
        } else {
            System.out.println(secim + " hazırlanıyor...");
        }
    }

    @Override
    public void sutEkle() {
        System.out.println("Süt eklensin mi? Y/N: ");
        sut = sc.nextLine().trim(); // toLowerCase() yapmana gerek yok çünkü equalsIgnoreCase kullanıyorsun

        if (sut.equalsIgnoreCase("Y")) {
            System.out.println("Kahvenize süt ekleniyor.");
        } else if (sut.equalsIgnoreCase("N")) {
            System.out.println("Sütsüz hazırlanıyor.");
        } else {
            System.out.println("Hatalı giriş yaptınız, tekrar deneyin.");
            sutEkle();
        }
    }


    @Override
    public void sekerEkle() {
        System.out.print("Kaç şeker istersiniz?: ");
        seker = sc.nextInt();
        sc.nextLine();
        if (seker > 0) {
            System.out.println(seker + " şeker ekleniyor.");
        } else if (seker == 0) {
            System.out.println("Kahveniz şekersiz hazırlanıyor...");
        } else {
            System.out.println("hatalı giriş yaptınız tekrar deneyin");
            sekerEkle();
        }
    }

    @Override
    public void kahveBoyutu() {
        System.out.println("lütfen bir kahve bouyu girin (k/o/b): \n1 - kucuk (k)\n2 - orta (o)\n3 - buyuk (b)");
        String kob = sc.nextLine().trim();

        if (kob.equalsIgnoreCase("k") || kob.equalsIgnoreCase("o") || kob.equalsIgnoreCase("b")) {
            switch (kob) {
                case "k":
                    boyut = Size.small;
                    break;
                case "o":
                    boyut = Size.tall;
                    break;
                case "b":
                    boyut = Size.venti;
                    break;
            }
        } else {
            System.out.println("Yanlış giriş yaptınız, tekrar deneyin.");
            kahveBoyutu();
        }
    }
}

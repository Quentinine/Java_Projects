package Projects.Proje4.ProjeSoru2;

public class SifreKontrol {
    String sifre;

    //Constructor
    SifreKontrol(String sifre) {
        this.sifre = sifre;
    }

    //şifre kontrol
    static void kontrol(String sifre) {
        if (sifre.length() >= 8 && sifre.matches(".*[A-ZÇĞİÖŞÜ].*") && sifre.matches(".*\\W.*") && sifre.matches(".*[0-9]*.") && sifre.matches(".*[a-zçğıöşü].*"))
            System.out.println("Şifre güvenli");
        else {
            System.out.println("Şifre güvenli değil");
        }
    }
}

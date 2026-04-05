package Projects.Proje3;
import java.util.Scanner;


public class soru1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen cümlenizi girin: ");
        String cumle = scanner.nextLine();
        String upp = buyukHarfeCevir(cumle);
        String low = kucukHarfeCevir(cumle);
        System.out.println(upp);
        System.out.println(low);
    }

    public static String buyukHarfeCevir(String metin) {
        return metin.toUpperCase().trim();
    }

    public static String kucukHarfeCevir(String metin) {
        return metin.toLowerCase().trim();}
}

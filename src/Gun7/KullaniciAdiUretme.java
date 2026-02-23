package Gun7;

import java.util.Scanner;

public class KullaniciAdiUretme {
    public static void main(String[] args) {
        /**
         * Ad soyad alın. Boşlukları temizleyin.
         * Ad soyad arasında en az 1 boşluk yoksa tekrar isteyin.
         * Varsa: adın ilk harfi + soyadın tamamı şeklinde kullanıcı adı üretin
         * ve küçük harfle yazdırın.
         * */

        Scanner scanner = new Scanner(System.in);

        String fullName;

        do {
            System.out.print("Ad Soyad: ");
            fullName = scanner.nextLine().trim();

            if (!fullName.contains(" ")) {
                System.out.println("Ad soyad arasinda bosluk birakiniz");
            }
        } while (!fullName.contains(" "));

        int index = fullName.indexOf(" ");
        String firstName = fullName.substring(0,index);
        String lastName = fullName.substring(index+1);

        String username = (firstName.substring(0,1) + lastName).toLowerCase();
        //String username = (firstName.substring(0,1).concat(lastName)).toLowerCase();

        System.out.println("Kullanici adi: " + username);

    }
}

package Projects.proje6.soru2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class geminisorular {
    static void main(String[] args) {
        int sayi;
        System.out.println("lütfen bir sayı girin");
        Scanner sc = new Scanner(System.in);

        try{sayi = sc.nextInt();
        sc.nextLine();}
        catch(InputMismatchException e){
            System.out.println("yanlış tipte veri girişi yaptınız!!");
        }finally {
            System.out.println("Sistem durduruldu.");
        }

    }


}

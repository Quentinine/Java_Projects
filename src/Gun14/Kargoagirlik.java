package Gun14;
import java.util.ArrayList;
import java.util.Scanner;

public class Kargoagirlik {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> kargo = new ArrayList<>();
        ArrayList<String> boyut = new ArrayList<>();


        while(true){
            System.out.println("Agırlık girin: ");
            int kg = scanner.nextInt();
            scanner.nextLine();

            if (kg == 0.0){ // cıkıs için kullanılacak.
                break;
            }

            if (kg < 0.0){
                System.out.println("Negatif giris olamaz. Tekrar deneyin");
                continue;
            }

            kargo.add(kg);

            if (kg <= 2.0){
                boyut.add("Küçük kargo");}
            else if (kg <=5.0){
            boyut.add("Orta kargo");}
            else if (kg <=9.0){
            boyut.add("Büyük kargo");}
            else {System.out.println("Hiç paket girilmedi.");}}

        int total = 0;
        double ort = 0;

        for (int i=0; i< kargo.size();i++){
            total += kargo.get(i);
        }
        ort = total/kargo.size();

        for (int i = 0; i< kargo.size(); i++){
            System.out.println((i+1) + ".numaralı kargonuzun agrırlıgı " + kargo.get(i)+ "kg, boyutu "+ boyut.get(i) +".");
        }




    }
}

package Gun4;

public class testing {
    public static void main(String[] args) {


        double balance = 100;
        double price = 120.5;

        if (balance >= price){
            System.out.println("Satın alma başarılı.");
        } else System.out.println("Yetersiz bakiye.");

        double sıcaklık = 30.67;

        if (sıcaklık >= 30) {
            System.out.println("Hava çok sıcak, gölge bir yer bul!.");
        } else if (30 > sıcaklık && sıcaklık > 15) {
            System.out.println("Hava harika, dışarı çık!");
        } else if (15 > sıcaklık && sıcaklık > 0) {
            System.out.println("Hava serin, ceketini al");
        } else System.out.println("Hava buz gibi, evde kal");




    }
}

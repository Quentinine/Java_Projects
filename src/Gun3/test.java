package Gun3;

public class test {
    public static void main(String[] args) {
        String email = "  test@Domain.com  ";
        String as = email.trim().toLowerCase();
        System.out.println(as);

        if (as.contains("@") && as.endsWith(".com")) {
        System.out.println("Giriş başaraılı.");}

        else System.out.println("Geçersiz eposta");


    }
}

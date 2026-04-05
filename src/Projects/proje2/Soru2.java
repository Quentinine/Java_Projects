package Projects.Proje2;

import java.util.Scanner;

class Soru2 {
    public static void main(String[] args) {
        System.out.println("Lütfen kelimeyi girin: ");
        Scanner scanner = new Scanner(System.in);
        String kelime = scanner.nextLine();
        kelime += " ";
        String zip = "";
        int count = 1;

        for (int i = 1; i < kelime.length(); i++) {
            if (kelime.charAt(i) == kelime.charAt(i - 1)) {
                count++;
            } else {
                zip += count + "" + kelime.charAt(i - 1);
                count = 1;
            }
        }

        System.out.println(zip);

    }
}
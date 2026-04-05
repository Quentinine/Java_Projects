package Projects.Proje1;

import java.util.Scanner;

public class ÜçgenÇözümtask2 {
          static void main(String[] args){
            Scanner scanner = new Scanner(System.in);
                        System.out.print("Birinci kenarı giriniz: ");
            int a = scanner.nextInt();

            System.out.print("İkinci kenarı giriniz: ");
            int b = scanner.nextInt();

            System.out.print("Üçüncü kenarı giriniz: ");
            int c = scanner.nextInt();

            if (a + b > c && a + c > b && b + c > a) {

                if (a == b && b == c) {
                    System.out.print("Bu bir Eşkenar Üçgendir.");
                }

                else if (a == b || a == c || b == c) {
                    System.out.print("Bu bir İkizkenar Üçgendir.");
                }

                else {
                    System.out.println("Bu bir Çeşitkenar Üçgendir.");
                }

                System.out.println("Girilen kenarlar geçerli bir üçgen oluşturmaz.");
                }

                scanner.close();
            }
          }


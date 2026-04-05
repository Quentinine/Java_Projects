package Projects.Proje4.ProjeSoru4;

import java.util.Scanner;

public class ParolaYazdir {
    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ParolaGen sifreYazdir = new ParolaGen();

        String sifre = sifreYazdir.passGen();

        System.out.println(sifre);

    }
}

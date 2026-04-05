package Projects.Proje1;

import java.util.Scanner;

public class ElektrikFaturasiCözüm {
    static void main(String[] args) {

        int eski_okuma, yeni_okuma, elektrik_tüketimi;
        double birim_fiyat =0.0, aylik_fatura;
        //değişkenleri almış oldum

        Scanner input = new Scanner(System.in);
        // kullanıcıdan girde alıyorum

        System.out.print("Eski okuma değerini giriniz (kWh): ");
        eski_okuma = input.nextInt();

        System.out.print("Yeni okuma değerini giriniz (kWh): ");
        yeni_okuma = input.nextInt();

        elektrik_tüketimi = yeni_okuma - eski_okuma ;
        //tüketimi görürümüm

        if (yeni_okuma < eski_okuma) {
            System.out.println("Hata !!! Yeni okuma eskisinden küçük olamaz");
            return;
        }

        //if (elektrik_tüketimi > 0) {
            //System.out.println("Dikkat ! yeni sayaç değeri eskisinden kücük olamaz");
        //}else {
            //hatalı giriş olursa kontrol ederim

            //birim fiyattan değer hesaplayacağım
            if (elektrik_tüketimi <= 100) {
                birim_fiyat = 1.1;
            } else if (elektrik_tüketimi <= 200) {
                birim_fiyat = 1.3;
            } else if (elektrik_tüketimi <= 300) {
                birim_fiyat = 1.5;
            } else if (elektrik_tüketimi <= 400) {
                birim_fiyat = 1.7;
            } else if (elektrik_tüketimi <= 500) {
                birim_fiyat = 1.9;
            }else {
                birim_fiyat = 2.3;
            }

            //aylık tüketim
            aylik_fatura = elektrik_tüketimi * birim_fiyat;

            System.out.println("\n---Fatura---");
            System.out.println(" Toplam tüketim " + elektrik_tüketimi + " KWH ");
            System.out.println(" Birim Fiyat " + birim_fiyat + " TL ");
            //System.out.println(" Ödenecek Fatura Bedeli " + aylik_fatura + " TL ");
            System.out.printf("Ödenecek Tutar  : %.2f TL\n", aylik_fatura);
            // virgülden sonra çok sıfır
            // %.2f ile sade 2 basamak getirsin istedim

          input.close();

        }
    }

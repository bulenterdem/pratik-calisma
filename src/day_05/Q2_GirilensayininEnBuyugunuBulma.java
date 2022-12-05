package day_05;

import java.util.Scanner;

public class Q2_GirilensayininEnBuyugunuBulma {
    public static void main(String[] args) {
        // // Kullanıcıdan 5 sayı isteyiniz, bu sayılardan en büyüğünü bularak yazdırınız.

        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen 5 adet sayi giriniz :");



        int enbuyuksayi=0;
        int sayac=0;

        while (sayac<5){

            int sayi= scan.nextInt();

            if (sayi>enbuyuksayi){
                enbuyuksayi=sayi;

            }

            sayac++;
        }
        System.out.println("Girilen Sayilarin Enbuyugu : "+ enbuyuksayi);











    }
}

package day_06;

import java.util.Random;
import java.util.Scanner;

public class Q16_SayiTahminiOyunu {
    // BILGISAYAR 0-100 ARASI TUTUP KULLANICIDAN TAHMIN ISTER
   // SAYIYI BULANA KADAR KUCULT VEYA BUYUT DIYE YOL GOSTERIR
   // BULUNCA KACINCI TAHMINDE BULDUGUNU YAZAR

    public static void main(String[] args) {

        System.out.println("Hosgeldiniz !");

        Random r = new Random();

        int num= r.nextInt(100);

        int bul=num;

        System.out.println(num);

        Scanner scan=new Scanner(System.in);

        int count=1;
        num=1;

        do {
            if (count==1){
                System.out.println("0 ile 100 arasinda bir sayi tuttum \nBunu tahmin et");
            } else if (bul>num) {
                System.out.println("daha buyuk bir sayi giriniz");

            } else System.out.println("daha kucuk bir sayi giriniz");

            num= scan.nextInt();

            if (num==bul){
                System.out.println("dogru tahmin " + count+ ". tahminde buldunuz");
            } else System.out.println("yanlis tahmin Denemeye devam et");

            count++;
        } while (num!=bul);


    }
}

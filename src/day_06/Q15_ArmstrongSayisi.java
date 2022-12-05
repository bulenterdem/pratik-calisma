package day_06;

import java.util.Scanner;

public class Q15_ArmstrongSayisi {
    public static void main(String[] args) {
        //// verilen bir sayinin Armstrong sayi olup olmadigini kontrol eden code yazin
        //        // Armstrong sayi rakamlarinin kuplerinin toplamina esit olan sayidir
        //        // 153 = (1*1*1) + (5*5*5) + (3*3*3) gibi

        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen Armstrong sayisi olup olmadigini kontrol etmek istediginiz " +
                "bir tam sayi giriniz");

          int sayi= scan.nextInt();
         int kuplertoplami=0;
         int ilkdeger= sayi;
         int rakam = 0;


        while (sayi != 0) {

            rakam=sayi%10;

            kuplertoplami+=rakam*rakam*rakam;
            sayi/=10;
        }

        if (kuplertoplami==ilkdeger) {
            System.out.println("Girdiginiz sayi bir Amstrong sayidir");
        }

        else System.out.println("Girdiginiz sayi bir Amstrong sayi degildir");
    }
}

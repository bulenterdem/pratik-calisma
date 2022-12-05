package day_02;

import java.util.Scanner;

public class q2_ifElseStatement {
    public static void main(String[] args) {

        /*
        Bir dersten alinan vize, final ve devam puanlarinin girilip ortalama hesaplandiktan sonra
        dersten gecilip
        gecilmedigini consola yazdiran bir program yazalim.
     */
        // ortalama = vizenin %10'i + finalin %80'si + devam puaninin %10'u


        Scanner scan=new Scanner(System.in);
        System.out.println(" lutfen vize puani girin ");
        double vze= scan.nextDouble();

        System.out.println(" final sinavini giriniz ");
        double fnl=scan.nextDouble();

        System.out.println(" devam puanini girin ");
        double dvm= scan.nextDouble();

        double gecmenotu= (vze%10+fnl%80+dvm%10);


        if (gecmenotu>=70 || gecmenotu<= 100) {
            System.out.println("tebrikler gectiniz");


    } else if (gecmenotu>=60) {
            System.out.println("sartli gectiniz");
        } else {
            System.out.println("uzgunum kaldiniz");

        }

        }

    }

package day_01;

import java.util.Scanner;

public class Q4 {
    //Kullanicidan bir sayi aliniz
    //Sayi 0 dan buyuk esit ise 10 dan kucuk olup olmadigini kontrol ediniz.
    //10 dan kucuk ise ekrana "Rakam" yazdiriniz degilse "Pozitif Sayi" yazdiriniz.
    //Sayi 0 dan kucuk ise ekrana "Negatif Sayi" yazdiriniz.

    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("lutfen bir sayi giriniz");

        int sayi= scan.nextInt();

        if (sayi>=0 && sayi<10 ){

            System.out.println("RAKAM");
        } else if (sayi>10) {
            System.out.println("POZITIF SAYI");

        }else {
            System.out.println("NEGATIF SAYI");
        }


    }
}

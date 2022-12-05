package day_04;

import java.util.Scanner;

public class kelimearatma {
    public static void main(String[] args) {
// * Ask the user for a String and a sentence
        /* Find and print occurrence of String in sentence.
         * (without case sensitivity)
         *
         * sentence =“hihihi” String=“hi” output=“There are 3 "hi"s in hihihi "
         * sentence =“I am coming” String=“com” output ="there is 1 “com” in sentence "
         *
         *//*
         * Kullanicidan bir kelime ve cumle aliniz
         * Kelimeyi cumle icinde aratip yazdiriniz
         *
         * Orn : Cumle = "hihihi" String = "hi" output = "hihihi" ' nin icinde 3 tane "hi" var
         * Orn : Cumle = "Yoldayim" String = "yol" output = "Yoldayim" in icinde 1 tane "yol" var
         *
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir cumle giriniz");

      String cumle =scan.nextLine();

        System.out.println("cumlede aratmak istediginiz kelimeyi giriniz");
        String kelime= scan.nextLine();

        int sayac=0;

        for (int i = 0; i <=cumle.length()- kelime.length() ; i++) {

            if (cumle.substring(i, i + kelime.length()).equalsIgnoreCase(kelime)) {
                sayac++;
            }
        }
        System.out.println(sayac);

        if (sayac>1){

            System.out.println("cumlenin icersinde "+ sayac+ " kadar "+ kelime+" var va");
        } else if (sayac==1) {
            System.out.println("cumlede 1 adet "+kelime+" kelimesi var");

        }else {
            System.out.println("aradaginiz kelime cumlede yoktur");
        }
    }

}

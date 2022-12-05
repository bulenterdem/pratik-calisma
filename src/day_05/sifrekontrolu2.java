package day_05;

import java.util.Scanner;

public class sifrekontrolu2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String sifre;
        int bayrak;
        boolean sifreDogruMu;

            do { System.out.println("Lutfen bir sifre giriniz");
                sifre = scan.nextLine();

                bayrak = 0;
                int sonuc = kucukHarfKontroluYap(sifre);

                bayrak = bayrak + sonuc;

                sonuc = buyukHarfKontroluYap(sifre);

                bayrak = bayrak + sonuc;

                sonuc = ozelKarakterKontroluYap(sifre);
                bayrak = bayrak + sonuc;


                if (sifre.length() < 8) {
                    System.out.println("sifre en az 8 karakter olmalidir");
                } else {
                    bayrak++;

                }

            }while(bayrak !=4);

            {
                System.out.println("Sifreniz basari ile kaydedildi");
            }


    }

    public static int ozelKarakterKontroluYap(String sifre) {
        int bayrak = 0;
        String ozelKarakterler = "§±@!$%^&*()_-+=?/>.<,`~#";


        for (int i = 0; i < sifre.length(); i++) {
            if (ozelKarakterler.contains(sifre.substring(i, i + 1))) {
                bayrak++;
                break;
            }
        }

        if (bayrak == 0) {
            System.out.println("Sifre ozel karakter icermelidir");
            return 0;
        } else return 1;
    }

    public static int buyukHarfKontroluYap(String sifre) {

        int bayrak = 0;

        for (int i = 0; i < sifre.length(); i++) {

            if (sifre.charAt(i) >= 'A' && sifre.charAt(i) <= 'Z') {
                bayrak++;
                break;
            }
        }

        if (bayrak == 0) {
            System.out.println("Sifre buyuk harf icermelidir");
            return 0;
        } else return 1;
    }

    public static int kucukHarfKontroluYap(String sifre) {
        int bayrak = 0;

        for (int i = 0; i < sifre.length(); i++) {

            if (sifre.charAt(i) >= 'a' && sifre.charAt(i) <= 'z') {
                bayrak++;
                break;
            }
        }

        if (bayrak == 0) {
            System.out.println("Sifre kucuk harf icermelidir");
            return 0;
        } else return 1;
    }
}

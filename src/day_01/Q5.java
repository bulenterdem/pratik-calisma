package day_01;

import java.util.Scanner;

public class Q5 {

     /*
 Cift sayida harf iceren bir String degiskenin ortasindaki harfi
 konsolda yazdirmak icin bir Java programi yaziniz.
 Eger kelime cift sayida harf iceriyorsa ortadaki 2 harfi yazdirin

 ORNEK:
       INPUT  :  Python
       OUTPUT :  th
 */

    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("Lutfen bir kelime giriniz");

        String input= scan.next();

        System.out.println(ortadakiharfiyazdir(input));



    }

  public static String ortadakiharfiyazdir(String input) {

        int uzunluk=input.length();
        int ortadakiindex=uzunluk/2;
        int baslagicindex=ortadakiindex-1;
        int bitisindex=ortadakiindex+1;

        if (uzunluk % 2 ==0) {
            System.out.println(input.substring(baslagicindex, bitisindex));;
        }
        else System.out.println(input.substring(ortadakiindex,ortadakiindex+1)); ;
      return input;
  }
}

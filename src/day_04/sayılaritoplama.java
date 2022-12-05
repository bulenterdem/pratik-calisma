package day_04;

public class sayılaritoplama {
    public static void main(String[] args) {
        //method which accepts a String as parameter
              /*  * and prints the sum of the digits, present in the given string
         *
         * Parametre olarak bir String kabul eden ve verilen Stringde
                * bulunan rakamların toplamını yazdiran bir method yazın.
         *
         * Input : ade1r4d3
                * Output : 1+4+3 = 8
                *
         * Use Character.isDigit()
                *     Integer.valueOf()

               */
        String kelime="ade1r4d3";

        rakamlarintoplami(kelime);

    }
    public static void rakamlarintoplami(String input){

        int toplam=0;

        for (int i = 0; i <= input.length()-1; i++) {

            if (Character.isDigit(input.charAt(i))){

           toplam+=Integer.valueOf(""+ input.charAt(i));
            }

        }
        System.out.println("rakamlarin toplami: " +  toplam);

    }



}
/*

String[] arr=input.split("");

for (int i = 0; i < input.length(); i++) {
    Character a = input.charAt(i);
    if (Character.isDigit(a)) {
        //top += Integer.valueOf("" + input.charAt(i));
        top += Integer.valueOf(arr[i]);
    }
 */

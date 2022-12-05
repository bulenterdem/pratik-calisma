package day_01;

public class Q2_Print_ {
    public static void main(String[] args) {

        /*
        76453 sayisinin her bir basmagini konsolda alt alta yazdirin
        input : 76543
        output: 7
                6
                5
                4
                3

         */
        int sayi=76543;
        int birler=sayi%10;
        int onlar=(sayi/10)%10;
        int yuzler=(sayi/100)%10;
        int binler=(sayi/1000)%10;
        int onbinler=(sayi/10000)%10;


        System.out.println(onbinler + "\n" + binler + "\n" + yuzler + "\n" + onlar +"\n" + birler );




    }
}

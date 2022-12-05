package day_05;

public class Q3_sayilariTersCevirme {
    public static void main(String[] args) {
        ///*
        // * Interview questions…
        // *
        // * write a return method to reverse number
        // *
        // * Input : 12345 Output : 54321
        // */
        int input=12345;

        System.out.println("Girdiginiz sayinin ters cevrilmis hali: "+reversenum(input));


    }

public static int reversenum(int input) {

        int reversum=0;

        while (input>0){

            reversum=input%10+reversum*10;
            input=input/10;


        }


        return reversum;



    }

}





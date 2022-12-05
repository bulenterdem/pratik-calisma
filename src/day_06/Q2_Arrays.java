package day_06;

import java.util.Arrays;

public class Q2_Arrays {

    public static void main(String[] args) {

        int [] integer;
        integer=new int[5];
        System.out.println(Arrays.toString(integer));

        String [] isimler= new String[3];

        isimler[0]= "ayse";
        isimler[1]= "fatma";
        isimler[2]= "hayriye";

        System.out.println(Arrays.toString(isimler));

        String boskova=isimler[0];

        isimler[0]=isimler[1];
        isimler[1]=boskova;

        System.out.println(Arrays.toString(isimler));



    }
}

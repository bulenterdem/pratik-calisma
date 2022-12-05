package day_06;

public class Q3_Arrays {
    // //Create an array of 5 floats and calculate their sum.

    public static void main(String[] args) {

        float[] sayilar = {1.0f, 2.0f, 3.0f, 4.0f, 5.0f};

        float sum = 0;

        for (int i = 0; i < sayilar.length; i++) {

            sum += sayilar[i];

        }
        System.out.println("Toplam : " + sum);

        sum = 0;
        int index = sayilar.length - 1;

        while (index >= 0) {
            sum += sayilar[index];
            index--;
        }
        System.out.println("toplam : " + sum);
        sum = 0;
        index = 0;

        while (index < sayilar.length) {
            sum += sayilar[index];
            index++;
        }
        System.out.println("toplam : " + sum);


        sum = 0;
        index = 0;

        do {
            sum += sayilar[index];
            index++;

        } while (index < sayilar.length);

        System.out.println("toplam : " + sum);

    }

    }



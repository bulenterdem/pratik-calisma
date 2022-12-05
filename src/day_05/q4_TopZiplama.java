package day_05;

public class q4_TopZiplama {
    public static void main(String[] args) {
        ///Bir top belirli yükseklikten atılmaktadır.
        //    // Atıldıktan sonra, atıldığı yüksekliğin 3/4 u kadar yerden yukarı doğru zıplamaktadır
        //    // Top zıplama  yüksekliği 1 metrenin altına indiğinde durmaktadır.
        //    // Bu ana kadar aldigi toplam yolu ve yere vurma sayısını bulan do while code blogu create ediniz.


        double yukseklik = 200;
      topuziplat(yukseklik);

    }


    public static void topuziplat(double yukselik){


        double yukseklik = 500;
        double topuntoplamyolu = 0;
        int yereVurmaSayisi = 0;



        do {
            yereVurmaSayisi++;
            topuntoplamyolu += yukseklik;
            yukseklik *= 0.75;
            topuntoplamyolu+=yukseklik;


        } while (yukseklik >= 100);

        System.out.println("topun toplam yolu :"+topuntoplamyolu +
                "\nyere vurma sayisi:"+yereVurmaSayisi);


    }


}
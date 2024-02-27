package j12_ArrayList.Tasks_02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Task12_Manav {
    static List<String> urunListesi = new ArrayList<>(Arrays.asList("domat - urun kodu : 1", "elma - urun kodu : 2", "muz - urun kodu : 3",
            "biber - urun kodu : 4", "balcan - urun kodu : 5"));//urunlerin atanacagi bos list
    static List<Double> urunFiyatlari = new ArrayList<>(Arrays.asList(5.0, 7.5, 1.3, 8.7, 9.2));//urun fiyatlarinin atanacagi bos list
    static double toplamOdenecekTutar;
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        /* TASK :
         * Basit bir 5 ürünlü manav alisveris programi yaziniz.
         *
         * 1. Adim : urun listesinden urun sectir ve kac kilo oldugunu sor.
         * 2. Adim : Baska bir urun almak isteyip istemedigini sor.
         * 			 istemiyorsa toplam miktari goster, istiyorsa tekrar urun sectir.
         * 			 Bu islemi alisverisi bitirmek isteyene kadar tekrarla.
         * 3. Adim : Musteri her urun sectiginde, aldigi urunun fiyatini toplam fiyata ekle.
         * 4. Adim : Alisveris bitince toplam odemesi gereken tutari goster.
         *
         * */

        System.out.println("Agam markete hoş geldin : \n"+urunListesi+"\n"+"Ürünlerin fiyatları : "+urunFiyatlari);
        musteriSecim();



    }

    private static void musteriSecim() {
        System.out.print("Agam hangi ürün istersen: ");
        int urunSecim= scan.nextInt();

        if(urunSecim<6&&urunSecim>0){
            System.out.println("Agam seçtiğiniz üründen kaç kilo istersen:");
            double kilo = scan.nextDouble();
            toplamOdenecekTutar+=kilo*urunFiyatlari.get(urunSecim-1);
            System.out.println("Agam seçtiğin ürün :"+urunListesi.get(urunSecim-1)+ "\n"+ "istenilen kilo"+ kilo +"\n"+"agam sectiğin urun fiyatı: "+urunFiyatlari.get(urunSecim-1)+
                    "\n"+"agam toplam ödemeniz: "+toplamOdenecekTutar);
            System.out.println("Agam alışverişe devam için 1 kasa için 2 giriniz");
            int karar =scan.nextInt();
            if(karar==1){
                musteriSecim();
            } else if (karar==2) {
                kasa();

            }else System.out.println("Agam gelmiyim ora adam gibin bişey giresen");

        }else{ System.out.println("Agam gelmiyim ora adam gibin bişey giresen");

            musteriSecim();}

    }

    private static void kasa() {
        System.out.println("Agam toplam ödemeniz geren tutar: "+toplamOdenecekTutar+"yine bekleriz");
    }


}


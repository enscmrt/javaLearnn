package j100_JavaProject.P01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ManavProject {//Class level


    static ArrayList<String>urunListesi=new ArrayList<>(Arrays.asList("domat->1","balcan->2","fujielma->3","çilek->4","muz->5"));
    static ArrayList<Double>urunFiyatListesi=new ArrayList<>(Arrays.asList(20.5,35.3,40.2,50.0,85.7));
    static double toplamOdenecekMiktar=0;

    static Scanner input =new Scanner(System.in);
    public static void main(String[] args) {//main level
        /* TASK :
         * Basit bir 5 ürünlü manav alisveris programi yaziniz.
         *
         * 1. Adim : urun listesinden urun sectir ve kac kilo oldugunu sor.
         * 2. Adim : Baska bir urun almak isteyip istemedigini sor.
         *            istemiyorsa toplam miktari goster, istiyorsa tekrar urun sectir.
         *            Bu islemi alisverisi bitirmek isteyene kadar tekrarla.
         * 3. Adim : Musteri her urun sectiginde, aldigi urunun fiyatini toplam fiyata ekle.
         * 4. Adim : Alisveris bitince toplam odemesi gereken tutari goster.
         *
         * */
        System.out.println("Agam markete hoş geldin : \n"+urunListesi+"\n"+urunFiyatListesi);
       // System.out.println(urunListesi);
        //System.out.println(urunFiyatListesi);

        musteriSecim();



    }//main sonu

    private static void musteriSecim() {
        System.out.print("Agam hangi ürün istersen: ");
        int urunSecim= input.nextInt();

        if(urunSecim<6&&urunSecim>0){
            System.out.println("Agam seçtiğiniz üründen kaç kilo istersen:");
            double kilo = input.nextDouble();
            toplamOdenecekMiktar+=kilo*urunFiyatListesi.get(urunSecim-1);
            System.out.println("Agam seçtiğin ürün :"+urunListesi.get(urunSecim-1)+ "\n"+ "istenilen kilo"+ kilo +"\n"+"agam sectiğin urun fiyatı: "+urunFiyatListesi.get(urunSecim-1)+
                    "\n"+"agam toplam ödemeniz: "+toplamOdenecekMiktar);
            System.out.println("Agam alışverişe devam için 1 kasa için 2 giriniz");
            int karar =input.nextInt();
            if(karar==1){
                musteriSecim();
            } else if (karar==2) {
                kasa();

            }else System.out.println("Agam gelmiyim ora adam gibin bişey giresen");

        }else{ System.out.println("Agam gelmiyim ora adam gibin bişey giresen");

        musteriSecim();}

    }

    private static void kasa() {
        System.out.println("Agam toplam ödemeniz geren tutar: "+toplamOdenecekMiktar+"yine bekleriz");
    }


}//class sonu

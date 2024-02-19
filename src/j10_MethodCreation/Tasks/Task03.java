package j10_MethodCreation.Tasks;

import java.util.Scanner;

public class Task03 {
   static Scanner scan = new Scanner(System.in);//herkes ulaşsın diye metod üstü class levele tanımlandı
    public static void main(String[] args) {
        //task-> girilen Saati saniyeye mil'i km'ye kg'yi gr'a çeviren METHOD create ediniz.
      //  Scanner scan = new Scanner(System.in);

        //System.out.println("Çevrilecek birimi giriniz->saat/mil/kg");
        //String birim = scan.next().toLowerCase();
        //System.out.println("Cevrilecek birimin miktarını giriniz");
        //double miktar = scan.nextDouble();
        donustur(birimVer(),miktarVer());


    }//main sonu

    private static void donustur(String birim, double miktar) {
        switch (birim){
            case "saat":
                saatSaniye(miktar);//System.out.println("girdiğin "+ miktar+"saatin saniye değeri="+(miktar*3600));

                break;
            case "mil":
                milKm(miktar);//System.out.println("girdiğin "+ miktar+"mil km değeri="+(miktar*1.6));

                break;
            case "kg":
                kgGr(miktar);//System.out.println("girdiğin "+ miktar+"kg gr değeri="+(miktar*1000));

                break;
                default:
                    System.out.println("Hatalı birim girdiniz!!!");
        }
    }

    private static void kgGr(double miktar) {
        System.out.println("girdiğin "+ miktar+"kg gr değeri="+(miktar*1000));
    }

    private static void milKm(double miktar) {
        System.out.println("girdiğin "+ miktar+"mil km değeri="+(miktar*1.6));
    }

    private static void saatSaniye(double miktar) {
        System.out.println("girdiğin "+ miktar+"saatin saniye değeri="+(miktar*3600));
    }

    public static String birimVer(){

        System.out.println("Çevrilecek birimi giriniz->saat/mil/kg");
        String birim = scan.next().toLowerCase();
        return birim;

    }
    public static double miktarVer(){
        System.out.println("Cevrilecek birimin miktarını giriniz");
        double miktar = scan.nextDouble();
        return miktar;

    }

}// Class sonu

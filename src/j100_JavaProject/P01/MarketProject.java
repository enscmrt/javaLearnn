package j100_JavaProject.P01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class MarketProject {//class level

    /* TASK :
     * Bir bakkalın 7 günlük tüm kazançlarını günlük olarak gösteren bir program yazınız.
     * Ayrıca bakkalın bu hafta ortalama kazandığı miktarı gösteren bir method yazınız.
     * Ayrıca bakkalın hangi günler ortalamanın üstüne kazandığını gösteren bir method yazınız.
     * Ayrıca bakkalın hangi günler ortalamanın altında kazandığını gösteren bir method yazınız.
     *
     * 1. Adım : Günleri içeren bir tane ArrayList oluşturun. (gunler)
     * 2. Adım : Günlük kazançları ekleyeceğimiz bir tane ArrayList oluşturun. (gunlukKazanclar)
     * 3. Adım : While döngüsü ile kullanıcıdan 7 günlük kazançları tekek teker alıp gunlukKazanclar ArrayList'e ekle.
     * 4. Adım : getOrtalamaKazanc() adlı method ile ortalama kazancı alın.
     * 5. Adım : getOrtalamaninUstundeKazancGünleri() adlı method oluşturun.
     *            for döngüsü ile tüm günleri ortalama kazanç ile karşılaştır
     *            ortalama kazançtan yüksekse o günleri return yap.
     * 6. Adım : getOrtalamaninAltindaKazancGünleri() adlı method oluşturun.
     *            for döngüsü ile tüm günleri ortalama kazanç ile karşılaştır
     *            ortalama kazançtan aşağıysa o günleri return yap.
     * */

    static List<String>gunler = new ArrayList<>(Arrays.asList("Pazartesi","Salı","Çarşamba","Perşembe","Cuma","Cumartesi","Pazar"));
    static List<Double>gunKazanc = new ArrayList<>(Arrays.asList());
    static Scanner input = new Scanner(System.in);
    static double haftanınToplamKazancı = 0;
    public static void main(String[] args) {//main level

        int gun=0;
        while (gun<7){
            System.out.print("Agam hele "+gunler.get(gun)+"gunu hasılatını giresen : ");
            double gununKazancı = input.nextDouble();
            haftanınToplamKazancı+=gununKazancı;
            gunKazanc.add(gununKazancı);




            gun++;
        }
        System.out.println("Agam bu haftalık toplam hasılatı: "+haftanınToplamKazancı);
        System.out.println("Agam bu günlük toplam hasılatı: "+gunKazanc);
        System.out.println("getOrtalamaKazanc() = " + getOrtalamaKazanc());
        System.out.println("getOrtalamaninUstundeKazancGünleri() = " + getOrtalamaninUstundeKazancGünleri());
        System.out.println("getOrtalamaninAltindaKazancGünleri() = " + getOrtalamaninAltindaKazancGünleri());

    }//main sonu

    private static ArrayList<String> getOrtalamaninAltindaKazancGünleri() {
        ArrayList<String>ortalamanınAltıGunler=new ArrayList<>();
        for (int i = 0; i < gunKazanc.size(); i++) {
            if(gunKazanc.get(i)>getOrtalamaKazanc()){
                ortalamanınAltıGunler.add(gunler.get(i));
            }

        }
        return ortalamanınAltıGunler;
    }


    private static ArrayList<String> getOrtalamaninUstundeKazancGünleri() {
        ArrayList<String>ortalamanınUstuGunler=new ArrayList<>();
        for (int i = 0; i < gunKazanc.size(); i++) {
            if(gunKazanc.get(i)>getOrtalamaKazanc()){
                ortalamanınUstuGunler.add(gunler.get(i));
            }

        }
        return ortalamanınUstuGunler;
    }

    private static double getOrtalamaKazanc() {

        return haftanınToplamKazancı/7;
    }
}//class sonu

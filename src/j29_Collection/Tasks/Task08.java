package j29_Collection.Tasks;

import java.util.Arrays;
import java.util.HashSet;

public class Task08 {
    /* TASK :
    Main method altinda bir double hashSet olusturunuz.
    ve bu seti, adi setOlustur ve return tipi hashSet double olan
    ayri bir metod altinda 3.23 , 3.10 , 5.12 , 10.12 , 23.12 degerlerini kullanarak doldurun.
    Adini toplaminiAl koyacagimiz ve parametre olarak bir Double(Çift) hashSet kabul edecek ayri bir method olusturarak
    hashSetin degerlerinin toplamini alınız.

    Çıktı--> sonuc = 44.69
     */
    public static void main(String[] args) {
        HashSet<Double>dhs=new HashSet<>();

        setOlustur(dhs);
        System.out.println(toplaminiAl(dhs));


    }

    private static Double toplaminiAl(HashSet<Double> dhs) {
        Double toplam = 0.0;
        for (Double d : dhs) {
            toplam += d;
        }
        return toplam;
    }

    private static HashSet<Double> setOlustur(HashSet<Double> dhs) {
        dhs.add(3.23);
        dhs.add(3.10);
        dhs.add(5.12);
        dhs.add(10.12);
        dhs.add(23.12);
        return dhs;

    }


}

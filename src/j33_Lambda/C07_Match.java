package j33_Lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C07_Match {
    public static void main(String[] args) {
        //anyMatch() --> enaz bir eleman sarti saglarsa true aksi durumda false return eder
        //allMatch() --> tum  elemanlar sarti saglarsa true en az bir eleman sarti saglamazsa false return eder.
        //noneMatch()--> hic bir eleman sarti SAGLAMAZSA true en az bir eleman sarti SAGLARSA false return eder.

        List<String> yemahhh = new ArrayList<>(Arrays.asList("küşleme", "soğanlı", "trileçe", "bicibici", "büryan", "Welemen", "cacix", "kokereç", "yağlama", "güveç", "arabAşı", "tantuni"));

        System.out.println("***Task01***");
        // Task01->  List elemanlarinin karakter sayisini 7 ve 7 'den az olma durumunu kontrol eden code create ediniz.
        kontrolChar7az(yemahhh);
        kontrolChar7azTernary(yemahhh);
        System.out.println("***Task02***");
        // Task02-> List elemanlarinin hicbirinin "W" ile baslamamasını kontrol eden code create ediniz...->noneMatch
        System.out.println("kontrolW(yemahhh) = " + kontrolW(yemahhh));
        System.out.println("***Task03***");
        // Task03-> List elemanlarinin "x" ile biten en az bir elemanın varlığını kontrol ediniz eden code create ediniz...->
        System.out.println("kontrolXBitenEnAz(yemahhh) = " + kontrolXBitenEnAz(yemahhh));

    }

    private static String kontrolXBitenEnAz(List<String> yemahhh) {
        return yemahhh.stream().anyMatch(t->t.endsWith("x"))?
                "Menüde x ile biten en az bir yemek var":
                "Menüde x ile biten en az bir yemek yok";
    }

    private static String kontrolW(List<String> yemahhh) {
//        return yemahhh.stream()
//                .noneMatch(t-> t.startsWith("W"))?
        return yemahhh.stream()
                .noneMatch(t-> t.substring(0,1).equalsIgnoreCase("w"))?
                "Menüde W ile başlayan yemek yok":
                "Menüde W ile başlayan ez az bir yemek var";
    }

    private static String kontrolChar7azTernary(List<String> yemahhh) {
        return yemahhh.stream().allMatch(t->t.length()<=7)?
                ("Yemek menunun tüm elemanlarının uzunluğu 7 veya 7 den az karakterde"):
                ("Yemek menunun en az bir elemanının uzunluğu 7 den fazla karakterde");


    }

    private static void kontrolChar7az(List<String> yemahhh) {
        yemahhh.stream()
                .allMatch(t->t.length()<=7);
        if (yemahhh.stream().allMatch(t->t.length()<=7)){
            System.out.println("Yemek menunun tüm elemanlarının uzunluğu 7 veya 7 den az karakterde");
        }else {
            System.out.println("Yemek menunun en az bir elemanının uzunluğu 7 den fazla karakterde");

        }
    }
}

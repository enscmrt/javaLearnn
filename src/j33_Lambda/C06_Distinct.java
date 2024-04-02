package j33_Lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class C06_Distinct {
    public static void main(String[] args) {
        //distinct() => Bu method tekrarlı elemanları sadece bir kere akısa sokar.
// Bu akışın farklı elemanlarından (Object.equals (Object) 'e göre) oluşan bir akış döndürür.
// Sıralı akışlar için, farklı elemanın seçimi sabittir.
// (yinelenen öğeler için, karşılaşma sırasında ilk görünen öğe korunur.)
// Sırasız akışlar için, herhangi bir kararlılık garantisi verilmez. Stream return eder.

        List<String> yemahhh = new ArrayList<String>(Arrays.asList("küşleme", "küşleme", "küşleme", "soğanlı", "soğanlı", "soğanlı", "trileçe", "bicibici", "büryan", "melemen", "cacix", "kokereç", "yağlama", "güveç", "arabAşı", "tantuni"));
        System.out.println("***Task01***");
        //Task01-> list elemanlarını alfabetik Buyuk harf ile tekrarsız print eden code create ediniz...
        printBykAlfSiraTekrarsiz(yemahhh);
        System.out.println("***Task02***");
        // Task02-> : list elemanlarinin character sayisini ters sirali olarak tekrarsiz print eden code create ediniz.
        printCharSayisiTersSiraTekrarsiz(yemahhh);
        System.out.println("***Task03***");
        // Task03-> : list elemanlarinin character sayisini  k->b sıralı benzersiz print eden code create ediniz.
        printCharSayisiKbTekrarsiz(yemahhh);
        System.out.println("***Task04***");
        // Task04-> : list elemanlarini son characterine göre ters sıralı tekrarsız print eden code create ediniz.
        printSonCharTersTekrarsiz(yemahhh);
        System.out.println("***Task05***");
        // Task05-> listin elemanlarin  cift sayili karakterlerinin  karelerini   b->k sirali tekrarsiz print eden code create ediniz...
        printCharCiftKareTersSira(yemahhh);
    }

    private static void printCharCiftKareTersSira(List<String> yemahhh) {
        yemahhh.stream()
                .map(String::length)
                .filter(SeedMethods::ciftMi)
                .map(SeedMethods::kareAl)
                .distinct()
                .sorted(Comparator.reverseOrder())
                .forEach(SeedMethods::intYazdir);
    }

    private static void printSonCharTersTekrarsiz(List<String> yemahhh) {
        yemahhh.stream().sorted(Comparator.comparing(t->t.toString().charAt(t.toString().length()-1)).reversed())
                .distinct()
                .forEach(SeedMethods::strYazdir);
    }
    /*
sorted(Comparator.comparing(str -> str.charAt(str.length() - 1), Comparator.reverseOrder())
sorted((s1, s2) -> Character.compare(s2.charAt(s2.length() - 1), s1.charAt(s1.length() - 1)))
 */

    private static void printCharSayisiKbTekrarsiz(List<String> yemahhh) {
        yemahhh.stream()
                .map(String::length)
                .sorted()
                .distinct()
                .forEach(SeedMethods::intYazdir);
    }

    private static void printCharSayisiTersSiraTekrarsiz(List<String> yemahhh) {
        yemahhh.stream()
                .map(String::length)
                .sorted(Comparator.reverseOrder())
                .distinct()
                .forEach(SeedMethods::intYazdir);
    }

    private static void printBykAlfSiraTekrarsiz(List<String> yemahhh) {
        yemahhh.stream().sorted().map(String::toUpperCase).distinct().forEach(SeedMethods::strYazdir);
    }
}

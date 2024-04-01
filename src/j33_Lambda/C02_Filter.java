package j33_Lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C02_Filter {

//    Filter:
//    Dizimiz veya Collection'ımız üzerinde bizim belirteceğimiz koşullar doğrultusunda
//    filtreleme işlemi yapmamıza yarayan bir yapıdır.
//    Bu işlem sonrası belirttiğimiz koşula uygun olmayan elemanlar bir sonraki aşamada kullanılamazlar.
//    Artık elimizde filtrelenmiş/süzülmüş/elenmiş bir veri vardır


    public static void main(String[] args) {
        List<Integer> sayiList = new ArrayList<>(Arrays.asList(7, 58, 17, 54, 33, 3, 13, 35, 65, 18, 61, 46, 25, 16, 6));
        System.out.println("***Task01***");
        //Task01->"Structured Programming"--> AMELE Programming kullanarak  listin çift elemanlarını aynı satırda aralarında bosluk ile print ediniz
        for (Integer each:sayiList){
            if(each%2==0){
                System.out.print(each+" ");
            }
        }

        System.out.println("***Task02***");
        //task02-> "Functional Programming"--> CINCIX Programming kullanarak  listin çift elemanlarını aynı satırda aralarında bosluk ile print ediniz
        printciftFunctional(sayiList);
        System.out.println("***Task03***");
        //task03-> "Functional Programming"--> CINCIX Programming kullanarak  listin 35'den kucuk çift elemanlarını aynı satırda aralarında bosluk ile print ediniz
        print35KckCiftFunctional(sayiList);
        System.out.println("***Task04***");
        print35KckCiftFunctional1(sayiList);
        System.out.println("***Task05***");
        //task05-> "Functional Programming"--> CINCIX Programming kullanarak  listin 34'den buyuk yada  tek elemanlarını aynı satırda aralarında bosluk ile print ediniz
        print34BykTekFunctional(sayiList);
    }

    private static void print34BykTekFunctional(List<Integer> sayiList) {
        sayiList.stream().filter((t)->t%2==1 || t>34).forEach(SeedMethods::intYazdir);
    }

    private static void print35KckCiftFunctional(List<Integer> sayiList) {
        sayiList.//actiona girecek akış kaynagı call edildi
        stream().//call edilen collction elemanları akışa alındı
                //filter(t->t%2==0&&t<35)
        filter(SeedMethods::ciftMi).//cift elemanlar filtrelendi
                filter(t->t<35).//35 den küçğk elemanlar filtrelendi
                forEach(SeedMethods::intYazdir);
    }

    private static void print35KckCiftFunctional1(List<Integer> sayiList) {
        sayiList
                .stream()
                .filter(SeedMethods::Kck35ciftMi)
                .forEach(SeedMethods::intYazdir);
    }

    private static void printciftFunctional(List<Integer> sayiList) {
        sayiList.//actiona girecek akış kaynagı call edildi
        stream().//call edilen collction elemanları akışa alındı
//        filter((t)->t%2==0)//akışa alınan call elemanları cift sartına göre filtrelendi.
        filter(SeedMethods::ciftMi)//akışa alınan call elemanları cift sartına göre filtrelendi.
                .forEach(SeedMethods::intYazdir);//akışta çifte göre filtrelenen elemanlar print edildi

    }
}

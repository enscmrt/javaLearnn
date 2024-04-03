package j33_Lambda.Tasks;

import j33_Lambda.SeedMethods;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q02 {

    //        2) Bir class oluşturun, 'Q02' olarak adlandırın
//        3) 5 elemanlı bir tamsayı listesi oluşturun
//        4) Elemanlari doğal sıraya koyun
//        5)Konsoldaki son 3 elemanın karelerinin toplamını bulun.
//        6) Konsoldaki toplamı yazdırın
//        7) 'Fonksiyonel Programlama' kullanın
    
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>(Arrays.asList(25,68,36,48,78));
        printQ2(list);


    }

    private static void printQ2(List<Integer> list) {
       int toplam= list.stream().sorted().skip(list.size()-3).map(SeedMethods::kareAl).reduce(0,Integer::sum);
       System.out.println(toplam);
    }
}

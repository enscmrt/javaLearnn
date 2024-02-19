package j12_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C11_Remove {
    public static void main(String[] args) {
        //remove()-> list'te istenen elemanı siler

        ArrayList<String> ulkeList = new ArrayList<>(List.of("Alamanya", "İsveç", "Danimarka", "Belçika", "Hollanda", "Finlandiya"));
        System.out.println("ulkeList remove öncesi = " + ulkeList);
        System.out.println("ulkeList.remove(1) = " + ulkeList.remove(1));
        System.out.println("ulkeList = " + ulkeList);
        //System.out.println("ulkeList.remove(33) = " + ulkeList.remove(33));
        //trick bilgi ->remove(index) silinen elemanı return eder.
        //remove(eleman)->silinen elemanın varlığına göre true/false döner.
        System.out.println("ulkeList.remove(\"İsveç\") = " + ulkeList.remove("İsveç"));
        List<String>sehirList = new ArrayList<>(Arrays.asList("Ankara", "Karaman", "Gelibolu", "İzmir"));
        System.out.println("ulkeList.addAll(sehirList) = " + ulkeList.addAll(sehirList));
        System.out.println("sehirList = " + sehirList);
        System.out.println("ulkeList.removeAll(sehirList) = " + ulkeList.removeAll(sehirList));
        System.out.println("ulkeList = " + ulkeList);
        System.out.println("sehirList = " + sehirList);
        System.out.println("sehirList.removeAll(sehirList) = " + sehirList.removeAll(sehirList));
        System.out.println("sehirList = " + sehirList);
        List<Integer>sayiList = new ArrayList<>(Arrays.asList(12, 14, 21, 43, 2, 65, 4, 7, 67));
        System.out.println("sayiList.remove(2) = " + sayiList.remove(2));
        //System.out.println("sayiList.remove(43) = " + sayiList.remove(43));  out of bound verir.


    }
}

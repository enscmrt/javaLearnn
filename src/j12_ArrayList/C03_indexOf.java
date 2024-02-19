package j12_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class C03_indexOf {
    public static void main(String[] args) {
        //indexOf()-> list içinde istenen eleman var ise index'ini return eder olmayan eleman için -1 return eder.

        ArrayList<String> ulkeList = new ArrayList<>(List.of("Alamanya", "İsveç", "Danimarka", "Belçika", "Hollanda, Finlandiya"));

        System.out.println("ulkeList.indexOf(\"alamanya\") = " + ulkeList.indexOf("alamanya"));//-1 verir java case sensitive çalışır.
        System.out.println("ulkeList.indexOf(\"Belçika\") = " + ulkeList.indexOf("Belçika"));
        System.out.println("ulkeList.indexOf(\"Türkiye\") = " + ulkeList.indexOf("Türkiye"));
        ulkeList.add("Ukrayna");
        ulkeList.add("İsveç");
        System.out.println("ulkeList = " + ulkeList);
        System.out.println("ulkeList.indexOf(\"İsveç\") = " + ulkeList.indexOf("İsveç"));
        System.out.println("ulkeList.lastIndexOf(\"İsveç\") = " + ulkeList.lastIndexOf("İsveç"));
        System.out.println("ulkeList.lastIndexOf(\"Ukrayna\") = " + ulkeList.lastIndexOf("Ukrayna"));
    }
}

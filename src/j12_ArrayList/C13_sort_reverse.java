package j12_ArrayList;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class C13_sort_reverse {
    public static void main(String[] args) {
        //sort():-> list elemanlarını doğal (NATUREL ORDER) sıralama yapar
        ArrayList<String> ulkeList=new ArrayList<>(List.of("Alamanya","Isvec","Danimarka","Belcika","Hollanda","Finlandiya"));
        System.out.println("ulkeList = " + ulkeList);
        Collections.sort(ulkeList);
        System.out.println("ulkeList = " + ulkeList);

        //reverse() meth list elemanlarını index'e göre ters sıralar

        List<Integer> sayiList = new ArrayList<>(List.of(23,12,21,62,49,11,7,16));
        System.out.println("sayiList reversed öncesi= " + sayiList);
        Collections.reverse(sayiList);
        System.out.println("sayiList = " + sayiList);
    }
}

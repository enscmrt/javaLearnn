package j12_ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class C12_replaceAll_fill {
    public static void main(String[] args) {
        //replaceAll();-> List'te belirli bir elemanı belirli bir elemana update eder.treu/ false return eder

        ArrayList<String> ulkeList=new ArrayList<>(List.of("Alamanya","Isvec","Danimarka","Belcika","Hollanda","Finlandiya"));
        System.out.println("replaceAll oncesi ulkeList = " + ulkeList);//[Alamanya, Isvec, Danimarka, Belcika, Hollanda, Finlandiya]
        System.out.println("Collections.replaceAll(ulkeList,\"Danimarka\",\"Fransa\") = " + Collections.replaceAll(ulkeList, "Danimarka", "Fransa"));//true
        System.out.println("replaceAll sonrasi ulkeList = " + ulkeList);//[Alamanya, Isvec, Fransa, Belcika, Hollanda, Finlandiya]

        //fill()-> list'tin tum elemanlarını istenen değere update eder...
        Collections.fill(ulkeList,"Turkiye");
        System.out.println("fill sonrasi ulkeList = " + ulkeList);//[Turkiye, Turkiye, Turkiye, Turkiye, Turkiye, Turkiye]
    }
}

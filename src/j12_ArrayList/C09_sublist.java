package j12_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class C09_sublist {
    public static void main(String[] args) {
        //sublist() -> listini istenen list parcasını(şu index'ten şu index'e parcasını) return eder

        ArrayList<String> ulkeList = new ArrayList<>(List.of("Alamanya", "İsveç", "Danimarka", "Belçika", "Hollanda", "Finlandiya"));
        System.out.println("sublist öncesi= "+ulkeList);
        System.out.println("ulkeList.subList(1,4) = " + ulkeList.subList(1, 4));
        System.out.println("sublist sonrası= "+ulkeList);
        List<String>yeniList = new ArrayList<>(ulkeList.subList(2,ulkeList.size()));
        System.out.println("yeniList = " + yeniList);
    }
}

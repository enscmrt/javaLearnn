package j12_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class C05_size {
    public static void main(String[] args) {
        //size()-> listin eleman sayısını return eder.(arr->length)
        ArrayList<String> ulkeList = new ArrayList<>(List.of("Alamanya", "İsveç", "Danimarka", "Belçika", "Hollanda, Finlandiya"));

        System.out.println("ulkeList.size() = " + ulkeList.size());
        List<String>sehirList = new ArrayList<>();
        System.out.println("sehirList = " + sehirList);
        System.out.println("sehirList.size() = " + sehirList.size());
    }
}

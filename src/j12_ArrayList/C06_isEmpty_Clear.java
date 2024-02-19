package j12_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class C06_isEmpty_Clear {
    public static void main(String[] args) {
        //isEmpty()-> listin boş olmasını kontrol eder true/false return eder

        ArrayList<String> ulkeList = new ArrayList<>(List.of("Alamanya", "İsveç", "Danimarka", "Belçika", "Hollanda", "Finlandiya"));
        System.out.println("ulkeList.isEmpty() = " + ulkeList.isEmpty());
        System.out.println("ulkeList = " + ulkeList);

        //clear-> tüm elemanları siler

        ulkeList.clear();
        System.out.println("ulkeList.size() = " + ulkeList.size());
        System.out.println("ulkeList.isEmpty() = " + ulkeList.isEmpty());
        System.out.println("ulkeList = " + ulkeList);
    }
}

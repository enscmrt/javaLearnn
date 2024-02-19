package j12_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class C10_equals {
    public static void main(String[] args) {
        //equals()-> iki listin hem index hem de value (değer) eşitliğini kontrol eder true/false return eder

        ArrayList<String> ulkeList1 = new ArrayList<>(List.of("Alamanya", "İsveç", "Danimarka", "Belçika", "Hollanda", "Finlandiya"));
        ArrayList<String> ulkeList2 = new ArrayList<>(List.of("Alamanya", "İsveç", "Danimarka", "Belçika", "Hollanda", "Finlandiya"));
        System.out.println("ulkeList1.equals(ulkeList2) = " + ulkeList1.equals(ulkeList2));
        System.out.println("ulkeList2.equals(ulkeList1) = " + ulkeList2.equals(ulkeList1));
        ulkeList2.set(1,"Kuba");
        System.out.println("ulkeList1.equals(ulkeList2) = " + ulkeList1.equals(ulkeList2));
        //String[]arr={"Alamanya", "İsveç", "Danimarka", "Belçika", "Hollanda", "Finlandiya"};
        //System.out.println("ulkeList1.equals(arr) = " + ulkeList1.equals(arr));

    }
}

package j12_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class C08_set {
    public static void main(String[] args) {
        //set()-> listin istenen index'e istenen elemanını  update set eder-> şu indexin şu elelmanını şununla değiştir..

        ArrayList<String> ulkeList = new ArrayList<>(List.of("Alamanya", "İsveç", "Danimarka", "Belçika", "Hollanda", "Finlandiya"));
        System.out.println("ulkeList = " + ulkeList);
        System.out.println("ulkeList.set(2,\"Izlanda\") = " + ulkeList.set(2, "Izlanda"));
        System.out.println("ulkeList set yaptıktan sonra = " + ulkeList);
        System.out.println("ulkeList.set(7,\"Turkey\") = " + ulkeList.set(5, "Turkey"));
        //ulkeList.set(3,"Fransa",4,"Romanya"); CTE hatası verdi. set çok parametre aldığı için compile yapmadı.
    }
}

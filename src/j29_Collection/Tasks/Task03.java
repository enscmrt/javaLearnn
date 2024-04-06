package j29_Collection.Tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class Task03 {
    public static void main(String[] args) {
    /*
         Task->
    commonValues() isminde bir method oluşturun ve parametresi  2 tane hashset olmalı.
    return tipi arraylist olmalı.
    ÖRNEĞİN:
    İlk Hashset : "Germany" , "England" , "South Africa" , "Brazil" , "USA"
    İkinci  hashset  : "Germany" , "China" , "Brazil" , "France" ,  "USA"
    Ortak değerleri ArrayListe ekleyiniz.
    çıktı:  "Germany" , "Brazil" ,"USA"
    ArrayListi print eden method create ediniz.
     */
        HashSet<String> hs1 = new HashSet<>(Arrays.asList("Germany", "England", "South Africa", "Brazil", "USA"));
        HashSet<String> hs2 = new HashSet<>(Arrays.asList("Germany", "China", "Brazil", "France", "USA"));

        System.out.println("commonVlues(hs1, hs2) = " + commonVlues(hs1, hs2));


    }//main sonu

    private static ArrayList<String> commonVlues(HashSet<String> hs1, HashSet<String> hs2) {
        ArrayList<String> ens = new ArrayList<>();
        for (String value : hs1) {
            if (hs2.contains(value)) {
                ens.add(value);
            }
        }
        return ens;
    }

    public static void printArrayList(ArrayList<String> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
            if (i < list.size() - 1) {
                System.out.print(", ");

            }
        }
    }
}

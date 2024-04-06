package j29_Collection.Tasks;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Task04 {
    /*
    Create a method totalCount()
    totalCount() isminde bir method oluşturun.
    Parametresi  'Integer Hashset' olmalı

    HashSetteki eleman sayısını alın.
    totalCount'u döndürün.
    Örnek:
    hashset ; 4,2,3,1,7
    cevap: 5
     */

    public static void main(String[] args) {

        HashSet<Integer> hs = new HashSet<>(Arrays.asList(4, 2, 3, 1, 7));
        System.out.println("totalCount(hs) = " + totalCount(hs));


    }

    private static int totalCount(HashSet<Integer> hs) {
        return hs.size();
    }
}
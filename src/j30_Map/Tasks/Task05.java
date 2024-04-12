package j30_Map.Tasks;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import static j100_javaProjects.P03_javaBankATM.JavaBankATM02.A03_Transactions.scan;

public class Task05 {

    /* Task-> girilen key(ınteger type) karsılık gelen Value(String type) return eden map ve int parametre
    alan method create ediniz.

    ÖRNEK:
    Map:
                    1 ,  "Lion"
                    2 ,  "Tiger"
                    3 ,  "Elephant"
                    4 ,  "Cat"
                    5  , "Dog"
     input: 3
     output : Elephant
     */

    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Lion");
        map.put(2, "Tiger");
        map.put(3, "Elephant");
        map.put(4, "Cat");
        map.put(5, "Dog");
        int no=0;

        task05(map,no);



    }

    private static void task05(Map<Integer, String> map, int no) {
        System.out.println("Key numarasını giriniz");
        int key = scan.nextInt();
        System.out.println(map.getOrDefault(key, "Key numarası yanlış"));
    }


}
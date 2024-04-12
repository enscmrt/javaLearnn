package j29_Collection.Tasks;

import j33_Lambda.SeedMethods;

import java.util.ArrayList;
import java.util.Arrays;

public class Task10 {

    public static void main(String[] args) {
        // Verilen bir Array'deki tekrarli elemanlari silip
        // unique elemanlardan olusan bir Array'e ceviren 
        // bir method yaziniz

        int arr[] = {2, 3, 4, 3, 5, 3, 6, 4, 7, 4, 8, 5};
        ArrayList<Integer>list = new ArrayList<Integer>();
        for (int i = 0; i < arr.length; i++) {
            list.add(arr[i] );
        }
        System.out.println("list = " + list);

        printUnique(list);



    }

    private static void printUnique(ArrayList<Integer> list) {
        list.stream().sorted().distinct().forEach(SeedMethods::intYazdir);
    }
}

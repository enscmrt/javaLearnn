package j29_Collection.Tasks;

import j33_Lambda.SeedMethods;

import java.util.*;
import java.util.stream.Collectors;

public class Task09 {
    /* TASK:

        1.  30 elemanli, elemanlari 0-10 arasinda random sayilardan olusan bir arraylist create edin.
        2.  1. adımdaki arraylist print edin.
        3.  bu arrayin tekrar eden elemanlarini arrayden silen methodu create edin.
        4.  sonucu print edin
        5.  Basta hazirlanan arraylist'i Set'e cevirin
        6.  Hazirlanan bu Set'i de Arraylist'e cevirin

     */

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(0,2,4,1,2,3,7,8,9,6,3,6,1,0,4,4,5,8,9,6,3,1,4,2,5,6,3,1,7,9));
        System.out.println("list = " + list);
        System.out.println(list.size());
        printTekrarEleman(list);
        System.out.println();
        HashSet<Integer>set1=new HashSet<>();
        set1.addAll(list);
        System.out.println("set1 = " + set1);
        System.out.println();
        ArrayList<Integer>list1=new ArrayList<>();
        list1.addAll(set1);
        System.out.println("list1 = " + list1);


    }

    private static void printTekrarEleman(ArrayList<Integer> list) {
        list.stream().sorted().distinct().forEach(SeedMethods::intYazdir);

    }
}



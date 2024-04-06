package j29_Collection.Tasks;

import java.util.*;

public class Task01 {
    public static void main(String[] args) {
       /* Task->
         Deger ataması yapılan Array'i arraylist'e ceviren method create ediniz
         main içersinde meth return ettiği arryList'i hashSet, linkedHashSet ve TreeSett'e atayınız.
         */
        String arr[] = {"javaCAN", "javaSU", "javaNAZ", "javIYE", "javIDAN", "javaTAR", "javFER"};
        List<String>arrayList=arrayListeCevir(arr);
        Set<String>yenihash=new HashSet<>(arrayList);
        Set<String>linkset=new LinkedHashSet<>(arrayList);
        Set<String>treeset=new TreeSet<>(arrayList);

        System.out.println(yenihash);
        System.out.println(linkset);
        System.out.println(treeset);
        System.out.println(arrayList);





    }//main son

    private static List<String> arrayListeCevir(String[] arr) {
        return new ArrayList<>(Arrays.asList(arr));
    }

}

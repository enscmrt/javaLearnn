package j29_Collection.Tasks;

import java.util.*;

public class Task02 {
    public static void main(String[] args) {
        //interview question : girilen String datanın karakterlerini alfabetik print ediniz-> TreeSet'e atanır ...
        // hashSet ve treeSet tanımlayıp run surelerini karsılastırınız..
        // Trick run suresi için System.currrentTimeMillis() meth. call ediniz...
        // iyi bir javaCAN  için gelişMAC lazım :)
        String task="KavrumEnes";
        TreeSet<Character> treeSet=new TreeSet<>();
        for (char c :task.toCharArray()){
            treeSet.add(c);
        }
        for (char c:treeSet){
            System.out.print(c+" ");
        }


    }
}

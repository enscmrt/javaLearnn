package j28_Iterators.Tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.ListIterator;

public class Task01 {
    public static void main(String[] args) {
        /*
        task -> Verilen bir integer listin tek  elemanlarının karesini tersten iterator  print eden code create ediniz
         */
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(14, 25, 36, 47, 58, 69, 12, 45, 78));

        ListIterator<Integer>kt = list.listIterator();
        while (kt.hasNext()){
            kt.next();
        }
        while (kt.hasPrevious()){
           int num= kt.previous();
           if (num%2==1){
               System.out.println(num*num);
           }

        }




    }
}

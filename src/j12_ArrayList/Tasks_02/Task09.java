package j12_ArrayList.Tasks_02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task09 {
    public static void main(String[] args) {
  /* TASK :
   Bir integer list oluşturunuz ve bu list’deki tum sayıların karesinin
   toplamını bulan code create ediniz.
    */

        List<Integer> list = new ArrayList<>(List.of(2,4,6,8));
        int kareToplam=0;
        for (int i = 0; i < list.size(); i++) {
            kareToplam+=list.get(i)*list.get(i);

        }
        System.out.println("kareToplam = " + kareToplam);


    }
}

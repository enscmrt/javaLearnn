package j12_ArrayList.Tasks_02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class Task17 {
    public static void main(String[] args) {
        // Task->  verilen bir listede tekrar eden sayilari sadece 1 kez print eden METHOD create ediniz
        // input : [1, 3, 5, 3, 5, 6, 1, 7]
        // output [1, 3, 5, 6, 7]

        List<Integer> list = new ArrayList<>(Arrays.asList(1, 3, 5, 3, 5, 6, 1, 7));
        onlyOne1(list);

    }//main sonu

    private static void onlyOne1(List<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
        for (int j = i+1; j < list.size(); j++) {
            if ((Objects.equals(list.get(i), list.get(j)))){
                list.remove(j);
            }
        }
    } System.out.println("list = " + list);
    }


}//class sonu

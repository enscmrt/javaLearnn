package j12_ArrayList.Tasks_02;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Task10 {

    public static void main(String[] args) {
        /* TASK :
         * Verilen arraydeki tekrar eden sayilari, ilki haric silip, tekrarsiz
         * sayilardan olusan bir array haline getiren bir code create ediniz.
         *
         * INPUT : {1,2,2,3,1,4,2,5,6,8,7,5,9,1}
         * OUTPUT : [1,2,3,4,5,6,7,8,9]
         */

        List<Integer>newList=new ArrayList<>(List.of(1,2,2,3,1,4,2,5,6,8,7,5,9,1));
        for (int i = 0; i < newList.size(); i++) {
            for (int j = i+1; j < newList.size(); j++) {
                if ((newList.get(i)==newList.get(j))){
                    newList.remove(j);
                }
            }

        }
        System.out.println("newList = " + newList);


    }

}

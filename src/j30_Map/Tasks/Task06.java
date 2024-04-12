package j30_Map.Tasks;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Task06 {

    /* Task->
    String-Integer HashMap parametre alan ve ArrayList<String> return eden
    returnKey() isminde bir method create ediniz.

    Hashmap:
                       "Lion",     1
                       "Tiger",    2
                       "Elephant", 3
                       "Cat",      4
                       "Dog",      5

     */

    public static void main(String[] args) {

        Map<String,Integer>lte=new HashMap<String,Integer>();
        lte.put("Lion",1);
        lte.put("Tiger",2);
        lte.put("Elephant",3);
        lte.put("Cat",4);
        lte.put("Dog",5);
        System.out.println("returnKey(lte) = " + returnKey(lte));


    }//main sonu

    private static ArrayList<String> returnKey(Map<String, Integer> lte) {
        ArrayList<String> list = new ArrayList<String>();
        for (Map.Entry<String, Integer> entry : lte.entrySet()) {
            list.add(entry.getKey());
        }
        return list;

    }
}



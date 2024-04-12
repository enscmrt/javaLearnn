package j30_Map.Tasks;

import java.util.HashMap;
import java.util.Map;

public class Task07 {
    /* task->

    Parametreleri , Integer -String HashMap,  int ve String olan (3ayrı parametre)
    Eğer HashMap, int olan parametreyi içeriyorsa,
    int değerinde var olan String'i güncelleyip Integer - String HashMap return eden
    update() isminde METHOD create ediniz.
    Örnek :
     Hash map:
    1, "New jersey"
    2, "New York"
    3, "London"
    4, "Paris"

    input :
    int = 3
    String = Miami
    output :
    1, "New jersey"
    2, "New York"
    3, "Miami"
    4, "Paris"
     */

    public static void main(String[] args) {
        int key=3;
        String value="Miami";
        Map<Integer,String>yeni=new HashMap<>();
        yeni.put(1,"New jersey");
        yeni.put(2,"New York");
        yeni.put(3,"London");
        yeni.put(4,"Paris");
        System.out.println("yeni.replace(1,value) = " + yeni.replace(1, "Miami"));
        System.out.println("yeni = " + yeni);


    }//main sonu
}

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Q46_MapKeySet {
    // create a map of zipcodes and Cities, at least 3 entries
    // get the keySet and iterate over it, print the map like below:
    // zipcode1 => city1
    // zipcode2 => city2
    // part 2: print all the keys of the map

    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(6300, "Keciören");
        map.put(140, "Altındag");
        map.put(254, "Cankaya");
        for (Map.Entry<Integer, String> entry : map.entrySet()){
            System.out.println( entry.getKey() + " " + entry.getValue());
        }

    }
}




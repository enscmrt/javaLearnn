package j30_Map;

import java.util.HashMap;

public class C04_entrySet {
    public static void main(String[] args) {
        //map.entrySet();->girilen map'in key-value tum datalarını Set'e atayıp return eder.


        HashMap<String, String> hm = new HashMap<>();//bos hm tanımlandı

        hm.put("Amazon", "296 Euro");
        hm.put("Saturn", "200 Euro");
        hm.put("Vatan", "111 Euro");
        hm.put("Apple", "450 Euro");
        hm.put("Teknosa", "333 Euro");
        hm.put("Media Markt", "444 Euro");
        System.out.println("hm.entrySet() = " + hm.entrySet());
    }
}

package j30_Map;

import java.util.HashMap;

public class C11_putIfAbsent {
    public static void main(String[] args) {
        //map.putIfAbsent(); -> Girilen key map'de yok ise entry(key,value) map'e eklenir ve null return eder.
//Girilen key map'de var ise key'e ait value return eder
        HashMap<String, String> hm = new HashMap<>();//bos hm tanımlandı

        hm.put("Amazon", "296 Euro");
        hm.put("Saturn", "200 Euro");
        hm.put("Vatan", "111 Euro");
        hm.put("Apple", "450 Euro");
        hm.put("Teknosa", "333 Euro");
        hm.put("Media Markt", "444 Euro");

        System.out.println("hm absent öncesi= " + hm);
        System.out.println("hm.putIfAbsent(\"Amazon\", \"javaCAN   \") = " + hm.putIfAbsent("Amazon", "javaCAN   "));
        System.out.println("hm.putIfAbsent(\"olmayankey\",\"hiç mi yok\") = " + hm.putIfAbsent("olmayankey", "hiç mi yok"));
        System.out.println("hm = " + hm);
    }
}

package j30_Map;

import java.util.HashMap;

public class C10_remove {
    public static void main(String[] args) {
        // map.remove(); -> Girilen entry map'de var ise siler ve true return eder yoksa false return eder.
// parametre entry değil sadece key değer girilirse key map'de varsa siler ve silinen key value return eder yoksa null return eder

        HashMap<String, String> hm = new HashMap<>();//bos hm tanımlandı

        hm.put("Amazon", "296 Euro");
        hm.put("Saturn", "200 Euro");
        hm.put("Vatan", "111 Euro");
        hm.put("Apple", "450 Euro");
        hm.put("Teknosa", "333 Euro");
        hm.put("Media Markt", "444 Euro");
        System.out.println("hm = " + hm);
        System.out.println("hm.remove(\"Vatan\",\"yahut silistre\") = " + hm.remove("Vatan", "yahut silistre"));
        System.out.println("hm.remove(\"Media Markt\", \"444 Euro\") = " + hm.remove("Media Markt", "444 Euro"));
        System.out.println("hm.remove(\"Olmayan Key\") = " + hm.remove("Olmayan Key"));
        System.out.println("hm.remove(\"Apple\") = " + hm.remove("Apple"));
        System.out.println("hm = " + hm);
    }
}

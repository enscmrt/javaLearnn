package j30_Map;

import java.util.HashMap;

public class C02_KeySet_Values {
    public static void main(String[] args) {
        //map.keySet()-> map key değerlerini Set'e(coll.) atayıp return eder
//map.values()-> map value değerlerini coll.  atayıp return ede

        HashMap<String, String> hm = new HashMap<>();//bos hm tanımlandı

        hm.put("Amazon", "296 Euro");
        hm.put("Saturn", "200 Euro");
        hm.put("Vatan", "111 Euro");
        hm.put("Apple", "450 Euro");
        hm.put("Teknosa", "333 Euro");
        hm.put("Media Markt", "444 Euro");
        System.out.println("hm = " + hm);
        System.out.println("hm.keySet() = " + hm.keySet());
        System.out.println("hm.values() = " + hm.values());

        // task-> hm key ve value'ları aynı satırda (satır-satır) ve keyler büyük harf olarak print eden code create ediniz

        System.out.println("hm.keySet().toString().toUpperCase() = " + hm.keySet().toString().toUpperCase());

        for (String s:hm.keySet()){
            System.out.print(s.toUpperCase()+" ");

        }
        System.out.println();
        for (String s: hm.values()){
            System.out.print(s+" ");
        }
    }
}

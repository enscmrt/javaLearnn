import java.util.HashMap;
import java.util.Map;

public class Q49_PrintMap {
    /*
        Hashmap ile 1 den 6 ya kadar sayilari sayi ve okunusu seklinde yazdirin
    */
    public static void main(String[] args) {
        Map<Integer,String>yeni=new HashMap<Integer,String>();
        yeni.put(1,"Bir");
        yeni.put(2,"İki");
        yeni.put(3,"Üç");
        yeni.put(4,"Dört");
        yeni.put(5,"Beş");
        yeni.put(6,"Altı");
        for (Map.Entry<Integer, String> entry : yeni.entrySet()) {
            System.out.println(entry.getKey() + "->" + entry.getValue());
        }

    }


}

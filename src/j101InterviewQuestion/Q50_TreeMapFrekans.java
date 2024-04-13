import java.util.*;

public class Q50_TreeMapFrekans {

    // TreeMap kullanarak bir cümlenin içindeki harflerin frekansını method ile bulunuz.
    public static void main(String[] args) {
        // TreeMap kullanarak bir cümlenin içindeki harflerin frekansını(adetini) hesaplayıp print  code create ediniz
        Map<String, String> tm = new TreeMap<>();
        tm.put("ykjhkgjyfhdrdhfg","oıjhgdacbjkkkööö");
        System.out.println("tm.size() = " + tm.size());
        Set yeni = tm.entrySet();
        System.out.println("yeni.toString().split(\"\").length = " + yeni.toString().split("").length);





    }
}

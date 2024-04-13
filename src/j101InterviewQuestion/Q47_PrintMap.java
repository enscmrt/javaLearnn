import java.util.LinkedHashMap;
import java.util.Map;

public class Q47_PrintMap {
    //aşağıdaki çıktıyı elde ediniz
    // Kiraz 100
    // İncir 200
    // Enginar 150
    // Üzüm 145
    // Nar 250

    public static void main(String[] args) {
        Map<String, Integer> map = new LinkedHashMap<>();
        map.put("Kiraz", 100);
        map.put("İncir", 200);
        map.put("Enginar", 150);
        map.put("Üzüm", 145);
        map.put("Nar", 250);

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

    }

}

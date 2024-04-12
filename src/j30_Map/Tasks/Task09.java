package j30_Map.Tasks;

import java.util.HashMap;

public class Task09 {
    /* Task -> Ad ve soyad bulunduran iki ayrı array'i bir map'de print eden code create ediniz.
     input : {"javaCAN", "javaTAR", "javaNAZ"};  {"Ahmet", "Haluk", "İpek"};
     output:{javaCAN=Ahmet,javaTAR=Haluk,javaNAZ=İpek}
    */

    public static void main(String[] args) {
        String[] names = {"javaCAN", "javaTAR", "javaNAZ"};
        String[] surname = {"Ahmet", "Haluk", "İpek"};

        HashMap<String, String> map = new HashMap<>();

        for (int i = 0; i < names.length; i++) {
            map.put(names[i], surname[i]);
        }

        for (String key : map.keySet()) {
            System.out.println(key + "=" + map.get(key));
        }


    }// main sonu
}

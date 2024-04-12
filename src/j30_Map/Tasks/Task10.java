package j30_Map.Tasks;

import java.util.HashMap;

public class Task10 {

    public static void main(String[] args) {
        // Task ->Verilen bir Stringdeki harfleri sayısını return  eden method create ediniz
        //  Input : Hellooo
        //  output : H=1, e=1, l=2, o=3

        String harf ="Hellooo";
        HashMap<Character, Integer> hm = new HashMap<>();
        for (int i = 0; i < harf.length(); i++) {
            char c = harf.charAt(i);
            if (hm.containsKey(c)) {
                hm.put(c, hm.get(c) + 1);
            } else {
                hm.put(c, 1);
            }
        }
        System.out.println("hm = " + hm);


    }//main sonu
}

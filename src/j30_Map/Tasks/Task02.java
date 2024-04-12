package j30_Map.Tasks;

import java.util.HashMap;
import java.util.Map;

public class Task02 {
    public static void main(String[] args) {
         /*
        Task ->
         Key:isim ,email,adres,telefon
         Key'lere ait value'leri depolayan bir kartvizit  map ve isim Key'e kartvizit map'i value tanımlayan farklı bir map tanımlayıp
         print eden code create ediniz.
         */

        Map<String, String> kartvizit = new HashMap<>();
        kartvizit.put("isim", "John Doe");
        kartvizit.put("email", "john.doe@example.com");
        kartvizit.put("adres", "123 Main St, City");
        kartvizit.put("telefon", "123-456-7890");

        // İsim key'ine göre kartvizit map'ini value olarak depolayan farklı bir map oluşturma
        Map<String, Map<String, String>> kartvizitIsimMap = new HashMap<>();
        kartvizitIsimMap.put("John Doe", kartvizit);
        //System.out.println("kartvizitIsimMap = " + kartvizitIsimMap);

         //Oluşturulan map'i print etme
        for (Map.Entry<String, Map<String, String>> entry : kartvizitIsimMap.entrySet()) {
            String isim = entry.getKey();
            Map<String, String> kartvizitMap = entry.getValue();
            System.out.println("İsim: " + isim);
            System.out.println("Kartvizit Bilgileri:");
            for (Map.Entry<String, String> innerEntry : kartvizitMap.entrySet()) {
                String key = innerEntry.getKey();
                String value = innerEntry.getValue();
                System.out.println(key + ": " + value);
            }
        }


    }
}

import java.util.HashMap;
import java.util.Map;

public class Q45_MapKeysValues {
    //5 tane ulke ismi ve nufusunu oluşturuyoruz.(put)
    //5 tane ulke ismi ve nufusunu yazdırıyoruz(country)
    //5 tane ulke ismi yazdırıyoruz. (keyset())
    //5 tane ulke nufusunu yazdırıyoruz. (values())
    //nüfusların toplamını yazdırın.
    //kaç tane 50 milyondan fazla nüfuslu ülke var?

    public static void main(String[] args) {
        Map<String,Integer>ulkeler=new HashMap<String,Integer>();
        ulkeler.put("Almanya",85);
        ulkeler.put("Afganistan",49);
        ulkeler.put("Albania",12);
        ulkeler.put("Türkiye",87);
        ulkeler.put("Belçika",8);
        System.out.println("ulkeler = " + ulkeler);
        System.out.println("ulkeler.keySet() = " + ulkeler.keySet());
        System.out.println("ulkeler.values() = " + ulkeler.values());
        int toplamNufus=0;
       for (Map.Entry<String,Integer>entry:ulkeler.entrySet()){
           toplamNufus+=entry.getValue();
       }
       System.out.println("toplamNufus = " + toplamNufus);

       int count=0;
       for (Map.Entry<String,Integer>entry:ulkeler.entrySet()){
           if (entry.getValue()>50){
               count++;
           }

       }System.out.println("count = " + count);


    }
}

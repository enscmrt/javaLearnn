import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Q36_AddedOrNotTask {

    // create a list of numbers 1, 3, 1, 2, 4, 5, 3 --> 2 duplicates
    // count how many duplicates we have
    // find out what are the duplicated values

    // 1, 3, 1, 2, 4, 5, 3 sayılarının bir listesini oluşturun --> 2 kopya
    // kaç tane tekrarli eleman olduğunu sayin
    // yinelenen değerlerin ne olduğunu öğrenin


    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(Arrays.asList(1,3,1,2,4,5,3));
        List<Integer>duplicates=new ArrayList<>();
        Map<Integer, Integer>yeni=new HashMap<>();
        for (Integer num:numbers){
            yeni.put(num,yeni.getOrDefault(num,0)+1);
        }
        System.out.println("yeni = " + yeni);

        int count=0;
        for (Map.Entry<Integer,Integer>entry:yeni.entrySet()){
            if (entry.getValue()>1){
                count++;
                duplicates.add(entry.getKey());
            }
        }
        System.out.println("numbers = " + numbers);
        System.out.println("duplicates = " + duplicates);
        System.out.println("count = " + count);



    }
}

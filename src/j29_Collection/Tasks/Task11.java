package j29_Collection.Tasks;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;

public class Task11 {
    public static void main(String[] args) {
        // Task 1 : Bir HashSet random olarak 10(set.size(10)) adet olacak şekilde
        // 1 den 20 e kadar olan sayılarla doldurup yazdırın
        // Task 2 : Bu SET i bir fonksiyonda diziye çevirinizve yazdırınız.

        HashSet<Integer>hs1=new HashSet<Integer>();
        Random random=new Random();
        while (hs1.size()<10){
            int randomNumber=random.nextInt(20)+1;
            hs1.add(randomNumber);
        }
        System.out.println(hs1);

        Integer[] array = setToArray(hs1);
        System.out.println("Dizi: " + Arrays.toString(array));

    }

    private static Integer[] setToArray(HashSet<Integer> hs1) {
        Integer[] array = new Integer[hs1.size()];
        int index = 0;
        for (Integer element : hs1) {
            array[index++] = element;
        }
        return array;
    }
}


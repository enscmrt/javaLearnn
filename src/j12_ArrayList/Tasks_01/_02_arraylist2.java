package j12_ArrayList.Tasks_01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _02_arraylist2 {

      /*
        getSum() isminde bir method oluşturun.
        Parametresi ArrayList olmalı
        Return tipi int olmalı.
        ArrayList teki tüm sayıları birbiri ile toplayın.
        return olarak toplam sonucu döndürün.
        Örneğin;
        Arraylist = 1,2,3,4,5
        return 15 olmalı
         */

    public static void main(String[] args) {
        ArrayList<Integer>sayılar = new ArrayList<>(List.of(1,2,3,4,5));
        System.out.println("getSum(sayılar) = " + getSum(sayılar));


    }

    private static int getSum(ArrayList<Integer> sayılar) {
        int toplam = 0;
        for (int i = 0; i < sayılar.size(); i++) {
            toplam += sayılar.get(i);
        }
        return toplam;
    }
}

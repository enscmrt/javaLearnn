package j12_ArrayList.Tasks_01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class _08_arraylist8 {

    /*
        secondMax()  isminde bir method oluşturun.
        Parametre olarak integer ArrayList.
        Return tipi int olmalı.
        ArrayList'teki en yüksek (maximum) 2. değeri bulun ve onu döndürün
        ÖRN;
        ArrayList   --  5,3,4,6,7
        CEVAP : 6
     */

    public static void main(String[] args) {
        List<Integer> sayılar = new ArrayList<>(Arrays.asList(5,3,4,6,7));
        System.out.println("secondMax(sayılar) = " + secondMax(sayılar));
    }

    private static int secondMax(List<Integer> sayılar) {
        Collections.sort(sayılar);
        int max =sayılar.get(sayılar.size()-2);

        return max;
    }
}

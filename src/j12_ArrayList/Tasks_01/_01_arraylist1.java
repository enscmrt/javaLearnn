package j12_ArrayList.Tasks_01;

import java.util.ArrayList;
import java.util.Arrays;

public class _01_arraylist1 {

    /*
        ismi getCount() olan bir method oluşturun.
        Parametre olarak bir String ArayList  ve  bir tane String

        Return tipi int olmalı.

        ArrayList'teki bir değerin kaç kez tekrarlandığını belirtin ve döndürün.
        Örneğin;
        ArrayList = Orange , Kiwi , Peach , Banana , Orange
        String Orange:
        Count = 2 olmalı. (Orange 2 kez yazılmış)
         */

    public static void main(String[] args) {
        ArrayList<String> meyve = new ArrayList<>(Arrays.asList("Orange", "Kiwi", "Peach", "Banana", "Orange"));
        String fruit="Orange";

        System.out.println("getCount(meyve, fruit) = " + getCount(meyve, fruit));


    }

    private static int getCount(ArrayList<String> meyve, String fruit) {
        int count = 0;
        for (String eleman : meyve) {
           if(eleman.equals(fruit)){
               count++;
           }
        }
        return count;
    }
}

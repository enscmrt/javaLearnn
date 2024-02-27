package j12_ArrayList.Tasks_01;

import java.util.ArrayList;
import java.util.Arrays;

public class _03_arraylist3 {

    /*
        getLength() isminde bir method oluşturun.
        Parametre olarak String ArrayList
        Return tipi Integer ArrayList
        ArrayList içindeki her bir Stringin uzunluğunu bulunuz.

        Tüm elementlerin uzunluğunu döndürün

        Örneğin;
        ArrayList  :  "New jersey" ,"New york" , "Ohio" , "Florida" , "Boston"
        Tüm Stringlerin uzunluklarını yazdırın;
        cevap: 10 ,  8 , 4 , 7 , 6 olmalı
     */

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(Arrays.asList("New jersey" ,"New york" , "Ohio" , "Florida" , "Boston"));
        System.out.println("getLength(list) = " + getLength(list));
        ArrayList<Integer> length = getLength(list);
        System.out.println("Tüm Stringlerin uzunlukları:");
        for (Integer lengths : length) {

        }System.out.print(length + " ");


    }

    private static ArrayList<Integer>getLength(ArrayList<String> list) {
        ArrayList<Integer> length = new ArrayList<>();
        for (String str : list) {
            length.add(str.length());
        }
        return length;
    }
}
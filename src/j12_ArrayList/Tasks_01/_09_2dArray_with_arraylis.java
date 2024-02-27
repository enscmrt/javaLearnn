package j12_ArrayList.Tasks_01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _09_2dArray_with_arraylis {

    /*
    Bir tane 2d array [][]   oluşturun ve elemanları =  [  [ 1, 2, 3 ],  [ 4, 5, 6 ],  [ 7, 8, 9 ] ]
    Store all the elements in one arraylist and print the arraylist
    Tüm elemanları bir arrayListe yükleyin ve bu arrayList'i yazdırın.
    Örnek:
    Girdi:
    [
     [ 1, 2, 3 ],
     [ 4, 5, 6 ],
     [ 7, 8, 9 ]
    ]
    Çıktı: [1,2,3,4,5,6,7,8,9]
     */

    public static void main(String[] args) {
        int [][]all = {{ 1, 2, 3 },  { 4, 5, 6 },  { 7, 8, 9 }};
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < all.length; i++) {
            for (int j = 0; j < all[i].length; j++) {
                list.add(all[i][j]);
            }
        }
        System.out.println("list = " + list);

    }
}
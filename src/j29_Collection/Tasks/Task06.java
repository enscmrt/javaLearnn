package j29_Collection.Tasks;

import java.util.Arrays;
import java.util.HashSet;

public class Task06 {
    public static void main(String[] args) {
        // Task 1 : bir metod oluşturup bir HashSet i
        // verilen bu numaralar ile doldurunuz [1, 2, 3, 4, 5, 5, 5, 6, 7, 8]
        // bu işlemi generateSet() metodunda yapınız.mainden yazdırınız.


        //Task 2
        // AddElements şeklinde bir metodla 1 veya 1 den fazla sayı eklenebilen metodu
        // yazınız.
        HashSet<Integer>set=generateSet();
        System.out.println("generateSet() = " + generateSet());
        HashSet<Integer>set1=new HashSet<>();
        AddElements(set1,1);
        AddElements(set1,2,3,4);
        AddElements(set1,5,5,5);
        System.out.println("set1 = " + set1);


    }

    private static void AddElements(HashSet<Integer> set1, int ... elements) {
        for (int i:elements){
            set1.add(i);
        }
    }


    private static HashSet<Integer> generateSet() {
        HashSet<Integer>set=new HashSet<>();
        int[] num={1, 2, 3, 4, 5, 5, 5, 6, 7, 8};
        for (int i:num){
            set.add(i);
        }
        return set;
    }


    // Dizi tipindeki dizi, arraylist, set ler i fonktsiyona gönderdiğinizde
    // fonksiyona kendisi gittiği için yapılan değişiklikler kendisinde yapıldığı için
    // bu değişkenleri RETURN etmenize gerek yoktur.



}

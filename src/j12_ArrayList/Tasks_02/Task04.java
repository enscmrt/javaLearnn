package j12_ArrayList.Tasks_02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task04 {
    public static void main(String[] args) {
        /* TASK :

         * Input olarak verilen listteki isimlerden
         * icinde ‘a’ ve 'A'  harfi bulunanlari silen bir code create ediniz.
         *
         * INPUT : list1={"Ali","Veli","Ayse","Fatma","Omer"}
         * OUTPUT : [Veli,Omer]
         */

        List<String> list1 = new ArrayList<>(Arrays.asList("Ali","Veli","Ayse","Fatma","Omer"));
        List<String>olmayanList=new ArrayList<>();
        System.out.println("list1 = " + list1);
        for (int i = 0; i < list1.size(); i++) {
            if(!(list1.get(i).contains("a")||list1.get(i).contains("A"))){
                olmayanList.add(list1.get(i));
            }

        }
        System.out.println("olmayanList = " + olmayanList);
        list1.clear();
        list1.addAll(olmayanList);
        System.out.println("list1 = " + list1);

        //2.yol
        System.out.println("list1 = " + list1);//
// Listeyi döngü ile dolaş
        for (int i = 0; i < list1.size(); i++) {
            // Her ismi al
            String name = list1.get(i);
            // Eğer isim 'a' veya 'A' harfi içeriyorsa
            if (name.contains("a") || name.contains("A")) {
                // O ismi listeden çıkar
                list1.remove(i);
                // İndeksi bir azalt, çünkü listeden bir eleman çıktı
                i--;
            }
        }

// Sonucu yazdır
        System.out.println("OUTPUT = " + list1);


    }
}
